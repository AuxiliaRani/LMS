package pageObjects;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;

public class ManageClassSearchBox {

	public ManageClassSearchBox() {
		PageFactory.initElements(driver, this);
	}
	public static WebDriver driver = DriverFactory.getdriver();
	
	int batchid = 123;
	
	@FindBy(xpath = ("//*[@id='searchbox']"))
	WebElement searchBox;
	

	public void clickClassButton(int batchId) {
		String batchidtostring = String.valueOf(batchid);
		searchBox.sendKeys(batchidtostring);
	}
	
	
	
}
