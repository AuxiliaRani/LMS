@13_ManageAssignment
Feature: Pagination in manage assignment
Background: Logged on the LMS portal as Admin
Given: Admin is on dashboard page after Login for Assignment page



@Assignment1
Scenario: Verify sheet one is displayed on default in data table
When: Admin clicks "Assignment" button on the navigation bar
Then: Data table should display 1 page  when entries available

@Assignment2
Scenario: Verify  right arrow is enable when sheet one is displayed in data table
When: Admin clicks "Assignment" button on the navigation bar
Then: Right arrow should be enabled in page one  when entries are more than 5 available

@Assignment3
Scenario: Verify  left arrow is disable when sheet one is displayed in data table
When: Admin clicks "Assignment" button on the navigation bar
Then: Left arrow should be disabled in page one  when entries are more than 5 available


@Assignment4
Scenario: Verify  right arrow is enable when sheet two is displayed in data table when entries are more than 10
When: Admin clicks "Assignment" button on the navigation bar
Then: Right arrow should be enabled in page two when entries are more than 10 available


@Assignment5
Scenario: Verify  left arrow is enable when sheet two is displayed in data table
When: Admin clicks "Assignment" button on the navigation bar
Then: Left arrow should be enabled in page two 

@Assignment6
Scenario: Verify  right arrow is disable when sheet two is displayed in data table when entries are less than 10
When: Admin clicks "Assignment" button on the navigation bar
Then: Data table should display  page 1  when entries available

@Assignment7
Scenario: Verify pagination controls enabled
When: Admin clicks "Assignment" button on the navigation bar
Then: entries are more than 5 in data table pagination controls enabled

@Assignment8
Scenario: Verify pagination controls disabled
When: Admin clicks "Assignment" button on the navigation bar
Then: entries are less than 5 in data table pagination controls disabled
