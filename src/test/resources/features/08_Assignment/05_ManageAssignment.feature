@05_ManageAssignment
Feature: Edit assignment Validation
Background: Admin logged into LMS portal and clicks assignment button on the navigation bar 
Given: Admin is in manage assignment page

@Assignment1
Scenario: Verify Edit assignment popup window
When: Admin clicks Edit button in data table 
Then: Edit popup window appears with heading Assignment Details

@Assignment2
Scenario: Verify values in popup window
When: Admin clicks Edit button from one of the row in data table 
Then: Edit popup window appears with same row values in the all fields

