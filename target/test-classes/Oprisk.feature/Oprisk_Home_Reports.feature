@run
Feature: To validate the Reports functionality in Home option 

Scenario: To test the reports function in Home option 

	Given To open the OneSumX application 
	When To click the Home option in Homepage
	When To click the Reports option in Home 
	Then To validate the Reports page 
	When To click Filter icon 
	Then To validate the Reports option 
	When To click Filter icon 
	Then To validate the Reports option

Scenario: To test the dropdown of Manage filter option


	Given To open the OneSumX application 
	When To click the Home option in Homepage 
	And To click the Reports option in Home 
	Then To validate the Reports page 
	When To click Filters arrow
	And To click My application reports
	Then To validate My application reports
	When To click Filters arrow
	And To click My Data Extracts
	Then To validate My Data Extracts 
	When To click Filters arrow
	And To Click My user reports		
	Then To validate my user reports
	When To click Filters arrow
	And To Click Sample user reports
	Then To validate Sample user reports	
		
		
	
