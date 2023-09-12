@ResetPasswordDetails
Feature: Reset Password Details Validations

	Background: Admin clicks Reset Password link on login page
		Given Admin is on "Reset Password" page
		
		
	@TC_ResetPasswordDetails_01
	Scenario: Verify text box is enabled in Type in new Password field
		When Admin clicks on "Type in new Password" field
    Then Admin should see text box is in enabled state
   
  @TC_ResetPasswordDetails_02
	Scenario: Verify text box is enabled in Retype Password field
    When Admin clicks on "Retype Password" field
   	Then Admin should see text box is in enabled state
    
  @TC_ResetPasswordDetails_03
	Scenario: Validate Reset Password with valid details
    When Admin enters same valid password on <newpassword> and <retypepassword>
		    | newpassword  |  retypepassword  |
		    | Validpwd@9   |  Validpwd@9		  |
    And  Admin clicks "Submit" button
    Then Admin should receive "Your password has been reset". Please click here to login
    
  @TC_ResetPasswordDetails_04
	Scenario: Validate Reset Password with invalid details
    When Admin enters invalid same password on <newpassword> and <retypepassword>
    	  | newpassword | retypepassword  |
		    |  invalid%&  |  	invalid%&   |
    And  Admin clicks "Submit" button
    Then Admin should see error message "Please try again"
    
  @TC_ResetPasswordDetails_05
	Scenario: Validate Reset Password with empty fields
    When Admin clicks on "Submit" button with empty fields
    Then Admin should see error message "Please try again"
    
  @TC_ResetPasswordDetails_06
	Scenario: Validate Reset Password with mismatch values
    When Admin enters mismatch values on <newpassword> and <retypepassword>
    	  | newpassword |  retypepassword  |
		    |  Validpwd@9 |  	Validpwd       |
    And  Admin clicks "Submit" button
    Then Admin should see error message "Please try again"