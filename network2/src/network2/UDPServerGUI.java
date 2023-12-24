package network2;

import javax.swing.*;
import java.awt.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

public class UDPServerGUI extends JFrame {

    private JTextArea messageArea;
    private List<ClientHandler> clients;

    public UDPServerGUI() {
        setTitle("UDP Server GUI");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        messageArea = new JTextArea();
        messageArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(messageArea);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        clients = new ArrayList<>();
    }

    public void startServer(int port) {
        try (DatagramSocket serverSocket = new DatagramSocket(port)) {
            appendMessage("UDP Server is running on port " + port);

            while (true) {
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

                serverSocket.receive(receivePacket);

                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

                appendMessage("Received from client " + clientAddress.getHostAddress() + ":" + clientPort + ": " + message);

                // Send the message to all connected clients
                sendToAllClients(message, clientAddress, clientPort);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendToAllClients(String message, InetAddress senderAddress, int senderPort) {
        for (ClientHandler client : clients) {
            if (!client.getAddress().equals(senderAddress) || client.getPort() != senderPort) {
                client.sendMessage(message);
            }
        }
    }

    private void appendMessage(String message) {
        SwingUtilities.invokeLater(() -> {
            messageArea.append(message + "\n");
            messageArea.setCaretPosition(messageArea.getDocument().getLength());
        });
    }

    private class ClientHandler {
        private InetAddress address;
        private int port;

        public ClientHandler(InetAddress address, int port) {
            this.address = address;
            this.port = port;
        }

        public InetAddress getAddress() {
            return address;
        }

        public int getPort() {
            return port;
        }

        public void sendMessage(String message) {
            try (DatagramSocket socket = new DatagramSocket()) {
                byte[] sendData = message.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, address, port);
                socket.send(sendPacket);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            UDPServerGUI serverGUI = new UDPServerGUI();
            serverGUI.setVisible(true);

            // Start the server on a separate thread
            new Thread(() -> serverGUI.startServer(9876)).start();
        });
    }
}
