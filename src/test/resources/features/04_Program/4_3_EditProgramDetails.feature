Feature: Edit Program Details

Background: Admin is on Manage Program Page after clicks Program on the navigation bar
 
@TC_Edit_Program_Details_01
Scenario: Validate Edit Feature in  edit program page
Given Admin is on Program Details Popup window to Edit
When Admin clicks Edit button on the data table for any row in Program Page
Then Admin should see a popup open for Program details to edit in Program Page


@TC_Edit_Program_Details_02
Scenario: Edit Program Name in edit program page
Given Admin is on Program Details Popup window to Edit Program Name in Program Page
When Admin edits the Name column and clicks save button in Program Page
Then Admin gets a message "Successful Program Updated" alert and able to see the updated name in the table for the particular program in Program Page

@TC_Edit_Program_Details_03
Scenario: Edit Program description in edit program page in Program Page
Given Admin is on Program Details Popup window to Edit Program description in Program Page
When Admin edits the Description column and clicks save button in Program Page
Then Admin gets a message Successful Program description Updated alert and able to see the updated Program description in the table for the particular program in Program Page


@TC_Edit_Program_Details_04
Scenario: Change Program Status in edit program page
Given Admin is on Program Details Popup window to Edit to verify Change Program Status in Program Page
When Admin changes the Status and clicks save button in Program Page
Then Admin gets a message Successful Program Updated alert and able to see the updated status in the table for the particular program in Program Page


@TC_Edit_Program_Details_05
Scenario: Validate invalid values on the text column in edit program page 
Given Admin is on Program Details Popup window to Edit with invalid values in Program Page
When Admin enters only numbers or special char in name and desc column in Program Page to edit
Then Admin gets a Error message alert for only entering numbers in Program Page

@TC_Edit_Program_Details_06
Scenario: Validate Cancel button on Edit popup in edit program page 
Given Admin is on Program Details Popup window to Edit to verify cancel button in Program Page
When Admin clicks  Cancel button on edit popup in Program Page
Then Admin can see the Program details popup disappears and can see nothing changed for particular program in Program Page

@TC_Edit_Program_Details_07
Scenario: Validate Save button on Edit popup in edit program page
Given    Admin is on Program Details Popup window to Edit  to verify save button in Program Page
When     Admin clicks Save button on edit popup in Program Page
Then     Admin gets a message Successful Program Updated alert and able to see the updated details in the table for the particular program in Program Page
