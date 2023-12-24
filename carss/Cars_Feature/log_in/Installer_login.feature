Feature: Installer Login
Actor: Installer


Scenario: Installer login successfuly
	Given Installer is not signed in
	When The admin enters valid email "Ezzmasri@gmail.com" and correct password "ezzmasri"
	Then Installer enter to the system
	And The system give welcome message "Welcome Admin"
	
	Scenario: Installer email not valid
		Given Installer is not signed in
		When The Installer enters an invalid email "invalidemail@gmail.com"
		Then The system give an error message "Invalid email"
		And The Installer remain/still on the login page
		
		Scenario: Incorrect Installer password
			Given Installer is not signed in
			When The Installer enters valid email "validemail@gmail.com" and incorrect password "incorrectPassword"
		  Then The system give an error message "Incorrect Password"
  		And The Installer will stay in login page
  		
  		