Feature:  add
Actor: Admin


Scenario: Admin want add listing
	Given Admin is sign in 
	When the Admin add a new listing
	Then the new listing well add 
	