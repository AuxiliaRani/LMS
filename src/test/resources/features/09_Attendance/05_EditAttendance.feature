#Author: Amruta
@Edit_Attendance
Feature: Edit Attendance

  Background: Admin click +Add New Attendance button after reaching to Manage attendance page05
    Given Admin is in attendance details popup window05

  @TC_Attendance_50
  Scenario: Validate admin able to update  attendance data
    When Admin fills all the values and click save for Attendance module05
    Then Admin should see success message in popup window and sees new attendance details in manage attendance details DB for Attendance module05

  @TC_Attendance_51
  Scenario: Validate admin able to update attendance data without program name05
    When Admin fills values missing program name and click save for Attendance module05
    Then Program name is missing for Attendance module05

  @TC_Attendance_52
  Scenario: Validate admin able to update attendance data without class name05
    When Admin fills values missing class name and click save for Attendance module05
    Then class name is missing for Attendance module05

  @TC_Attendance_53
  Scenario: Validate admin able to create new attendance data without student name05
    When Admin fills values missing student name and click save for Attendance module05
    Then student name is missing for Attendance module05

  @TC_Attendance_54
  Scenario: Validate admin able to create new attendance data without attendances05
    When Admin fills values missing attendance and click save for Attendance module05
    Then Attendance is missing for Attendance module05

  @TC_Attendance_55
  Scenario: Validate admin able to create new attendance data without attendance date05
    When Admin fills values missing attendance date  and click save for Attendance module05
    Then Attendance date is missing for Attendance module05

  @TC_Attendance_56
  Scenario: Validate admin able to create new attendance by selecting future date05
    When Admin fills values with future date  and click save for Attendance module05
    Then Invalidate attendance date for Attendance module05
