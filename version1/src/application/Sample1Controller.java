package application;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class Sample1Controller {
	ArrayList<Integer> chelsea = new ArrayList<Integer>();
	static int flag;
	int first=1;
	 int initail;
	 static int pc_or_user;

    @FXML
    private TextArea area;

    @FXML
    private Button boton;

    @FXML
    private RadioButton eazy;

    @FXML
    private RadioButton hard;

    @FXML
    private Button inistal_boton;

    @FXML
    private RadioButton medium;

    @FXML
    private TextField text1;

    @FXML
    private TextField text2;

    @FXML
    private TextField text3;

    @FXML
    private TextField text4;
    private ToggleGroup group;

    @FXML
    public void initialize() {
    	
        // Create a ToggleGroup and add radio buttons to it
        group = new ToggleGroup();
        eazy.setToggleGroup(group);
        medium.setToggleGroup(group);
        hard.setToggleGroup(group);

        // Set a default selected radio button if needed
        // For example, if you want "medium" to be selected by default
        medium.setSelected(true);
    }

    @FXML
    void boton_cliked(ActionEvent event) {
    	 ArrayList<Integer> Temp=new ArrayList<Integer>();
    	 int depth,alpha,beta;
    	 boolean isMaximizingPlayer=true;
    	 depth=3;
    	 alpha=Integer.MIN_VALUE;
    	 beta=Integer.MAX_VALUE;
    	RadioButton selectedRadioButton = (RadioButton) group.getSelectedToggle();
  	  String selectedText = selectedRadioButton.getText();
  
    /*	if (first ==1) {
    	int number1=Integer.parseInt(text2.getText());
    	int number2=Integer.parseInt(text3.getText());;
    	
    	chelsea.add(number1);
    	chelsea.add(number2); first=0;}*/
    	if(selectedText.equalsIgnoreCase("Hard")) {
    		
    	int number3=Integer.parseInt(text4.getText());
    	int number1=Integer.parseInt(text2.getText());
    	 int number2=Integer.parseInt(text3.getText());
    	 
    	 
    	
    int s=minimax( Temp,  depth, alpha,  beta,  isMaximizingPlayer);
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 chelsea =user_split(number3,number1,number2,chelsea);
    	 print_user(chelsea);
    	 pc_or_user=0;
    	 the_winner( chelsea);
    	 chelsea=hard_level(chelsea);
    	 pc_or_user=1;
     	print_pc(chelsea);
     	the_winner( chelsea);
    	 text2.setText("");
     	text3.setText("");
     	text4.setText("");}
    	else if(selectedText.equalsIgnoreCase("Medium")) {
    		int number3=Integer.parseInt(text4.getText());
        	int number1=Integer.parseInt(text2.getText());
        	 int number2=Integer.parseInt(text3.getText());
        	 chelsea =user_split(number3,number1,number2,chelsea);
        	 print_user(chelsea);
        	 pc_or_user=0;
        	 the_winner( chelsea);
        	 chelsea=hard_level(chelsea);
        	 pc_or_user=1;
         	print_pc(chelsea);
         	the_winner( chelsea);
        	 text2.setText("");
         	text3.setText("");
         	text4.setText("");
    		
    	}
    	else {
    		System.out.print("ezz");
    		int number3=Integer.parseInt(text4.getText());
        	int number1=Integer.parseInt(text2.getText());
        	 int number2=Integer.parseInt(text3.getText());
        	 chelsea =user_split(number3,number1,number2,chelsea);
        	 print_user(chelsea);
        	 pc_or_user=0;
        	 the_winner( chelsea);
        	 chelsea=eazy_level(chelsea);
        	 pc_or_user=1;
         	print_pc(chelsea);
         	the_winner( chelsea);
        	 text2.setText("");
         	text3.setText("");
         	text4.setText("");
    	}
    }

    private ArrayList<Integer> eazy_level(ArrayList<Integer> chelsea2) {
    	int x=20;
		for(int i=0;i<chelsea.size();i++) {
		
			if (chelsea.get(i)!=1 &&chelsea.get(i)!=2 ) {
				if(x>chelsea.get(i)) { x= chelsea.get(i);     }
			}
			
		}
		// rmove item
		for(int i=0;i<chelsea.size();i++) {
			if (chelsea.get(i)==x ) {
				chelsea.remove(i);
				
			}
			}
		// insert
		
		if(x==4) {
			chelsea.add(3);
			chelsea.add(1);
		}
		else if (x==5) {   chelsea.add(3);
		chelsea.add(2);   }
		else if (x==8) {   chelsea.add(5);
		chelsea.add(3);   }
		else if (x==7) {   chelsea.add(4);
		chelsea.add(3);   }
		
		else if(x==3) {   chelsea.add(2);
		chelsea.add(1);   }
		else {
		chelsea.add(x-2);
		chelsea.add(2);}
		
		return chelsea;
	}

	@FXML
    void initail_number_cliked(ActionEvent event) {
    	initail=Integer.parseInt(text1.getText());
    	area.appendText("you chose number of sticks " + initail+"\n" );
    	if (first ==1) {
        	int number1=Integer.parseInt(text2.getText());
        	int number2=Integer.parseInt(text3.getText());;
        	
        	chelsea.add(number1);
        	chelsea.add(number2); first=0;
        	area.appendText("user split  " + number1 +"  "+  number2+ " " + "\n" );
        	chelsea=hard_level(chelsea);
       	 
        	print_pc(chelsea);
        	}
    	
    	text2.setText("");
    	text3.setText("");
    	text4.setText("");

    }
	private static ArrayList<Integer> hard_level(ArrayList<Integer> chelsea) {
		int x=20;
		for(int i=0;i<chelsea.size();i++) {
		
			if (chelsea.get(i)!=1 &&chelsea.get(i)!=2 ) {
				if(x>chelsea.get(i)) { x= chelsea.get(i);     }
			}
			
		}
		// rmove item
		for(int i=0;i<chelsea.size();i++) {
			if (chelsea.get(i)==x ) {
				chelsea.remove(i);
				
			}
			}
		// insert
		if(x==4) {
			chelsea.add(3);
			chelsea.add(1);
		}
		else if(x==6) { chelsea.add(4);
		chelsea.add(2); }
		else if (x==5) {   chelsea.add(x-1);
		chelsea.add(1);   }
		else if(x==3) {   chelsea.add(2);
		chelsea.add(1);   }
		else {
		chelsea.add(x-2);
		chelsea.add(2);}
		
		return chelsea;
	}
	  void print_pc(ArrayList<Integer> chelsea) {
		  area.appendText("pc split ");
		 
		for(int i=0;i<chelsea.size();i++) {
			
			  area.appendText("  "+chelsea.get(i)+" "  );
			
			
		}  area.appendText( "\n" );
		
	}

		 void the_winner(ArrayList<Integer> chelsea) {
			int sum =0;
			for(int i=0;i<chelsea.size();i++) { 
				if(chelsea.get(i )==1|| chelsea.get(i )==2) {
					sum++;
				}
				
			}
			if(sum==chelsea.size()) { 
				if(pc_or_user==1) {  area.appendText("pc winner \n");  area.appendText("Evalution =-1 \n");    }
				else {area.appendText("user  winner"); area.appendText("Evalution = +1 \n");}
			flag=0;	
			}
			
			
		}
		  private static boolean isEndGame(ArrayList<Integer> Temp) {
		    	for (int index : Temp) {
		            if (index >= 3) {
		                return false;
		            }
		        }
		    	return true;
		    }
		 private static int minimax(ArrayList<Integer> Temp, int depth, int alpha, int beta, boolean isMaximizingPlayer) {
		        if (depth == 0 || isEndGame(Temp)) {
		            return 0;
		        }

		        if (!isMaximizingPlayer) {
		            int minEval = Integer.MAX_VALUE;
		            for (int i = 0; i < Temp.size(); i++) {
		                int index = Temp.get(i);
		                if (index > 2) {
		                    for (int j = 1; j < index; j++) {
		                        int split1 = j;
		                        int split2 = index - j;
		                        Temp.remove(i);
		                        Temp.add(split1);
		                        Temp.add(split2);
		                        int eval = minimax(Temp, depth - 1, alpha, beta, false);
		                        Temp.remove(Temp.size() - 1);
		                        Temp.remove(Temp.size() - 1);
		                        if (eval < minEval) {
		                            minEval = eval;
		                        }
		                        beta = Math.min(beta, eval);
		                        if (beta <= alpha) {
		                            break; 
		                        }
		                    }
		                }
		            }
		            return minEval;
		        } else {
		            int maxEval = Integer.MIN_VALUE;
		            for (int i = 0; i < Temp.size(); i++) {
		                int index = Temp.get(i);
		                if (index > 2) {
		                    for (int j = 1; j < index; j++) {
		                        int split1 = j;
		                        int split2 = index - j;
		                        Temp.remove(i);
		                        Temp.add(split1);
		                        Temp.add(split2);
		                        int eval = minimax(Temp, depth - 1, alpha, beta, true );
		                        Temp.remove(Temp.size() - 1);
		                        Temp.remove(Temp.size() - 1);
		                        maxEval = Math.max(maxEval, eval);
		                        alpha = Math.max(alpha, eval);
		                        if (beta <= alpha) {
		                            break; // Alpha cut-off
		                        }
		                    }
		                }
		            }
		            return maxEval;
		        }
		    }
			 static ArrayList<Integer> user_split(int number3, int number1, int number2, ArrayList<Integer> chelsea) {
				// rmove item
						for(int i=0;i<chelsea.size();i++) {
							if (chelsea.get(i)==number3 ) {
								chelsea.remove(i);
								
							}
							}


		chelsea.add(number1);
		chelsea.add(number2);
		return chelsea;}
				 void print_user( ArrayList<Integer> chelsea) {
					area.appendText( "user split " );
					for(int i=0;i<chelsea.size();i++) {
						
						area.appendText( " "+chelsea.get(i)+""  );
						
						
					}area.appendText(  "\n" );
					
				}
}
