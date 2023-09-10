@ForgotUsernamePassword
Feature: Forgot Username and Password Validations

	Background: Admin is on the login page after clicking Login button from the home page
		Given Admin is on the "Login" page
		When Admin clicks on "Forgot Username or Password" link
		
	@TC_ForgotUsernamePassword_01
	Scenario: Admin Verify Forgot Username or Password link		
    Then Admin should land on "Forgot Username or Password" page
    
  @TC_ForgotUsernamePassword_02
	Scenario: Admin verify broken link for Forgot Username or Password link		
    Then Admin should receive "Https response code greater than or equal to 400" error for the link
    And The link is broken     
    
  @TC_ForgotUsernamePassword_03
	Scenario: Admin Verify the Email text color
    Then Admin should see "Email" text in gray color
    
  @TC_ForgotUsernamePassword_04
	Scenario: Admin Verify send link button is present
    Then Admin should see "Email" in text field
    
  @TC_ForgotUsernamePassword_05
	Scenario: Admin Verify Send Link button is present
    Then Admin should see "Send Link" button
    
  @TC_ForgotUsernamePassword_06
	Scenario: Admin Verify asterik near to the Email text
    Then Admin should see * symbol next to the text Email
    
  @TC_ForgotUsernamePassword_07
	Scenario: Admin Verify the text spelling
    Then Admin should see correct spellings in all fields 
    
  @TC_ForgotUsernamePassword_08
	Scenario: Admin Verify the alignment of the Send Link button
    Then Admin should see "Send Link" button in center of the page
    
  
    
    
    
    
    
