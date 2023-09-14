Feature: Manage Class Page Verification

  Background: Logged on the LMS portal as Admin
  Given Admin is on Dashboard page after login with valid username and password
    When Admin clicks "Class" button on the navigation bar

@TC_ManageClass_01
  Scenario: Verify landing in class page
    Then Admin should see URL with "Manage Class"
    
@TC_ManageClass_02
  Scenario: Capture the response time to navigate to manage class page
    Then Get the response time for navigation from dashboard page to manage class page

@TC_ManageClass_03
  Scenario: Verify Manage Class Page Header
    Then Admin should see header with "Manage Class"

@TC_ManageClass_04
  Scenario: Verify delete icon below the header
    Then Admin should see disabled delete icon below the "Manage Class"

@TC_ManageClass_05
  Scenario: Verify search bar on the class page
    Then Admin should see search bar on the class page

@TC_ManageClass_06
  Scenario: Verify add new class button  on class page
    Then Admin should see Add New Class button on the class page

@TC_ManageClass_07
  Scenario: Verify data table on the class page
    Then Admin should see data table on the Manage Class Page With following column headers. (Check box symbol,Batch Id, Class No,Class Date, Class Topic, Staff Id, Description, Comments, Notes, Recording, Edit Delete)

@TC_ManageClass_08
  Scenario: Verify Edit icon in the data table
    Then Edit Icon in each row of data table only  when entries are available

@TC_ManageClass_09
  Scenario: Verify Edit icon when no data in the table
    Then Edit Icon will not be present in data table

@TC_ManageClass_10
  Scenario: Verify delete icon in the data table
    Then Delete Icon in each row of data table only  when entries are available

@TC_ManageClass_11
  Scenario: Verify delete icon when no data in the table
    Then Admin cant see delete  Icon in data table

@TC_ManageClass_12
  Scenario: Verify sort icon in the data table in manage class page
    Then Admin should see sort icon near the column headers except for Edit and Delete in manage class page

@TC_ManageClass_13
  Scenario: Verify check box in the data table
    Then Admin should see check box in the all rows  of data table

@TC_ManageClass_14
  Scenario: Validate the number entries displaying in manage class page
    Then Above the footer Admin should see the text as "Showing x to y of z entries" below the table in manage class page

  #x- starting record number on that page
  #y-ending record number on that page
  #z-Total number of records  Note: with or without entries
  
 @TC_ManageClass_15
  Scenario: Verify Pagination control below the data table in manage class page
    Then Admin should see the pagination controls under the data table in manage class page

@TC_ManageClass_16
  Scenario: Validate footer  text in manage class page
    Then Admin should see the text with total number classes in the data table. ( " In total there are number of classes")
