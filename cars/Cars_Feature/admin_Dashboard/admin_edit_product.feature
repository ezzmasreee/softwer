Feature:  add
Actor: Admin


Scenario: Admin want edit product 
	Given Admin is sign in 
	When the Admin edit a new name_product"kia" and key number "1" and price "44'
	Then the  product well update  
	