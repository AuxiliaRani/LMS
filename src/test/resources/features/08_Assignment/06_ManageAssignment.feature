@06_ManageAssignment
Feature: Edit assignment Validation
Background: Admin clicks Edit button in manage assignment after reaching manage assignment page
Given: Admin is in  Edit assignment detail popup window




@Assignment1
Scenario: Validate admin able to update assignment with valid data in mandatory fields
When: Admin enters all mandatory field values with valid data and clicks save button ( Program name, batch number,Assignment Name, grade by, Assignment due date) on assignment page
Then: Admin should see updated assignment details is added in the data table on assignment page

@Assignment2
Scenario: Validate admin able to update assignment with valid data in mandatory fields
When: Admin enters all mandatory field values with invalid data and clicks save button (Program name, batch number,Assignment Name, grade by, Assignment due date ) on assignment page
Then: Error message should appear in alert on assignment page

@Assignment3
Scenario: Validate admin able to update assignment with valid data  in all fields
When: Admin enters values in all fields with valid data and clicks save button (Program name, batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5) on assignment page
Then: Admin should see updated assignment details is added in the data table on assignment page

@Assignment4
Scenario: Validate admin able to update assignment with invalid data  in optional fields
When: Admin enters with invalid data in optional fields and clicks save button (Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5) on assignment page
Then: Error message should appear in alert on assignment page on assignment page

@Assignment5
Scenario: Validate admin able to update assignment missing program name
When: Admin enters  data missing value in program name and clicks save button (batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5) on assignment page
Then: Program Name is missing on assignment

@Assignment6
Scenario: Validate admin able to update assignment missing batch number
When: Admin enters data missing value in Batch number and clicks save button (Program name,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5) on assignment page
Then: Batch number is missing on assignment

@Assignment7
Scenario: Validate admin able to update assignment missing assignment name
When: Admin enters data missing value in Assignment name and clicks save button (Program name, batch number,Assignment Name,  grade by, Assignment Due date ) on assignment page
Then: Assignment name is missing on assignment

@Assignment8
Scenario: Validate admin able to update assignment missing due date
When: Admin enters data missing value in Assignment due date and clicks save button ( Program name, batch number,Assignment Name, grade by) on assignment page
Then: Assignment due date is missing on assignment

@Assignment9
Scenario: Validate admin able to update assignment missing grade by
When: Admin enters data missing value in grade by  and clicks save button (Program name, batch number,Assignment Name, Assignment due date) on assignment page
Then: Grade by is missing on assignment


@Assignment10
Scenario: Validate  admin able to update assignment passing past date 
When: Admin enters passed date in the due date field and clicks save button ( Program name, batch number,Assignment Name,  grade by, Assignment Due date ) on assignment page
Then: Assignment cannot be updated for the passed date on assignment page

@Assignment11
Scenario: Validate cancel button function in assignment details popup window
When: Admin clicks Cancel button without entering values in the fields on assignment page6
Then: Admin should land on manage assignment page6

@Assignment12
Scenario: Validate cancel button function in assignment details popup window with values in field
When: Admin clicks Cancel button entering values in the fields on assignment page
Then: Admin should land on manage assignment Page and validate new assignment is not created in the data table for assignment page

























