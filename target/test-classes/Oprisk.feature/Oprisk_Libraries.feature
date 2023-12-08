Feature: To Test the Libraries functionality

@run
Scenario: To Test the Risk function in Libraries
Given To open the OneSumX application 
When To mouse hover to Libraries
When To click the Risk option in Libraries
Then To validate the Maintain Risk register page
When To print the Group wide risk name in Maintain Risk register page
When To click the cancel button in Maintain Risk register page

@EndtoEnd
Scenario: To Test the Control fuction in Libraries
Given To open the OneSumX application
When To mouse hover to Libraries	
When To Click the control option in Libraries
Then To validate the maintain control register page
When To click the Risk icon in maintain control register page
When To click the Risk management Down Arrow button
When To Click the Add Groupwide control option
Then To validate the Add Groupwide control page 
When To Enter value in Groupwide control name in New Groupwide control 
When To Enter value in External reference in New Groupwide control
When To Enter value in Control Description in New Groupwide control
When To Enter value in Control Text in New Groupwide control
When To select the Dropdown in Control Category New Groupwide control
When To select the Dropdown in Control Classification New Groupwide control
When To select the Dropdown in Frequency in New Groupwide control
When To select the Dropdown in Start Month in New Groupwide control
When To click the Save button in New Groupwide control 
Then To Validate Edit Groupwild control page
When To Enter the loader id in Edit Groupwild control page
When To select the Dropdown in Source System in Edit Groupwild control page
When To click the Save button in Edit Groupwild control page
