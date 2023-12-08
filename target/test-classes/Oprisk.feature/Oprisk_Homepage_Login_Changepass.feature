@run
Feature: To test the change password functionality 

Scenario: To validate the change password functionality 

	Given To open the OneSumX application 
	When To click Login button 
	When To click Product Ext Password
	Then To validate Change password
	When To click cancel in change password
	Then To validate Workspace