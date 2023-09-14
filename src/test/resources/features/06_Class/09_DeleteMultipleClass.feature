Feature: Delete Multiple Class Validation

Background: Admin logged into LMS portal and clicks class button on the navigation bar 
Given Admin is in Manage class page
When Admin clicks single  row level check box in the data table for multiple class

Scenario: Verify delete multiple class  button is enabled for multiple class
Then Admin should see delete icon below the header is enabled in manage class page

Scenario: verify tick mark is visible after clicking on check box in manage class page
Then Admin should see tick mark in check box in manage class page


Scenario: verify admin able to click multiple check box in manage class page
Then Admin should see tick mark in check box  of the selected rows in manage class page

