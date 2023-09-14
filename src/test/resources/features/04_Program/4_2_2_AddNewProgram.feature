Feature: Admin Add New Program_2

Background: Admin is on Manage Program Page after clicks Program on the navigation bar
Given Admin is on Program Details Popup window in Program Page

@TC_Add_New_Program_04
Scenario: Empty form submission in Program page
When  Admin clicks on Save button without entering any data in Program Page
Then Admin gets a Error message alert  in Program Page "blank details"

@TC_Add_New_Program_05
Scenario: Enter only Program Name in Program page
When Admin enters only Program Name in text box and clicks Save button in Program Page
Then Admin gets a message alert Name is required  in Program Page

@TC_Add_New_Program_06
Scenario: Enter only Program Description	in Program page
When Admin enters only Program description  in text box and clicks Save button in Program Page
Then Admin gets a message alert Description is required in Program Page

@TC_Add_New_Program_07
Scenario: Select Status only 	in Program page 
When Admin selects only Status and clicks Save button in Program Page
Then Admin gets a message alert Name and Description required in Program Page

@TC_Add_New_Program_08
Scenario: Validate invalid values on the text column in Program page
When Admin enters only numbers or special char in name and desc column in Program Page	
Then Admin gets a Error message alert for only entering number  in Program Page

@TC_Add_New_Program_09
Scenario:Validate Cancel/Close(X) icon on Program Details form in Program page
When Admin clicks Cancel or Close Icon on Program Details form in Program Page
Then Program Details popup window should be closed without saving in Program Page

@TC_Add_New_Program_10
Scenario:Validate Save button on Program Details form	in Program page
When Enter all the required fields with valid values and click Save button in Program Page
Then Admin gets a message "Successful Program Created" alert and able to see the new program added in the data table in Program Page
