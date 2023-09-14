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
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.MainPage;
import utilities.LoggerLoad;

public class ForgotUsernamePwdSD extends DriverFactory {

	MainPage forgotPwdPage = new MainPage();
	private int responseCode;

	// Background - Admin is on the login page after clicking Login button from the
	// home page
	@Given("Admin is on the {string} page for Forgot Username and Password")
	public void admin_is_on_the_page_for_forgot_username_and_password(String login) {
		forgotPwdPage.getLMSPortal();
		forgotPwdPage.clickHomeLoginButton();
		String title = forgotPwdPage.verifyPageTitle();
		LoggerLoad.info("Title of the current page: " + title);
		try {
			assertEquals(title, login, "Page Title do not match");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	@When("Admin clicks on {string} link")
	public void admin_clicks_on_link(String string) {
		try {
			forgotPwdPage.clickForgotUserPwd();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}

	// @TC_ForgotUsernamePassword_01
	@Then("Admin should land on {string} page from Login page")
	public void admin_should_land_on_page_from_login_page(String forgotUserPwd) {
		String title = forgotPwdPage.verifyPageTitle();
		LoggerLoad.info("Title of the current page: " + title);
		try {
			assertEquals(title, forgotUserPwd, "Page Title do not match");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_ForgotUsernamePassword_02
	@Then("Admin should receive {string} error for the Forgot Username\\/Password link")
	public void admin_should_receive_error_for_the_forgot_username_password_link(String expectedResponseCode)
			throws IOException {
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

	// @TC_ForgotUsernamePassword_03
	@Then("The link is broken for  Forgot Username\\/Password")
	public void the_link_is_broken_for_forgot_username_password() {
		try {
			assertTrue("The Link is Broken", responseCode >= 400);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_ForgotUsernamePassword_04
	@Then("Admin should see {string} text in gray color")
	public void admin_should_see_text_in_gray_color(String string) {
		boolean isEmailTxtGray = forgotPwdPage.isEmailTxtGray();
		try {
			assertTrue("Email text is not in Gray Color", isEmailTxtGray);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_ForgotUsernamePassword_05
	@Then("Admin should see {string} in text field")
	public void admin_should_see_in_text_field(String expectedText) {
		String actualText = forgotPwdPage.verifyEmailTxt();
		LoggerLoad.info("Actual Text in the Email field: " + actualText);
		try {
			assertEquals(actualText, expectedText, "Text in the Email field is not correct/empty");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_ForgotUsernamePassword_06
	@Then("Admin should see {string} button")
	public void admin_should_see_button(String string) {
		LoggerLoad.info("Verify Send Link button");
		WebElement sendLinkButton = forgotPwdPage.verifySendLinkButton();
		try {
			assertNotNull("Send Link button is not present", sendLinkButton);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_ForgotUsernamePassword_07
	@Then("Admin should see * symbol next to the text Email")
	public void admin_should_see_symbol_next_to_the_text_email() {
		boolean isAsteriskEmailPresent = forgotPwdPage.isAsteriskEmailPresent();
		try {
			assertTrue("Asterisk (*) symbol is not present next to 'Email' text", isAsteriskEmailPresent);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_ForgotUsernamePassword_08
	@Then("Admin should see correct spellings in all fields")
	public void admin_should_see_correct_spellings_in_all_fields() {
		LoggerLoad.info("Verify correct spellings in all fields on the Forgot Username or Password page");
		String SendLinkTxt = forgotPwdPage.getSendLinkTxt();
		LoggerLoad.info("Send Link text in the current page: " + SendLinkTxt);
		try {
			assertEquals(SendLinkTxt, "Send Link", "Send Link field has incorrect spelling");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_ForgotUsernamePassword_09
	@Then("Admin should see {string} button in center of the page")
	public void admin_should_see_button_in_center_of_the_page(String string) {
		try {
			boolean isSendLinkCenter = forgotPwdPage.isSendLinkButtonCentered();
			assertTrue("Send Link button is not Centered", isSendLinkCenter);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

}
