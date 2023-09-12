#Author: Amruta
@Pagination_in_manage_attendance2
Feature: Pagination in manage attendance2

  Background: Admin click +Add New attendance button after reaching to Manage attendance page12
    Given Admin is in add attendance details popup window for attendance module12

  @TC_Attendance_75
  Scenario: Verify next page is enabled for attendance module12
    When Admin creates 6 new attendance for attendance module12
    Then Total attendance entries above 5 next page is enabled on multiples of 5 new page will be enabled for attendance module12

  @TC_Attendance_76
  Scenario: Verify next page is disabled for attendance module12
    When Admin creates less than or equal to 5 new attendance for attendance module12
    Then Total attendance entries 5 or below next page is disabled for attendance module12
