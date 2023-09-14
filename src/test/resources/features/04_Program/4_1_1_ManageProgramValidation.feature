Feature: Manage Program Validation

@TC_Program_Page_Validation_01
Scenario: Validate landing in Program page
    Given  Admin is on dashboard page after Login to validate  Program Page
    When   Admin clicks Program on the navigation bar on Program Page
    Then   Admin should see URL with "Manage Program"

@TC_Program_Page_Validation_02
Scenario: Validating the Manage Program Header on Program Page
     Then   Admin should see header text as "Manage Program" on Program Page