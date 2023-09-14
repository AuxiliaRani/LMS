Feature: Delete Program

Background: Admin is on dashboard page after Login and clicks Program on the navigation bar in Program Page
Given    Admin is on Manage Program Page for verifying delete progrm

@TC_Delete_Program_01
Scenario: Delete Feature in Delete Program  in Program Page
When    Admin clicks Delete button on the data table for any row 
Then     Admin should see a alert open with heading Confirm along with  YES and NO button for deletion in Program Page


@TC_Delete_Program_02
Scenario: Validate details for Confirm Deletion form in Delete Program in Program Page
When     Admin clicks Delete button on the data table for any row to verify confirm before delete in Program Page
Then     Admin should see a message Are you sure you want to delete Program name? in Program Page


