@UserpageDeleteMultipleuser
Feature: Delete multiple user
Background:  Logged on the LMS portal
             Admin is on dashboard page after Login
             Admin clicks "User"from navigation bar

@Uspg19
  Scenario: Validate the delete icon below the header 
    Given None of the checkboxes in data table are selected for multiple user delete
     
    Then  The delete icon under the "Manage User" header should be disabled
    
  @Uspg20
  Scenario: Check for single row delete 
    Given One of the checkbox/ row is selected
     When Click delete icon below "Manage User" header
    Then  The respective row in the data table is deleted for multiple user
    
 @Uspg21
  Scenario: Check for multi row delete 
    Given Two or more checkboxes/row is selected
     When Click delete icon below "Manage User" header for deleting multiple user
    Then  The respective row in the data table is deleted for users