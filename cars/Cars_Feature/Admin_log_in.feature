Feature: Admin Login
Actor: Admin


Scenario: Admin login successfuly
	Given Admin is not signed in
	When The admin enters valid email "Ezzmasri@gmail.com" and correct password "ezzmasri"
	Then Admin enter to the system
	And The system give welcome message "Welcome Admin"
	
	Scenario: Admin email not valid
		Given Admin is not signed in
		When The admin enters an invalid email "invalidemail@gmail.com"
		Then The system give an error message "Invalid email"
		And The admin remain/still on the login page
		
		Scenario: Incorrect Admin password
			Given Admin is not signed in
			When The admin enters valid email "validemail@gmail.com" and incorrect password "incorrectPassword"
		  Then The system give an error message "Incorrect Password"
  		And The admin will stay in login page
  		
  		