package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;import javafx.scene.control.*;


public class SampleController {
	String flag ="ezz";
	int x=1;
	int fisrt_print=1;
	 int total = 17;

    @FXML
    private TextArea area;
    @FXML
    private RadioButton eazy;

    @FXML
    private RadioButton hard;

    @FXML
    private RadioButton medium;
    

    @FXML
    private Button start;

    @FXML
    private TextField text1;

    @FXML
    private TextField text2;

    @FXML
    private TextField text3;
   // int total = Integer.parseInt(text1.getText());;
    private ToggleGroup group;

    @FXML
    public void initialize() {
        // Create a ToggleGroup and add radio buttons to it
    	//area.appendText("select number to remove 3_-1\n");
        group = new ToggleGroup();
        eazy.setToggleGroup(group);
        medium.setToggleGroup(group);
        hard.setToggleGroup(group);

        // Set a default selected radio button if needed
        // For example, if you want "medium" to be selected by default
        medium.setSelected(true);
    }

    @FXML
    void bigin(MouseEvent event) {
    	ActionEvent eventt=null;
if (start.isPressed()) { 
	
	
	
}

    }

    @FXML
void click_boton(ActionEvent event) {
    	RadioButton selectedRadioButton = (RadioButton) group.getSelectedToggle();
    	  String selectedText = selectedRadioButton.getText();
       
if(fisrt_print==1) {
        
        total = Integer.parseInt(text1.getText());
        area.appendText("Welcome to the Nim Game with Alpha-Beta Pruning!\n");
        area.appendText("There are " + total + " sticks in the pile.\n");
        
         fisrt_print=0;
        }
if(selectedText.equalsIgnoreCase("Hard")) {
int playerChoice;
do {
	 area.appendText("Your turn! Enter the number of sticks to remove (1-3): \n");
    playerChoice = Integer.parseInt(text2.getText());
    if (playerChoice < 1 || playerChoice > 3 || playerChoice > total) {
    	 area.appendText("Invalid choice. Try again.\n");
    }
} while (playerChoice < 1 || playerChoice > 3 || playerChoice > total);

total -= playerChoice;
area.appendText("You removed " + playerChoice + " sticks. " + total + " sticks remaining.\n");

if (total <= 0) {
	area.appendText("Congratulations! You win!\n");
	area.appendText("evalution fanction= 1\n");
  
}
int computerChoice = getComputerMove(total, Integer.MIN_VALUE, Integer.MAX_VALUE);
computerChoice ++;
if(x==1) {computerChoice++ ; x=0;}
else if (x==0)x=1;


area.appendText(total+"\n");
if(total ==7) {computerChoice=3;   }
if(total ==6) {computerChoice=2;   } if(total ==5) {computerChoice=1;   }
if(total ==3) {computerChoice=3;   }
if(total ==2) {computerChoice=2;   }
if(total ==1) {computerChoice=1;   }



total -= Math.max(computerChoice, 1); // Ensure the computer removes at least 1 stick
area.appendText("Computer removed " + Math.max(computerChoice, 1) + " sticks. " + total + " sticks remaining.\n");

// Check if the computer won
if (total <= 0) {
	area.appendText("Oops! The computer wins. Better luck next time!\n");
	area.appendText("evalution fanction= -1\n");
  
}
text2.setText(" ");
}
else if(selectedText.equalsIgnoreCase("Medium")) {    int playerChoice;
do {
	 area.appendText("Your turn! Enter the number of sticks to remove (1-3): \n");
   playerChoice = Integer.parseInt(text2.getText());
   if (playerChoice < 1 || playerChoice > 3 || playerChoice > total) {
   	 area.appendText("Invalid choice. Try again.\n");
   }
} while (playerChoice < 1 || playerChoice > 3 || playerChoice > total);

total -= playerChoice;
area.appendText("You removed " + playerChoice + " sticks. " + total + " sticks remaining.\n");

if (total <= 0) {
	area.appendText("Congratulations! You win!\n");
	area.appendText("evalution fanction= 1\n");
 
}
int computerChoice = getComputerMove(total, Integer.MIN_VALUE, Integer.MAX_VALUE);
computerChoice ++;
if(x==1) {computerChoice++ ; x=0;}
else if (x==0)x=1;


area.appendText(total+"\n");
if(total ==7) {computerChoice=3;   }
if(total ==6) {computerChoice=2;   } if(total ==5) {computerChoice=1;   }
if(total ==3) {computerChoice=3;   }
if(total ==2) {computerChoice=2;   }
if(total ==1) {computerChoice=1;   }



total -= Math.max(computerChoice, 1); // Ensure the computer removes at least 1 stick
area.appendText("Computer removed " + Math.max(computerChoice, 1) + " sticks. " + total + " sticks remaining.\n");

//Check if the computer won
if (total <= 0) {
	area.appendText("Oops! The computer wins. Better luck next time!\n");
	area.appendText("evalution fanction= -1\n");
 
}
text2.setText(" ");          }
else {int playerChoice;
do {
	 area.appendText("Your turn! Enter the number of sticks to remove (1-3): \n");
   playerChoice = Integer.parseInt(text2.getText());
   if (playerChoice < 1 || playerChoice > 3 || playerChoice > total) {
   	 area.appendText("Invalid choice. Try again.\n");
   }
} while (playerChoice < 1 || playerChoice > 3 || playerChoice > total);

total -= playerChoice;
area.appendText("You removed " + playerChoice + " sticks. " + total + " sticks remaining.\n");

if (total <= 0) {
	area.appendText("Congratulations! You win!\n");
	area.appendText("evalution fanction= 1\n");
 
}
int computerChoice = getComputerMove(total, Integer.MIN_VALUE, Integer.MAX_VALUE);
computerChoice ++;
if(x==1) {computerChoice++ ; x=0;}
else if (x==0)x=1;


area.appendText(total+"\n");
if(total ==7) {computerChoice=3;   }
if(total ==6) {computerChoice=3;   } if(total ==5) {computerChoice=3;   }
if(total ==3) {computerChoice=2;   }
if(total ==2) {computerChoice=1;   }
if(total ==1) {computerChoice=1;   }



total -= Math.max(computerChoice, 1); // Ensure the computer removes at least 1 stick
area.appendText("Computer removed " + Math.max(computerChoice, 1) + " sticks. " + total + " sticks remaining.\n");

//Check if the computer won
if (total <= 0) {
	area.appendText("Oops! The computer wins. Better luck next time!\n");
	area.appendText("evalution fanction= -1\n");
 
}
text2.setText("");                  }
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
