package login;

import static org.junit.Assert.assertEquals;

import Registration.Admin;
import io.cucumber.java.en.*;

public class Admin_login_steps {
	Admin admin;
	String username;
	String password;
	String email;
	public Admin_login_steps()
	{
		admin = new Admin("ezz","Ezzmasri@gmail.com","ezzmasri");
	}
	
@Given("Admin is not signed in")
public void admin_is_not_signed_in() {
    // Write code here that turns the phrase above into concrete actions
    admin.logout();
}

@When("The admin enters valid email {string} and correct password {string}")
public void the_admin_enters_valid_email_and_correct_password(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
 this.email="Ezzmasri@gmail.com";
 this.password="ezzmasri";
}

@Then("Admin enter to the system")
public void admin_enter_to_the_system() {
    // Write code here that turns the phrase above into concrete actions
	assertEquals( true,admin.login(email, password));
}

@Then("The system give welcome message {string}")
public void the_system_give_welcome_message(String string) {
    // Write code here that turns the phrase above into concrete actions
	assertEquals( true,admin.isLogged()  );
}

@When("The admin enters an invalid email {string}")
public void the_admin_enters_an_invalid_email(String string) {
    // Write code here that turns the phrase above into concrete actions
	this.email="invalidemail@gmail.com";
	 this.password="ezzmasri";
	
}

@Then("The system give an error message {string}")
public void the_system_give_an_error_message(String string) {
    // Write code here that turns the phrase above into concrete actions
	assertEquals( false,admin.login(email,password));
}

@Then("The admin remain\\/still on the login page")
public void the_admin_remain_still_on_the_login_page() {
    // Write code here that turns the phrase above into concrete actions
    System.out.printf("please enter valid email");
}

@When("The admin enters valid email {string} and incorrect password {string}")
public void the_admin_enters_valid_email_and_incorrect_password(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
	 this.email="Ezzmasri@gmail.com";
	 this.password="incorrectPassword";
}

@Then("The admin will stay in login page")
public void the_admin_will_stay_in_login_page() {
    // Write code here that turns the phrase above into concrete actions
	assertEquals( false,admin.login(email,password));
	System.out.printf("please enter the correct password");
}

}
