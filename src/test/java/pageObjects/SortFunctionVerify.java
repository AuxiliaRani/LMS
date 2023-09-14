package pageObjects;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;

public class SortFunctionVerify {

	public SortFunctionVerify() {
		PageFactory.initElements(driver, this);
	}
		
	public static WebDriver driver = DriverFactory.getdriver();

	
	@FindBy(xpath = "//*[@value='batchiheader']")
	WebElement batchidheader;
	
	@FindBy(xpath = "//*[@value='datatable']")
	WebElement datatable;
	
	
	
	public void batchIconClick() {
		batchidheader.click();
	}
	
	//incomplete method need to workon
	public void dataTable() {
		
		List<String> BatchId = new ArrayList<String>();	
		
		List<WebElement> batchIdInEachRows =	datatable.findElements(By.xpath(".//tbody/tr/td"));
	for(WebElement batchIdInEachRow :batchIdInEachRows) {
		BatchId.add(batchIdInEachRow.getText());
		
	
	}
	}
	
}
