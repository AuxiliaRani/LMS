@02_ManageAssignment
Feature: Manage Assignment page verification
Background: Admin logged into LMS portal and clicks assignment button on the navigation bar
Given: Admin is on manage assignment page

@Assignment1
Scenario: Validate search box function for assignment name
When: Admin enters assignment name into search box
Then: Displays entries with that assignment name
@Assignment2
Scenario: Validate search box function
When: Admin enters assignment name is not existing the table into search box
Then: Displays empty details in the data table
@Assignment3
Scenario: Validate search box function
When: Admin enters assignment description into search box
Then: Displays entries with that assignment description
@Assignment4
Scenario: Validate search box function
When: Admin enters assignment description which is not existing the table into search box
Then: Displays empty details in the data table
@Assignment5
Scenario: Validate search box function
When: Admin enters assignment due date into search box
Then: Displays entries with that assignment due date
@Assignment6
Scenario: Validate search box function
When: Admin enters assignment due date which is not existing the table into search box
Then: Displays empty details in the data table
@Assignment7
Scenario: Validate search box function
When: Admin enters grade value into search box
Then: Displays entries with that assignment grade
@Assignment8
Scenario: Validate search box function
When: Admin enters grade value which is not existing the table into search box
Then: Displays empty details in the data table
