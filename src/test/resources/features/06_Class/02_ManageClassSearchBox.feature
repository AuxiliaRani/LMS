Feature: Manage Class Page Search Box Verification

  Background: Admin logged into LMS portal and clicks class button on the navigation bar
    Given Admin is on Manage Class Page

@TC_ManageClassSearchBox_01
  Scenario: Validate search box function with valid batchid in manage class page
    When Admin enters batch id into search box in manage class page
    Then Displays entries with that batch Id in manage class page
    
@TC_ManageClassSearchBox_02
  Scenario: Validate search box function with invalid batchid in manage class page
    When Admin enters batch id which is not existing the table into search box in manage class page
    Then Displays empty details in the data table for invalid batchid in manage class page

@TC_ManageClassSearchBox_03
  Scenario: Validate search box function with valid class number in manage class page
    When Admin enters class no into search box in manage class page
    Then Displays entries with that class no in manage class page

@TC_ManageClassSearchBox_04
  Scenario: Validate search box function with invalid class number in manage class page
    When Admin enters class no which doesnot exist in the table into search box
    Then Displays empty details in the data table for invalidclass in manage class page

@TC_ManageClassSearchBox_05
  Scenario: Validate search box function with valid class topic in manage class page
    When Admin enters class topic into search box in manage class page
    Then Displays entries with that class topic in manage class page

@TC_ManageClassSearchBox_07
  Scenario: Validate search box function with invalid class topic in manage class page
    When Admin enters class topic which does not exist in the table into search box
    Then Displays empty details in the data table for classtopic in manage class page

@TC_ManageClassSearchBox_08
  Scenario: Validate search box function with valid staffid in manage class page
    When Admin enters staff id into search box of manage class page
    Then Displays entries with that staff id in manage class page

@TC_ManageClassSearchBox_09
  Scenario: Validate search box function with invalid staffid in manage class page
    When Admin enters staff id which doesnt exist into search box of manage class page
    Then Displays empty details in the data table for staffid in manage class page

@TC_ManageClassSearchBox_10
  Scenario: Validate search box function with valid class date in manage class page
    When Admin enters class date into search box of manage class page
    Then Displays entries with that class date in manage class page

@TC_ManageClassSearchBox_11
  Scenario: Validate search box function with invalid class date in manage class page
    When Admin enters invalid class date into search box of manage class page
    Then Displays empty details in the data table for classdate in manage class page
