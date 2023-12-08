@run
Feature: To Test the Quick query functionality

Scenario: To Test the Quick query functionality

Given To open the OneSumX application
When To mouse hover to Control Gap Management
And To click the Quick query option
Then To validate the issue Quick query page
And To click the issue id radio button in issue Quick query page
And To Enter the id in the issue id box issue Quick query page
And To click the Run button issue Quick query page
Then To validate the id in the issue id box control gap management page
