@run
Feature: To test the Workspace setting in Homepage Login 

Scenario: To validate the Workspace settings in Homepage Login 

	Given To open the OneSumX application 
	When To click Login button 
	When To Click workspace settings
	Then To Validate the workspace settings
	Then To validate the individual settings
	When To click Save in workspace settings
	When To click OK
	When To click Cancel in workspace settings
	Then To validate Workspace
