@SendLink
Feature: Send Link Validations in Forgot Username and Password Page

	Background: Admin Clicks on Forgot Username and Password after reaching Login page
		Given Admin is in "Forgot Username and Password" page
		
	@TC_SendLink_01
	Scenario: Validate Email sent for Forgot Username or Password with valid email id
    When Admin enters valid "<emailid>"
	   	 |   emailid        |
	     |bddcoders@gmail.com|
	  And  Admin clicks "Send Link" button on Forgot Username and Password page
    Then Admin should receive link in mail to Reset Username/Password
    
  @TC_SendLink_02
	Scenario: Validate Email sent for Forgot Username or Password with invalid email id
    When Admin enters invalid "<emailid>"
	   	 |   emailid           |
	     |bddcoders@gggmail.com|
	  And Admin clicks "Send Link" button on Forgot Username and Password page
    Then Admin should not receive link in mail to Reset Username/Password