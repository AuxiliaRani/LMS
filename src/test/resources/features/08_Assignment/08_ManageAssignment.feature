@08_ManageAssignment
Feature: Delete Assignment validation
Background: Admin clicks row level delete button after landing to manage assignment page



@Assignment1
Scenario: Validate accept in alert
Given: Admin is in delete alert
When: Admin clicks yes button
Then: Redirected to assignment page and selected assignment details are deleted from the data table

@Assignment2
Scenario: Validate reject in alert
Given: Admin is in delete alert
When: Admin clicks no button
Then: Redirected to assignment page and selected assignment details are not deleted from the data table
