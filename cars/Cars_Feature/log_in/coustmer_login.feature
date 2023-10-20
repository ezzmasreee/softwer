Feature: Coustmer Login
Actor: Coustmer


Scenario: Coustmer login successfuly
	Given Coustmer is not signed in
	When The Coustmer enters valid email "Ezzmasri@gmail.com" and correct password "ezzmasri"
	Then Coustmer enter to the system
	And The system give welcome message "Welcome Admin"
	
	Scenario: Coustmer email not valid
		Given Coustmer is not signed in
		When The Coustmer enters an invalid email "invalidemail@gmail.com"
		Then The system give an error message "Invalid email"
		And The Coustmer remain/still on the login page
		
		Scenario: Incorrect Coustmer password
			Given Coustmer is not signed in
			When The Coustmer enters valid email "validemail@gmail.com" and incorrect password "incorrectPassword"
		  Then The system give an error message "Incorrect Password"
  		And The Coustmer will stay in login page
  		
  		