@UserpageEdituser
Feature: Edit new user
Background:  Logged on the LMS portal
             Admin is on dashboard page after Login
             Admin clicks "User"from navigation bar

@Uspg11
  Scenario: Validate row level edit icon
    Given The edit icon on row level in data table is enabled for user
     When Admin clicks the edit icon in userpage
    Then  A new pop up with User details appears for userpage
           
    @Uspg12
  Scenario: Check if the fields are updated
    Given Admin clicks the edit icon for user
     When Update the fields with valid values and click submit for user
    Then  The updated user details should appear on the data table
    
    @Uspg13
  Scenario: Check if the update throws error with invalid values
    When Update the fields with invalid values and click submit for user
    Then  Error message should appear for user
    
    
    @Uspg14
  Scenario: Check if you get error message when mandatory fields are erased
    When Erase data from mandatory field for user
    Then  Error message should appear for user mandotry fields erased
    
     @Uspg15
  Scenario: Check if description field is optional in update
     When Erase data from description field for user
    Then The updated user details should appear on the data table for user