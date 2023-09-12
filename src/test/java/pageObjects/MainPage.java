package pageObjects;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class MainPage extends DriverFactory {

	String lmsPortal = ConfigReader.getHomePage();
	String invalidUrl = ConfigReader.getInvalidUrl();
	String loginPage = ConfigReader.getLoginPage();
	Boolean isRequired;

	@FindBy(xpath = "//*[@id='learning']")
	WebElement locateLearning;
	@FindBy(xpath = "//*[@id='management']")
	WebElement locateManagement;
	@FindBy(xpath = "//*[@id='system']")
	WebElement locateSystem;
	@FindBy(xpath = "//img[@class='logo-class']")
	WebElement lmsLogo;
	@FindBy(xpath = "//button[text()='Login']")
	WebElement loginButton;
	@FindBy(xpath = "//h1[@class='header-class']")
	WebElement header;
	@FindBy(xpath = "//input[@type='text']")
	List<WebElement> txtFields;
	@FindBy(xpath = "//input[@id='id_user']")
	WebElement user;
	@FindBy(xpath = "//input[@id='id_password']")
	WebElement password;
	@FindBy(xpath = "//input[@id='id_user']/following-sibling::span[contains(text(), '*')]")
	WebElement locateUserAsterisk;
	@FindBy(xpath = "//input[@id='id_password']/following-sibling::span[contains(text(), '*')]")
	WebElement locatePwdAsterisk;
	@FindBy(xpath = "//input@id='id_user' or @id='id_password']")
	List<WebElement> inputFields;
	@FindBy(xpath = "//a[@href='forgot-username-or-password']")
	WebElement forgotUserPwd;
	@FindBy(xpath = "//a[@href='reset-password']")
	WebElement resetPwd;
	@FindBy(xpath = "//input[@id='id_email']")
	WebElement email;
	@FindBy(xpath = "//button[text()='Send Link']")
	WebElement sdLinkButton;
	@FindBy(xpath = "//input[@id='id_email']/following-sibling::span[contains(text(), '*')]")
	WebElement locateEmailAsterisk;

	// Initializing Page Factory
	public MainPage() {

		PageFactory.initElements(driver, this);

	}

	// Get the lms portal url
	public void getLMSPortal() {
		driver.get(lmsPortal);
	}

	// Get the lms loginpage url
	public void getLoginPage() {
		driver.get(loginPage);
	}

	// Verify page title
	public String verifyPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}

	// get the invalid url
	public void getInvalidUrl() {
		driver.get(invalidUrl);
	}

	// Verify the spelling for the Learning field
	public String getLearningTxt() {
		String learningTxt = locateLearning.getText();
		return learningTxt;
	}

	// Verify the spelling for the Management field
	public String getManagementTxt() {
		String managementTxt = locateManagement.getText();
		return managementTxt;
	}

	// Verify the spelling for the System field
	public String getSystemTxt() {
		String systemTxt = locateSystem.getText();
		return systemTxt;
	}

	// Verify the LMS logo
	public WebElement getLMSLogo() {
		return lmsLogo;
	}

	// Presence of login button
	public WebElement verifyLoginButton() {
		return loginButton;
	}

	// Verify login button in lms portal
	public void clickHomeLoginButton() {
		loginButton.click();
	}

	// Verify login button in login page
	public void clickLoginButton() {
		loginButton.click();
	}

	// Method to validate header text
	public String getHeaderText() {
		return header.getText();
	}

	// Get the count of the text fields
	public int getTxtFieldCount() {
		return txtFields.size();
	}

	// Verify user text on first text field
	public String verifyUserTxt() {
		return user.getAttribute("value");
	}

	// Verify password text on second text field
	public String verifyPasswordTxt() {
		return password.getAttribute("value");
	}

	// Verify asterisk is present next to user text
	public boolean isAsteriskUserPresent() {
		return locateUserAsterisk.getAttribute("value").isEmpty();
	}

	// Verify asterisk is present next to password text
	public boolean isAsteriskPwdPresent() {
		return locatePwdAsterisk.getAttribute("value").isEmpty();
	}

	// Method to check whether the input fields are in the center
	public boolean areInputFieldsCenter() {

		// Check if all input fields are centered.
		for (WebElement inputField : inputFields) {
			String textAlignment = inputField.getCssValue("text-align");
			String margin = inputField.getCssValue("margin");

			// Check if text-align is center and margin is auto.
			if (!textAlignment.equals("center") || !margin.equals("auto")) {
				return false;
			}
		}

		return true;
	}

	// Method to verify the login button is in the center of the page
	public boolean isLoginButtonCentered() {
		String loginAlignment = loginButton.getCssValue("text-align");
		String margin = loginButton.getCssValue("margin");
		if (!loginAlignment.equals("center") || !margin.equals("auto")) {
			return false;
		}
		return true;
	}

	// Presence of forgot username password link
	public WebElement verifyForgotUserPwd() {
		return forgotUserPwd;
	}

	// Presence of reset password link
	public WebElement verifyResetPwd() {
		return resetPwd;
	}

	// Verify the input text color in User field
	public boolean isUserTxtGray() {
		String textColor = user.getCssValue("color");
		// Check if the text color is gray (hex code #808080 or RGB value 128,128,128).
		return textColor.equals("rgb(128, 128, 128)") || textColor.equals("#808080");
	}

	// Verify the input text color in Password field
	public boolean isPwdTxtGray() {
		String textColor = password.getCssValue("color");
		// Check if the text color is gray (hex code #808080 or RGB value 128,128,128).
		return textColor.equals("rgb(128, 128, 128)") || textColor.equals("#808080");
	}

	// method to enter the username value
	public void enterValidUsername(DataTable dataTable) {
		List<Map<String, String>> userDetail = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> form : userDetail) {
			String userData = form.get("username");
			LoggerLoad.info("The Admin enters the username as : " + userData);
			user.sendKeys(userData);
		}
	}

	// Method to enter the password value
	public void enterValidPassword(DataTable datatable) {
		List<Map<String, String>> pwdDetail = datatable.asMaps(String.class, String.class);
		for (Map<String, String> form : pwdDetail) {
			String pwd = form.get("password");
			LoggerLoad.info("The Admin enters the password as : " + pwd);
			password.sendKeys(pwd);
		}
	}

	// Validate the username and password for empty fields
	public Boolean doLogin(String username, String pwd) {

		user.clear();
		user.sendKeys(username);
		password.clear();
		password.sendKeys(pwd);

		// To check empty fields , we need to check "required" field is on an attribute
		if (username.isBlank()) {
			JavascriptExecutor js_user = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", user);
			return isRequired;
		} else if (pwd.isBlank()) {
			JavascriptExecutor js_password = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_password.executeScript("return arguments[0].required;", password);
			return isRequired;

		}
		return isRequired;
	}

	// Clicks login through keyboard
	public void pressEnterKeyonLogin() {
		loginButton.sendKeys(Keys.ENTER);
	}

	// Clicks login by mouse actions
	public void clickLoginButtonWithMouse() {
		Actions actions = new Actions(driver);
		actions.moveToElement(loginButton).click().perform();
	}

	// Click forgot username password link
	public void clickForgotUserPwd() {
		forgotUserPwd.click();
	}

	// Verify the input text color in Email field
	public boolean isEmailTxtGray() {
		String textColor = user.getCssValue("color");
		// Check if the text color is gray (hex code #808080 or RGB value 128,128,128).
		return textColor.equals("rgb(128, 128, 128)") || textColor.equals("#808080");
	}

	// Verify email text
	public String verifyEmailTxt() {
		return email.getAttribute("value");
	}

	// Presence of Send Link button
	public WebElement verifySendLinkButton() {
		return sdLinkButton;
	}

	// Verify asterisk is present next to email text
	public boolean isAsteriskEmailPresent() {
		return locateEmailAsterisk.getAttribute("value").isEmpty();
	}

	// Verify the spelling for the Send Link
	public String getSendLinkTxt() {
		String sendLinkButton = sdLinkButton.getText();
		return sendLinkButton;
	}

	// Method to verify the send link button is in the center of the page
	public boolean isSendLinkButtonCentered() {
		String sendLinkAlignment = sdLinkButton.getCssValue("text-align");
		String margin = loginButton.getCssValue("margin");
		if (!sendLinkAlignment.equals("center") || !margin.equals("auto")) {
			return false;
		}
		return true;
	}
}
