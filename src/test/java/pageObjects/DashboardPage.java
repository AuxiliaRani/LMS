package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import utilities.ConfigReader;

public class DashboardPage extends DriverFactory {

	String lmsPortal = ConfigReader.getHomePage();
	String loginPage = ConfigReader.getLoginPage();

	@FindBy(xpath = "//button[text()='Login']")
	WebElement loginButton;
	@FindBy(xpath = "//h1[@class='header-class']")
	WebElement header;
	@FindBy(xpath = "//title[contains(text(), 'LMS - Learning Management System')]")
	WebElement dashboardTitle;
	@FindBy(xpath = "//input[@id='lms-title']")
	WebElement lmsTitle;
	@FindBy(xpath = "//ul[@id='navbar']//li")
	List<WebElement> navigationBar;
	@FindBy(xpath = "//ul[@id='navbar']//li)[1]")
	WebElement navBar1st;
	@FindBy(xpath = "//ul[@id='navbar']//li)[2]")
	WebElement navBar2nd;
	@FindBy(xpath = "//ul[@id='navbar']//li)[3]")
	WebElement navBar3rd;
	@FindBy(xpath = "//ul[@id='navbar']//li)[4]")
	WebElement navBar4th;
	@FindBy(xpath = "//ul[@id='navbar']//li)[5]")
	WebElement navBar5th;
	@FindBy(xpath = "//ul[@id='navbar']//li)[6]")
	WebElement navBar6th;
	@FindBy(xpath = "//ul[@id='navbar']//li)[7]")
	WebElement navBar7th;
	@FindBy(xpath = "//ul[@id='navbar']//li)[8]")
	WebElement navBar8th;

	// Initializing Page Factory
	public DashboardPage() {

		PageFactory.initElements(driver, this);

	}

	// ==****===========****==Navigate to Home and Login
	// Page==****=============****==

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

	// Verify login button in lms portal
	public void clickHomeLoginButton() {
		loginButton.click();
	}

	// Verify login button in login page
	public void clickLoginButton() {
		loginButton.click();
	}

	// ==****===========****==Navigate to Dashboard Page==****=============****==

	// Method to validate header text
	public String getHeaderText() {
		return header.getText();
	}

	// Method to get the maximum navigation time
	public long getMaxNavigationTime() {
		return driver.manage().timeouts().getPageLoadTimeout().toMillis();
	}

	public String getLMSTitle() {
		return dashboardTitle.getText();
	}

	// method to check alignment
	public boolean isLMSTitleAligned() {
		lmsTitle.getCssValue("text-align").equals("left");
		return false;
	}

	// check the correct spelling for links on navigation bar
	public List<String> getNavigationBarText() {

		List<String> navigationBarText = new ArrayList<>();
		for (WebElement element : navigationBar) {
			navigationBarText.add(element.getText());
		}

		return navigationBarText;
	}

	// check the navigation bar is aligned to top right
	public boolean isNavigationBarTopRightAligned() {
		for (WebElement navBarElement : navigationBar) {
			String floatProperty = navBarElement.getCssValue("float");
			if (!floatProperty.equals("right")) {
				return false;
			}
		}
		return true;

	}

	// validate the student is in the 1st place
	public String getFirstItemNavBar() {
		return navBar1st.getText();
	}

	// validate the program is in the 2nd place
	public String getSecondItemNavBar() {
		return navBar2nd.getText();
	}

	// validate the batch is in the 3rd place
	public String getThirdItemNavBar() {
		return navBar3rd.getText();
	}

	// validate the class is in the 4th place
	public String getFourthItemNavBar() {
		return navBar4th.getText();
	}

	// validate the user is in the 5th place
	public String getFifthItemNavBar() {
		return navBar5th.getText();
	}

	// validate the attendance is in the 6th place
	public String getSixthItemNavBar() {
		return navBar6th.getText();
	}

	// validate the assignemnt is in the 7th place
	public String getSeventhItemNavBar() {
		return navBar7th.getText();
	}

	// validate the student is in the 8th place
	public String getEigthItemNavBar() {
		return navBar8th.getText();
	}

}
