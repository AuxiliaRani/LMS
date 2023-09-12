#Author: Amruta
@Attendance_popup_window_verification1
Feature: Attendance details popup window verification1

  Background: Admin is on Manage attendance page after login 02
    Given Admin is in manage attendance page 02
    When Admin clicks plus a new attendance button 02

  @TC_Attendance_20
  Scenario: Verify all label text for Attendance module
    Then Admin should see correct spellings in the label for Attendance module

  @TC_Attendance_21
  Scenario: Verify dropdown box is present for Attendance module
    Then There should be 4 dropdowns present for Attendance module

  @TC_Attendance_22
  Scenario: Verify close button in attendance details popup window for Attendance module
    Then Admin should see close button on the attendance details popup window for Attendance module

  @TC_Attendance_23
  Scenario: Verify the alignment of the close button for Attendance module
    Then Close button should on the top right corner for Attendance module

  @TC_Attendance_24
  Scenario: Verify the text on first dropdown select a program name for Attendance module
    Then First dropdown box "select a program name" text  should be present for Attendance module

  @TC_Attendance_25
  Scenario: Verify the text on second dropdown select class name for Attendance module
    Then Second dropdown box "select class name" text  should be present for Attendance module

  @TC_Attendance_26
  Scenario: Verify the text on third dropdown select students for Attendance module
    Then Third dropdown box "select students" text  should be present for Attendance module

  @TC_Attendance_27
  Scenario: Verify the text on fourth dropdown select attendance for Attendance module
    Then Fourth dropdown box "select attendance" text  should be present for Attendance module

  @TC_Attendance_28
  Scenario: Verify all the text inside the dropdown box is gray color for Attendance module
    Then Admin  should text in gray color for Attendance module

  @TC_Attendance_29
  Scenario: Verify save button is present for Attendance module
    Then Admin should see  save button in the class detail popup window for Attendance module

  @TC_Attendance_30
  Scenario: Verify cancel button is present for Attendance module
    Then Admin should see  cancel button in the class detail popup window for Attendance module

  @TC_Attendance_31
  Scenario: Verify order of the label in attendance details page for Attendance module
    Then Order of the label should be Program name, Class Name, Student Name, Attendance, Attendance Date for Attendance module
