 @UserpageDeleteuser
Feature: Delete user
Background:  Logged on the LMS portal
             Admin is on dashboard page after Login
             Admin clicks "User"from navigation bar

@Uspg16
  Scenario: Validate row level delete icon
    Given The delete icon on row level in data table is enabled
     When Admin clicks the delete icon for user
    Then  Alert appears with yes and No option for user delete
    
   @Uspg17
  Scenario: Validate accept alert
    Given Admin clicks the delete icon
     When Admin click yes option for user delete
    Then  User deleted alert pops and user is no more available in data table
    
    @Uspg18
  Scenario: Validate reject alert
    Given Admin clicks the delete icon
     When Admin click No option for user delete
    Then  User is still listed in data table
            