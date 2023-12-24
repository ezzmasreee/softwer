package network_udp;
import java.net.*;
import java.io.*;
public class server {

	public static void main(String[] args) {
	    int serverPort = 1121; // Specify the server port number

        try (DatagramSocket serverSocket = new DatagramSocket(serverPort)) {
            System.out.println("UDP Server is listening on port " + serverPort);

           
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);

                String clientMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

                System.out.println("Received from client: " + clientMessage);
                // read from file
                BufferedReader readfile=new BufferedReader(new FileReader("read.txt"));
                String line=null;
                int flag=0;
               while ((line=readfile.readLine())!=null) {
            	   String[] parts = line.split(" ");
            	   String Vehicle_id=parts[0];
            	   
            	   String  Make=parts[1];
            	   String Model=parts[2];
            	   String Year =parts[3];
            	   String Colour=parts[4];
            	   String Owner_Name=parts[5];
            	   String Owner_ID=parts[6];
            	 if (Vehicle_id.equals(clientMessage)) {
            	String responseMessage= clientMessage +"  "+Make+"  "+Model+"  "+Year+"  "+Colour+"  "+Owner_Name+"  "+Owner_ID;
            	 byte[] sendData = responseMessage.getBytes();
                 DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
                 serverSocket.send(sendPacket);
            		 readfile.close();
            		 flag=1;
            		 break;
            	 }
            	   
            	   
               }
               if (flag==0) {
            	   String responseMessage=    "Vehicle is not found";
            	   byte[] sendData = responseMessage.getBytes();
                   DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
                   serverSocket.send(sendPacket);
                readfile.close();}

               /* String responseMessage = "Hello, client!";
                byte[] sendData = responseMessage.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
                serverSocket.send(sendPacket);
            */
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
