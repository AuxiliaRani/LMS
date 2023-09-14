/**
 * Author:    Auxilia
 * Created:   09.10.2023
 * 
 * Numpy Ninja
 **/
package stepDefinitionsMainLoginPage;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.MainPage;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class LoginValidationsSD extends ConfigReader {

	MainPage loginPage = new MainPage();
	String excelfilepath = ConfigReader.getExcelFilePath();
	static String username;
	static String password;
	static String expectedMsg;
	Boolean isRequired;

	// Background - Admin is on the login page after clicking Login button from the
	// home page
	@Given("Admin is on the {string} page")
	public void admin_is_on_the_page(String login) {
		loginPage.getLMSPortal();
		loginPage.clickHomeLoginButton();
		String title = loginPage.verifyPageTitle();
		LoggerLoad.info("Title of the current page: " + title);
		try {
			assertEquals(title, login, "Page Title do not match");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_LoginCredentials_01/03/04
	@When("Admin enters valid {string} and {string}")
	public void admin_enters_valid_username_and_password(String string, String string1,
			io.cucumber.datatable.DataTable dataTable) {
		try {
			loginPage.enterValidUsername(dataTable);
			loginPage.enterValidPassword(dataTable);
		} catch (Error e) {
			LoggerLoad.error("Login Failed: " + e.getMessage());
		}
	}

	@When("Clicks on {string} button")
	public void clicks_on_button(String string) {
		LoggerLoad.info("Admin click login button");
		loginPage.clickLoginButton();
	}

	@Then("Admin should land on {string} page from login page")
	public void admin_should_land_on_page_from_login_page(String dashboard) {
		String title = loginPage.verifyPageTitle();
		LoggerLoad.info("Title of the current page: " + title);
		try {
			assertEquals(title, dashboard, "Page Title do not match");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_LoginCredentials_02
	@When("Admin enters sheet {string} and {int}")
	public void admin_enters_sheet_and(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		try {
			LoggerLoad.info("User Enter the sheet details");
			ExcelReader reader = new ExcelReader();
			LoggerLoad.info("Excel File Path in SD : " + excelfilepath);
			List<Map<String, String>> testData = reader.getData(excelfilepath, sheetName);
			username = testData.get(rowNumber).get("username");
			password = testData.get(rowNumber).get("password");
			expectedMsg = testData.get(rowNumber).get("expected message");

			LoggerLoad.info("Admin Enter username as \" " + username + " \" Password as \" " + password + "\" ");
			if (username != null || password != null) {
				loginPage.doLogin(username, password);
			}
		} catch (Error e) {
			LoggerLoad.error("Failed to get the excel data: " + e.getMessage());
		}

	}

	// @TC_LoginCredentials_03
	@When("Clicks on {string} button through keyboard")
	public void clicks_on_button_through_keyboard(String string) {
		try {
			LoggerLoad.info("Admin clicks login through keyboard");
			loginPage.pressEnterKeyonLogin();
		} catch (Error e) {
			LoggerLoad.error("Failed to enter keys on login: " + e.getMessage());
		}
	}

	// @TC_LoginCredentials_04
	@When("Clicks on {string} button through mouse action")
	public void clicks_on_button_through_mouse_action(String string) {
		try {
			LoggerLoad.info("Admin clicks login by mouse actions");
			loginPage.clickLoginButtonWithMouse();
		} catch (Error e) {
			LoggerLoad.error("Failed to enter keys on login: " + e.getMessage());
		}
	}
//	@Then("Admin should land on {string} page")
//	public void admin_should_land_on_page(String string) {
//	    
//	}

}
