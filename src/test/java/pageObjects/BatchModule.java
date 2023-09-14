package pageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BatchModule {
	
	public WebDriver driver;
	public Properties prop;
	WebElement pageNumbers;
	
	
	
//------------------validation of batch page-------------------------------------
	@FindBy(xpath = "//tagname[text()='Batch']") WebElement batchButton;
	@FindBy(xpath = "//tagname[text()=' Manage Batch']") WebElement headerName;
	@FindBy(xpath = "(//tagname[@Attribute='deleteMultipleButton'])")WebElement deleteMultipleButton;
	@FindBy(xpath = "//tagname[@Attribute=BottomPage']")WebElement pageBottom;
	@FindBy(xpath = "//tagname[@Attribute='searchBtm']")WebElement searchButton;
	@FindBy(xpath = "//tagname[@Attribute='SText']")WebElement searchtext;
	
	@FindBy(xpath="//tagname[@Attribute='stsColumn']")List<WebElement> statusColoumn;
	
	@FindBy(xpath="//tagname[@Attribute='Classcolmn']")List<WebElement> classesColoumn;
	
	@FindBy(xpath="//tagname[@Attribute='pgname']")List<WebElement> programNames;
	
	@FindBy(xpath = "//tagname[@Attribute='actBatch']")List<WebElement> actualBatchs;
	
	@FindBy(xpath = "//tagname[@Attribute='chkbox']")WebElement checkBoxBatch;
	
	@FindBy(xpath = "//tagname[@Attribute='Allchkbx']")List<WebElement> allCheckbox;
	
	@FindBy(xpath = "//tagname[@Attribute='footerrecd']")WebElement footerRecords;
	
	@FindBy(xpath=("//div[@class= 'alert popUp']")) WebElement batchPopup;
	@FindBy(xpath = ("//*[@id='batchDataTableheader']"))WebElement batchDataTableHeader;

	@FindBy(xpath = ("//*[@id='batchDataTable']"))	WebElement batchDataTable;

	// =====Add batch WebElements==============
	
	@FindBy(xpath = "//tagname[@Attribute='addBtch']")WebElement addNewBatchButton;
	@FindBy(xpath = "//tagname[text()='Batch header']")WebElement addBatchHeader;
	@FindBy(xpath=("//div[@class= 'alert popUp']")) WebElement errorMsgforInvalidvalues;
	@FindBy(xpath = "//tagname[@Attribute='Batch Details']")WebElement batchDetails;
	@FindBy(xpath = "//tagname[@Attribute='savform']")WebElement saveForm;
	
	@FindBy(xpath = "//tagname[@Attribute='errmsg']")WebElement errorMessageNameRequired;
	@FindBy(xpath = "//tagname[text()='Cancel']")WebElement cancelForm;
	@FindBy(xpath = "//tagname[@id='batchName']")WebElement formBatchName;
	@FindBy(xpath = "//tagname[@id='batchDescription']")WebElement formDescription;
	@FindBy(xpath = "//tagname[@Attribute='drpbtn']")WebElement dropdownButton;
	@FindBy(xpath = "//tagname[@Attribute='drpdwnvalue']")List<WebElement> dropdownValues;

	@FindBy(xpath = "//tagname[@Attribute='1stselec']")WebElement firstOptionSelection;

	@FindBy(xpath = "//tagname[@Attribute='activestas']")WebElement activeStatus;
	@FindBy(xpath = "//tagname[@Attribute='inactivestas']")WebElement inactiveStatus;
	@FindBy(xpath = "//tagname[@id='batchNoOfClasses']")WebElement noOfClasses;
	@FindBy(xpath = "//tagname[@Attribute='sts']")List<WebElement> status;
	
	@FindBy(xpath = "//tagname[text()='New Batch Created']")WebElement successMessage;

	// ========= Edit/delete batch WebElements ===========
	
	@FindBy(xpath = "//tagname[@Attribute='editbtch']")WebElement editBatch;
	@FindBy(xpath = "//tagname[@Attribute='delbatch']")WebElement deleteBatch;
	
	@FindBy(xpath = "//tagname[text()='Delete heder']")	WebElement deleteHeader;
	
	@FindBy(xpath = "//tagname[@Attribute='updateprogName']")WebElement editProgramName;

	@FindBy(xpath = "//tagname[text()='No']")WebElement confirmNo;
	@FindBy(xpath = "//tagname[text()='Yes']")WebElement confirmYes;

	@FindBy(xpath = "//tagname[@Attribute='confmsg']")WebElement confirmMessage;

	@FindBy(xpath = "//tagname[text()='Showing 0 to 0 of 0 entries']")WebElement zeroRecords;

	@FindBy(xpath = "//tagname[@Attribute='chkbx']")List<WebElement> checkboxs;

	@FindBy(xpath=("//div[@class= 'alert popUp for blank mandatory field']")) WebElement errorMsgforblankvalues;
	// =================pagination===============
	
	@FindBy(xpath = "//tagname[@Attribute='paginationTxt']")WebElement paginationText;
	
	@FindBy(xpath = "//tagname[@Attribute='singleBackLink']")WebElement singleBackwardLink;

	@FindBy(xpath = "//tagname[@Attribute='singlefrwdLink']")WebElement singleForwardLink;

	@FindBy(xpath = "//tagname[@Attribute='highlitepage']")WebElement highLightedPageNumber;

	@FindBy(xpath = "//tagname[@Attribute='5']")WebElement lastEnablePageNumber;
	
	@FindBy(xpath = "//tagname[@Attribute='1']")WebElement firstEnablePageNumber;

	@FindBy(xpath = "//tagname[@Attribute='BNameSorting']")WebElement batchNameSorting;

	@FindBy(xpath = "//tagname[@Attribute='BDescriptionSorting']")WebElement batchDescriptionSorting;

	@FindBy(xpath = "//tagname[@Attribute='BStatusSorting']")WebElement batchStatusSorting;

	@FindBy(xpath = "//tagname[@Attribute='BNoOfClassesSorting']")WebElement batchNoOfClassesSorting;

	@FindBy(xpath = "//tagname[@Attribute='programNameSorting']")WebElement programNameSorting;

	@FindBy(xpath = "//tagname[@Attribute='BNameColoumn']")WebElement batchNameColoumn;

	@FindBy(xpath = "//tagname[@Attribute='BDescriptionColoumn']")WebElement batchDescriptionColoumn;

	@FindBy(xpath = "//tagname[@Attribute='BStatusColoumn']")WebElement batchStatusColoumn;

	@FindBy(xpath = "//tagname[@Attribute='BNoOfClassesColoumn']")WebElement batchNoOfClassesColoumn;

	@FindBy(xpath = "//tagname[@Attribute='BprogramNameColoumn']")WebElement programNameColoumn;
	
	@FindBy(xpath = "//tagname[@Attribute='BnumberOfRows']")WebElement numberOfRows;
	

	// Constructor
	public BatchModule(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	
	
	
	// ============Navigate to Batch page(batch page validation=============
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public void navigateToBatch() {
		try {
			Thread.sleep(2000);
			batchButton.click();
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

	// method to click batch button
			public void clickBatchButton() {
				batchButton.click();
			}
			//method to click Add New Class Button
			public void clickAddNewClassButton() {
				addNewBatchButton.click();
			}
	
	// Verify Delete button state
	public void verifyDeleteButton() {
		try {
			if (deleteMultipleButton.isEnabled()) {
				System.out.println("Button is enabled");
			} else {
				System.out.println("Button is disabled");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean batchPopup() {
		
		try {
		if (batchPopup.isDisplayed() && batchPopup.getText().contains("batch details")) {
			return true;
		} else {
			return false;
		}
	} catch (NoSuchElementException e) {
		return false;
	}
	}
	
	
	
	//method to getText for each tableHeader (WebElement )
			public List<String> batchDataTableHeader() {
				
				List<WebElement> headerCells = batchDataTableHeader.findElements(By.tagName("td"));
				List<String> headerText = null;

				for (WebElement hc :headerCells)
				{
					headerText.add(hc.getText());
				}
				return headerText;
			}
			
			
			public List<WebElement> batchDataTableHeaderWithSortIcon() {
				
				List<WebElement> headerCells = batchDataTableHeader.findElements(By.tagName("td"));		
				return headerCells;
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
	
	
	public String enterBatchNameInSearch(String batchName) {
		searchButton.sendKeys(batchName);
		return batchName;
	}

	public String searchBatchName(String batchName) throws InterruptedException {
		String actualName="";
		try {
			for (int j = 1; j < 20; j++) {
				pageNumbers = driver.findElement(By.xpath("//button[text()=" + j + "]"));
				Thread.sleep(2000);
				pageNumbers.click();

				for (WebElement batchMatch : actualBatchs) {
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
	
	
	public boolean batchEditIconEnabled()
	{
	try {
		if (editBatch.isDisplayed() && editBatch.isEnabled()) {
			return true;
		} else {
			return false;
		}
	} catch (NoSuchElementException e) {
		return false;
	}
	}
	public boolean NewBatchBtnEnabled()
	{
	try {
		if (addNewBatchButton.isDisplayed() && addNewBatchButton.isEnabled()) {
			return true;
		} else {
			return false;
		}
	} catch (NoSuchElementException e) {
		return false;
	}
}
	
	
	
	
	//==================Add Batch methods start from here=====================
	
	public void addNewBatchbuttonClick() throws InterruptedException {
		Thread.sleep(2000);
		try {
			addNewBatchButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String checkAddBatchHeader() {
		String header=addBatchHeader.getText();
		return header;
	}

	public boolean batchDetailForm() {
		try {
			if (batchDetails.isEnabled()) {
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
	

	public String enterName(String addBatchName) throws InterruptedException {
		// Thread.sleep(3000);
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOf(formBatchName));

			formBatchName.sendKeys(addBatchName);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return addBatchName;

	}


	public String enterDescription(String addDescription) throws InterruptedException {

		try {
			Thread.sleep(2000);
			formDescription.sendKeys(addDescription);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return addDescription;
	}
	

	public String selectProgramName(String program) {
		
		if (program == null) {
			return null;
		}
		try {
			dropdownButton.click();
			//String firstValue = firstOptionSelection.getText();

			for (WebElement pName : dropdownValues) {
				String dropDownValue = pName.getText();

				if (program.equalsIgnoreCase(dropDownValue)) {
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

	public void selectStatus(String statusInput) throws InterruptedException {
		try {

			Thread.sleep(2000);
			switch (statusInput) {
			case "Active":
				activeStatus.click();
				break;

			case "Inactive":
				inactiveStatus.click();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String errorMsgInvalidvalues() {
		String errmsg=errorMsgforInvalidvalues.getText();
		return errmsg;
	}
	
	
	
	public boolean statusEnable() {
		try {
			if (activeStatus.isEnabled()) {
				System.out.println("Status set to Active");
				return true;
			} else {
				System.out.println("Status set to Inactive");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public void enterClassesNumber(String noOfClass) {
		try {
			Thread.sleep(2000);
			noOfClasses.sendKeys(noOfClass);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickOnEdit() {
		try {
			editBatch.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String editName(String editName) {
		try {
			Thread.sleep(1000);
			editBatch.click();
			formBatchName.clear();
			formBatchName.sendKeys(editName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return editName;
	}
	public void editNamewithEmptyValue() {
		try {
			Thread.sleep(1000);
			editBatch.click();
			formBatchName.clear();
			} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public String errorMsgforblankvaluesEdit() {
		String errmsg=errorMsgforblankvalues.getText();
		return errmsg;
	}

	public String getEditedText() {
		String getText = formBatchName.getAttribute("ng-reflect-model");
		return getText;
	}

	public String editDescription(String editedDescription) {
		try {
			editBatch.click();
			formDescription.clear();
			formDescription.sendKeys(editedDescription);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return editedDescription;
	}
	public void editDescriptionBlankValue() {
		try {
			editBatch.click();
			formDescription.clear();
			} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	public void selectActive() {
		try {
			activeStatus.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//===================  methods for Delete operations ==============
	public void deleteBatch() {
		try {
			deleteBatch.click();
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

	public String confirmMessageDisplayed() {
		try {
			confirmMessage.isDisplayed();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		String text=confirmMessage.getText();
		return text;
	}

	
	public boolean searchDeletedName(String deletedBatchName) throws InterruptedException {
		try {
			searchButton.sendKeys(deletedBatchName);

			for (int j = 1; j < 20; j++) {
				pageNumbers = driver.findElement(By.xpath("//button[text()=" + j + "]"));
				Thread.sleep(2000);
				pageNumbers.click();

				for (WebElement batchMatch : actualBatchs) {
					String actualName = batchMatch.getText();
					System.out.println(actualName);
					if (actualName.equals(deletedBatchName)) ;
						return true;
				
			}
		} 
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}


	public void selectMutipleCheckboxes() {
		try {
			for (WebElement checkbox : checkboxs) {
				checkbox.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

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
	
	public void deleteMutipleBatches() {
		try {
			deleteMultipleButton.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//=================Pagination links methods================
	
	public String checkPaginationText() {
		String pagiText=paginationText.getText();
		return pagiText;
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

}
