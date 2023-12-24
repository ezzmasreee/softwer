Feature:  manage
Actor: Admin


Scenario: Admin want manage coustmer
	Given Admin is sign in 
	When the Admin search coustmer by email "ezzmasre@gmail" and want change his place "nabluse"
	Then the  costmer have new data
	 
	