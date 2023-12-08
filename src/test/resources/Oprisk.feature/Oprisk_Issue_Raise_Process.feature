@EndtoEnd
Feature: To test the issue raising OneSumX  application 


Scenario Outline: To validate the issue raising process in OneSumX 

	Given To open the OneSumX application 
	Then To validate the OneSumX logo 
	Then To validate the plus issue button 
	When To click the plus issue button 
	And To click the views option straight line 
	And To click the number two link 
	And To click the twenty Strategy & Innovation (STIN) 
	And To click proceed button 
	Then To validate the new issue path in Strategy & Innovation issue page 
	When To enter the Title in title box in Strategy & Innovation issue page "<Title>" 
	And To enter the issue details in Strategy & Innovation issue page "<issue>" 
	Then To validate the priority options in Strategy & Innovation issue page 
	When To select the priority in Strategy & Innovation issue page 
	Then to validate the responsibility in Strategy & Innovation issue page 
	When To select the select link in Strategy & Innovation issue page 
	When To select the oadelakin id in responsibility select section 
	When To click the select button in responsibility select section 
	When to select the issue sensitivity in Strategy & Innovation issue page 
	When To select target closure date in Strategy & Innovation issue page 
	When To enter department ref in Strategy & Innovation issue page "<ref>" 
	When To enter department comment in Strategy & Innovation issue page "<comment>" 
	Then To validate the interested person option list 
	When To select Ahmed Magdi in person option list in Strategy & Innovation issue page 
	When To select save button in Strategy & Innovation issue page 
	Then to validate the Details of the Strategy & Innovation issue 
	When To select accept button in Strategy & Innovation issue 
	Then to validate the Details of the Strategy & Innovation issue 
	When to click home pagre button from Strategy & Innovation issue 
	When To click the issues option in Home page 
	Then to validate New issue status in Home page 
	
	Examples: 
		|Title|issue|ref|comment|
		|Test1|Test1|Test2|Test2|