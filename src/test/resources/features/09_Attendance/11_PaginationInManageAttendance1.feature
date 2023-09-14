#Author: Amruta
@Pagination_in_manage_attendance1
Feature: Pagination in manage attendance1

  Background: Logged on the LMS portal as Admin for attendance module11
    Given Admin is on dashboard page after Login for attendance module11
    When Admin clicks "attendance" button on the navigation bar for attendance module11

  @TC_Attendance_66
  Scenario: Verify sheet one is displayed on default in data table for attendance module11
    Then Data table should display 1 page  when entries available for attendance module1166

  @TC_Attendance_67
  Scenario: Verify  right arrow is enable when sheet one is displayed in data table for attendance module11
    Then Right arrow should be enabled in page one  when entries are more than 5 available for attendance module11

  @TC_Attendance_68
  Scenario: Verify  left arrow is disable when sheet one is displayed in data table for attendance module11
    Then Left arrow should be disabled in page one  when entries are more than 5 available for attendance module11

  @TC_Attendance_69
  Scenario: Verify  right arrow is enable when sheet two is displayed in data table when entries are more than 10 for attendance module11
    Then Right arrow should be enabled in page two when entries are more than 10 available for attendance module11

  @TC_Attendance_70
  Scenario: Verify  left arrow is enable when sheet two is displayed in data table for attendance module11
    Then Left arrow should be enabled in page two for attendance module11

  @TC_Attendance_71
  Scenario: Verify  right arrow is disable when sheet two is displayed in data table when entries are less than 10 for attendance module11
    Then Data table should display  page 1 when entries available for attendance module11

  @TC_Attendance_72
  Scenario: 
    Verify  right arrow is disable when sheet two is displayed in data table when entries are less than 10 for attendance module11

    Then Data table should display page 1  when entries available for attendance module1172

  @TC_Attendance_73
  Scenario: Verify pagination controls enabled for attendance module11
    Then pagination controls enabled if entries are more than 5 in data table for attendance module11

  @TC_Attendance_74
  Scenario: 
    Verify pagination controls disabled for attendance module11

    Then pagination controls disabled if entries are less than 5 in data table for attendance module11
