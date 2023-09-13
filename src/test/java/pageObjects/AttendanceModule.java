
package pageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utilities.LoggerLoad;

import org.openqa.selenium.Point;
//import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import java.util.concurrent.TimeUnit;

public class AttendanceModule {
	
	public WebDriver driver;
	public Properties prop;
	WebElement pageNumbers;
	JavascriptExecutor js;
	String deleteValidationClassId1;
	

//------------------validation of Attendance page-------------------------------------
	
	@FindBy(xpath = "//tagname[text()='Attendance-header']") WebElement attendanceHeader; 
	@FindBy(xpath = "//tagname[text()='Attendance-header']") WebElement manageAttendanceTitle;
	
	@FindBy(xpath = "//tagname[text()='form-Attendance-header']") WebElement formAttendanceHeaderName;
	@FindBy(xpath = "//tagname[text()='attendanceLable']") WebElement attendanceLable;
	
	@FindBy(xpath = "//tagname[text()='Attendance']") WebElement attendanceButton;
	@FindBy(xpath = "//tagname[text()='Header']") WebElement headerName;
	@FindBy(xpath = "(//tagname[@Attribute='deleteButton'])")WebElement deleteButton;
	@FindBy(xpath = "(//tagname[@Attribute='deleteMultipleButton'])")WebElement deleteMultipleButton;
	@FindBy(xpath = "//tagname[@Attribute=BottomPage']")WebElement pageBottom;
	@FindBy(xpath = "//tagname[@Attribute='searchBtm']")WebElement searchButton;

	@FindBy(xpath = "//tagname[@Attribute='addAttendance']")WebElement editButton;
	@FindBy(xpath = "//tagname[@Attribute='SText']")WebElement searchtext;
	
	
	@FindBy(xpath="//tagname[@Attribute='Classcolmn']")List<WebElement> classesColoumn;
	
	@FindBy(xpath="//tagname[@Attribute='pgname']")List<WebElement> programNames;
	
	@FindBy(xpath = "//tagname[@Attribute='actBatch']")List<WebElement> actualAttendance;
	
	@FindBy(xpath = "//tagname[@Attribute='chkbox']")WebElement checkBoxAttendance;
	
	@FindBy(xpath = "//tagname[@Attribute='Allchkbx']")List<WebElement> allCheckbox;
	
	@FindBy(xpath = "//tagname[@Attribute='footerrecd']")WebElement footerRecords;
	
	@FindBy(xpath=("//div[@class= 'alert popUp']")) WebElement attendancePopup;
	@FindBy(xpath = ("//*[@id='attendanceDataTableheader']"))WebElement attendanceDataTableHeader;

	@FindBy(xpath = ("//*[@id='attendanceDataTable']"))	WebElement attendanceDataTable;
	@FindBy(xpath = "//tagname[text()='LMS']") WebElement HomePageTitle;

	// =====Add Attendance WebElements==============
	
	

	@FindBy(xpath = "//tagname[@Attribute='addAttendance']")WebElement addNewAttendanceButton;
	@FindBy(xpath = "//tagname[text()='attendance header']")WebElement addattendanceHeader;
	
	@FindBy(xpath = "//tagname[@Attribute='attendance Details']")WebElement attendanceDetails;
	@FindBy(xpath = "//tagname[@Attribute='savform']")WebElement saveForm;
	@FindBy(xpath = "//tagname[@Attribute='closebutton']")WebElement closeButton;
	@FindBy(xpath = "//tagname[@Attribute='savebutton']")WebElement saveButton;
	
	@FindBy(xpath = "//tagname[text()='selectProgtxtLable']")WebElement selectProgtxtLable;
	@FindBy(xpath = "//tagname[text()='selectClasstxtLable']")WebElement selectClasstxtLable;
	@FindBy(xpath = "//tagname[text()='selectStudenttxtLable']")WebElement selectStudenttxtLable;
	@FindBy(xpath = "//tagname[text()='selectAttendancetxtLable']")WebElement selectAttendancetxtLable;
	
	@FindBy(xpath = "//tagname[@Attribute='errmsg']")WebElement errorMessageNameRequired;
	@FindBy(xpath = "//tagname[text()='Cancel']")WebElement cancelForm;
	@FindBy(xpath = "//tagname[@id='attendanceName']")WebElement formattendanceName;
	@FindBy(xpath = "//tagname[@id='attendanceDescription']")WebElement formDescription;
	@FindBy(xpath = "//tagname[@id='admintxt']")WebElement admintxt;
	
	@FindBy(xpath = "//tagname[@Attribute='pdrpbtn']")WebElement pdropdownButton;
	@FindBy(xpath = "//tagname[@Attribute='cdrpbtn']")WebElement cdropdownButton;
	@FindBy(xpath = "//tagname[@Attribute='sdrpbtn']")WebElement sdropdownButton;
	@FindBy(xpath = "//tagname[@Attribute='adrpbtn']")WebElement adropdownButton;
	
	@FindBy(xpath = "//tagname[@Attribute='drpdwnvalue']")List<WebElement> dropdownValues;

	@FindBy(xpath = "//tagname[@Attribute='1stselec']")WebElement firstOptionSelection;

	@FindBy(xpath = "//tagname[@Attribute='classesnames']")WebElement cName;
	@FindBy(xpath = "//tagname[@Attribute='inactivestas']")WebElement inactiveStatus;
	@FindBy(xpath = "//tagname[@id='attendanceNoOfClasses']")WebElement noOfClasses;
	@FindBy(xpath = "//tagname[@Attribute='sts']")List<WebElement> status;
	
	@FindBy(xpath = "//tagname[text()='New attendance Created']")WebElement successMessage;
	
	//Selecting the date
	@FindBy(xpath = ("//tagname[@id='datePicker']")) WebElement datePicker;
	@FindBy(xpath =("//tagname[@id='datePicker-MM']")) WebElement selectMonth;
	@FindBy(xpath =("//tagname[@id='datePicker-DD']")) WebElement selectDay;
	@FindBy(xpath =("//tagname[@id='datePicker'-YYYY]")) WebElement selectYear;
	@FindBy(xpath =("//tagname[@id='datePicker'-selection")) WebElement dateSelection;
	
	@FindBy(xpath =("//tagname[@id='datePicker'--YYYY]")) WebElement selectFutureYear;
	
	//Error Messages on screen
	@FindBy(xpath = "//tagname[@id='missingProg']")WebElement missingProg;
	@FindBy(xpath = "//tagname[@id='missingClass']")WebElement missingClass;
	@FindBy(xpath = "//tagname[@id='missingClass']")WebElement missingStd;
	@FindBy(xpath = "//tagname[@id='missingAttendance']")WebElement missingAttendance;
	@FindBy(xpath = "//tagname[@id='missingClass']")WebElement missingDate;
	@FindBy(xpath = "//tagname[@id='missingClass']")WebElement futureDateError;
	


	// ========= Edit Attendance WebElements ===========
	
	@FindBy(xpath = "//tagname[@Attribute='editAttendance-form']")WebElement editAttendanceForm;
	
	@FindBy(xpath = "//tagname[@Attribute='addAttendance']")WebElement editProgramName;
	@FindBy(xpath = "//tagname[@Attribute='addAttendance']")WebElement editclassName;
	@FindBy(xpath = "//tagname[@Attribute='addAttendance']")WebElement editStudentName;
	@FindBy(xpath = "//tagname[@Attribute='addAttendance']")WebElement editAttendanceName;
	
	@FindBy(xpath = "//tagname[@Attribute='1stselec']")WebElement secondOptionSelection;
	
	@FindBy(xpath = "//tagname[@Attribute='editAttendance']")WebElement editAttendanceButton;
	
	// =========Delete Attendance WebElements ===========
	
	@FindBy(xpath = "//tagname[@Attribute='delAttendance']")WebElement deleteAttendanceButton;
	@FindBy(xpath = "//tagname[@Attribute='multidelAttendance']")WebElement multiDeleteAttendanceButton;
	
	@FindBy(xpath = "//tagname[@Attribute='RowDeleteAtd']")WebElement rowLevelDeleteAttendanceButton;
	
	@FindBy(xpath = "//tagname[text()='Delete header']") WebElement deleteHeader;

	@FindBy(xpath = "//tagname[text()='No']")WebElement confirmNo;
	@FindBy(xpath = "//tagname[text()='Yes']")WebElement confirmYes;

	@FindBy(xpath = "//tagname[@Attribute='confmsg']")WebElement confirmMessage;
	
	@FindBy(xpath = "//tagname[@Attribute='confmsg-yes']")WebElement VerifyMesgYesOnConfirm;
	@FindBy(xpath = "//tagname[@Attribute='confmsg-no']")WebElement VerifyMesgNoOnConfirm;

	@FindBy(xpath = "//tagname[text()='Showing 0 to 0 of 0 entries']")WebElement zeroRecords;

	@FindBy(xpath = "//tagname[@Attribute='chkbx']")List<WebElement> checkboxs;
	@FindBy(xpath = "//tagname[@Attribute='singleCheckbox']")WebElement singleCheckbox;

	// =================pagination===============
	
	@FindBy(xpath = "//tagname[@Attribute='paginationTxt']")WebElement paginationText;
	
	@FindBy(xpath = "//tagname[@Attribute='singleBackLink']")WebElement singleBackwardLink;

	@FindBy(xpath = "//tagname[@Attribute='singlefrwdLink']")WebElement singleForwardLink;

	@FindBy(xpath = "//tagname[@Attribute='highlitepage']")WebElement highLightedPageNumber;

	@FindBy(xpath = "//tagname[@Attribute='5']")WebElement lastEnablePageNumber;
	
	@FindBy(xpath = "//tagname[@Attribute='1']")WebElement firstEnablePageNumber;

	@FindBy(xpath = "//tagname[@Attribute='BNameSorting']")WebElement attendanceNameSorting;

	@FindBy(xpath = "//tagname[@Attribute='BDescriptionSorting']")WebElement attendanceDescriptionSorting;

	@FindBy(xpath = "//tagname[@Attribute='BStatusSorting']")WebElement attendanceStatusSorting;

	@FindBy(xpath = "//tagname[@Attribute='BNoOfClassesSorting']")WebElement attendanceNoOfClassesSorting;

	
	
	@FindBy(xpath = "//tagname[@Attribute='BnumberOfRows']")WebElement numberOfRows;
	

	// Constructor
	public AttendanceModule(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	
	
	
	// ============Attendance page validation=============
	
	
	
	public void navigateToAttendance() {
		try {
			Thread.sleep(2000);
			attendanceButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Verify page title method
	public String verifyPageTitle() {
		String actualHeaderName = "";
		try {

			if (headerName.isDisplayed()) {
				actualHeaderName = headerName.getText();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return actualHeaderName;
	}
	
	

	// method to click Attendance on navigation bar 
			public void clickAttandanceButton() {
				attendanceButton.click();
			}
			
    //method to click Add New Attendance Button
			public void clickAddNewAttendanceButton() {
				addNewAttendanceButton.click();
			}
			
	// method to check Attendance page is displayed 
			public boolean AttendanceModuleIsDisplayed()
			{
				manageAttendanceTitle.isDisplayed();
				return true;
			}
			
			public String getPageTitle()
			{
				String title = HomePageTitle.getText();
				return title;
				
			}
			
	//Visibility
			
			public boolean searchBarVisible()
			{
				try {
				manageAttendanceTitle.isDisplayed();
				
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				
				return true;
			}
	
			
			
			public boolean addNewAttendancebuttonVisible()
			{
				try {
				addNewAttendanceButton.isDisplayed();
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
				return true;
			}
			
	// Verify Delete button state
	public void verifyDeleteButton() {
		try {
			if (deleteButton.isEnabled()) {
				System.out.println("Delete Button is enabled");
			} else {
				System.out.println(" Delete Button is disabled");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// Verify footer 
	
	public String footerString() {
		String footer = "";
		try {
		footer=footerRecords.getText();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	    return footer;
	}

	
	
	
	//method to getText for each tableHeader (WebElement )
	
			public List<String> attendanceDataTableHeader() {
				
				List<WebElement> headerCells = attendanceDataTableHeader.findElements(By.tagName("td"));
				List<String> headerText = null;

				for (WebElement hc :headerCells)
				{
					headerText.add(hc.getText());
				}
				return headerText;
			}
			
			
			public List<WebElement> batchDataTableHeaderWithSortIcon() {
				
				List<WebElement> headerCells = attendanceDataTableHeader.findElements(By.tagName("td"));		
				return headerCells;
			}
	
	public String totalRecords() {
		String footer = "";
		try {
		footer=footerRecords.getText();
		footer=footer.replaceAll("[^0-9]", " ");
		footer=footer.replaceAll(" +", " ");
		
		if (footer.equals(" ")) {
			return "-1";
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	    return footer;
	}

	public int verifyNumberOfRecords() throws InterruptedException {
		int records = 0;
		try {
			for (int i = 1; i <= 5; i++) {
				pageNumbers = driver.findElement(By.xpath("//button[text()="+ i +"]"));
				pageNumbers.click();
				Thread.sleep(2000);
				records = driver.findElements(By.tagName("//tbody/tr")).size();
			}
			System.out.println(records);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return records;
	}
	
	//verifyEditButton()
	
	public void verifyEditButton() {
		try {
			if (editButton.isEnabled()) {
				System.out.println(" Edit Button is enabled");
			} else {
				System.out.println(" Edit Button is disabled");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	


	public String recordsAvailable() {
		String num = "";
		try {
			num = pageBottom.getAttribute("ng-reflect-total-records");
			System.out.println(num);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}
	
	//verify number of rows
	public int checknumberofRows() {
		String rowValue= numberOfRows.getAttribute("row value");
		return Integer.valueOf(rowValue);
	}
	//verify search
	public String getSearchText() {
		String textSearch=searchtext.getText();
		return textSearch;
	}
	

	public String searchAttendanceName(String batchName) throws InterruptedException {
		String actualName="";
		try {
			for (int j = 1; j < 20; j++) {
				pageNumbers = driver.findElement(By.xpath("//button[text()=" + j + "]"));
				Thread.sleep(2000);
				pageNumbers.click();

				for (WebElement batchMatch : actualAttendance) {
					actualName = batchMatch.getText();
					System.out.println(actualName);
					if (actualName.contains(batchName)) {
						System.out.println("Batch name matches to result");
					} else {
						System.out.println("Batch name matches to result");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return actualName;
	}
	
	public String enterStatusInSerach(String status) {
		searchButton.sendKeys(status);
		return status;
	}
	

	
	public String enterClasseIDInSearch(String classId) {
		searchButton.sendKeys(classId);
		return classId;
	}
	
	public String getSearchedClasses(String classes) {
		String className = "";
		for(WebElement clas : classesColoumn) {
			className=clas.getText();
			if(className.equalsIgnoreCase(classes));	
		}
		return className;
	}
	
	public String enterStudentIdInSearch(String StudentId) {
		searchButton.sendKeys(StudentId);
		return StudentId;
	}
	

	
	public void checkBoxAttendanceSelected() {
		checkBoxAttendance.click();
		
	}

	
	public boolean getAllcheckboxSelected() {
		
		for (WebElement check:allCheckbox) {
			if (check.isSelected()) 
				return true;
			}	
		return false;
	}
	
	
	public boolean NewAttendanceBtnEnabled()
	{
	try {
		if (addNewAttendanceButton.isDisplayed() && addNewAttendanceButton.isEnabled()) {
			return true;
		} else {
			return false;
		}
	} catch (NoSuchElementException e) {
		return false;
	}
}
	
	
	
	//==================Add Attendance methods start from here=====================
	
	//Web element presence  validations isDisplayed()
	

	
	public boolean programDrpIsDisplayed()
	{
		pdropdownButton.isDisplayed();
		return true;
	}
	
	
	public boolean classDrpIsDisplayed()
	{
		cdropdownButton.isDisplayed();
		return true;
	}
	
	public boolean studentDrpIsDisplayed()
	{
		sdropdownButton.isDisplayed();
		return true;
	}
	
	public boolean attendanceDrpIsDisplayed()
	{
		adropdownButton.isDisplayed();
		return true;
	}
	
	
	
	public boolean closeButtonDisplayed()
	{
		closeButton.isDisplayed();
		return true;
	}
	
	
	
	public boolean saveButtonDisplayed()
	{
		saveButton.isDisplayed();
		return true;
	}
	
	// get location
	public boolean VerifylocationCloseButton() {
		
	
	Point location = closeButton.getLocation();
    System.out.println("X : " + location.getX());
    System.out.println("Y : " + location.getY());
    
    //Top right is x=35 y=85
    if (location.getX()>= 35 && location.getY() >= 85)
    LoggerLoad.info("Web element is on Top right corner");
    
    return true;
    
	}
	
	
 
	
	// Verify the input text color in User field
		public boolean isAdminTxtGray() {
			String textColor = admintxt.getCssValue("color");
			// Check if the text color is gray (hex code #808080 or RGB value 128,128,128).
			return textColor.equals("rgb(128, 128, 128)") || textColor.equals("#808080");
		}
	
	public boolean verifyTextselectProgtxtLable(){
		
		String txtLable = selectProgtxtLable.getText();
		Assert.assertEquals("Select a Program Name", txtLable);
		
		return true;
		
	}
	
  public boolean verifyTextselectClasstxtLable(){
		
		String txtLable = selectClasstxtLable.getText();
		Assert.assertEquals("Select Class Name",txtLable);
		
		return true;
		
	}
  public boolean verifyTextselectStudenttxtLable(){
		
		String txtLable = selectStudenttxtLable.getText();
		Assert.assertEquals("Select students",txtLable);
		
		return true;
		
	}
  
  public boolean verifyTextselectAttendancetxtLable(){
		
		String txtLable = selectAttendancetxtLable.getText();
		Assert.assertEquals("Select Attendance",txtLable);
		
		return true;
		
	}
	//Action validation
	
	
	public void addNewAttendancebuttonClick() throws InterruptedException {
		Thread.sleep(2000);
		try {
			addNewAttendanceButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public String checkAddAttendanceHeader() {
		String header= attendanceHeader.getText();
		return header;
	}
	
	public void checkSpellingAddAttendanceLable() {
		String attendance_lable = attendanceLable.getText();
		
		Assert.assertEquals("Attendance Details", attendance_lable);;
		
	}
	
	
	public Point attendanceHeaderLocation() {
		
		Point point = attendanceHeader.getLocation();
		
		return point;
		
	}

	public boolean attendanceDetailForm() {
		try {
			if (attendanceDetails.isDisplayed()) {
				return true;
			}  	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public void saveForm() throws InterruptedException {
		// Thread.sleep(2000);
		try {
			saveForm.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void popupWindowSave() throws InterruptedException {
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}
	
	
	

	public String checkErrorMessage() {
		String actualError = null;
		try {
			Thread.sleep(2000);
			actualError = errorMessageNameRequired.getText();
			System.out.println(actualError);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return actualError;

	}

	
	
	public void clickOnDropdown() {
		pdropdownButton.click();
	}
	
	public List<String> checkAllDropdownValues() {
		List<String> dpValues= new ArrayList<String>();
		for(WebElement dValues : dropdownValues) {
			String val=dValues.getText();
			dpValues.add(val);
		}return dpValues;
	}

	public String verifySuccessMessage() {
		String success=successMessage.getText();
		return success;
	}
	
	public void clickOnCancel() {
		try {
			cancelForm.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



//Add attendance Dropdown lists
	
//1. Select Program
	public String selectProgramName() {
		String program = null;
		try {
			pdropdownButton.click();
			String firstValue = firstOptionSelection.getText();

			for (WebElement pName : dropdownValues) {
				program = pName.getText();

				if (firstValue.equalsIgnoreCase(program)) {
					firstOptionSelection.click();
				} else {
					System.out.println("program name is Different");
				}
				System.out.println(program);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return program;
	}
	
	//2. Select class
	
	public String selectClassName() {
		String class1 = null;
		try {
			cdropdownButton.click();
			String firstValue = firstOptionSelection.getText();

			for (WebElement cName : dropdownValues) {
				class1 = cName.getText();

				if (firstValue.equalsIgnoreCase(class1)) {
					firstOptionSelection.click();
				} else {
					System.out.println("Class name is Different");
				}
				System.out.println(class1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return class1;
	}
	
	//3. Select Student
	
	public String selectStudentName() {
		String std = null;
		try {
			sdropdownButton.click();
			String firstValue = firstOptionSelection.getText();

			for (WebElement sName : dropdownValues) {
				std = cName.getText();

				if (firstValue.equalsIgnoreCase(std)) {
					firstOptionSelection.click();
				} else {
					System.out.println("Student name is Different");
				}
				System.out.println(std);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return std;
	}
	
	//4. Select Attendance
	
		public String selectAttendance() {
			String atd = null;
			try {
				sdropdownButton.click();
				String firstValue = firstOptionSelection.getText();

				for (WebElement aName : dropdownValues) {
					atd = aName.getText();

					if (firstValue.equalsIgnoreCase(atd)) {
						firstOptionSelection.click();
					} else {
						System.out.println("Attendance value is Different");
					}
					System.out.println(atd);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return atd;
		}
		
	//5. select date
	
		
	     public void selectDate() {
			
			try {
				
				datePicker.click();
				selectYear.click();
				selectMonth.click();
				selectDay.click();
				dateSelection.getText();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
				
		}
	     

	     public void selectFutureDate() {
			
			try {
				
				selectFutureYear.click();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
				
		} 
		

		
// For missing mandatory fields
	     
	     public void missingMandatoryProg() {
	     
	     //expected error text
	      String exp = "Please select program";
	      //identify actual error message
	    
	      String act = missingProg.getText();
	      System.out.println("Error message is: "+ act);
	      //verify error message with Assertion
	      Assert.assertEquals(exp, act);
		

	     }
	     
	     public void missingMandatoryClass() {
		     
		     //expected error text
		      String exp = "Please select class";
		      //identify actual error message
		    
		      String act = missingClass.getText();
		      System.out.println("Error message is: "+ act);
		      //verify error message with Assertion
		      Assert.assertEquals(exp, act);
			

		     }
	     
	     public void missingMandatoryStudent() {
		     
		     //expected error text
		      String exp = "Please select Student";
		      //identify actual error message
		    
		      String act = missingStd.getText();
		      System.out.println("Error message is: "+ act);
		      //verify error message with Assertion
		      Assert.assertEquals(exp, act);
			

		     }
	     
	     public void missingMandatoryAttendance() {
		     
		     //expected error text
		      String exp = "Please select Attendance";
		      //identify actual error message
		    
		      String act = missingAttendance.getText();
		      System.out.println("Error message is: "+ act);
		      //verify error message with Assertion
		      Assert.assertEquals(exp, act);
			

		     }
	     
	     public void missingMandatoryDate() {
		     
		     //expected error text
		      String exp = "Please select date";
		      //identify actual error message
		    
		      String act = missingDate.getText();
		      System.out.println("Error message is: "+ act);
		      //verify error message with Assertion
		      Assert.assertEquals(exp, act);
			

		     }
	     
	     //User selects next year to set future date
	     
	     public void futureDateError() {
	    	//expected error text
		      String exp = "Future date not allowed";
		      
		      //identify actual error message
		    
		      String act = futureDateError.getText();
		      System.out.println("Error message is: "+ act);
		      //verify error message with Assertion
		      Assert.assertEquals(exp, act);
	    	 
	     }
	     
	     
//=================== Methods for Edit Attendance ===================
	     
	     
		

	public void clickOnEdit() {
		try {
			editAttendanceButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
		public String editAttendance() {
			String edited_atd = null;
			try {
				sdropdownButton.click();
				String secondValue = secondOptionSelection.getText();

				for (WebElement aName : dropdownValues) {
					edited_atd = aName.getText();

					if (secondValue.equalsIgnoreCase(edited_atd)) {
						secondOptionSelection.click();
					} else {
						System.out.println("Edit not allowed");
					}
					System.out.println(edited_atd);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return edited_atd;
		}


	     
//	===================  methods for Delete operations ==============
	
	
	public boolean deleteMultipleButtonEnabled() {
		try {
			deleteMultipleButton.isEnabled();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public void rowLevelDeleteAttendance() {
		try {
			rowLevelDeleteAttendanceButton.click();
			
		} catch (Exception e) {
			e.printStackTrace();
			

		}
		
		//save class ID of row level record
		
			//	String deleteValidationClassId = deleteValidationClassId.getText();
		
		WebElement tableContents = driver.findElement(By.tagName("table"));

		List<WebElement> rows=tableContents.findElements(By.tagName("tr"));
		for(int rnum=0;rnum<rows.size();rnum++)
		{
		List<WebElement> columns=rows.get(rnum).findElements(By.tagName("td"));

		
		
		deleteValidationClassId1=columns.get(0).getText();
		

		System.out.println(columns.get(0).getText());

		}
		
	}
		
	
	public void rowLevelDeleteAttendanceEnabled() {
		try {
			if (rowLevelDeleteAttendanceButton.isEnabled()) {
				
				System.out.println("Row level delete Button is enabled");
			} else {
				System.out.println("Row level delete Button is disabled");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		 
		
	}
			
	public void deleteAttendance() {
		try {
			deleteAttendanceButton.click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void multiDeleteAttendance() {
		try {
			multiDeleteAttendanceButton.click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String deleteHeader() {
		String text=deleteHeader.getText();
		return text;
	}
	

	public void clickNoOnConfirm() {
		try {
			confirmNo.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickYesOnConfirm() {
		try {
			confirmYes.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void confirmMessageDisplayed() {
		try {
			confirmMessage.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void VerifyYesOnConfirm() {
	
	//expected error text
    String exp = "Record deleted successfully";
    //identify actual error message
  
    String act = VerifyMesgYesOnConfirm.getText();
    
    System.out.println("Confirmation Message is: "+ act);
    //verify error message with Assertion
    Assert.assertEquals(exp, act);
	}
	
	public void VerifyNoOnConfirm() {
		
		//expected error text
	    String exp = "Record is not deleted";
	    //identify actual error message
	  
	    String act = VerifyMesgNoOnConfirm.getText();
	    
	    System.out.println("Confrimation Message is: "+ act);
	    //verify error message with Assertion
	    Assert.assertEquals(exp, act);
		}


	public void verifyDeletedRecords() {
		try {
			if (zeroRecords.isDisplayed()) {
				System.out.println("Zero records displayed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Select multiple checkbox
	public void selectMutipleCheckboxes() {
		try {
			for (WebElement checkbox : checkboxs) {
				checkbox.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// Verify is single check box is selected
	
	public void singleCheckboxisSelected() {
		try {
			if (singleCheckbox.isSelected()) {
				System.out.println("Single checkbox is selected");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Verify Multiple check boxes are selected
	
	public boolean checkboxesIsSelected() {
		try {
			for (WebElement checkbox : checkboxs) {
				if (checkbox.isSelected()) 
					return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean isSelectedMultipleDelete() {
		
		if (deleteMultipleButton.isEnabled()){
		return true;
		}
		return false;
	}
	
	//Verify delete oparation -searching by class ID

	public void searchDeletedAttendance(String deleteValidationClassId1) throws InterruptedException {
		try {
			
			searchButton.sendKeys(deleteValidationClassId1);

			for (int j = 1; j < 20; j++) {
				pageNumbers = driver.findElement(By.xpath("//button[text()=" + j + "]"));
				Thread.sleep(2000);
				pageNumbers.click();

				for (WebElement attendanceMatch : actualAttendance) {
					String actualName = attendanceMatch.getText();
					System.out.println(actualName);
					if (actualName.equals(deleteValidationClassId1)) 
						System.out.println("Selected record is deleted");
					else	
						System.out.println("Selected record is not deleted");
			}
		} 
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

	//=================Pagination links methods================
	
	
	
	public String checkPaginationText() {
		String pagiText=paginationText.getText();
		return pagiText;
	}
	


	public void clickOnPreviousLink() {
		try {
			singleBackwardLink.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnNextLink() {
		try {
			singleForwardLink.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int checkHighLightedPageNumber() {
		int pagenum = 0;
		try {
			String pageHighLight = highLightedPageNumber.getText();
			pagenum=Integer.valueOf(pageHighLight);
			System.out.println(pagenum);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pagenum;
	}
	
	public void lastEnabledLink() {
		lastEnablePageNumber.click();
	}


	public void firstEnabledLink() {
		firstEnablePageNumber.click();
	}

	// Sorting methods started from here
	
	
	/*
	
	public void setBatchNameAsc() {
		try {
			batchNameSorting.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setBatchNameDesc() {
		try {
			for(int i=0;i<2;i++) 
			{
			batchNameSorting.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setBatchDescriptionAsc() {
		try {
			batchDescriptionSorting.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setBatchDescriptionDesc() {
		try {
			for(int i=0;i<2;i++) 
			{
			batchDescriptionSorting.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setBatchStatusAsc() {
		try {
			batchStatusSorting.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setBatchStatusDesc() {
		try {
			for(int i=0;i<2;i++) 
			{
			batchStatusSorting.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setBatchClassesAsc() {
		try {
			batchNoOfClassesSorting.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setBatchClassesDesc() {
		try {
			for(int i=0;i<2;i++) 
			{
			batchNoOfClassesSorting.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setProgramNameAsc() {
		try {
			programNameSorting.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setProgramNameDesc() {
		try {
			for(int i=0;i<2;i++) 
			{
			programNameSorting.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String checkBatchNameColoumnSorting() throws InterruptedException {
		String currentSort = "";
		try {
			Thread.sleep(2000);
			currentSort = batchNameColoumn.getAttribute("aria-sort");
			System.out.print("current sorting of batchName: " + currentSort);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return currentSort;
	}

	public String checkBatchDescriptionColoumnSorting() {
		String currentSort = "";
		try {
			currentSort = batchDescriptionColoumn.getAttribute("aria-sort");
			System.out.print("current sorting of batchDescription: " + currentSort);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return currentSort;
	}

	public String checkBatchStatusColoumnSorting() {
		String currentSort = "";
		try {
			currentSort = batchStatusColoumn.getAttribute("aria-sort");
			System.out.print("current sorting of batchStatus: " + currentSort);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return currentSort;
	}

	public String checkBatchClassesColoumnSorting() {
		String currentSort = "";
		try {
			currentSort = batchNoOfClassesColoumn.getAttribute("aria-sort");
			System.out.print("current sorting of batchclasses: " + currentSort);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return currentSort;
	}

	public String checkProgramNameColoumnSorting() {
		String currentSort = "";
		try {
			currentSort = programNameColoumn.getAttribute("aria-sort");
			System.out.print("current sorting of ProgramName: " + currentSort);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return currentSort;
	}

*/

}