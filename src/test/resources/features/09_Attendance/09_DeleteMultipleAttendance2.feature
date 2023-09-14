#Author: Amruta
@Delete_Multiple_Attendance_Validation2
Feature: Delete Multiple Attendance Validation2

  Background: Admin clicks delete button under header after selecting the check box in the data table for attendance module09
    Given Admin is in delete alert for attendance module09

  @TC_Attendance_62
  Scenario: Verify delete multiple class button is enabled for attendance module09
    When Admin clicks yes button for attendance module09
    Then Success message and selected attendance detail are deleted from the data table for attendance module09

  @TC_Attendance_63
  Scenario: Verify tick mark is visible after clicking on check box for single data for attendance module09
    When Admin clicks no button for Attendance Module09
    Then Redirected to attendance page and selected attendance details are not deleted from the data table for attendance module09
