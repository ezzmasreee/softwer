package admin_dashboard;

import Registration.Admin;
import io.cucumber.java.en.*;

public class admin_addlisting_steps {
	Admin a;

@When("the Admin add a new listing")
public void the_admin_add_a_new_listing(String listing ,int key ) {
	a.add_product(null);
	
	
    // Write code here that turns the phrase above into concrete actions
}

@Then("the new listing well add")
public void the_new_listing_well_add() {
	assert (true );
    // Write code here that turns the phrase above into concrete actions
}

}

