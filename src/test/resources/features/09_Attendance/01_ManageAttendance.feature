
@Attendance
Feature: Manage Attendance Page verification

  Background: Logged on the LMS portal as Admin for Attendance module 
    Given Admin is on dashboard page after Login for Attendance module
    When Admin clicks "Attendance" on the navigation bar

  @TC_Attendance_01
  Scenario: Validate the header of the page for Attendance module
    Then Admin should see the Manage attendance in header

  @TC_Attendance_02
  Scenario: Validate response time from dashboard page to attendance page
    Then Maximum navigation time in milliseconds, defaults to 30 seconds for Attendance module

  @TC_Attendance_03
  Scenario: Validate the broken link on Attendance module
    Then The link is broken HTTP response >= 400 for Attendance module

  @TC_Attendance_04
  Scenario: Verify LMS title or Attendance module
    Then Admin should see LMS -Learning management system  as title for Attendance module

  @TC_Attendance_05
  Scenario: Verify the alignment of the Manage Attendance header
    Then Manage attendance header should be in left side of the page

  @TC_Attendance_06
  Scenario: Validate text in manage attendance page
    Then Admin should see correct spelling for the all the fields on manage attendance page

  @TC_Attendance_07
  Scenario: Verify delete icon below the header on manage attendance page
    Then Admin should see disabled delete icon below the "Manage Attendance"

  @TC_Attendance_08
  Scenario: Verify search bar on the Attendance page
    Then Admin should see search bar on the attendance page

  @TC_Attendance_09
  Scenario: Verify add new Attendance button on Attendance page
    Then Admin should see +Add New Attendance button on the attendance page

  @TC_Attendance_10
  Scenario: Verify data table on the attendance page
    Then Admin should see data table on the Manage Attendance Page With following column headers - Check box symbol,Class ID, Student Id,Preasent, Edit,Delete

  @TC_Attendance_11
  Scenario: Verify Edit icon in the data table for Attendance Module
    Then Edit Icon in each row of data table only when entries are available for Attendance Module

  @TC_Attendance_12
  Scenario: Verify Edit icon when no data in the table for Attendance Module
    Then Edit Icon in each row of data table only when entries are available for Attendance Module

  @TC_Attendance_13
  Scenario: Verify delete icon in the data table for Attendance Module
    Then Delete Icon in each row of data table only  when entries are available for Attendance Module

  @TC_Attendance_14
  Scenario: Verify delete icon when no data in the table for Attendance Module
    Then Admin cant see delete Icon in data table for Attendance Module

  @TC_Attendance_15
  Scenario: Verify sort icon in the data table for Attendance Module
    Then Admin should see sort icon near the column headers except for Edit and Delete for Attendance Module

  @TC_Attendance_16
  Scenario: Verify check box in the data table for Attendance Module
    Then Admin should see check box in the all rows  of data table for Attendance Module

  @TC_Attendance_17
  Scenario: Validate the number entries displaying for Attendance Module
    Then Above the footer Admin should see the text as "Showing x to y of z entries" below the table for Attendance Module

  @TC_Attendance_18
  Scenario: Verify Pagination control below the data table for Attendance Module
    Then Admin should see the pagination controls under the data table for Attendance Module

  @TC_Attendance_19
  Scenario: Validate footer text for Attendance Module
    Then Admin should see the text with total number classes in the data table for Attendance Module

