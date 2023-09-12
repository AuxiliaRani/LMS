#Author: Amruta
@Navigation_function_validation_from_manage_attendance_page_to_other_pages
Feature: Navigation function validation from manage attendance page to other pages

  Background: Admin is manage class page after logged in13
    Given Admin is in manage attendance page for attendance module13

  @TC_Attendance_77
  Scenario: Verify admin is able to navigate from manage attendance to student page for attendance module13
    When Admin clicks " Student" button in the navigation bar for attendance module13
    Then Admin should able to land on student page for attendance module13

  @TC_Attendance_78
  Scenario: Verify admin is able to navigate from manage attendance to program page for attendance module13
    When Admin clicks " Program" button in the navigation bar for attendance module13
    Then Admin should able to land on program page for attendance module13

  @TC_Attendance_79
  Scenario: Verify admin is able to navigate from manage attendance to batch page for attendance module13
    When Admin clicks " Batch" button in the navigation bar for attendance module13
    Then Admin should able to land on batch page for attendance module13

  @TC_Attendance_80
  Scenario: Verify admin is able to navigate from manage attendance to user page for attendance module13
    When Admin clicks " User" button in the navigation bar for attendance module13
    Then Admin should able to land on user page for attendance module13

  @TC_Attendance_81
  Scenario: Verify admin is able to navigate from manage attendance to assignment page for attendance module13
    When Admin clicks " Assignment" button in the navigation bar for attendance module13
    Then Admin should able to land on Assignment page for attendance module13

  @TC_Attendance_82
  Scenario: Verify admin is able to navigate from manage attendance to attendance page for attendance module13
    When Admin clicks " class" button in the navigation bar for attendance module13
    Then Admin should able to land on class page for attendance module13

  @TC_Attendance_83
  Scenario: Verify admin should able to do logout function from manage attendance for attendance module13
    When Admin clicks "Logout" button in the navigation bar for attendance module13
    Then Admin should able to land on login page for attendance module13
