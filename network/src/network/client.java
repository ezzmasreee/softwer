package network;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.*;
import java.io.*;
import java.net.*;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class client {




	    public static void main(String[] args) {
	    	 Scanner scanner = new Scanner(System.in); 
	            String input = scanner.nextLine(); 
	        String serverIP = "127.0.0.1"; // Server's IP address
	        int serverPort = 12366; // Server's port number

	        try (Socket socket = new Socket(serverIP, serverPort)) {
	            // Create input and output streams for the client socket
	            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

	            // Send a message to the server
	           
	            out.println(input);

	            // Read the server's response
	            String serverResponse = in.readLine();
	            System.out.println("Received from server: " + serverResponse);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}



