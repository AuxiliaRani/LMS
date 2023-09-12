#Author: Amruta
@Delete_Attendance_Validation2
Feature: Delete Attendance Validation2

  Background: Admin clicks row level delete button after landing to manage attendance page07
    Given Admin is in delete alert for Attendance Module07

  @TC_Attendance_57
  Scenario: Validate accept in alert for Attendance Module07
    When Admin clicks yes button for Attendance Module07
    Then Success message and selected attendance details are deleted from the data table07

  @TC_Attendance_58
  Scenario: Validate reject in alert for Attendance Module07
    When Admin clicks no button for Attendance Module07
    Then Redirected attendance page and selected attendance details are not deleted from the data table07
