@run
Feature: To validate the control view approval in risk management
@cvp
Scenario: To validate the control view approval in risk management

    Given To open the OneSumX application 
	When To MouseOver on the Risks option in home page 
	And To click the Risk & Self-Assesment(RCSA) link 
	Then Validate the Risk & Self-Assesment(RCSA) page 
	When To click the checkbox in RIMA
	And To click the reassign option in RCSA page
	Then To validate the Risk assessment selected pop up
	When To select joshi franklin in select person dropdowm 
	And To click save in Risk assessment selected pop up
	And To click close in Risk assessment selected pop up
	And To click Risk assessment link RCSA page
	Then To validate the RCSA control view page
	When To click the proceed to approval button in control view page
	Then To Validate the RCSA approval page
	When To click the check box in RCSA approval page
	When To Enter value in comment box in RCSA approval page
	When To click the review dropdown in RCSA approval page
	And To select one reviewer in review dropdown in RCSA approval page
	And To click the RA save button in RCSA approval page
	And To click the history option in RCSA approval page
	Then To validate history option in RCSA approval page
	
	
	
		
	 
	
	