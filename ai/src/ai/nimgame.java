package ai;

import java.util.ArrayList;
import java.util.Scanner;



class nood {
	ArrayList<Integer> tree = new ArrayList<Integer>();
	 public nood() { 
		 
	 }
   
}


public class nimgame {
	 static ArrayList<nood> full_tree = new ArrayList<nood>();
	 static int flag;
	 static int pc_or_user;

	public static void main(String[] args) {
		flag=20;
		int initail=17;
		  Scanner scanner = new Scanner(System.in);
	
		ArrayList<Integer> chelsea = new ArrayList<Integer>();
nood a =new nood();
a.tree.add(17);
full_tree.add(a);
int number1=scanner.nextInt();
int number2=scanner.nextInt();
chelsea.add(number1);
chelsea.add(number2);
///////////////////////////////////
while (true) {
chelsea=hard_level(chelsea);
pc_or_user=1;
add_node(chelsea);
print_pc(chelsea);
the_winner( chelsea);
if(flag==0) {break; }
int number3=scanner.nextInt();
number1=scanner.nextInt();
 number2=scanner.nextInt();
 chelsea =user_split(number3,number1,number2,chelsea);
 print_user(chelsea);
 pc_or_user=0;
 the_winner( chelsea);
 if(flag==0) {break; }
}
for (int i=0;i<full_tree.size();i++) {
	for(int j=0;j<full_tree.get(i).tree.size();j++) {
		System.out.printf("%d  ",full_tree.get(i).tree.get(j));
		
		
	}
	System.out.print("\n");
}

		
		

	}

	private static void the_winner(ArrayList<Integer> chelsea) {
		int sum =0;
		for(int i=0;i<chelsea.size();i++) { 
			if(chelsea.get(i )==1|| chelsea.get(i )==2) {
				sum++;
			}
			
		}
		if(sum==chelsea.size()) { 
			if(pc_or_user==1) {  System.out.println( "pc winner" );      }
			else System.out.println( "user  winner" );
		flag=0;	
		}
		
		
	}

	private static void print_user( ArrayList<Integer> chelsea) {
		System.out.print( "user split " );
		for(int i=0;i<chelsea.size();i++) {
			
			System.out.printf("%d   ",chelsea.get(i)  );
			
			
		}System.out.print( "\n" );
		
	}

	private static ArrayList<Integer> user_split(int number3, int number1, int number2, ArrayList<Integer> chelsea) {
		// rmove item
				for(int i=0;i<chelsea.size();i++) {
					if (chelsea.get(i)==number3 ) {
						chelsea.remove(i);
						
					}
					}


chelsea.add(number1);
chelsea.add(number2);
nood a =new nood();
for(int i=0;i<chelsea.size();i++) {
	a.tree.add(chelsea.get(i));
	
	
}
full_tree.add(a);

return chelsea;}

	private static void print_pc(ArrayList<Integer> chelsea) {
		System.out.print( "pc split " );
		for(int i=0;i<chelsea.size();i++) {
			
			System.out.printf("%d   ",chelsea.get(i)  );
			
			
		}System.out.print( "\n" );
		
	}

	private static void add_node(ArrayList<Integer> chelsea) {
		nood a =new nood();
		for(int i=0;i<chelsea.size();i++) {
			a.tree.add(chelsea.get(i));
			
			
		}
		full_tree.add(a);
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
		}else {
		chelsea.add(x-2);
		chelsea.add(2);}
		
		return chelsea;
	}

}
