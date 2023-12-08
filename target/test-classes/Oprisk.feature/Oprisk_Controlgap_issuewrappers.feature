Feature: To test the issue wrappers functionality

@EndtoEnd
Scenario: To test the issue wrappers functionality

Given To open the OneSumX application
When To mouse hover to Control Gap Management
And To click the issue wrappers option 
Then To validate the issue wrappers page
When To click the Add new button issue wrappers page
Then To validate the issue wrappers select senior organisation unit
When To click the office of the president icon in issue wrappers select senior organisation unit
When To click the president icon in issue wrappers select senior organisation unit
When To click the radio button of risk management in issue wrappers select senior organisation unit
And To click the proceed button in issue wrappers select senior organisation unit
Then To validate the Add issue wrappers page
When To Enter the value in wrapper Title box in Add issue wrappers page
And To Enter the value in wrapper Reference box in Add issue wrappers page
And To Enter the value in wrapper Notes box in Add issue wrappers page
And To select dropdown option in Originator Type in Add issue wrappers page
And To click the Save button in Add issue wrappers page
Then To validate the Edit issue wrapper page
When To click the Add new reference button in Edit issue wrapper page
Then To validate the Add new reference popup page
When To click the choose file in Add new reference page
And To Enter the value in Reference Source System box in Add new reference page
And To Enter the value in Reference Description box in Add new reference page
And To click the check bok in Shared in Add new reference page
And To Enter the value in Loader Id box in Add new reference page
And To select dropdown option in Source System in Add new reference page
And To click the Attach and close in Add new reference page
And to click the save button in Edit issue wrapper page

@run
Scenario: To Test the issue wrappers Add Existing page functionality

Given To open the OneSumX application
When To mouse hover to Control Gap Management
And To click the issue wrappers option 
Then To validate the issue wrappers page
When To click the onesum under the title in issue wrappers page
Then To validate the Edit issue wrapper page
When To click the Add Existing reference button in Edit issue wrapper page
Then To validate the Search Reference library page
When To click the required checkbox under the Reference source system
When To click the save button in Search Reference library page
Then  To validate the  uploaded file in Edit issue wrapper page 
When to click the save button in Edit issue wrapper page






