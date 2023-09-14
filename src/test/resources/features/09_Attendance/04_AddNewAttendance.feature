#Author: Amruta

@Add_New_Attendance
Feature: Add new attendance

  Background: Admin click +Add New Attendance button after reaching to Manage attendance page 04
    Given Admin is in attendance details popup window04

  @TC_Attendance_43
  Scenario: Validate admin able to create new attendance data
    When Admin fills all the values and click save for Attendance module
    Then Admin should see success message in popup window and sees new attendance details in manage attendance details DB for Attendance module

  @TC_Attendance_44
  Scenario: Validate admin able to create new attendance data without program name
    When Admin fills values missing program name and click save for Attendance module
    Then Program name is missing for Attendance module

  @TC_Attendance_45
  Scenario: Validate admin able to create new attendance data without class name
    When Admin fills values missing class name and click save for Attendance module
    Then class name is missing for Attendance module

  @TC_Attendance_46
  Scenario: Validate admin able to create new attendance data without student name
    When Admin fills values missing student name and click save for Attendance module
    Then student name is missing for Attendance module

  @TC_Attendance_47
  Scenario: Validate admin able to create new attendance data without attendances
    When Admin fills values missing attendance and click save for Attendance module
    Then Attendance is missing for Attendance module

  @TC_Attendance_48
  Scenario: Validate admin able to create new attendance data without attendance date
    When Admin fills values missing attendance date  and click save for Attendance module
    Then Attendance date is missing for Attendance module

  @TC_Attendance_49
  Scenario: Validate admin able to create new attendance by selecting future date
    When Admin fills values with future date  and click save for Attendance module
    Then Invalidate attendance date for Attendance module
