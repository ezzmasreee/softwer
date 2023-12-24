package product;

public class categories {
	String categ=new String();
	public boolean set_categories(String a) {
		categ=a;
		return true;
	}

	public String get_categories() {
		return categ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= new String(); a="ezz";
		String b=new String();
		b=a;
System.out.print(b);
	}

}
