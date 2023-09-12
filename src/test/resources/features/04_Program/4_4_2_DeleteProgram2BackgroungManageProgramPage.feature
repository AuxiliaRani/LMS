Feature: Delete Program


Background: Admin is on Manage Program Page after clicks Program on the navigation bar
Given    Admin is on Confirm Deletion alert of program page

@TC_Delete_Program_03
Scenario: Click Yes on deletion window in Delete Program 
When     Admin clicks YES button on the alert in Program Page to delete
Then     Admin gets a message "Successful Program Deleted" alert and able to see that program deleted in the data table in Program Page

@TC_Delete_Program_04
Scenario: Click No on deletion window in Delete Program 
When     Admin clicks NO button on the alert in Program Page to delete
Then     Admin can see the deletion alert disappears without deleting in Program Page

@TC_Delete_Program_05
Scenario: Validate Cancel/Close icon on Confirm Deletion alert in Delete Program 
When     Admin clicks Cancel/Close Icon on Deletion alert in Program Pages
Then     Admin can see the deletion alert disappears without any changes in Program Page