Feature: Manage Program Validation

Background: Admin is on dashboard page after Login and clicks Program on the navigation bar
   Given Admin/User/Staff  is on Manage Program page
    
@TC_Program_Page_Validation_03    
Scenario: Verify the text and pagination icon below the data table on Program Page
   
    Then   Admin should see the text as "Showing x to y of z entries" along with Pagination icon below the table.
    And    x- starting record number on that page y-ending record number on that page z- Total number of records
    
@TC_Program_Page_Validation_04
Scenario: Validating the Manage Program Footer on Program Page
  
    Then   Admin should see the footer as "In total there are z programs" z- Total number of records on Program Page

@TC_Program_Page_Validation_05
Scenario: Validating the default state of Delete button in Manage Program page
    
    Then   Admin should see a Delete button on the top left hand side as Disabled on Program Page

@TC_Program_Page_Validation_06      
Scenario:  Validate Add A New Program button in Manage Program page
    
    When   Admin Clicks on  " + A New Program" button in Manage Program page
    Then   Admin should see a "+A New Program" button on the program page above the data table  in Manage Program page

@TC_Program_Page_Validation_07    
Scenario: Validate that number of records --rows of data in the table-- displayed in Manage Program page
    
    Then   Admin should see the number of records rows of data in the table displayed on the page are 5 
    
@TC_Program_Page_Validation_08      
Scenario: Verify data table on the Manage Program page
    When   Admin/User/Staff enters Program Name to be searched  in Manage Program page
    Then   Admin should see data table on the Manage Program Page with following column headers Program Name, Program Description, Program Status, Edit,Delete
    
@TC_Program_Page_Validation_09   
Scenario: Verify Sort arrow icon on the data table in Manage Program page
 
    When   Admin/User/Staff enters Program Status to be searched   in Manage Program page
    Then   Admin should see the sort arrow icon beside to each column header except Edit and Delete  in Manage Program page
    



 











    
    
   