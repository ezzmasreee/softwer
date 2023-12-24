Feature:  addcategories
Actor: Admin


Scenario: Admin want add categories
	Given Admin is logged in
	When the Admin add a new name_product"kia" and key number "1" and price "4" and want to add categories "Interior, Exterior, Electronics"
	Then the categories product well add 
	
