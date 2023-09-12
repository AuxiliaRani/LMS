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

public class ManageAttendancePage {
	
	public ManageAttendancePage() {
		PageFactory.initElements(driver, this);
	}
		
	public static WebDriver driver = DriverFactory.getdriver();

	
		
	
	@FindBy(xpath = ("//*[@id='AddNewAttendance']"))
	WebElement addNewAttendanceButton;
	
	@FindBy(xpath = ("//*[@id='manageAttendancetext']"))
	WebElement manageAttendanceText;
	
	@FindBy(xpath = ("//*[@id='deleteicon']"))
	WebElement deleteIcon;
	
	@FindBy(xpath = ("//*[@id='searchbar']"))
	WebElement searchBar;
	
	@FindBy(xpath = ("//*[@id='Attendancedatatableheader']"))
	WebElement attendanceDataTableHeader;
	
	@FindBy(xpath = ("//*[@id='Attendancedatatable']"))
	WebElement attendanceDataTable;
	
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
	WebElement pagination;
	
	
	@FindBy(xpath = ("//*[@id='Attendancelist']"))
	WebElement attendancelist;
	
	
	
	/*
	
	// method to click class button
		public void clickClassButton() {
			AttendanceButton.click();
		} */
	
	
		//method to click Add New Attendance Button
		public void clickAddNewAttendanceButton() {
			addNewAttendanceButton.click();
		}
        //method ot check Add new Attendance is displayed
		public boolean addNewClassIsDisplayed()
		{
			boolean b = addNewAttendanceButton.isDisplayed();
		return b;
		}
		// method to getText of WebElement manageAttendanceHeader
		public String getText() {
			String text = manageAttendanceText.getText();
			return text;
		}
		
		//delete Icon method
		public boolean deleteIconIsDisabled () {
			return deleteIcon.isEnabled();
		}
		
		//search Bar method
		public boolean searchBarIsDisplayed() {		
			return searchBar.isDisplayed();
		}
		
		//method to getText for each tableHeader (WebElement )
		public List<String> AttendanceDataTableHeader() {
			
			List<WebElement> headerCells = attendanceDataTableHeader.findElements(By.tagName("th"));
			List<String> headerText = null;
			
			for (WebElement hc :headerCells)
			{
				headerText.add(hc.getText());
			}
			return headerText;
		}
		
		
		public List<WebElement> AttendanceDataTableHeaderWithSortIcon() {
			
			List<WebElement> headerCells = attendanceDataTableHeader.findElements(By.tagName("th"));		
			return headerCells;
		}
		//url
		public List<WebElement> rowIsPresent() {			
			List<WebElement> dataTableRows = attendanceDataTable.findElements(By.tagName("tr"));
			return dataTableRows;
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
		List<WebElement> noOfPages = pagination.findElements(By.id("pagination"));
			return noOfPages;
		}
			
		public List<WebElement> classList() {
			List<WebElement> noOfClasses = attendancelist.findElements(By.id("classlist"));
			return noOfClasses;
			}
		//pagination method
		public boolean paginationIsDisplayed() {
			return pagination.isDisplayed();
		}
		
		
		
		
		
		
} // Class ends
		
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
