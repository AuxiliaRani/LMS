#Author: Amruta
@Delete_Multiple_Attendance_Validation1
Feature: Delete Multiple Attendance Validation1

  Background: Admin logged into LMS portal and clicks attendance button on the navigation bar08
    Given Admin is in manage attendance page08

  @TC_Attendance_59
  Scenario: Verify delete multiple class  button is enabled for attendance module08
    When Admin clicks single row level check box in the data table for attendance module08
    Then Admin should see delete icon below the header is enabled for attendance module08

  @TC_Attendance_60
  Scenario: Verify tick mark is visible after clicking on check box for single data for attendance module08
    When Admin clicks single  row level check box in the data table for Attendance Module08
    Then Admin should see tick mark in check box for attendance module08

  @TC_Attendance_61
  Scenario: verify admin able to click multiple check box for attendance module08
    When Admin clicks multiple row level check box in the data table for attendance module08
    Then Admin should see tick mark in check box of the selected rows for attendance module08
