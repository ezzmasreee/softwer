package Registration;
import product.*;
import java.util.ArrayList;

public class Admin {
	String name;
	public String email;
	public String password;
	ArrayList <product> Admin_product=new ArrayList <product>();
	ArrayList <categories> Admin_categories=new ArrayList <categories>();
	public ArrayList <user> Admin_user=new ArrayList <user>();
	categories c =new categories();
	product p=new product();
	protected boolean adislogged;
	
	public Admin(String a,String b,	String c){
		name=a;
		email=b;
		password=c;
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
	public void Add_categories(categories a) {
		Admin_categories.add(a);
		
	}
	public void edit_categories( int number,String a) {
		
	    Admin_product.get(number).pro_catagerois=a;
		
	}
public void deleat_categories( String a) {
	for ( categories element : Admin_categories) {
	    if (a.equalsIgnoreCase( element.get_categories())) 
	     Admin_categories.remove(element);
	  }
		
}

public void update_product_price(String name ,int a) {
	for (product product : Admin_product) {
		
		  if (product.get_name(product).equals(name)) {  
	product.edit_price(name, a);
		  }
		}

}
public void update_product_avalible(String name ,String avalibl) {
	for (product product : Admin_product) {
		
		  if (product.get_name(product).equals(name)) {  
	product.edit_availability(name, avalibl);
		  }
		}
}

	
	public void add_product(product a) {
		Admin_product.add(a);
		
	}
	public void View_coustmer() {
		System.out.printf("name\temail\tpasswoed\tplace\tnumber\n");
		
		for (int  i=0;i<Admin_user.size();i++) {
			System.out.printf("%s\t%s\t%s\t%s\t%d \n",Admin_user.get(i).name,Admin_user.get(i).email,Admin_user.get(i).password,Admin_user.get(i).place,Admin_user.get(i).phone_number);
		}
		
	}
	public void manage_coustmer(String email) {
		
		for (int  i=0;i<Admin_user.size();i++) {
	if(Admin_user.get(i).email.equalsIgnoreCase(email)) {
		Admin_user.remove(i);
	}
		}}
	public boolean sure_signup_user(String email,String pass) {
		for (int  i=0;i<Admin_user.size();i++) {
			if(Admin_user.get(i).email.equalsIgnoreCase(email)&&Admin_user.get(i).password.equalsIgnoreCase(pass) ) {
				return true;
			}
	}
		return false;
	}
	public void add_user(user a) {
		Admin_user.add(a);
	}
	public void show_product() {	System.out.printf("id number \tname\tdiscrivtion\tavalible\tcatagoirs\n");
		for (int  i=0;i<Admin_product.size();i++) {
		
			System.out.printf("%d\t%s\t%s\t%s\t%s \n",i,Admin_product.get(i).getname(),Admin_product.get(i).getdis(),Admin_product.get(i).getavali(),Admin_product.get(i).getpro_catagerois());
			
		}
		
		
	}
	public void browse(String name) {

		for (int  i=0;i<Admin_product.size();i++) {
	
		if(Admin_product.get(i).name.contains(name))
			System.out.printf("%d\t%s\t%s\t%s\t%s \n",i,Admin_product.get(i).getname(),Admin_product.get(i).getdis(),Admin_product.get(i).getavali(),Admin_product.get(i).getpro_catagerois());
	
		}
		
		
	}public void deleat_coustmer(String next) {
		for (int  i=0;i<Admin_user.size();i++) {
			if(Admin_user.get(i).email.equalsIgnoreCase(next)) Admin_user.remove(i);
		}
		
	}
	public static void main(String[] args) {
		
	

	}
	

}
