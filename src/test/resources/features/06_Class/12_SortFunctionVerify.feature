Feature: Sort Function In Manage Class Page Verification

Background: Admin is manage class page after logged in
Given Admin is in Manage class page

Scenario: Verify sort function in data table for descending order in manage class page
When Admin click on Batch id column header to sort in manage class page
Then Admin should see data table sorted in descending order in manage class page

Scenario: Verify sort function in data table for ascending order in manage class page
When Admin double click on Batch id column header to sort in manage class page 
Then Admin should see data table sorted in ascending  order in manage class page



