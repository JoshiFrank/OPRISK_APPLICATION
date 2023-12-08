@run
@EndtoEnd
Feature: To Test Admin menu Questionnaires in Risk Framework option

Scenario: To Test Admin menu Questionnaires in Risk Framework option
Given To open the OneSumX application
When To click the Admin menu option in home page
When To mouse hover to Risk Framework option 
When To click the Questionnaires in Risk Framework option
Then To validate the Manage Questionnaires page
When To click the the Add new button in Manage Questionnaires page
Then To validate Add Questionnaire page
When To Enter the value in Title box in Add Questionnaire page
When To click the Save button in Add Questionnaire page
Then To validate the Modify Questionnaire page
When To click the insert button in Modify Questionnaire page
Then To validate the Add question page
When To select the drop down option in choose an item type in Add question page
Then To validate the Add question with choose an item type in Add question page
When To Enter value in question box in Add question page
When To Enter value in question Alias box in Add question page
When To Enter value in Explanatory Text box in Add question page
When To click the check box in Required default value in Add question page
When To select dropdown option in display type in Add question page
When To click the check box in Allow additonal answer in Add question page
When To Enter value in loader id box in in Add question page
When To select dropdown option source system in Add question page
When To click the save button in Add question page
Then To validate result Modify Questionnaire page 

