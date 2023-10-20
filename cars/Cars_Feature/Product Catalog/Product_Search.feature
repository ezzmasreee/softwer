Feature:  Product_Search
Actor: Admin


Scenario: Admin want search product 
	Given Admin is loggedin 
	When the Admin search a new name_product"kia" and key number "1" and price "44" 
	Then the new product well appear
	