Feature: To Test Admin menu in System Configuration in Configuration option  in System settings
@run
Scenario: To Test Admin menu in Integrations Areas in Configuration option in System settings
Given To open the OneSumX application
When To click the Admin menu option in home page
When To mouse hover to System settings Option
When To click Configuration option in System settings
Then To validate Settings page
When To click Integrations Areas link in Settings page
Then To validate Questionnaire Integrations page
When To click cancel button in Questionnaire Integrations page

@run
Scenario: To Test Admin menu in Issues Log Administrator in Configuration option in System settings
Given To open the OneSumX application
When To click the Admin menu option in home page
When To mouse hover to System settings Option
When To click Configuration option in System settings
Then To validate Settings page
When To click Issues Log Administrator link in Settings page
Then To validate Issues Log Administrator page 
When To click cancel button in Issues Log Administrator page  

