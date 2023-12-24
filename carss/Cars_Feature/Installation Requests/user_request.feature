Feature: user
Actor: user


Scenario: user want request
	Given user is sighn in 
	When the user enter "his name to requst"
	Then Installer save the request
	