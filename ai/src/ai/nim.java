package ai;
import java.util.Scanner;

public class nim {

    public static void main(String[] args) {
    	   Scanner scanner = new Scanner(System.in);

           System.out.println("Welcome to Nim!");
           System.out.print("Enter the initial number of tokens on the table: ");
           int tokens = scanner.nextInt();

           boolean player1Turn = true;

           while (tokens > 0) {
               System.out.println("Current tokens on the table: " + tokens);
               System.out.print("Player " + (player1Turn ? "1" : "2") + ", enter the number of tokens to take: ");
               int move = scanner.nextInt();

               if (move > 0 && move < tokens && move != tokens - move) {
                   tokens -= move;
                   player1Turn = !player1Turn;
               } else {
                   System.out.println("Invalid move. Please try again.");
               }
           }

           System.out.println("Player " + (player1Turn ? "2" : "1") + " wins!");
           scanner.close();
       }
}

