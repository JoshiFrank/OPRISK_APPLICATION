Feature: To Test Admin menu in Tech Admin Option

Scenario: To Test Admin menu Auditing Tech Admin Option
Given To open the OneSumX application
When To click the Admin menu option in home page
When To mouse hover to Tech Admin option 
When To click the Auditing in organisation option 
Then To validate Audit Report page
When To Select dropdown in Table Name in Audit Report page
When To Select dropdown in Changed By in Audit Report page
When To Select the Start Date in Audit Report page
When To Select the End Date in Audit Report page
When To click the Run Report in Audit Report page
Then To validate Audit Report Generation page
When To click ok button in Audit Report Generation page
	
Scenario: To Test Admin menu Scheduled jobs Tech Admin Option
Given To open the OneSumX application
When To click the Admin menu option in home page
When To mouse hover to Tech Admin option 
When To click the Scheduled jobs in Tech Admin option
Then To validate Maintain Job Schedules page
When To click the check box under Non monthly task option in Maintain Job Schedules page
When To click save button in Maintain Job Schedules page
	

Scenario: To Test Admin menu Emails Tech Admin Option
Given To open the OneSumX application
When To click the Admin menu option in home page
When To mouse hover to Tech Admin option 
When To click the Emails in Tech Admin option
Then To validate Email Configuration page
When To click check box in indicator option in Email Configuration page
When To click link under email details option in Email Configuration page
Then To validate pop up in Email Configuration page
When To click ok button in pop up in Email Configuration page
Then To validate Email Text page
When To Enter value Email Title box in Email Text page
When To Enter value Email Body box in Email Text page
When To click Save button in Email Text page 


Scenario: To Test Admin menu Archiving Tech Admin Option
Given To open the OneSumX application
When To click the Admin menu option in home page
When To mouse hover to Tech Admin option
When To click the Archiving in Tech Admin option
Then To validate Manage Archiving page

@tnd
Scenario: To Test Admin menu References Tech Admin Option
Given To open the OneSumX application
When To click the Admin menu option in home page
When To mouse hover to Tech Admin option
When To click the References in Tech Admin option
Then To validate Reference Manager page
When To click arrow button under Reference source system
When To click link under title Reference Manager page 
When To click Entity link in Reference Manager page
Then To validate Suspected Payment Fraud using eBanking page







