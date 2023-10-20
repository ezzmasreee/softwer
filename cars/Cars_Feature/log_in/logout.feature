Feature:  Logout


Scenario:  logout successfuly
	Given person is  signed in
	When The person said "logout"
	Then person out  the system
	And The system give welcome message "logout sucessfuly"
	
