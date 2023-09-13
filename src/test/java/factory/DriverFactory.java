package factory;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;

import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.MainPage;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class DriverFactory {

	public static WebDriver driver;
	@FindBy(xpath = "//input[@id='id_user']")
	WebElement user;
	@FindBy(xpath = "//input[@id='id_password']")
	WebElement password;

	public WebDriver initializeDrivers(String browser) {

		if (browser.equalsIgnoreCase("firefox")) {
			LoggerLoad.info("Testing on firefox");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("chrome")) {
			LoggerLoad.info("Testing on chrome");
			WebDriverManager.chromedriver().driverVersion("116.0.5845.96").setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("safari")) {
			LoggerLoad.info("Testing on safari");
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			LoggerLoad.info("Testing on Edge");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
		// Set Page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		return driver;
	}

	public static WebDriver getdriver() {
		return driver;

	}

	public void closeallDriver() {
		driver.close();
	}

	// Get Username value from the excel sheet
	public void enterValidUsername(DataTable dataTable) {
		List<Map<String, String>> userDetail = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> form : userDetail) {
			String userData = form.get("username");
			LoggerLoad.info("The Admin enters the username as : " + userData);
			user.sendKeys(userData);
		}
	}

	// Get Password value from the excel sheet
	public void enterValidPassword(DataTable datatable) {
		List<Map<String, String>> pwdDetail = datatable.asMaps(String.class, String.class);
		for (Map<String, String> form : pwdDetail) {
			String pwdData = form.get("password");
			LoggerLoad.info("The Admin enters the password as : " + pwdData);
			password.sendKeys(pwdData);
		}
	}
	
	

}
