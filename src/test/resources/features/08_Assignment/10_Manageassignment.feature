@09_ManageAssignment
Feature: Delete multiple class validation
Background: Admin clicks delete button under header after selecting the check box in the data table




@Assignment1
Scenario: Verify accept alert in delete multiple class function by selecting single checkbox
Given: Admin is in delete alert
When: Admin clicks yes button
Then: Redirected to assignment page and selected assignment details are deleted from the data table


@Assignment2
Scenario: Verify reject alert in delete multiple class function by selecting single checkbox
Given: Admin is in delete alert
When: Admin clicks no button
Then: Redirected to assignment page and selected assignment details are not deleted from the data table
