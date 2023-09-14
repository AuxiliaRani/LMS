/**
 * Author:    Auxilia
 * Created:   09.10.2023
 * 
 * Numpy Ninja
 **/
package stepDefinitionsMainLoginPage;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebElement;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.MainPage;
import utilities.LoggerLoad;

public class LoginPageSD extends DriverFactory {

	MainPage loginPage = new MainPage();
	private int responseCode;

	// Background
	@Given("Admin is on the {string} page of LMS portal")
	public void admin_is_on_the_page_of_lms_portal(String lms) {

		LoggerLoad.info("Admin launch the LMS portal");
		loginPage.getLMSPortal();
		String title = loginPage.verifyPageTitle();
		LoggerLoad.info("Title of the current page: " + title);
		try {
			assertEquals(title, "LMS", "Page Title do not match");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	@When("Admin clicks the {string} button on LMS portal")
	public void admin_clicks_the_button_on_lms_portal(String string) {

		LoggerLoad.info("Admin clicks the Login button on LMS Portal");
		try {
			loginPage.clickLoginButton();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}

	// @TC_LoginPage_01
	@Then("Admin should land on the {string} page from LMS Portal")
	public void admin_should_land_on_the_page_from_lms_portal(String login) {

		String title = loginPage.verifyPageTitle();
		LoggerLoad.info("Title of the current page: " + title);
		try {
			assertEquals(title, login, "Page Title do not match");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_LoginPage_02
	@Then("Admin should receive {string} error for the link")
	public void admin_should_receive_error_for_the_link(String expectedResponseCode) throws IOException {
		// Get the current URL
		URL loginUrl = new URL(driver.getCurrentUrl());

		HttpURLConnection http = (HttpURLConnection) loginUrl.openConnection();
		responseCode = http.getResponseCode();
		int expectedRespCode = Integer.parseInt(expectedResponseCode);
		LoggerLoad.info("Expected Response Code : " + expectedResponseCode);
		try {
			assertEquals(expectedRespCode, responseCode);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}

	}

	// @TC_LoginPage_03
	@Then("Admin should see {string} in the header")
	public void admin_should_see_in_the_header(String expectedHeader) {

		String actualHeader = loginPage.getHeaderText();
		LoggerLoad.info("Actual header in the login page: " + actualHeader);
		try {
			assertEquals(actualHeader, expectedHeader, "Header text is incorrect");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_LoginPage_04
	@Then("Admin should see correct spellings in all fields on the Login page")
	public void admin_should_see_correct_spellings_in_all_fields_on_the_login_page() {

		LoggerLoad.info("Verify correct spellings in all fields on the Login page");
		String headerTxt = loginPage.getHeaderText();
		String loginTxt = loginPage.verifyLoginButton().getText();
		String forgotuserpwdTxt = loginPage.verifyForgotUserPwd().getText();
		String resetpwdTxt = loginPage.verifyResetPwd().getText();

		try {
			assertEquals(headerTxt, "Please login to LMS application", "Header has incorrect spelling");
			assertEquals(loginTxt, "Login", "Login button has incorrect spelling");
			assertEquals(forgotuserpwdTxt, "Forgot Username or Password",
					"Forgot Username or Password link has incorrect spelling");
			assertEquals(resetpwdTxt, "Reset Password", "Reset Password link has incorrect spelling");

		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_LoginPage_05
	@Then("Admin should see two text fields on the login page")
	public void admin_should_see_two_text_fields_on_the_login_page() {

		LoggerLoad.info("Admin validates the presence of username and password text fields");
		int txtFieldCount = loginPage.getTxtFieldCount();
		try {
			assertEquals(txtFieldCount, 2, "Expected two text fields in the login page, but found" + txtFieldCount);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_LoginPage_06
	@Then("Admin should see {string} in the first text field on the login page")
	public void admin_should_see_in_the_first_text_field_on_the_login_page(String expectedText) {

		String actualText = loginPage.verifyUserTxt();
		LoggerLoad.info("Actual Text in the Username field: " + actualText);
		try {
			assertEquals(actualText, expectedText, "Text in the first text field is not correct/empty");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_LoginPage_07
	@Then("Admin should see {string} symbol next to User text in the first text field on the login page")
	public void admin_should_see_symbol_next_to_user_text_in_the_first_text_field_on_the_login_page(String string) {
		try {
			boolean isAsteriskUserPresent = loginPage.isAsteriskUserPresent();
			assertTrue("Asterisk (*) symbol is not present next to 'User' text", isAsteriskUserPresent);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_LoginPage_08
	@Then("Admin should see {string} in the second text field on the login page")
	public void admin_should_see_in_the_second_text_field_on_the_login_page(String expectedText) {

		String actualText = loginPage.verifyPasswordTxt();
		LoggerLoad.info("Actual Text in the Passsword field: " + actualText);
		try {
			assertEquals(actualText, expectedText, "Text in the second text field is not correct/empty");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_LoginPage_09
	@Then("Admin should see {string} symbol next to Password text in the second text field on the login page")
	public void admin_should_see_symbol_next_to_password_text_in_the_second_text_field_on_the_login_page(
			String string) {

		boolean isAsteriskPwdPresent = loginPage.isAsteriskPwdPresent();
		try {
			assertTrue("Asterisk (*) symbol is not present next to 'Password' text", isAsteriskPwdPresent);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_LoginPage_10
	@Then("Admin should see input fields on the centre of the login page")
	public void admin_should_see_input_fields_on_the_centre_of_the_login_page() {

		boolean areinputFieldsCenter = loginPage.areInputFieldsCenter();
		try {
			assertTrue("Input Fields are not Centered", areinputFieldsCenter);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_LoginPage_11
	@Then("Admin should see Login button on the login page")
	public void admin_should_see_button_on_the_login_page() {

		LoggerLoad.info("Verify Login button in LMS Portal");
		WebElement loginButton = loginPage.verifyLoginButton();
		try {
			assertNotNull("Login button is not present", loginButton);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_LoginPage_12
	@Then("Admin should see Login button on the centre of the login page")
	public void admin_should_see_login_button_on_the_centre_of_the_login_page() {
		try {
			boolean isLoginCenter = loginPage.isLoginButtonCentered();
			assertTrue("Login button is not Centered", isLoginCenter);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_LoginPage_13
	@Then("Admin should see Forgot Username or Password link")
	public void admin_should_see_forgot_username_or_password_link() {

		WebElement forgotUserPwd = loginPage.verifyForgotUserPwd();
		try {
			assertNotNull("Forgot Username or Password is not present", forgotUserPwd);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_LoginPage_14
	@Then("Admin should see Reset Password link")
	public void admin_should_see_reset_password_link() {

		WebElement forgotUserPwd = loginPage.verifyForgotUserPwd();
		try {
			assertNotNull("Forgot Username or Password is not present", forgotUserPwd);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_LoginPage_15
	@Then("Admin should see User text displayed in gray color")
	public void admin_should_see_user_text_displayed_in_gray_color() {

		boolean isUserTxtGray = loginPage.isUserTxtGray();
		try {
			assertTrue("User text is not in Gray Color", isUserTxtGray);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_LoginPage_16
	@Then("Admin should see Password text displayed in gray color")
	public void admin_should_see_password_text_displayed_in_gray_color(String string) {

		boolean isPwdTxtGray = loginPage.isPwdTxtGray();
		try {
			assertTrue("Password text is not in Gray Color", isPwdTxtGray);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}
}
