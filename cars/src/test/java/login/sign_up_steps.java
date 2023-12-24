package login;

import static org.junit.Assert.assertEquals;

import Registration.user;
import io.cucumber.java.en.*;

public class sign_up_steps {
	 user user;
	 String name="nahida";
		String email="nahida.aghbar@gmail.com";
		String password="na123";
		String firstname="nahida";
		String place="nablus";
		int phone_number=123;
		public sign_up_steps()
		{
			user= new user(name,email,password,firstname,place,phone_number);
		}
@Given("user is not signed in")
public void user_is_not_signed_in() {
    // Write code here that turns the phrase above into concrete actions\
	System.out.printf("do you want to sig up?");
}

@When("The user enters first name{string}  and  last name {string} and place {string} and valid email {string} and password {string}")
public void the_user_enters_first_name_ezz_and_last_name_and_place_and_valid_email_and_password(String string, String string2, String string3,String string4, String string5) {
    // Write code here that turns the phrase above into concrete actions
	user.sign_in(email, password);
}

@Then("user enter to the system")
public void user_enter_to_the_system() {
    // Write code here that turns the phrase above into concrete actions
	assertEquals( true,user.sign_in(email, password));
}

}
