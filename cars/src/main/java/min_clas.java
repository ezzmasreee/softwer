import java.net.Authenticator;
import java.util.Properties;
import java.util.Scanner;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import Registration.*;
import product.product;

import java.util.Properties;

public class min_clas {
	static Admin ezz;
	static Installer nahida;
	static  Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {/*
		admin_regstrethion();// admin ishlize
		Installation_regstre();
		admin_addproduct();
		
		  
		while (true ) {
			 System.out.println("select one  ");
			  System.out.print("1_Admin \n2-User \n3-Installer\n");
			 
			
			  int who_now = scanner.nextInt();
			if(who_now==1) admin_choice();
			else if(who_now==2) user_choice();
			else if(who_now ==3) installer_choice();
	}*/}
/*
	private static void installer_choice() {
		 System.out.println("sign up enter your email and password");
		 String a= scanner.nextLine();
		 String b= scanner.nextLine();
		 System.out.println("sign in succesfull");
			
		
		while (true) {
		 System.out.println("1-view coustmer request  \n2-view admin appoitment \n3-view product list");
		 int y= scanner.nextInt();
		 if (y==1) {nahida.showrequest(); }
		 else if(y==2) {nahida.showappoitment(); }
		 else if(y==3) {ezz.show_product();       }
		 else if(y==4) {break; }}
		
	}

	private static void Installation_regstre() {
		
	nahida=new Installer("nahid","nahida.gmail","barcha");
		
	}

	private static void admin_addproduct() {
		product a=new product("steering wheel"," control the direction of the car wheels","avaliable","interio");
		ezz.add_product(a);
	 a=new product("Fuel gauge"," the amount of fuel left in your car's","avaliable","interio");
	 ezz.add_product(a);
		 a=new product("Air Ventilation "," air recirculation","avaliable","interio");
		 ezz.add_product(a);
		 a=new product("Power Window"," replaced the traditional manual handle","avaliable","interio");ezz.add_product(a);
		 a=new product("Airbags","are intended to work in conjunction with seat belts,","avaliable","interio");ezz.add_product(a);
		 
		 a=new product("Bumpers"," protecting the front and rear ends in low-speed","avaliable","Exterior "); ezz.add_product(a);
		 a=new product("Doors"," viewing from inside the vehicle","avaliable","Exterior "); ezz.add_product(a);
		 a=new product("Indicator lights","These lights flash to indicate to the drivers","avaliable","Exterior "); ezz.add_product(a);
		 a=new product("quarter panel","the side panel of the vehicle that usually wraps","avaliable","Exterior "); ezz.add_product(a);
		 
		 a=new product("DC Converter","The traction battery pack delivers a constant voltage","avaliable","Electronics "); ezz.add_product(a);
		 a=new product("Electric motor","The motor converts the electrical energy into kinetic energy","avaliable","Electronics "); ezz.add_product(a);
		 a=new product("Power Inverter","It coverts DC power from the batteries to AC power","avaliable","Electronics "); ezz.add_product(a);
		 a=new product("Charge Port","onnects the electric vehicle to an external supply.","avaliable","Electronics "); ezz.add_product(a);
	}

	private static void user_choice() {
		 System.out.println("1-sign in\n2-sign up \nchose number  ");
		 int x=scanner.nextInt();
		 user a = null;
		 if(x==1) {
			 System.out.println("pls enter your name email password  place  phone_number");
		  a= new user( scanner.next(),scanner.next(),scanner.next(),scanner.next(),scanner.nextInt());
		 ezz.add_user(a);
		ezz.View_coustmer();
		 
		 }
		 else { 	 System.out.println("pls enter your email and password to sign");  
		if( ezz.sure_signup_user(scanner.next(), scanner.next())) {
			 System.out.println("succed login");  
		}
		else {   System.out.println("incorect input");  ezz.sure_signup_user(scanner.next(), scanner.next());    }
		 }
		 while (true ) {
			 System.out.println("1-Show products\n2-Browse product\n3-make purchases\n4-view orders\n5-edit profile\n6-Installer request\n7-log out");
			 
			 int y=scanner.nextInt();
			 if(y==1) {     ezz.show_product();      }
			 if(y==2) { System.out.println("enter the name of your search ");ezz.browse(scanner.next());             }
			 if(y==3) { System.out.println("enter the ID number "); a=addproduct(a,scanner.nextInt());  sendemail();  }
			 if(y==4) {  a.view_order();       }
			 if(y==5) { System.out.println("1-change name\n2-change password ");int m= scanner.nextInt();if(m==1)a.edit_name(scanner.next()); else a.edit_password(scanner.next());           }
			 if(y==6) {  System.out.println("write a time u want meet the Installer  "); nahida.user_request(scanner.next(),a.name);        }
			 if(y==7)break;
			
			 
		 }
		 
		 
		 
		 
		 }
		
	

	private static void sendemail() {
		 String from = "s12011015@stu.najah.edu";
	        String to = "ezzmasre2002@gmail.com";

	        // Set the host and port for the SMTP server
	        String host = "smtp.gmail.com";
	        String port = "587";

	        // Set the username and password for your email account
	        final String username = "s12011015@stu.najah.edu";
	        final String password = "eNd@69843";

	        // Set additional properties
	        Properties props = new Properties();
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", host);
	        props.put("mail.smtp.port", port);

	        // Create a session with authentication
	        Session session = Session.getInstance(props,
	                new javax.mail.Authenticator() {
	                    protected PasswordAuthentication getPasswordAuthentication() {
	                        return new PasswordAuthentication(username,"dbrq dmwx odam kold");
	                    }
	                });

	        try {
	            // Create a MimeMessage object
	            Message message = new MimeMessage(session);

	            // Set the sender and recipient addresses
	            message.setFrom(new InternetAddress(from));
	            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));

	            // Set the subject and body of the email
	            message.setSubject("Test Email");
	            message.setText("This is a test email sent from Java.");

	            // Send the email
	            Transport.send(message);

	            System.out.println("Email sent successfully.");

	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
		}

	private static user addproduct(user a,int j) {
		
				
		a.addproduct(ezz.admin_product.get(j));
		
		
		
			
		
	
		return a;
	}

	private static void admin_choice() {
		System.out.println("sign up\nenter your email and password\n");
		while (true ) {
		if(ezz.email.equalsIgnoreCase(scanner.next())&& ezz.password.equalsIgnoreCase(scanner.next())) { System.out.println("sign up succesful\n"); break;}
		else System.out.println("try again \n");
		}
		while(true) {
		System.out.println("1_manage product\n2-manage categories\n3-view coustmer\n4-manage coustmer\n5-view installer appotment\n6-send request appoitment\n7-log out ");
		int y=scanner.nextInt();
		if(y==1) {mangeproduct();    }
		else if(y==2)manage_catagories();
		else if(y==3)ezz.View_coustmer();
		else if(y==4) {System.out.println("enter the gmail to delete the coustmer"); ezz.deleat_coustmer(scanner.next()) ;}
		else if(y==5) { nahida.showappoitment();}
		else if(y==6) {nahida.sendappoitment(scanner.nextLine());       }
		else if(y==7)break;}
		
		
	}

	private static void manage_catagories() {
		System.out.println("pls enter the index of product and categories");
		ezz.edit_categories(scanner.nextInt(),scanner.next());
		
	}

	private static void mangeproduct() {
		while (true ) {
			System.out.println("1-view product listing\n2-add product\n3-deleate product\n4-exit");
			int x=scanner.nextInt();
			if(x==1)ezz.show_product(); 
			else if(x==2) {System.out.println("insert name and discp also avalible and caatagiors for the product"); 
			product a=new product(scanner.nextLine(),scanner.nextLine(),scanner.next(),scanner.next());
			ezz.add_product(a); }
			else if(x==3) { System.out.println("enter the index of product "); ezz.admin_product.remove(scanner.nextInt()); }
			else if(x==4)break;
			
		}
		
	}

	private static void admin_regstrethion() {
		// TODO Auto-generated method stub
		ezz=new Admin ("ezz","s12011015@stu.najah.edu","ezzmasre");
	//	nahida=new Admin ("nahida","s12011015@stu.najah.edu","nahida");

		
		
	}*/

}
