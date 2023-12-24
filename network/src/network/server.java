package network;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.*;
import java.io.*;
import java.net.*;
import java.io.*;
import java.net.*;

public class server {
	


	    public static void main(String[] args) {
	        int port = 12366; // Specify the port number the server will listen on

	        try (ServerSocket serverSocket = new ServerSocket(port)) {
	            //System.out.println("Server is listening on port " + port);

	            
	                Socket clientSocket = serverSocket.accept();
	               // System.out.println("Client connected: " + clientSocket.getInetAddress());

	                // Create input and output streams for the client socket
	                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
	                String clientMessage = in.readLine();
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
	            		 out.printf("Hello client %s : %s %s %s %s %s %s ",clientMessage,Make,Model,Year,Colour,Owner_Name,Owner_ID);
	            		 readfile.close();
	            		 flag=1;
	            		 break;
	            	 }
	            	   
	            	   
	               }
	               if (flag==0) {
	            	   out.println( "Vehicle is not found");
	                readfile.close();}
	                // Read data from the client
	                

	                // Send a response to the client
	                //out.println("Hello, client!");
	               // System.out.print("rzzzz");

	                // Close the client socket
	                clientSocket.close();
	            
	        } catch (Exception e) {
	            //e.printStackTrace();
	        }
	    }
	}


