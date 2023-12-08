@run
Feature: To validate the Key Risk Indicator KRIs funtionality

Scenario: To Test funtionality of a Periodic Key Risk Indicator

Given To open the OneSumX application  
When To MouseOver on the Key Risk indicators(KRIs) option in the home page
And To Click the Periodic Key Risk indicators(KRIs) link
Then validate the List Periodic Key Risk Indicators (KRIs) page
When To click the check box of required indicator 
And Click the Not Recorded link under the value option which one you selected indicator
Then Validate the Enter indicator score popup
When Enter the value
And Select the Score from the dropdown
And Enter the comment in the text box
And Click Save & Next button
And To click cancel button
And To click submit button 
And To click Approve button 
Then Validate the selected indicator status is submitted









