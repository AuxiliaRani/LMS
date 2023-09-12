/**
 * Author:    Auxilia
 * Created:   09.10.2023
 * 
 * Numpy Ninja
 **/
package stepDefinitionsMainPage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.MainPage;
import utilities.LoggerLoad;

public class ResetPasswordSD {
	MainPage resetPwdPage = new MainPage();
	//Background: Admin is on Login page after clicking Login button in home page
	@Given("Admin is on {string} page")
	public void admin_is_on_page(String login) {
		resetPwdPage.getLMSPortal();
		resetPwdPage.clickHomeLoginButton();
		String title = resetPwdPage.verifyPageTitle();
		LoggerLoad.info("Title of the current page: " + title);
		try {
			assertEquals(title, login, "Page Title do not match");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	    
	}

	@When("Admin clicks on {string} link from Login page")
	public void admin_clicks_on_link_from_login_page(String resetPwd) {
			resetPwdPage.clickResetPwd();
			String title = resetPwdPage.verifyPageTitle();
			LoggerLoad.info("Title of the current page: " + title);
			try {
				assertEquals(title, resetPwd, "Page Title do not match");
			} catch (AssertionError e) {
				LoggerLoad.error("Assertion failed: " + e.getMessage());
			}			    
	}


	//@TC_ResetPassword_01
	@Then("Admin should see correct spellings for all fields in {string} page")
	public void admin_should_see_correct_spellings_for_all_fields_in_page(String string) {
		LoggerLoad.info("Verify correct spellings in all fields on the Reset Password page");
		String newPwdTxt = resetPwdPage.getNewPwdTxt();	
		String retypePwdTxt = resetPwdPage.getRetypePwdTxt();
		try {
			assertEquals(newPwdTxt, "Type in new Password", "Incorrect spelling" + newPwdTxt);
			assertEquals(retypePwdTxt, "ReType Password", "Incorrect spelling " + retypePwdTxt);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}	
	    
	}

	//@TC_ResetPassword_02
	@Then("Admin should see {string} button in Reset Password page")
	public void admin_should_see_button_in_reset_password_page(String string) {
		LoggerLoad.info("Admin should see the Submit button");
		WebElement submitButton = resetPwdPage.verifySubmitButton();
		try {
			assertNotNull("Submit button is not present", submitButton);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	    
	}

	//@TC_ResetPassword_03
	@Then("Admin should see {string} button in the center of the Reset Password page")
	public void admin_should_see_button_in_the_center_of_the_reset_password_page(String string) {
		try {
			boolean isSubmitCenter = resetPwdPage.isSubmitButtonCentered();
			assertTrue("Submit button is not Centered", isSubmitCenter);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	    
	}

	//@TC_ResetPassword_04
	@Then("Admin should see two text box in the Reset Password page")
	public void admin_should_see_two_text_box_in_the_reset_password_page() {
	    
		int txtFieldCount = resetPwdPage.getTxtFieldCount();
		try {
			assertEquals(txtFieldCount, 2, "Expected two text fields in the reset password page, but found" + txtFieldCount);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	//@TC_ResetPassword_05
	@Then("Admin should see {string} in the first label text on the Reset Password page")
	public void admin_should_see_in_the_first_label_text_on_the_reset_password_page(String string) {
		WebElement typeNewPwd = resetPwdPage.verifyTypeNewPwd();
		try {
			assertNotNull("Type in new Password is not present", typeNewPwd);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	    
	}

	//@TC_ResetPassword_06
	@Then("Admin should see {string} in the second label text on the Reset Password page")
	public void admin_should_see_in_the_second_label_text_on_the_reset_password_page(String string) {
		WebElement retypePwd = resetPwdPage.verifyRetypePwd();
		try {
			assertNotNull("ReType Password is not present", retypePwd);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	    
	}

	//@TC_ResetPassword_07
	@Then("Admin should see both the text box in disabled state on the Reset Password page")
	public void admin_should_see_both_the_text_box_in_disabled_state_on_the_reset_password_page() {
	    boolean areTxtBoxDisabled = resetPwdPage.areBothTextBoxesDisabled();
	    try {
	    assertFalse("Both the Text Boxes are not in disabled state", areTxtBoxDisabled);
	    }catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	    
	}


	
}
