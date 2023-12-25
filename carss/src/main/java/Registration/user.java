package Registration;

import java.util.ArrayList;

import product.product;

public class user {
	public String name;
	public String email;
	String password;
	String firstname;
	String place;
	int phone_number;
	String appoitment;
	ArrayList <product> user_product=new ArrayList <product>();
	protected boolean adislogged;
	
	public user(String name1,String email1,String password1,String place1,int number) {
		name=name1;
		email=email1;
				password=password1;
	
		place=place1;
		phone_number=number;
		
	}
	public boolean sign_in(String emaill,String pass ) {
		if (email.equalsIgnoreCase(emaill)&&password.equalsIgnoreCase(pass)) {
			return true;
		}
		else return false;
	}
	public boolean login(String a,String b)
	{
		this.adislogged = this.email.equals(a);
		this.adislogged = this.password.equals(b);
		return this.adislogged;
	}
	

	public boolean logout()
	{
		this.adislogged = false;
		return this.adislogged;
	}
	
	public boolean isLogged()
	{
		return this.adislogged;
	}
	public void edit_name(String a ) {
		name =a;
	}public void edit_password(String a ) {
		password=a;
	} public void view_order(){
		System.out.println(user_product.size());
		for (int  i=0;i<user_product.size();i++) { 
			
			user_product.get(i).view_product();
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	}
	public void addproduct(product product) {
		user_product.add(product);
		// TODO Auto-generated method stub
		
	}

}
