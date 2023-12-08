Feature: To Test Admin menu in Reporting in Configuration option  in System settings
@run
Scenario: To Test Admin menu in Folders in Configuration option in System settings
Given To open the OneSumX application
When To click the Admin menu option in home page
When To mouse hover to System settings Option
When To click Configuration option in System settings
Then To validate Settings page
When To click Folders link in Settings page
Then To validate Maintain Reports Folders page
When To click cancel button in Maintain Reports Folders page

@run
Scenario: To Test Admin menu in User Report Defaults in Configuration option in System settings
Given To open the OneSumX application
When To click the Admin menu option in home page
When To mouse hover to System settings Option
When To click Configuration option in System settings
Then To validate Settings page
When To click User Report Defaults link in Settings page
Then To validate User Report Defaults page
When To click cancel button in User Report Defaults page
	
	