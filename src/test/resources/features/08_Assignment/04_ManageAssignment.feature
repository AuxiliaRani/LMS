@04_ManageAssignment
Feature: Add New Assignment
Background: Admin click +Add new assignment button after reaching to manage assignment page
Given: Admin is in  assignment details popup window


@Assignment1
Scenario: Validate admin able to add new assignment with valid data in mandatory fields
When: Admin enters all mandatory field values with valid data and clicks save button ( Program name, batch number,Assignment Name, grade by, Assignment due date)
Then: Admin should see new assignment details is added in the data table

@Assignment2
Scenario: Validate admin able to add new assignment with invalid data in mandatory fields
When: Admin enters all mandatory field values with invalid data and clicks save button (Program name, batch number,Assignment Name, grade by, Assignment due date )
Then: Error message should appear in alert

@Assignment3
Scenario: Validate admin able to add new assignment with valid data  in all fields
When: Admin enters values in all fields with valid data and clicks save button (Program name, batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)
Then: Admin should see new assignment details is added in the data table

@Assignment4
Scenario: Validate admin able to add new assignment with invalid data  in optional fields
When:Admin enters with invalid data in optional fields and clicks save button (Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)
Then: Error message should appear in alert

@Assignment5
Scenario: Validate admin able to add new assignment missing program name
When: Admin enters  data missing value in program name and clicks save button (batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5))
Then: Program Name is missing

@Assignment6
Scenario:Validate admin able to add new assignment missing batch number
When: Admin enters data missing value in Batch number and clicks save button (Program name,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)
Then: Batch number is missing

@Assignment7
Scenario: Validate admin able to add new assignment missing assignment name
When: Admin enters data missing value in Assignment name and clicks save button (Program name, batch number,Assignment Name,  grade by, Assignment Due date )
Then: Assignment name is missing


@Assignment8
Scenario: Validate admin able to add new assignment missing due date
When: Admin enters data missing value in Assignment due date and clicks save button ( Program name, batch number,Assignment Name, grade by)
Then: Assignment due date is missing

@Assignment9
Scenario: Validate admin able to add new assignment missing grade by
Given: Admin is in  assignment details popup window
When: Admin enters data missing value in grade by  and clicks save button (Program name, batch number,Assignment Name, Assignment due date)
Then: Grade by is missing

@Assignment10
Scenario: Validate  admin able to add new assignment passing past date 
When: Admin enters passed date in the due date field and clicks save button ( Program name, batch number,Assignment Name,grade by,Assignment Due date )
Then: Assignment cannot be created for the passed date


@Assignment11
Scenario: Validate date picker
When: Admin clicks date from date picker
Then: selected date should be their in class date text box

@Assignment12
Scenario: validate date picker should be correct format
When: Admin clicks date from date picker
Then: selected date should be in  mm/dd/yyyy format

@Assignment13
Scenario: Validate right arrow in data picker to navigate to next month
When: Admin clicks right arrow in the date picker near month
Then: Next month calender should visible

@Assignment14
Scenario: Validate left arrow in data picker to navigate to previous month
When: Admin clicks left arrow in the date picker near month
Then: previous month calender should visible

@Assignment15
Scenario: Validate current date is highlighted in the date picker
When: Admin clicks date picker button
Then: Admin should see current date is highled in the date picker

@Assignment16
Scenario: Validate selected date is highlighted in the date picker
When: Admin clicks date picker button and selects future date
Then: Admin should see selected date is highled in the date picker

@Assignment17
Scenario: Validate cancel button function in assignment details popup window
When: Admin clicks Cancel button without entering values in the fields
Then: Admin should land on manage assignment page

@Assignment18
Scenario: Validate cancel button function in assignment details popup window with values in field
When: Admin clicks Cancel button entering values in the fields
Then: Admin should land on manage assignment Page and validate new assignment is not created in the data table




























 
