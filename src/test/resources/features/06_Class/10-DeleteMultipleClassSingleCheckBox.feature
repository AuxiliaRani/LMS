Feature: Delete Multiple Classes By Selecting Single Checkbox Validation.

Background: Admin clicks delete button under header after selecting the check box in the data table
Given Admin is in delete alert on class page

Scenario: Verify accept alert in delete multiple class function by selecting single checkbox for manage class
When Admin clicks yes button multiple class alert
Then Success message and validate particular class details are deleted from the data table for multiple class

Scenario: Verify reject alert in delete multiple class function by selecting single checkbox
When Admin clicks no button multiple class alert
Then  Admin should land on manage class page and validate particular class details are not deleted from the data table for multiple class


