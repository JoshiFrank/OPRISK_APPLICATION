Feature: To Test Admin menu in Hierarchy Configuration in Configuration option  in System settings
@run
Scenario: To Test Admin menu in Authoritative Category Levels in Configuration option in System settings
Given To open the OneSumX application
When To click the Admin menu option in home page
When To mouse hover to System settings Option
When To click Configuration option in System settings
Then To validate Settings page
When To click Authoritative Category Levels link in Settings page
Then To validate Maintain Authoritative Category Level Hierarchy page
When To click cancel button in Maintain Authoritative Category Level Hierarchy page

@run
Scenario: To Test Admin menu in Location Levels in Configuration option in System settings
Given To open the OneSumX application
When To click the Admin menu option in home page
When To mouse hover to System settings Option
When To click Configuration option in System settings
Then To validate Settings page
When To click Location Levels link in Settings page
Then To validate Maintain Location Level Hierarchy page
When To click cancel button in Maintain Location Level Hierarchy page

