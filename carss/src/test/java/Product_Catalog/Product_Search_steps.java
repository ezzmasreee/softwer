package Product_Catalog;

import static org.junit.Assert.assertEquals;

import Registration.*;
import io.cucumber.java.en.*;
import product.product;
public class Product_Search_steps {
	Admin admin;
	
	 product product;
	public Product_Search_steps()
	{
		admin = new Admin("ezz","Ezzmasri@gmail.com","ezzmasri");
		product=new product();
	}
	@Given("Admin is loggedin")
	public void admin_is_loggedin() {
	    // Write code here that turns the phrase above into concrete actions
		admin.login("Ezzmasri@gmail.com","ezzmasri");
	    
	}

	@When("the Admin search a new name_product\"kia\" and key number {string} and price {string}")
	public void the_admin_search_a_new_name_product_kia_and_key_number_and_price(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		product.search("kia");
	    
	}

	@Then("the new product well appear")
	public void the_new_product_well_appear() {
	    // Write code here that turns the phrase above into concrete actions
		assert( true);
	}

}

