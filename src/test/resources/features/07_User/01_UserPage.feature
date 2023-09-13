@Userpage
Feature: User page validation
Background: Logged on the LMS portal

@Uspg1
  Scenario: Validate "+ A New user" button in User Page
    Given Admin is on dashboard page after Login for user page
    When Admin clicks "User" from navigation bar
    Then Admin should be able to see the "+ A New User" button
    
 @Uspg2
  Scenario: Validate "+ Assign staff"  button in User page
    
    Then Admin should be able to see the "+ Assign staff" button
    
  @Uspg3
  Scenario: Validate search box in User page
    
    Then Admin should be able to see the search text box
    
  @Uspg4
  Scenario: Validate data rows
  Then Each row in the data table should have a checkbox
   And Each row in the data table should have a edit icon that is enabled
   And Each row in the data table should have a delete icon that is enabled
   
    @Uspg5
  Scenario: Validate pop up for adding user
  Given Admin is on dashboard page after Login and Admin clicks "User" from navigation bar
  When Admin clicks "+ A New User" button
  Then A new pop up with User details appears
    
    
    
   
   