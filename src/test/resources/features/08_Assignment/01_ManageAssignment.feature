@ManageAssignment
Feature: Manage Assignment page verification
Background: Logged on the LMS portal as Admin
@Assignment1
Scenario: Verify landing in manage assignment page
Given: Admin is on dashboard page after login
When: Admin clicks "assignment" button on the navigation bar
Then: Admin should see URL with "Manage assignment"
@Assignment2
Scenario: Capture the response time to navigate to manage assignment page
Given: Admin is on dashboard page after Login
When: Admin clicks "assignment" button on the navigation bar
Then: apture the response time to navigate to manage assignment page
@Assignment3
Scenario: Verify manage assignment page Header
Given: Admin is on dashboard page after Login
When: Admin clicks "assignment" button on the navigation bar
Then: Admin should see header with "Manage assignment"
@Assignment4
Scenario: Validate text in manage assignment page
Given: Admin is on dashboard page after Login
When: Admin clicks "assignment" button on the navigation bar and get all text from the portal page
Then: Admin should see correct spelling for the all the fields
@Assignment5
Scenario: Verify delete icon below the header
Given: Admin is on dashboard page after Login
When: Admin clicks "assignment" button on the navigation bar
Then: Admin should see disabled delete icon below the "Manage assignment"
@Assignment6
Scenario: Verify search bar on the manage assignment page
Given: Admin is on dashboard page after Login
When: Admin clicks "assignment" button on the navigation bar
Then: Admin should see search bar on the manage assignment page
@Assignment7
Scenario: Verify add new assignment button on manage assignment page
Given: Admin is on dashboard page after Login
When: Admin clicks "assignment" button on the navigation bar
Then: Admin should see +Add New assignment button on the manage assignment page
@Assignment8
Scenario: Verify data table on the manage assignment page
Given: Admin is on dashboard page after Login
When: Admin clicks "assignment" button on the navigation bar
Then: Admin should see data table on the manage assignment page With following column headers.(check box symbol ,Assignment name, Assignment description, Assignment Date, Assignment Grade, Edit Delete)
@Assignment9
Scenario: Verify Edit icon when no data in the table
Given: Admin is on dashboard page after Login
When: Admin clicks "assignment" button on the navigation bar
Then: Edit Icon will not be present in data table
@Assignment10
Scenario: Verify delete icon in the data table
Given: Admin is on dashboard page after Login
When: Admin clicks "assignment" button on the navigation bar
Then: Delete Icon in each row of data table only when entries are available
@Assignment11
Scenario: Verify delete icon when no data in the table
Given: Admin is on dashboard page after Login
When: Admin clicks "assignment" button on the navigation bar
Then: Delete Icon will not be present in data table
@Assignment12
Scenario: Verify sort icon in the data table
Given: Admin is on dashboard page after Login
When: Admin clicks "assignment" button on the navigation bar
Then: Admin should see sort icon near the column headers except for Edit and Delete
@Assignment13
Scenario: Verify check box in the data table
Given: Admin is on dashboard page after Login
When: Admin clicks "assignment" button on the navigation bar
Then: Admin should see check box in the all rows of data table when entries available
@Assignment14
Scenario:Validate the number entries displaying
Given: Admin is on dashboard page after Login
When: Admin clicks "assignment" button on the navigation bar
Then: "Above the footer Admin should see the text as" "Showing x to y of z entries" below the table.
x- starting record number on that page
y-ending record number on that page
z-Total number of records
Note: with or without entries"
@Assignment15
Scenario: Verify Pagination control below the data table
Given: Admin is on dashboard page after Login
When: Admin clicks "assignment" button on the navigation bar
Then: Admin should see the page navigaination controls under the data table
@Assignment16
Scenario: Validate footer text
Given: Admin is on dashboard page after Login
When: Admin clicks "assignment" button on the navigation bar
Then: Admin should see the text with total number assignments in the data table.("In total there are number of assignments")
