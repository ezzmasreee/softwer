package ai;
import java.util.Random;
import java.util.Scanner;

public class NimGames {

    public static void main(String[] args) {
        playNimGame();
    }

    public static void playNimGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Initialize the number of sticks in the pile
        int total = 17; // Random number between 10 and 20
        System.out.println("Choose difficulty level: ");
        System.out.println("1. Hard");
        System.out.println("2. Meduim");
        System.out.println("3. Easy");
        int difficultyChoice = scanner.nextInt();
        int flag=1;
        switch(difficultyChoice) { 
        case 1:

        System.out.println("Welcome to the Nim Game with Alpha-Beta Pruning!");
        System.out.println("There are " + total + " sticks in the pile.\n");
             
        while (total > 0) {
            // Player's turn
            int playerChoice;
            do {
                System.out.print("Your turn! Enter the number of sticks to remove (1-3): ");
                playerChoice = scanner.nextInt();
                if (playerChoice < 1 || playerChoice > 3 || playerChoice > total) {
                    System.out.println("Invalid choice. Try again.");
                }
            } while (playerChoice < 1 || playerChoice > 3 || playerChoice > total);

            total -= playerChoice;
            System.out.println("You removed " + playerChoice + " sticks. " + total + " sticks remaining.\n");

            // Check if the player won
            if (total <= 0) {
            	 System.out.println("Congratulations! You win!\n");
            	  System.out.println("evalution fanction= 1\n");
                break;
            }

            // Computer's turn using minimax with alpha-beta pruning
            int computerChoice = getComputerMove(total, Integer.MIN_VALUE, Integer.MAX_VALUE);
            computerChoice ++;
            if(flag==1) {computerChoice++ ; flag=0;}
            else if (flag==0)flag=1;
           
            
            System.out.println(total);
            if(total ==7) {computerChoice=3;   }
            if(total ==6) {computerChoice=2;   } if(total ==5) {computerChoice=1;   }
            if(total ==3) {computerChoice=3;   }
            if(total ==2) {computerChoice=2;   }
            if(total ==1) {computerChoice=1;   }
            
            
            
            total -= Math.max(computerChoice, 1); // Ensure the computer removes at least 1 stick
            System.out.println("Computer removed " + Math.max(computerChoice, 1) + " sticks. " + total + " sticks remaining.\n");

            // Check if the computer won
            if (total <= 0) {
            	System.out.println("Oops! The computer wins. Better luck next time!\n");
            	  System.out.println("evalution fanction= -1\n");
                break;
            }
        }break;
        case 2: System.out.println("Welcome to the Nim Game with Alpha-Beta Pruning!");
        System.out.println("There are " + total + " sticks in the pile.\n");
       
 while (total > 0) {
     // Player's turn
     int playerChoice;
     do {
         System.out.print("Your turn! Enter the number of sticks to remove (1-3): ");
         playerChoice = scanner.nextInt();
         if (playerChoice < 1 || playerChoice > 3 || playerChoice > total) {
             System.out.println("Invalid choice. Try again.");
         }
     } while (playerChoice < 1 || playerChoice > 3 || playerChoice > total);

     total -= playerChoice;
     System.out.println("You removed " + playerChoice + " sticks. " + total + " sticks remaining.\n");

     // Check if the player won
     if (total <= 0) {
    	 System.out.println("Congratulations! You win!\n");
    	  System.out.println("evalution fanction= 1\n");
         break;
     }

     // Computer's turn using minimax with alpha-beta pruning
     int computerChoice = getComputerMove(total, Integer.MIN_VALUE, Integer.MAX_VALUE);
     computerChoice ++;
     if(flag==1) {computerChoice++ ; flag=0;}
     else if (flag==0)flag=1;
    
     
     System.out.println(computerChoice);
     total -= Math.max(computerChoice, 1); // Ensure the computer removes at least 1 stick
     System.out.println("Computer removed " + Math.max(computerChoice, 1) + " sticks. " + total + " sticks remaining.\n");

     // Check if the computer won
     if (total <= 0) {
    	 System.out.println("Oops! The computer wins. Better luck next time!\n");
    	  System.out.println("evalution fanction= -1\n");
         break;
     }
 }case 3: System.out.println("Welcome to the Nim Game with Alpha-Beta Pruning!");
 System.out.println("There are " + total + " sticks in the pile.\n");
 
while (total > 0) {
// Player's turn
int playerChoice;
do {
  System.out.print("Your turn! Enter the number of sticks to remove (1-3): ");
  playerChoice = scanner.nextInt();
  if (playerChoice < 1 || playerChoice > 3 || playerChoice > total) {
      System.out.println("Invalid choice. Try again.");
  }
} while (playerChoice < 1 || playerChoice > 3 || playerChoice > total);

total -= playerChoice;
System.out.println("You removed " + playerChoice + " sticks. " + total + " sticks remaining.\n");

// Check if the player won
if (total <= 0) {
  System.out.println("Congratulations! You win!\n");
  System.out.println("evalution fanction= 1\n");
  break;
}

// Computer's turn using minimax with alpha-beta pruning
int computerChoice = getComputerMove(total, Integer.MIN_VALUE, Integer.MAX_VALUE);
computerChoice ++;
if(flag==1) {computerChoice++ ; computerChoice++ ;flag=0;}
else if (flag==0)flag=1;



System.out.println(total);
total -= Math.max(computerChoice, 1);


// Ensure the computer removes at least 1 stick
System.out.println("Computer removed " + Math.max(computerChoice, 1) + " sticks. " + total + " sticks remaining.\n");

// Check if the computer won
if (total <= 0) {
  System.out.println("Oops! The computer wins. Better luck next time!\n");
  System.out.println("evalution fanction= -1\n");
  break;
}
}          }
        scanner.close();
    }

    public static int getComputerMove(int sticks, int alpha, int beta) {
        if (sticks <= 0) {
            return 0; // Base case: no sticks left
        }

        int bestMove = Integer.MIN_VALUE;

        // Try each possible move (1, 2, or 3 sticks)
        for (int move = 1; move <= 3 && move <= sticks; move++) {
            int newSticks = sticks - move;

            // Evaluate the opponent's move with alpha-beta pruning
            int opponentMove = getPlayerMove(newSticks, alpha, beta);

            // Update the best move
            if (opponentMove > bestMove) {
                bestMove = opponentMove;
            }

            // Update alpha with the maximum of alpha and the best move
            alpha = Math.max(alpha, bestMove);

            // Prune the tree if beta is less than or equal to alpha
            if (beta <= alpha) {
                break;
            }
        }

        return bestMove;
    }

    public static int getPlayerMove(int sticks, int alpha, int beta) {
        if (sticks <= 0) {
            return 0; // Base case: no sticks left
        }

        int worstMove = Integer.MAX_VALUE;

        // Try each possible move (1, 2, or 3 sticks)
        for (int move = 1; move <= 3 && move <= sticks; move++) {
            int newSticks = sticks - move;

            // Evaluate the computer's move with alpha-beta pruning
            int computerMove = getComputerMove(newSticks, alpha, beta);

            // Update the worst move
            if (computerMove < worstMove) {
                worstMove = computerMove;
            }

            // Update beta with the minimum of beta and the worst move
            beta = Math.min(beta, worstMove);

            // Prune the tree if beta is less than or equal to alpha
            if (beta <= alpha) {
                break;
            }
        }

        return worstMove;
    }
}
