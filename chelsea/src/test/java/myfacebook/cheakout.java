package myfacebook;

import io.cucumber.java.en.*;

public class cheakout {
	public int x;
	@Given("I have {int} nis")
	public void i_have_nis(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   x=int1;
	    
	}

	@When("I complete action")
	public void i_complete_action() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I shoud have zero nis")
	public void i_shoud_have_zero_nis() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
