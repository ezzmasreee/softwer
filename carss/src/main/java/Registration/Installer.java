package Registration;

import java.util.ArrayList;



public class Installer {
	String name;
	String email;
	String password;
	ArrayList <String> user_request=new ArrayList <String>();
	
	ArrayList <String> admin_appointment=new ArrayList <String>();
	ArrayList <String> appointment_date=new ArrayList <String>();
	String model;
	String date ;
	
	public Installer(String a,String b,	String c){
		name=a;
		email=b;
		password=c;
	}
	public void user_request	(String a,String b) {
		user_request.add(a+":"+b);
	}
	void 		admin_request(String a,String b) {
		 admin_appointment.add(a);
		 appointment_date.add(b);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void Showappoitment() {
		for (int i=0;i<admin_appointment.size();i++)
			System.out.println(admin_appointment.get(i));
		// TODO Auto-generated method stub
		
	}public void Showrequest() {
		for (int i=0;i<user_request.size();i++)
			System.out.println(user_request.get(i));
		// TODO Auto-generated method stub
		
	}
	
	public void Sendappoitment(String nextLine) {
		// TODO Auto-generated method stub
		admin_appointment.add(nextLine);
	}

}
