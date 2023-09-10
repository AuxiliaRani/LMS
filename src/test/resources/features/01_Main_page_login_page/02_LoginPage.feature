@LoginPage
Feature: Login Page Verification

	Background: Admin gives the correct LMS portal URL
		Given Admin is on the "Home" page
    When Admin clicks the "Login" button
	
	@TC_LoginPage_01
	Scenario: Verify Admin is able to land on the login page
    Then Admin should land on the "Login" page 
    
  @TC_LoginPage_02
	Scenario: Admin verifies for broken link on the login page
 		Then Admin should receive "Https response code greater than or equal to 400" error for the link
    And The link is broken 
    
  @TC_LoginPage_03
	Scenario: Admin Verify the header of the login page
    Then Admin should see "Please login to LMS application" in the header
    
  @TC_LoginPage_04
	Scenario: Admin verifies correct spellings in all fields on the Login page
    Then Admin should see correct spellings in all fields on the Login page
    
  @TC_LoginPage_05
	Scenario: Admin Verify the text fields are present on the login page
    Then Admin should see two text fields
    
  @TC_LoginPage_06
	Scenario: Admin Verify the text on the first text field on the login page
    Then Admin should see "User" in the first text field
    
  @TC_LoginPage_07
	Scenario: Admin Verify asterik next to the user text
    Then Admin should see "*" symbol next to User text in the first text field
    
  @TC_LoginPage_08
	Scenario: Admin Verify the text on the second text field in the login page
    Then Admin should see "Password" in the first text field
    
  @TC_LoginPage_09
	Scenario: Admin Verify asterik next to the password text
    Then Admin should see "*" symbol next to Password text in the second text field
    
  @TC_LoginPage_10
	Scenario: Admin Verify the alignment of the input fields on the login page
    Then Admin should see input fields on the centre of the login page
        
  @TC_LoginPage_11
  Scenario: Admin verifies the presence of the Login button on the login page
    Then Admin should see "Login" button on the login page
    
  @TC_LoginPage_12
  Scenario: Admin Verify the alignment of the Login button on the login page
    Then Admin should see "Login" button on the centre of the login page

	@TC_LoginPage_13
  Scenario: Admin verifies the presence of the Forgot Username or Password on the login page
    Then Admin should see "Forgot Username or Password" link
    
  @TC_LoginPage_14
	Scenario: Admin verifies the presence of the Reset Password on the login page
    Then Admin should see "Reset Password" link  
    
   @TC_LoginPage_15
	Scenario: Admin Verify the input text color in User field
    Then Admin should see text "User" displayed in gray color
    
    @TC_LoginPage_16
	Scenario: Admin Verify the input text color in Password field
    Then Admin should see text "Password" displayed in gray color
    
    
    
    