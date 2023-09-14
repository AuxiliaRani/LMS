@12_ManageAssignment
Feature: Verify sort function in manage assignment page
Background: Admin is manage assignment page after logged in
Given: Admin is in manage assignment page



@Assignment1
Scenario: Verify sort function in data table for descending order

When: Admin click on assignment name column header to sort 
Then: Admin should see data table sorted in descending order


@Assignment1
Scenario: Verify sort function in data table for ascending order
When: Admin double click on assignment name column header to sort 
Then: Admin should see data table sorted in ascending  order
