Feature: Delete Multiple Classes By Selecting Multiple Checkbox Validation.

Background: Admin clicks delete button under header after selecting the multiple check box in the data table in manage class page
Given Admin is in delete alert for multiple checkbox

Scenario: Verify accept alert in delete multiple class function by selecting multiple checkbox in manage class page
When Admin clicks yes button in manage class alert
Then Admin should land on manage class page and validate particular class details are deleted from the data table for alert

Scenario: Verify reject alert in delete multiple class function by selecting multiple checkbox
When Admin clicks no button in manage class alert
Then Admin should land on manage class page and validate particular class details are not deleted from the data table for alert
