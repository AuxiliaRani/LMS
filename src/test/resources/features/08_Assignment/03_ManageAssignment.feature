@03_ManageAssignment
Feature: Assignment details Pop Up Window verification
Background: Admin logged into LMS portal and clicks assignment button on the navigation bar 
Given: Admin is on manage assignment Page


@Assignment1
Scenario: Verify Assignment details popup window
When: Admin click +Add new assignment button
Then: Admin should see a popup  with  heading "Assignment details"

@Assignment2
Scenario: Verify input fields in Assignment details popup window
When: Admin click +Add new assignment button
Then: Admin should see input fields Text (Program name, batch number,Assignment Name, 
			Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, 
			Assignment file 3, Assignment file 4, Assignment file 5)
			
@Assignment3
Scenario: Verify text box present in Assignment details popup window
When: Admin click +Add new assignment button
Then: 8 textbox should be  present in Assignment details popup window

@Assignment4
Scenario: Verify drop down in Batch Number  in Assignment details popup window
When: Admin click +Add new assignment button
Then: Admin should see  dropdown option for Batch Number

@Assignment5
Scenario: Verify drop down in Program Number  in Assignment details popup window
When: Admin click +Add new assignment button
Then: Admin should see  dropdown option for Program name

@Assignment6
Scenario: Verify calendar icon in Assignment due date  in Assignment details popup window
When: Admin click +Add new assignment button
Then: Admin should see  calendar icon for assignment due date

@Assignment7
Scenario: Verify save button is present
When: Admin click +Add new assignment button
Then: Admin should see  save button in the Assignment detail popup window

@Assignment8
Scenario: Verify save button is present
When: Admin click +Add new assignment button
Then: Admin should see  save button in the Assignment detail popup window

@Assignment9
Scenario: Verify cancel button is present
When: Admin click +Add new assignment button
Then: Admin should see  cancel button in the Assignment detail popup window

@Assignment10
Scenario: Verify close button in  Assignment details popup window
When: Admin click +Add new assignment button
Then: Admin should see  close button on the Assignment details popup window
