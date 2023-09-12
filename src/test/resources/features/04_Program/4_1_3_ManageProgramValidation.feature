Feature: Manage Program Validation search button validation

Background: Admin is on dashboard page after Login and clicks Program on the navigation bar
   Given   Admin  is on Manage Program page for search button validation

@TC_Program_Page_Validation_10    
Scenario: Verify Check box on the data table in Manage Program page
   
    When   Admin enters Program Status to be searched  in Manage Program page 
    Then   Admin should see check box on the left side in all rows of the data table  in Manage Program page  
    
@TC_Program_Page_Validation_11    
Scenario: Verify Edit and Delete buttons in Manage Program page
    
    When   Admin enters Program Status to be searched  
    Then   Admin should see the Edit and Delete buttons on each row of the data table  

@TC_Program_Page_Validation_12   
Scenario: Verify Search bar in Manage Program page
  
    
    Then   Admin should see Search bar with text as "Search..."  in Manage Program page

@TC_Program_Page_Validation_13    
Scenario: Search by  Program Name in Manage Program page
   
    When   Admin enters Program name phrase into search box in Manage Program page 
    Then   Admin should see the Programs displayed based on the Program Name

@TC_Program_Page_Validation_14    
Scenario: Search by Program Description in Manage Program page

    When   Admin enters Program description phrase into search box in Manage Program page
    Then   Admin should see the Programs displayed based on the Program Description in Manage Program page
 
 @TC_Program_Page_Validation_15   
Scenario: Search by  Program Status in Manage Program page
   
    When   Admin enters Program status phrase into search box in Manage Program page
    Then   Admin should see the Programs displayed based on the Program Status in Manage Program page
    
@TC_Program_Page_Validation_16   
Scenario: Validating the Search with unrelated keyword in Manage Program page
    When   Admin enters the keywords not present in the data table on the Search box in Manage Program page
    Then   Admin should see zero entries on the data table in Manage Program page
    