@ResetPassword
Feature: Reset Password Validations

	Background: Admin is on Login page after clicking Login button in home page
		Given Admin is on "Login" page
		When Admin clicks on "Reset Password" link
		
	@TC_ResetPassword_01
	Scenario: Verify Reset Password link	 
    Then Admin should land on "Reset Password" page
   
  @TC_ResetPassword_02
	Scenario: Verify text in the page
    Then Admin should see correct spellings in all fields 
    
  @TC_ResetPassword_03
	Scenario: Verify the presence of Submit button
    Then Admin should see "Submit"  button
    
     @TC_ResetPassword_04
	Scenario: Verify the alignment of the Submit button
    Then Admin should see "Submit" button in the center of the page
    
     @TC_ResetPassword_05
	Scenario: Verify text box is present in the page
    Then Admin should see two text box
    
     @TC_ResetPassword_06
	Scenario: Verify First label text
    Then Admin should see "Type in new Password" in the first label text
    
     @TC_ResetPassword_07
	Scenario: Verify Second label text
    Then Admin should see "Retype Password" in the second label text
    
     @TC_ResetPassword_08
	Scenario: Verify both the text box is in disabled state
    Then Admin should see both the text box in disabled state
     