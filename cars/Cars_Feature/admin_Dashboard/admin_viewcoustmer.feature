Feature:  update
Actor: Admin


Scenario: Admin want view coustmer
	Given Admin is sign in 
	When the Admin search coustmer by email "ezzmasre@gmail" 
	Then the  coustmer well show 
	 
	