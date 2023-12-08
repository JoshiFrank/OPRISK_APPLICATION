Feature: To Test Admin menu in Data Feeds in Data Loading Option
@EndtoEnd
Scenario: To Test Admin menu in Add Data Feed in Data Feeds in Data Loading Option
Given To open the OneSumX application
When To click the Admin menu option in home page
When To mouse hover to Data Loading Option
When To click Data Feeds in Data Loading Option
Then To validate List Data Feeds page
When To click Add data feed in List Data Feeds page
Then To validate Add Data Feed page 
When To select dropdown in Data Feed Type option in Add Data Feed page 
When To Enter value in Data Feed Code box in Data Feed Code
When To Enter value in Data Feed Name box in Data Feed Code
When To Enter value in Data Feed Description box in Data Feed Code
When To select dropdown in Data Feed Owner option in Add Data Feed page 
When To select dropdown in Source System option in Add Data Feed page 
When To click check box in Call Method in Add Data Feed page
When To Enter value in Upload File Sub Folder box in Add Data Feed page
When To click choose file upload in Add Data Feed page
When To click radio button in Loader Mode in Add Data Feed page
When To click radio button in Email Notifications in Add Data Feed page
When To Enter value in Notes box in Add Data Feed page
When To click Save button in Add Data Feed page
Then To validate Edit Data Feed page
When To click cancel button Edit Data Feed page 

@run
Scenario: To Test Admin menu in processed Files in Data Feeds in Data Loading Option
Given To open the OneSumX application
When To click the Admin menu option in home page
When To mouse hover to Data Loading Option
When To click Data Feeds in Data Loading Option
Then To validate List Data Feeds page
When To click processed Files in List Data Feeds page
Then To validate List Processed Data Feed Files page
When To select Arrow option under data feed name in List Processed Data Feed Files page  
When To click cancel button in List Processed Data Feed Files page






