Feature: To Test Admin menu in Golbal setting in Configuration option  in System settings
@run
Scenario: To Test Admin menu in Generic list defaults in Configuration option in System settings
Given To open the OneSumX application
When To click the Admin menu option in home page
When To mouse hover to System settings Option
When To click Configuration option in System settings
Then To validate Settings page
When To click Generic list defaults link in Settings page
Then To validate Maintain Global Generic List Default Preferences page
When To click cancel button in Maintain Global Generic List Default Preferences page

@run
Scenario: To Test Admin menu in Global dashboards in Configuration option in System settings
Given To open the OneSumX application
When To click the Admin menu option in home page
When To mouse hover to System settings Option
When To click Configuration option in System settings
Then To validate Settings page
When To click Global dashboards link in Settings page
Then To validate Maintain Global Dashboards page
When To click cancel button in Maintain Global Dashboards page

@rrp
Scenario: To Test Admin menu in Preferences sets in Configuration option in System settings
Given To open the OneSumX application
When To click the Admin menu option in home page
When To mouse hover to System settings Option
When To click Configuration option in System settings
Then To validate Settings page
When To click Preferences sets link in Settings page
Then To validate List Preference Sets page
When To click cancel button List Preference Sets page
