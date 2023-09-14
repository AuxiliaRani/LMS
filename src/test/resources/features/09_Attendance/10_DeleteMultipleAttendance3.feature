#Author: Amruta
@Delete_Multiple_Attendance_Validation3
Feature: Delete Multiple Attendance Validation3

  Background: Admin clicks delete button under header after selecting the multiple check box in the data table for attendance module10
    Given Admin is in delete alert for attendance module10

  @TC_Attendance_64
  Scenario: Verify accept alert in delete multiple attendance by selecting multiple checkbox for attendance module10
    When Admin clicks yes button for attendance module10
    Then Success message and validate particular attendance details are deleted from the data table for attendance module10

  @TC_Attendance_65
  Scenario: Verify reject alert in delete multiple attendance by selecting multiple checkbox for attendance module10
    When Admin clicks on No button for Attendance Module09
    Then Redirected to attendance page and selected attendance details are not deleted from the data table for attendance module10
