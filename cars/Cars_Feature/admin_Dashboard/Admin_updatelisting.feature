Feature:  update
Actor: Admin


Scenario: Admin want update listing
	Given Admin is sign in 
	When the Admin update  listing by key'3' and list name "sos"
	Then the  listing well update 
	 
	