package product;

import java.util.ArrayList;
import java.util.List;

public class product {
	ArrayList <categories> product_categories=new ArrayList <categories>();
	public String name;
	String description;
	int x;
	protected boolean isFounded;
	String avaliable;
	public String pro_catagerois;
	public product() {
		
	}
	
	public product(String a,String b,String c ,String w){
		
		name=a;
		description=b;
		
		avaliable=c;
		pro_catagerois=w;
	}
	public String  getname() {
		return name;
	}
	public String  getdis() {
		return description;
	}
	public String  getavali() {
		return avaliable;
	}
	public String  getpro_catagerois() {
		return pro_catagerois;
	}
	public boolean add_product(String a,String b,String c ,String w){
		name=a;
		description=b;
		
		avaliable=c;
		pro_catagerois=w;
		return true;
	}
	public void view_product() {
		System.out.printf("%s\t%s\t%s\t%s \n",name ,description ,avaliable,pro_catagerois);
	}
	public void view_categories() {
		for (int  i=0;i<product_categories.size();i++) {
			System.out.println(product_categories.get(i).categ);
	}}
public void edit_availability(String name,String av) {
	this.avaliable=av;
}
public void edit_price( String name, int a) {
	this.x=a;
}
public String get_name(product p) {
	return p.name;
}
public List<categories> search(String text) {
    List<categories> result = new ArrayList<>();

    for (categories category : product_categories) {
        if (category.get_categories().toLowerCase().contains(text.toLowerCase())) {
            result.add(category);
        }
    }

    return result;
}

	public static void main(String[] args) {
		categories a = new categories();
		a.categ="ezz masre";
		product s=new product();
		s.product_categories.add(a);
		System.out.print(s.product_categories.get(0).categ);
		
		// TODO Auto-generated method stub

	}
	

}
