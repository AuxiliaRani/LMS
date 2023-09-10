@HomePage
Feature: Home Page Verification

	Background:
		Given Admin launch the browser
    
	
	@TC_HomePage_01
  Scenario: Verify admin is able to land on home page
    When Admin gives the correct LMS portal URL
    Then Admin should land on the "Home" page
    
  @TC_HomePage_02
  Scenario Outline: Verify admin is able to land on home page with invalid URL
    When Admin gives the invalid LMS portal URL "<invalid_url>"
    Then Admin should receive "404 page not found" error    
    Examples:
    |invalid_url           |
    |https://invalidurl.com|

  @TC_HomePage_03
  Scenario: Admin verifies for broken link on the LMS portal
    When  Admin gives the correct LMS portal URL
    Then Admin should receive "Https response code greater than or equal to 400" error for the link
    And The link is broken
    
  
 	@TC_HomePage_04
  Scenario: Admin verifies correct spellings in all fields on the LMS portal
    When Admin gives the correct LMS portal URL
    Then Admin should see correct spellings in all fields on the LMS portal
        
  
  @TC_HomePage_05
  Scenario:  Admin verifies the presence of the LMS logo
    When Admin gives the correct LMS portal URL 
    Then Admin should see correct Logo of the LMS
    
  @TC_HomePage_06
  Scenario: Admin verifies that the LMS logo is properly aligned
    When Admin gives the correct LMS portal URL 
    Then Admin should see that the Logo is properly aligned
    
    @TC_HomePage_07
  Scenario: Admin verifies the presence of the login button
    When Admin gives the correct LMS portal URL 
    Then Admin should see the "Login" button 
    
    @TC_Register_08
  Scenario:  Admin verifies that the Login button is clickable
    When Admin gives the correct LMS portal URL 
    Then Admin should be able to click the "Login" button
    
   