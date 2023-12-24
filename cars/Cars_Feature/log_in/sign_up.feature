Feature:  sign up
Actor: user


Scenario: user login successfuly
	Given user is not signed in
	When The user enters first name"ezz"  and  last name "masre" and place "nabluse" and valid email "Ezzmasri@gmail.com" and password "ezzmasri" 
	Then user enter to the system
	And The system give welcome message "Welcome "