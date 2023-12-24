package login;

import static org.junit.Assert.assertEquals;

import Registration.user;
import io.cucumber.java.en.*;

public class coustmer_login_steps {
    user user;
	String username;
	String password;
	String email;
	public coustmer_login_steps()
	{
		user= new user("amona","amona1@gmail.com","123am","Amna","Nablus",119);
	}
	
@Given("Coustmer is not signed in")
public void coustmer_is_not_signed_in() {
    // Write code here that turns the phrase above into concrete actions
	user.logout();
}

@When("The Coustmer enters valid email {string} and correct password {string}")
public void the_coustmer_enters_valid_email_and_correct_password(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
	this.email="amona1@gmail.com";
	 this.password="123am";
}

@Then("Coustmer enter to the system")
public void coustmer_enter_to_the_system() {
    // Write code here that turns the phrase above into concrete actions
	assertEquals( true,user.login(email, password));
}

@When("The Coustmer enters an invalid email {string}")
public void the_coustmer_enters_an_invalid_email(String string) {
    // Write code here that turns the phrase above into concrete actions
	this.email="invalidemail@gmail.com";
	 this.password="123am";
}

@Then("The Coustmer remain\\/still on the login page")
public void the_coustmer_remain_still_on_the_login_page() {
    // Write code here that turns the phrase above into concrete actions
	assertEquals( false,user.isLogged()  );
}

@When("The Coustmer enters valid email {string} and incorrect password {string}")
public void the_coustmer_enters_valid_email_and_incorrect_password(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
	this.email="amona1@gmail.com";
	 this.password="am123";
}

@Then("The Coustmer will stay in login page")
public void the_coustmer_will_stay_in_login_page() {
    // Write code here that turns the phrase above into concrete actions
	assertEquals( false,user.isLogged()  );
}



}
