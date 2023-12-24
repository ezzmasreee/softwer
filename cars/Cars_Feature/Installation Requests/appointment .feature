Feature: user
Actor: user


Scenario: admin want appointment
	Given admin is sighn in 
	When the admin enter "his name to requst"
	Then Installer save the appointment
	