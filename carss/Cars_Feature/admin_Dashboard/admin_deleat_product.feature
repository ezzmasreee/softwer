Feature:  delete
Actor: Admin


Scenario: Admin want delete product 
	Given Admin is sign in 
	When the Admin delete a product by key number'2'
		Then the  product well delete  
	