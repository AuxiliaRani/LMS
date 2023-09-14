package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import utilities.LoggerLoad;

public class ManageClass {
	
	public ManageClass() {
		PageFactory.initElements(driver, this);
	}
		
	public static WebDriver driver = DriverFactory.getdriver();

	
	@FindBy(xpath = "//*[@value='Class']")
	WebElement classButton;	
	
	@FindBy(xpath = ("//*[@id='AddNewClass']"))
	WebElement addNewClassButton;
	
	@FindBy(xpath = ("//*[@id='manageclasstext']"))
	WebElement manageClassText;
	
	@FindBy(xpath = ("//*[@id='deleteicon']"))
	WebElement deleteIcon;
	
	@FindBy(xpath = ("//*[@id='searchbar']"))
	WebElement searchBar;
	
	@FindBy(xpath = ("//*[@id='classdatatableheader']"))
	WebElement classDataTableHeader;
	
	@FindBy(xpath = ("//*[@id='classdatatable']"))
	WebElement classDataTable;
	
	@FindBy(xpath = ("//*[@id='editicon']"))
	WebElement editIcon;
	
	@FindBy(xpath = ("//*[@id='sorticon']"))
	WebElement sortIcon;
	
	@FindBy(xpath = ("//*[@id='checkBox']"))
	WebElement checkBox;
	
	@FindBy(xpath = ("//*[@id='footer']"))
	WebElement footer;
	
	@FindBy(xpath = ("//*[@id='nextPageicon']"))
	WebElement nextPageIcon;
	
	@FindBy(xpath = ("//*[@id='nextPageicon']"))
	WebElement Pagination;
	
	
	@FindBy(xpath = ("//*[@id='classlist']"))
	WebElement classlist;
	
	
	
	
	// method to click class button
		public void clickClassButton() {
			classButton.click();
		}
		//method to click Add New Class Button
		public void clickAddNewClassButton() {
			addNewClassButton.click();
		}
        //method ot check Add new class is displayed
		public boolean addNewClassIsDisplayed()
		{
			boolean b = addNewClassButton.isDisplayed();
		return b;
		}
		// method to getText of WebElement manageclassHeader
		public String getText() {
			String text = manageClassText.getText();
			return text;
		}
		
		//deleteIcon methos
		public boolean deleteIconIsDisabled () {
			return deleteIcon.isEnabled();
		}
		
		//searchBar method
		public boolean searchBarIsDisplayed() {		
			return searchBar.isDisplayed();
		}
		
		//method to getText for each tableHeader (WebElement )
		public List<String> classDataTableHeader() {
			List<WebElement> headerCells = classDataTableHeader.findElements(By.tagName("th"));
			List<String> headerText = null;			
			for (WebElement hc :headerCells)
			{
				headerText.add(hc.getText());
			}
			return headerText;
		}
		
		
		public List<WebElement> classDataTableHeaderWithSortIcon() {
			List<WebElement> headerCells = classDataTableHeader.findElements(By.tagName("th"));		
			return headerCells;
		}
		
		public List<WebElement> rowIsPresent() {			
			List<WebElement> dataTableRowsWebElement = classDataTable.findElements(By.xpath("//table[@id='exampleTable']/tbody/tr/td"));
			return dataTableRowsWebElement;
		}
		
		public boolean editIconIsPresent() {
			return 	editIcon.isDisplayed();		
		}
		
		public boolean sortIconIsPresent() {
			return 	sortIcon.isDisplayed();		
		}
		
		public boolean checkBoxInAllRows() {
			return checkBox.isDisplayed();		
		}
		
		public String footerText() {
			String footertext = footer.getText();
			return footertext;
		}
		
		public void nextPage() {
			nextPageIcon.click();			
		}
		
		public List<WebElement> numberOfPages() {
		List<WebElement> noOfPages = Pagination.findElements(By.id("pagination"));
			return noOfPages;
		}
			
		public List<WebElement> classList() {
			List<WebElement> noOfClasses = classlist.findElements(By.id("classlist"));
			return noOfClasses;
			}
	
		public boolean paginationIsDisplayed() {
			return Pagination.isDisplayed();
		}
		
		
		
		
		
		
		
		
		
		}
		
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	

