Feature: ViewOrder
Actor: Coustmer


Scenario: Coustmer view ordder 
	Given Coustmer is loggedin
	When The Coustmers want to see history and installation requests
	Then the history appear
	
	