package Registration;
import product.*;
import java.util.ArrayList;

public class Admin {
	String name;
	String email;
	String password;
	ArrayList <product> admin_product=new ArrayList <product>();
	ArrayList <categories> admin_categories=new ArrayList <categories>();
	ArrayList <user> admin_user=new ArrayList <user>();
	
	Admin(String a,String b,	String c){
		name=a;
		email=b;
		password=c;
	}
	public void add_categories(categories a) {
		admin_categories.add(a);
		
	}
	public void edit_categories( int number,String a) {
		
		// must full
		
	}
public void deleat_categories( String a) {
		
		//must full
		
	}

public void update_product_price(String name ,int a) {
	
	
}
public void update_product_avalible(String name ,String avalibl) {
	
	
}

	
	public void add_product(product a) {
		admin_product.add(a);
		
	}
	public void View_coustmer() {
		System.out.printf("name\temail\tpasswoed\tplace\tnumber\n");
		
		for (int  i=0;i<admin_user.size();i++) {
			System.out.printf("%s\t%s\t%s\t%s\t%d",admin_user.get(i).name,admin_user.get(i).email,admin_user.get(i).password,admin_user.get(i).place,admin_user.get(i).phone_number);
		}
		
	}
	public void manage_coustmer(String email) {
		
		for (int  i=0;i<admin_user.size();i++) {
	if(admin_user.get(i).email.equalsIgnoreCase(email)) {
		admin_user.remove(i);
	}
		}}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
