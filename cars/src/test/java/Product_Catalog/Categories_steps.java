package Product_Catalog;

import static org.junit.Assert.assertEquals;

import Registration.Admin;
import io.cucumber.java.en.*;
import product.categories;

public class Categories_steps {
	Admin admin;
	 categories cat;
	public Categories_steps()
	{
		admin = new Admin("ezz","Ezzmasri@gmail.com","ezzmasri");
		cat=new categories();
	}
	@Given("Admin is logged in")
	public void admin_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    admin.login("Ezzmasri@gmail.com", "ezzmasri");
	}

	@When("the Admin add a new name_product\"kia\" and key number {string} and price {string} and want to add categories {string}")
	public void the_admin_add_a_new_name_product_kia_and_key_number_and_price_and_want_to_add_categories(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    cat.set_categories("abc");
	}

	@Then("the categories product well add")
	public void the_categories_product_well_add() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals( true,cat.set_categories("abc"));
	}
}