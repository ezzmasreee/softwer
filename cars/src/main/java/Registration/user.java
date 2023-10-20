package Registration;

import java.util.ArrayList;

import product.product;

public class user {
	String name;
	String email;
	String password;
	String firstname;
	String place;
	int phone_number;
	ArrayList <product> user_product=new ArrayList <product>();

	public user(String name1,String email1,String password1,String firstname1,String place1,int number) {
		name=name1;
		email=email1;
				password=password1;
		firstname=firstname1;
		place=place1;
		phone_number=number;
		
	}
	public boolean sign_in(String emaill,String pass ) {
		if (email==emaill&&password==pass) {
			return true;
		}
		else return false;
	}
	public void edit_name(String a ) {
		name =a;
	}public void edit_password(String a ) {
		password=a;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	}

}
