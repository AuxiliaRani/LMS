Feature: Pagination In Manage Class Verification.

Background: Logged on the LMS portal as Admin
Given Admin is on dashboard page after Login
When Admin clicks "Class" button on the navigation bar

@TC_Pagination_01
Scenario: Verify sheet one is displayed on default in data table in manage class page
Then Data table should display 1 page when entries available on the manage class page

@TC_Pagination_02
Scenario: Verify  right arrow is enable when sheet one is displayed in data table in manage class page
Then Right arrow should be enabled in page one  when entries are more than 5 available in manage class page

@TC_Pagination_03
Scenario: Verify  left arrow is disable when sheet one is displayed in data table in manage class page
Then Left arrow should be disabled in page one  when entries are more than 5 available in manage class page

@TC_Pagination_04
Scenario: Verify  right arrow is enable when sheet two is displayed in data table when entries are more than 10 in manage class page
Then Right arrow should be enabled in page two when entries are more than 10 available in manage class page

@TC_Pagination_05
Scenario: Verify  left arrow is enable when sheet two is displayed in data table in manage class page
Then Left arrow should be enabled in page two in manage class page

@TC_Pagination_06
Scenario: Verify  right arrow is disable when sheet two is displayed in data table when entries are less than 10 in manage class page
Then Data table should display  page 1  when entries available in manage class page

@TC_Pagination_07
Scenario: Verify pagination controls enabled in manage class page in manage class page
Then If entries are more than 5 in data table in manage class page pagination controls enabled in manage class page

@TC_Pagination_08
Scenario: Verify pagination controls disabled in manage class page
Then If entries are more than 5 in data table in manage class page pagination controls enabled







