#Author: Amruta
@Attendance_popup_window_verification2
Feature: Attendance details popup window verification2

  Background: Admin click +Add New Attendance button after reaching to Manage attendance page 03
    Given Admin is on attendance details popup window 03

  @TC_Attendance_32
  Scenario: Validate all program name is reflecting in the dropdown for Attendance module
    When Admin clicks  program name dropdown for Attendance module
    Then Program Name in the drop down should match with  program name in  manage program page table for Attendance module

  @TC_Attendance_33
  Scenario: Validate all class name  is reflecting in the dropdown for Attendance module
    When Admin clicks class name dropdown for Attendance module
    Then Class Name in the drop down should match with  class name in  manage class page table for Attendance module

  @TC_Attendance_34
  Scenario: Validate attendance field dropdown all mandatory keywords for Attendance module
    When Admin clicks attendance dropdown for Attendance module
    Then Attendance field should have keywords such as - present, absent, late, excused for Attendance module

  @TC_Attendance_35
  Scenario: Verify spellings in the attendance field drop down for Attendance module
    When Admin clicks attendance dropdown for Attendance module
    Then Admin should see correct spellings in dropdown text for Attendance module

  @TC_Attendance_36
  Scenario: Validate date picker for Attendance module
    When Admin clicks date from date picker for Attendance module
    Then selected date should be their in class date text box for Attendance module

  @TC_Attendance_37
  Scenario: validate date picker should be correct format for Attendance module
    When Admin clicks date from date picker for Attendance module
    Then selected date should be in  mm/dd/yyyy format for Attendance module

  @TC_Attendance_38
  Scenario: Validate right arrow in data picker to navigate to next month for Attendance module
    When Admin clicks right arrow in the date picker near month for Attendance module
    Then Next month calender should visible for Attendance module

  @TC_Attendance_39
  Scenario: Validate left arrow in data picker to navigate to previous month for Attendance module
    When Admin clicks left arrow in the date picker near month for Attendance module
    Then previous month calender should visible for Attendance module

  @TC_Attendance_40
  Scenario: Validate current date is highlighted in the date picker for Attendance module
    When Admin clicks date picker button for Attendance module
    Then Admin should see current date is highled in the date picker for Attendance module

  @TC_Attendance_41
  Scenario: Validate selected date is highlighted in the date pickerfor Attendance module
    When Admin clicks date picker button and selects future date for Attendance module
    Then Admin should see selected date is highled in the date picker for Attendance module
