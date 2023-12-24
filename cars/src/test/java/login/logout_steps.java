package login;

import static org.junit.Assert.assertEquals;

import Registration.user;
import io.cucumber.java.en.*;

public class logout_steps {
    user user;
	String username;
	String password;
	String email;
	public logout_steps()
	{
		//user= new user("amona","amona1@gmail.com","123am","Amna","Nablus",119);
	}
	@Given("person is  signed in")
	public void person_is_signed_in() {
	    // Write code here that turns the phrase above into concrete actions
		user.login(email, password);
	}

	@When("The person said {string}")
	public void the_person_said(String string) {
	    // Write code here that turns the phrase above into concrete actions
		user.logout();
	}
	

	@Then("person out  the system")
	public void person_out_the_system() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals( false,user.logout());
	}


}
