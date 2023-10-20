package product;

import java.util.ArrayList;

public class product {
	ArrayList <categories> product_categories=new ArrayList <categories>();
	String name=new String();
	String description=new String();
	int x;
	String avaliable=new String();
	product(){
		
	}
	product(String a,String b,int x,String c ,categories w){
		name=a;
		description=b;
		this.x=x;
		avaliable=c;
		product_categories.add(w);
	}
	public void view_product() {
		System.out.printf("%s\t%s\t%d\t%s",name ,description ,x,avaliable);
	}
	public void view_categories() {
		for (int  i=0;i<product_categories.size();i++) {
			System.out.println(product_categories.get(i).categ);
	}}

	public static void main(String[] args) {
		categories a = new categories();
		a.categ="ezz masre";
		product s=new product();
		s.product_categories.add(a);
		System.out.print(s.product_categories.get(0).categ);
		
		// TODO Auto-generated method stub

	}

}
