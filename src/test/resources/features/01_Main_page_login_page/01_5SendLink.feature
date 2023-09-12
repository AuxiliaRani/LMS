@SendLink
Feature: Send Link Validations in Forgot Username and Password Page

	Background: Admin Clicks on Forgot Username and Password after reaching Login page
		Given Admin is in "Forgot Username and Password" page
		
	@TC_SendLink_01
	Scenario: Validate Email sent for Forgot Username or Password with valid email id
    When Admin enters valid "<emailid>" and clicks "Send Link" button
	   	 |   emailid        |
	     |bddcoders@gmail.com|
    Then Admin should receive link in mail to Reset Username/Password
    
  @TC_SendLink_02
	Scenario: Validate Email sent for Forgot Username or Password with invalid email id
    When Admin enters invalid "<emailid>" and clicks "Send Link" button
	   	 |   emailid           |
	     |bddcoders@gggmail.com|
    Then Admin should not receive link in mail to Reset Username/Password