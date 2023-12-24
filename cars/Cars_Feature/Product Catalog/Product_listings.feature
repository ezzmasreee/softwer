Feature:  Product_listings
Actor: Admin


Scenario: Admin want listing product 
	Given Admin is logg in 
	When the Admin list a new name_product"kia" and key number "1" and price "44"  and image "photo" and availability "YES"
	Then the new product well listing
	