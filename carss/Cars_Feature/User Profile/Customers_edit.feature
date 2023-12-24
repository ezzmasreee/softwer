Feature:  Customers_edit
Actor: Customers


Scenario: Coustmer edit successfuly
	Given Coustmer is signed_in
	When The Coustmer with email "Ezzmasri@gmail.com" and want to edit his phone to "12234"
	Then Coustmer edit successfuly
	And The system give message "done"
	
	