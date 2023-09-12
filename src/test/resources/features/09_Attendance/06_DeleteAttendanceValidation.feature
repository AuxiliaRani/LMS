#Author: Amruta
@Delete_Attendance_Validation
Feature: Delete Attendance Validation

  Background: Admin logged into LMS portal and clicks attendance button on the navigation bar06
    Given Admin is in manage attendance page06
    When Admin clicks delete button in data table row level06

  @TC_Attendance_57
  Scenario: Verify Delete attendance alert06
    Then Admin should see alert06

  @TC_Attendance_58
  Scenario: Verify  accept enabled in alert06
    Then Alert should have "yes" button to accept06

  @TC_Attendance_59
  Scenario: Verify reject enabled in alert06
    Then Alert should have "No" button to reject06
