package Product_Catalog;

import static org.junit.Assert.assertEquals;

import Registration.Admin;
import io.cucumber.java.en.*;
import product.categories;
import product.*;

public class Product_listings_steps {
	Admin admin;
	
	 product product;
	 categories cat;
	public Product_listings_steps()
	{
		admin = new Admin("ezz","Ezzmasri@gmail.com","ezzmasri");
		product=new product();
		cat=new categories();
	}
	@Given("Admin is logg in")
	public void admin_is_logg_in() {
	    // Write code here that turns the phrase above into concrete actions
		admin.login("Ezzmasri@gmail.com","ezzmasri");
	}

	@When("the Admin list a new name_product\"kia\" and key number {string} and price {string}  and image {string} and availability {string}")
	public void the_admin_list_a_new_name_product_kia_and_key_number_and_price_and_image_and_availability(String string, String string2, String string3, String string4) {
	    // Write code here that turns the phrase above into concrete actions
	    product.add_product("BMW","New BMW car",4,"yes" ,cat);
	 
	}

	@Then("the new product well listing")
	public void the_new_product_well_listing() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals( true,product.add_product("BMW","New BMW car",4,"yes" ,cat));
	    
	}

}

