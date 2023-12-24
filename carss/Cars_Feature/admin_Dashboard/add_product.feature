Feature:  add
Actor: Admin


Scenario: Admin want add product 
	Given Admin is sign in 
	When the Admin add a new name_product"kia" and key number "1" and price "44'
	Then the new product well add 
	