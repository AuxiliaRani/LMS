@Logout
Feature: Logout Funtion

	Background: Admin is in Dashboard page after logged in
	
	@TC_Logout_01
  Scenario: Verify Logout button function
    Given Admin is on "Dashboard" page for logout
    When Admin clicks "Logout" button on navigation bar
    Then Admin should land on "Login" page after clicking logout
    