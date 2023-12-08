@run
Feature: To test the About functionality in login option in homepage 

Scenario: To Test the Details option- dashboard in Login dropdown 

	Given To open the OneSumX application 
	When To click Login button 
	When To click Details option in Login dropdown 
	When To click Dashboard option 
	Then To validate dashboard options 
	When To click Create a new dashboard 
	When To click Next button 
	Then To validate dashboard layout page 
	#When Navigate to back 
	Then To validate Personal Details page 
	When To click Cancel button 
	Then To validate Workspace 
	