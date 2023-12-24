package ai;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree {
	static int alpha =-255;
	static int beta=255;
	
    Node deapth;

    BinaryTree(int key) {
        deapth = new Node(key);
    }

    BinaryTree() {
        deapth = null;
    }

    // Method to perform a pre-order traversal and print the nodes
    private void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    // Wrapper method to start pre-order traversal from the root
    public void printPreOrder() {
        preOrderTraversal(deapth);
    }

    public static void main(String[] args) {
    	
    	
        BinaryTree tree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        
        int x=19;
        BinaryTree fox = new BinaryTree();
        System.out.printf( "enter how u want split" );
        tree.deapth = new Node(17);
        fox.deapth=tree.deapth;
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        
        add_usersplit(number1,number2,fox);
        System.out.printf( "user split  %d \t %d \n",fox.deapth.left.key,fox.deapth.right.key );
        
        ////////////////////////
        while(true) {
        int flag =1;
        fox.deapth=hard_level(fox.deapth);
        System.out.printf( "pc split  %d \t %d \t alpha = %d \n",fox.deapth.left.key,fox.deapth.right.key ,alpha);
        flag=the_winner( fox.deapth,flag);
        if(flag==20) { break; }
        x=scanner.nextInt();// chose one 
        if(x==2) { System.out.print("pls  invaled value");  x=scanner.nextInt(); }
        fox.deapth= cheack_userchoice(x,fox);
        flag=0;
        // second round
         number1=scanner.nextInt();
         number2=scanner.nextInt();
         if(number1==number2) {   System.out.print("u must enter two value not equal") ; number1=scanner.nextInt();
         number2=scanner.nextInt();        }
         if(number1<number2) {beta =number1;}
         else beta =number2;
        add_usersplit(number1,number2,fox);
         System.out.printf( "user split  %d \t %d     beta = %d\n",fox.deapth.left.key,fox.deapth.right.key ,beta);
         flag=the_winner( fox.deapth,flag);
         if(flag==20) { break; }
         }
         
         
         
         
         
         
      //  fox.deapth=hard_level(fox.deapth,ezz);
        //System.out.printf( "pc split  %d \t %d \n",fox.deapth.left.key,fox.deapth.right.key );
        
        
        
        
        
        
        
        
       // System.out.print(fox.deapth.key);
     //   initial_hard(fox.deapth);
       // hard_level(fox.deapth);
      //  System.out.printf( "enter wicth one u take  %d \t %d \n",fox.deapth.left.key,fox.deapth.right.key );
       
      
      
        
       
        
        
        
       /* tree.deapth.left = new Node(2);
        tree.deapth.right = new Node(3);
        tree.deapth.left.left = new Node(4);

        System.out.println("Pre-order traversal:");
        tree.printPreOrder();
      
        fox.deapth=*/
    }

	

	static int the_winner(Node deapth2, int flag) {
	if((deapth2.left.key==1|| deapth2.left.key==2)  &&   (deapth2.right.key==1|| deapth2.right.key==2)           ) {
		if(flag==1) {    System.out.println("pc is winner ");   flag=20  ;       return flag;  }
		else {         System.out.println("user  is winner "); flag=20; System.out.print(flag ); return flag;                             }
	}
	return flag;
	}
		

	private static void initial_hard(Node root2) {
		
	
			root2.left=new Node(2);
			root2.right=new Node((root2.key)-2);
			
		
			
		}
		// TODO Auto-generated method stub
		
	

	private static void add_usersplit(int number1, int number2, BinaryTree fox) {
		// TODO Auto-generated method stub
		fox.deapth.left=new Node(number1);
		fox.deapth.right=new Node(number2);
		
		
	}

	 static Node cheack_userchoice(int x, BinaryTree fox) {
		// TODO Auto-generated method stub
		if(fox.deapth.left.key==x) {
			fox.deapth=fox.deapth.left;
		}
		else {fox.deapth=fox.deapth.right ;
			
		}
		return fox.deapth;
		
	}

	 static Node  hard_level(Node root2 ) {
	if(root2.left.key==3 ||  root2.right.key==3) {
		if(root2.left.key==3) {
			
			root2=new Node(root2.left.key);
				root2.right=new Node(2);
				root2.left=new Node(1);
				alpha=2;
			
				return root2;
			
		}
		else {        root2=new Node(root2.right.key);
		             root2.right=new Node(2);
		              root2.left=new Node(1);
		              alpha=2;
		                  return root2;         }
		
	 }
	else {
		if (root2.left.key>root2.right.key) {
			
			root2=new Node(root2.left.key);
			if (root2.key==4  ) {
				root2.right=new Node(3);
				root2.left=new Node(1);
				alpha =root2.right.key;
				
			}
			else {
				root2.right=new Node((root2.key-2));
			root2.left=new Node(2);
			alpha =root2.right.key;
			}
			
		}
		else {   	root2=new Node(root2.right.key);;
		if (root2.key==4  ) {
			root2.right=new Node(3);
			root2.left=new Node(1);
			alpha =root2.right.key;
			
		}
		else {   root2.right=new Node(root2.key-2);
		root2.left=new Node(2); alpha =root2.right.key;    }
		}
		return root2;            
}}

	}
