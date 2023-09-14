package pageObjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;

public class ProgramModule {
	WebElement pageNumbers;

	WebDriver driver;
	// -----------------LMS Program button
	@FindBy(xpath = "//tagname[@attribute='programbutton']")
	WebElement programbutton;
	// LMS Header and Footer
	@FindBy(xpath = "//tagname[@attribute='headerMsg']")
	WebElement HeaderMsg;
	@FindBy(xpath = "//tagname[@attribute='header']")
	WebElement headerName;

	@FindBy(xpath = "//tagname[@attribute='FooterMsg']")
	WebElement FooterMsg;

	// LMS Delete MultipleRecords
//
	@FindBy(xpath = "//tagname[@attribute='value']")
	WebElement btnNo;
	@FindBy(xpath = "//tagname[@Attribute='footerrecd']")WebElement footerRecords;
	@FindBy(xpath = "//tagname[@Attribute=BottomPage']")WebElement pageBottom;
	@FindBy(xpath = "//tagname[@Attribute='searchBtm']")WebElement searchButtonprog;

//-----------------add prog-----------
	@FindBy(xpath = "//tagname[@Attribute='addProg']")
	WebElement addNewProgButton;
	@FindBy(xpath = "//tagname[text()='Prog header']")
	WebElement addProgHeader;
	@FindBy(xpath = ("//div[@class= 'popUp Prog details']"))
	WebElement progDetailsPopup;
	@FindBy(xpath = ("//div[@class= 'alert popUp Prog']"))
	WebElement errorMsgforInvalidvalues;
	@FindBy(xpath = "//tagname[@Attribute='Prog Details']")
	WebElement batchDetails;
	@FindBy(xpath = "//tagname[@Attribute='savform1']")
	WebElement saveProg;
	@FindBy(xpath = "//tagname[@attribute='txtSearch']")
	WebElement txtSearch;

	@FindBy(xpath = "//tagname[@attribute='AscProgramName']")
	WebElement AscProgramName;

	@FindBy(xpath = "//tagname[@attribute='DesProgramName']")
	WebElement DesProgramName;

	@FindBy(xpath = "//tagname[@attribute='AscProgramDes']")
	WebElement AscProgramDes;

	@FindBy(xpath = "//tagname[@attribute='DesProgramDes']")
	WebElement DesProgramDes;

	@FindBy(xpath = "//tagname[@attribute='AscProgramStatus']")
	WebElement AscProgramStatus;

	@FindBy(xpath = "//tagname[@attribute='DesProgramStatus']")
	WebElement DesProgramStatus;


	@FindBy(xpath = "//tagname[@attribute='txtProStatus']")
	WebElement txtProStatus;

	@FindBy(xpath = "//tagname[@attribute='txtProName']")
	WebElement txtProName;

	@FindBy(xpath = "//tagname[@attribute='txtProDescription']")
	WebElement txtProDescription;


	@FindBy(xpath = "//tagname[@attribute='value']")
	WebElement btnCancel;

	@FindBy(xpath = "//tagname[@attribute='value']")
	WebElement btnSavechk;


	// =================pagination===============

	@FindBy(xpath = "//tagname[@Attribute='paginationText']")
	WebElement paginationTextProgpg;

	@FindBy(xpath = "//tagname[@Attribute='singleBackwardLink']")
	WebElement singleBackwardLinkProgpg;

	@FindBy(xpath = "//tagname[@Attribute='singleForwardLink']")
	WebElement singleForwardLinkProgpg;

	@FindBy(xpath = "//tagname[@Attribute='highLightedPageNumber']")
	WebElement highLightedPageNumberProgpg;

	@FindBy(xpath = "//tagname[@Attribute='5']")
	WebElement lastEnablePageNumberProgpg;

	@FindBy(xpath = "//tagname[@Attribute='1']")
	WebElement firstEnablePageNumberProgpg;

	@FindBy(xpath = "//tagname[@Attribute='hNameSorting']")
	WebElement batchNameSortingProgpg;

	@FindBy(xpath = "//tagname[@Attribute='DescriptionSorting']")
	WebElement batchDescriptionSortingProgpg;

	@FindBy(xpath = "//tagname[@Attribute='StatusSorting']")
	WebElement StatusSortingProgpg;

	@FindBy(xpath = "//tagname[@Attribute='StatusSorting']")
	WebElement batchNoOfClassesSortingProgpg;

	@FindBy(xpath = "//tagname[@Attribute='programNameSorting']")
	WebElement programNameSortingProgpg;

	@FindBy(xpath = "//tagname[@Attribute='NameColoumn']")
	WebElement coloumnProgpgName;

	@FindBy(xpath = "//tagname[@Attribute='DescriptionColoumn']")
	WebElement colProgramDescription;

	@FindBy(xpath = "//tagname[@Attribute='StatusColoumn']")
	WebElement colProgramStatus;

	@FindBy(xpath = "//tagname[@Attribute='programNameColoumn']")
	WebElement programNameColoumnProgpg;

	@FindBy(xpath = "//tagname[@Attribute='numberOfRows']")
	WebElement numberOfRowsProgpg;


	// LMS Checkbox
	@FindBy(xpath = "//tagname[@attribute='value']")
	WebElement rowcheckBox1;

	@FindBy(xpath = "//tagname[@attribute='value']")
	WebElement rowcheckBox2;

	// LMS Edit File
	@FindBy(xpath = "//tagname[@attribute='rowEdit1']")
	WebElement rowEdit1;
	@FindBy(xpath = ("//div[@class= 'alert popUp']"))
	WebElement programPopup;

	@FindBy(xpath = "//tagname[@attribute='rowEdit2']")
	WebElement rowEdit2;

	@FindBy(xpath = "//tagname[@attribute='rowEdit3']")
	WebElement rowEdit3;


	// LMS Delete file
	@FindBy(xpath = "//tagname[@attribute='value']")
	WebElement rowDelete1;

	@FindBy(xpath = "//tagname[@attribute='value']")
	WebElement rowDelete2;


	@FindBy(xpath = "//tagname[@attribute='multiDelete']")
	WebElement multiDeletebtn;
	@FindBy(xpath = "//tagname[@attribute='radio btn']")
	WebElement radiobtnchk;
	@FindBy(xpath = "//tagname[@attribute='chk box']")
	WebElement chkBoxbtnchk;

	@FindBy(xpath = "//tagname[text()='cancel']")
	WebElement confirmcancel;
	@FindBy(xpath = "//tagname[text()='confirm delete']")
	WebElement confrmDeleteMessage;
	@FindBy(xpath = ("//div[@class= 'alert delete popUp Prog']"))
	WebElement deletePopUp;

	//----------------------------Navigation to other pages web elements ----------------
	@FindBy(xpath = "//tagname[@attribute='student']")
	WebElement studentPageBtn;
	@FindBy(xpath = "//tagname[@attribute='batch']")
	WebElement batchPageBtn;
	@FindBy(xpath = "//tagname[@attribute='Class']")
	WebElement classPageBtn;
	@FindBy(xpath = "//tagname[@attribute='attendance']")
	WebElement attandancePageBtn;
	@FindBy(xpath = "//tagname[@attribute='assignemnt']")
	WebElement assignmentPageBtn;
	@FindBy(xpath = "//tagname[@attribute='user']")
	WebElement userPageBtn;
	@FindBy(xpath = "//tagname[@attribute='user']")
	WebElement userlogoutBtn;
	
	
	
	//--------------- Navigation ------------
	
	public void navigateToStudent() {
		try {
			Thread.sleep(2000);
			studentPageBtn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void navigateToBatch() {
		try {
			Thread.sleep(2000);
			batchPageBtn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void navigateToClass() {
		try {
			Thread.sleep(2000);
			classPageBtn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void navigateToAttendance() {
		try {
			Thread.sleep(2000);
			attandancePageBtn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void navigateToAssignment() {
		try {
			Thread.sleep(2000);
			assignmentPageBtn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void navigateToUser() {
		try {
			Thread.sleep(2000);
			userPageBtn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void navigateToLogout() {
		try {
			Thread.sleep(2000);
			userlogoutBtn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// -------------method for prog add--------------

	public void navigateToProgam() {
		try {
			Thread.sleep(2000);
			programbutton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ProgramModule(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Verify page title method
	public String verifyPageTitleProgam() {
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

	public void clickAddNewProgButton() {
		addNewProgButton.click();
	}

	public void saveProg() {
		saveProg.click();
	}

	public String checkErrorMessage() {
		String actualError = null;
		try {
			Thread.sleep(2000);
			actualError = errorMsgforInvalidvalues.getText();
			System.out.println(actualError);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return actualError;

	}

	public void addProgramName(String enterName) {
		txtProName.sendKeys(enterName + Keys.TAB);
	}

	public void addProgramStatus(String enterName) {
		txtProStatus.sendKeys(enterName + Keys.TAB);
	}

	public void addProgramDesciption(String description) {
		txtProDescription.sendKeys(description);
	}

	public void clickCancelButton() {
		btnCancel.click();
	}

	public boolean progPopup() {

		try {
			if (progDetailsPopup.isDisplayed() && progDetailsPopup.getText().contains("prog details")) {
				return true;
			} else {
				return false;
			}
		} catch (NoSuchElementException e) {
			return false;
		}
	}
//---------------------manage prog------------
	
	public void clickSearchButton() {
		searchButtonprog.click();
	}

	
	public String getHeader() {
		String Header = HeaderMsg.getText();
		return Header;
	}

	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	// method to click prog button
	public void programbutton() {
		programbutton.click();
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
		
		public boolean progDeleteBtnEnabled() {
			try {
				if (multiDeletebtn.isDisplayed() && multiDeletebtn.isEnabled()) {
					return true;
				} else {
					return false;
				}
			} catch (NoSuchElementException e) {
				return false;
			}
		}
		public boolean addNewProgBtnEnabled() {
			try {
				if (addNewProgButton.isDisplayed() && addNewProgButton.isEnabled()) {
					return true;
				} else {
					return false;
				}
			} catch (NoSuchElementException e) {
				return false;
			}
		}
		
		
		public boolean getSearchbtnenabled() {
			try {
				if (txtSearch.isDisplayed() && txtSearch.isEnabled()) {
					return true;
				} else {
					return false;
				}
			} catch (NoSuchElementException e) {
				return false;
			}
		}
		
		public void enterProgramInSearch(String data) {
			txtSearch.sendKeys(data  + Keys.ENTER);
			
		}
		
		
		public boolean searchProgram(String data, String colName) {
			enterProgramInSearch(data);
			
			WebElement table = driver.findElement(By.xpath("//table[contains(@class, 'table table-style')]"));
		    List<WebElement> rowsList = table.findElements(By.tagName("tr"));

		    List<WebElement> columnsList = null;

		    for (WebElement row : rowsList) {
		        columnsList = row.findElements(By.tagName("td"));
		        
		        switch (colName) {
		        case "Name" :
		        	String pNameFromRow = columnsList.get(0).getText();
			        if(data.equalsIgnoreCase(pNameFromRow)) {
			        	return true;
			        }
			        break;
		        case "Desc" :
		        	String pDescFromRow = columnsList.get(1).getText();
			        if(data.equalsIgnoreCase(pDescFromRow)) {
			        	return true;
			        }
			        break;
		        case "Status" :
		        	String pStatusFromRow = columnsList.get(2).getText();
			        if(data.equalsIgnoreCase(pStatusFromRow)) {
			        	return true;
			        }
		        }

		    }
			return false;
		}
		

	// --------delete page -------

	public void clickcancelConfirm() {
		try {
			confirmcancel.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String recordsAvailable1() {
		String num = "";
		try {
			num = pageNumbers.getAttribute("ng-reflect-total-records");
			System.out.println(num);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	//
	public boolean progSaveBtnEnabled() {
		try {
			if (btnSavechk.isDisplayed() && btnSavechk.isEnabled()) {
				return true;
			} else {
				return false;
			}
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public boolean progradioBtnEnabled() {
		try {
			if (radiobtnchk.isDisplayed() && radiobtnchk.isEnabled()) {
				return true;
			} else {
				return false;
			}
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public boolean progChkBoxEnabled() {
		try {
			if (chkBoxbtnchk.isDisplayed() && chkBoxbtnchk.isEnabled()) {
				return true;
			} else {
				return false;
			}
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public String confrmDeleteMessage() {
		String actualError = null;
		try {
			Thread.sleep(2000);
			actualError = confrmDeleteMessage.getText();
			System.out.println(actualError);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return actualError;

	}

	public boolean deletePopup() {

		try {
			if (deletePopUp.isDisplayed() && deletePopUp.getText().contains("yes or no")) {
				return true;
			} else {
				return false;
			}
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	// LMS Delete MultipleRecords


	public void ConfNo() {
		btnNo.click();

	}


	// LMS Checkbox
	public void clickrowcheck1() {
		rowcheckBox1.click();
	}

	public void clickrowcheck2() {
		rowcheckBox2.click();
	}


	// ----------------------LMS Edit file button---------------------

	public void ClickRowEdit1() {
		rowEdit1.click();
	}

	public boolean programPopup() {

		try {
			if (programPopup.isDisplayed() && programPopup.getText().contains("Program Details")) {
				return true;
			} else {
				return false;
			}
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public String getSaveAlertText() {

		return driver.switchTo().alert().getText();
	}

	public void ClickRowEdit2() {
		rowEdit2.click();
	}

	public boolean editBtnEnabled() {
		return rowEdit1.isEnabled();
	}

	public boolean deleteBtnEnabled() {
		return rowDelete1.isEnabled();
	}

	

	// LMS Delete file
	public boolean deletebtnEableorDisablechk() {
		return multiDeletebtn.isEnabled();
	}
	
	public void clickMultiDeleteBtn() {
		multiDeletebtn.click();
	}
	
	public void acceptMultiDeleteAlert() {
		driver.switchTo().alert().accept();
	}
	
	public void rejectMultiDeleteAlert() {
		driver.switchTo().alert().dismiss();
	}
	
	public String getDeleteAlertText() {

		return driver.switchTo().alert().getText();
	}

	public void ClickRowDelete1() {
		rowDelete1.click();
	}

	public void ClickRowDelete2() {
		rowDelete2.click();
	}

	// =================Pagination links methods================

	public String checkPaginationTextProgpg() {
		String pagiText = paginationTextProgpg.getText();
		return pagiText;
	}

	public void clickOnPreviousLinkProgpg() {
		try {
			singleBackwardLinkProgpg.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnNextLinkProgpg() {
		try {
			singleForwardLinkProgpg.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean clickOnNextLinkProgpgEnabled() {
		{
			try {
				if (singleForwardLinkProgpg.isDisplayed() && singleForwardLinkProgpg.isEnabled()) {
					return true;
				} else {
					return false;
				}
			} catch (NoSuchElementException e) {
				return false;
			}
		}
	}

	public int checkHighLightedPageNumberProgpg() {
		int pagenum = 0;
		try {
			String pageHighLight = highLightedPageNumberProgpg.getText();
			pagenum = Integer.valueOf(pageHighLight);
			System.out.println(pagenum);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return pagenum;
	}

	public void lastEnabledLinkProgpg() {
		lastEnablePageNumberProgpg.click();
	}

	public void firstEnabledLinkProgpg() {
		firstEnablePageNumberProgpg.click();
	}

	public boolean clickOnPreviousLinkProgpgEnabled() {
		{
			try {
				if (singleBackwardLinkProgpg.isDisplayed() && singleBackwardLinkProgpg.isEnabled()) {
					return true;
				} else {
					return false;
				}
			} catch (NoSuchElementException e) {
				return false;
			}
		}
	}

	// --------------------sorting---------------------

	
	public void setProgramDescriptionAscProgpg() {
		try {
			batchDescriptionSortingProgpg.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setProgramDescriptionDescProgpg() {
		try {
			for (int i = 0; i < 2; i++) {
				batchDescriptionSortingProgpg.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setProgramStatusAscProgpg() {
		try {
			StatusSortingProgpg.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setProgramStatusDescProgpg() {
		try {
			for (int i = 0; i < 2; i++) {
				StatusSortingProgpg.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void setProgramNameAscProgpg() {
		try {
			programNameSortingProgpg.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setProgramNameDescProgpg() {
		try {
			for (int i = 0; i < 2; i++) {
				programNameSortingProgpg.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String checkNameColoumnSorting() throws InterruptedException {
		String currentSort = "";
		try {
			Thread.sleep(2000);
			currentSort = coloumnProgpgName.getAttribute("aria-sort");
			System.out.print("current sorting of programName: " + currentSort);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return currentSort;
	}

	public String checkProgramDescriptionColoumnSorting() {
		String currentSort = "";
		try {
			currentSort = colProgramDescription.getAttribute("aria-sort");
			System.out.print("current sorting of programDescription: " + currentSort);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return currentSort;
	}

	public String checkProgramStatusColoumnSorting() {
		String currentSort = "";
		try {
			currentSort = colProgramStatus.getAttribute("aria-sort");
			System.out.print("current sorting of programStatus: " + currentSort);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return currentSort;
	}

}
