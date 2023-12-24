package network_udp;
import java.net.*;
import java.util.Scanner;
import java.io.*;
public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in); 
         String input = scanner.nextLine(); 
		  String serverAddress = "127.0.0.1"; // Server's IP address
	        int serverPort = 1121; // Server's port number

	        try (DatagramSocket clientSocket = new DatagramSocket()) {
	            InetAddress serverIP = InetAddress.getByName(serverAddress);

	            String message = "Hello, server!";
	            byte[] sendData = input.getBytes();
	            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverIP, serverPort);
	            clientSocket.send(sendPacket);

	            byte[] receiveData = new byte[1024];
	            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
	            clientSocket.receive(receivePacket);

	            String serverResponse = new String(receivePacket.getData(), 0, receivePacket.getLength());
	            System.out.println("Received from server: " + serverResponse);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
