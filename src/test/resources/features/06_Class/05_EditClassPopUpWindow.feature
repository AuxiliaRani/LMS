Feature: Edit Class Pop Up Window Validation

Background: Admin logged into LMS portal and clicks class button on the navigation bar 
Given Admin is in Manage class page

Scenario: Verify Edit class popup window for manage class
When Admin clicks Edit button in data table in manage class page
Then Edit popup window appears with heading Class Details on manage class page


Scenario: Verify values in popup window for manage class
When Admin clicks Edit button from one of the row in data table in manage class page
Then Edit popup window appears with same row values in the all fields on manage class page