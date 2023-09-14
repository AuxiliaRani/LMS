package pageObjects;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import factory.DriverFactory;

public class Userpage {
	public static WebDriver driver = DriverFactory.getdriver();
	
	@FindBy(id = "dashboard-title")
    private static WebElement dashboardTitle;
	
	//@FindBy(xpath="")WebElement user;
	
	@FindBy(xpath ="*//[id=user]")
    private static WebElement Userclick;
	
	
	@FindBy(xpath="*//[id=assignstaff]")
    private static WebElement assignstaff;
	
	@FindBy(xpath="*//[id=searchbox]")
    private static WebElement searchBox;
	
	@FindBy(xpath = "//table[@id='dataTable']/tbody/tr")
    private static List<WebElement> dataRows;
	@FindBy(xpath ="*//[id=Newuser]")
    private static WebElement newUser;
	@FindBy(id = "popupElementId") 
    private static WebElement popup;
	
	@FindBy(id = "firstName") 
    private static WebElement firstNameField;

    @FindBy(id = "middleName") 
    private static WebElement middleNameField;

    @FindBy(id = "lastName") 
    private static WebElement lastNameField;

    @FindBy(id = "location") 
    private static WebElement locationField;
    @FindBy(id = "phone") 
    private static WebElement phoneField;
	
    @FindBy(id = "linkdinUrl") 
    private static WebElement linkdinUrlField;
    @FindBy(id = "undergraduate") 
    private static WebElement undergraduateField;
    @FindBy(id = "Postgraduate") 
    private static WebElement postgraduateField;
    @FindBy(id = "timezone") 
    private static WebElement timezoneField;
	
    @FindBy(id = "usercomments") 
    private static WebElement usercommentsField;
	
    @FindBy(id = "userRoledropdown") 
    private static WebElement userRoledropdown;
    @FindBy(id = "AdminuserRole") 
    private static WebElement adminuser;
    @FindBy(id = "studentuserRole") 
    private static WebElement studentuser;
    @FindBy(id = "roleStatus") 
    private static WebElement roleStatusdropdown;
    @FindBy(id = "roleStatus/Active") 
    private static WebElement adroleStatus;
    
    @FindBy(id = "VisaStatus") 
    private static WebElement VisaStatudropdown;

    
    @FindBy(id = "VisaStatus/H1b") 
    private static WebElement VisaStatus;
    @FindBy(xpath="//div/div/dropdown") 
    private WebElement dropdownUser;
    @FindBy(id = "usersubmitButton") 
    private static WebElement usersubmitButton;
    
    @FindBy(xpath = "//table[@id='userDataTable']") 
    private static WebElement userDataTable;
    @FindBy(xpath = "//*[@id='erroralert']") 
    private static WebElement errorMsg;
    
    @FindBy(xpath = "//table[@id='dataTable']") 
    private static WebElement dataTable;
    @FindBy(xpath = "//button[@class='edit-icon']")
	static 
    WebElement editIcon;
    
    
    
    
    @FindBy(xpath = "//*[@id='deletealert']") 
    private static WebElement alertMsg;
    
    @FindBy(xpath = "/Alert/button[text()='Yes']") 
    private static WebElement yesButton;

    @FindBy(xpath = "/Alert/button[text()='No']") 
    private static WebElement noButton;
    
    @FindBy(xpath = "//input[@type='checkbox']") 
    private static List<WebElement> checkboxes;
    
    
    @FindBy(id = "userDetailsPopup")
    private static WebElement userDetailsPopup;
    
    @FindBy(id = "errorMessage") 
    private static WebElement errorMessage;
    @FindBy(id = "description") 
    private static WebElement descriptionInput;
	public Userpage() {
		PageFactory.initElements(driver, this);

	}
	
	public static String getDashboardTitleText() {
        return dashboardTitle.getText();
    }
	
	public static void clickuserLink() {		
		Userclick.click();}
	
		public static boolean isAssignstaffVisible() {
	        return assignstaff.isDisplayed();
	
}
		public static boolean isSearchboxVisible() {
	        return searchBox.isDisplayed();
	
}	
		
		public static boolean areCheckboxesPresentInAllRows() {
	        for (WebElement row : dataRows) {
	            List<WebElement> checkboxes = row.findElements(By.xpath(".//input[@type='checkbox']"));
	            if (checkboxes.isEmpty()) {
	                return false; 
	            }
	        }
	        return true; 
	    }	
		public static boolean areEditIconsEnabledInAllRows() {
	        for (WebElement row : dataRows) {
	            WebElement editIcon = row.findElement(By.xpath(".//i[@class='edit-icon']"));
	            String iconClass = editIcon.getAttribute("class");
	            if (!iconClass.contains("disabled")) {
	                return false; 
	            }
	        }
	        return true; // All rows have enabled edit icons
	    }
		
		 public static boolean areDeleteIconsEnabledInAllRows() {
		        for (WebElement row : dataRows) {
		            WebElement deleteIcon = row.findElement(By.xpath(".//i[@class='delete-icon']"));
		            String iconClass = deleteIcon.getAttribute("class");
		            if (!iconClass.contains("disabled")) {
		                return false; 
		            }
		        }
		        return true; 
		    }
		
		
		 public static void clicknewUser() {		
				newUser.click();}
		 
		 
		 public static boolean isPopupDisplayed() {
		        return popup.isDisplayed();
		    }
		 
		 public static WebElement getFirstNameField() {
		        return firstNameField;
		    }

		    public static WebElement getMiddleNameField() {
		        return middleNameField;
		    }

		    public static WebElement getLastNameField() {
		        return lastNameField;
		    }
		 
		 
		 
		    public static WebElement getLocationField() {
		        return locationField;
		    }

		    public static WebElement getPhoneField() {
		        return phoneField;
		    }

		    public static WebElement getLinkdinUrlField() {
		        return linkdinUrlField;
		    }
		    public static WebElement getUndergraduateField() {
		        return undergraduateField;
		    }

		    public static WebElement getPostgraduateField() {
		        return postgraduateField;
		    }

		    public static WebElement getTimezoneField() {
		        return timezoneField;
		    }
		 
		    public static WebElement getUsercommentsField() {
		        return usercommentsField;
		    }

		    public static WebElement getUserroleField() {
		        return userRoledropdown;
		    }

		    public static WebElement getRoleStatusField() {
		        return roleStatusdropdown;
		    }
		    public static WebElement getVisastatusField() {
		        return VisaStatudropdown;
		    }

		    public WebElement getUserdropdown() {
		        return dropdownUser;
		    }

		    
		    
		    
		    public static void UserRoleselect() {
		    userRoledropdown.click();
            adminuser.click();}
		    
		    public static void UserRoleselectstudent() {
		    	userRoledropdown.click();
	            studentuser.click();}
		    
		    public static void UserStatusselect() {
		    	roleStatusdropdown.click();
	            adroleStatus.click();}
		    public static void VisaStatusselect() {
		    	VisaStatudropdown.click();
	            VisaStatus.click();}
		    public static void clickuserSubmit() {
		        usersubmitButton.click();
		    }
		  
		    public static boolean isNewUserPresentInTable(String username) {
		        
		        By userRowLocator = By.xpath("//tr[contains(@class, 'user-row')][contains(., '" + username + "')]");

		        WebElement userRow = userDataTable.findElement(userRowLocator);
		        return userRow.isDisplayed();}
		    
		    
		    public static boolean isErrorMsgDisplayed() {
		        return errorMsg.isDisplayed();
		    }
		    
		    
		    
		    
		    
		    
		    public static boolean isDeleteIconEnabledForRow(int rowIndex) {
		        
		        By deleteIconLocator = By.xpath("//tr[@id='row_" + rowIndex + "']//button[@class='delete-icon']"); 

		        WebElement deleteIcon = dataTable.findElement(deleteIconLocator);
		        return deleteIcon.isEnabled();
		    }
		    
		    public static void clickDeleteIcon() {
		        
		        By deleteIconLocator = By.xpath("//*button[@class='delete-icon']"); 
		        WebElement deleteIcon = dataTable.findElement(deleteIconLocator);
		        deleteIcon.click();
		    }
		    
		    public static boolean isDeletealertDisplayed() {
		        return alertMsg.isDisplayed();
		    }
		    public static String getAlertText() {
		        return alertMsg.getText();
		    }
		    
		    public static void clickYes() {
		        yesButton.click();
		    }
		    
		    
		    public static boolean isUserPresentInTable(String username) {
		        
		        By userLocator = By.xpath("//tr[contains(@class)][contains(., '" + username + "')]"); 

		        WebElement userpresent = dataTable.findElement(userLocator);
		        return userpresent.isDisplayed();
		    }
		    public static void clickNo() {
		        noButton.click();
		    }
		    
		    public static boolean areAllCheckboxesUnchecked() {
		        for (WebElement checkbox : checkboxes) {
		            if (checkbox.isSelected()) {
		                return false;
		            }
		        }
		        return true;
		    }

		    
		    public static boolean isDeleteIconUnderHeaderDisabled(String headerName) {
		        
		        By deleteIconLocator = By.xpath("//th[contains(text(), '" + headerName + "')]/following-sibling::th//button[@class='delete-icon' and @disabled]");

		        WebElement deleteIcon = dataTable.findElement(deleteIconLocator);
		        return deleteIcon.isEnabled();
		    }
		    
		    public static boolean isAtLeastOneCheckboxSelected() {
		        for (WebElement checkbox : checkboxes) {
		            if (checkbox.isSelected()) {
		                return true;
		            }
		        }
		        return false;
		    }
		    public static void clickDeleteIconBelowHeader(String headerName) {
		        
		        By deleteIconLocator = By.xpath("//th[contains(text(), '" + headerName + "')]/following-sibling::th//button[@class='delete-icon']");

		        WebElement deleteIcon = dataTable.findElement(deleteIconLocator);
		        deleteIcon.click();
		    }
		    
		    public static boolean isUserPresentInTablemultipleusers(String username) {
		        
		        By userRowLocator = By.xpath("//tr[contains(@class, 'user-row')][contains(., '" + username + "')]");

		        try {
		            WebElement userRow = dataTable.findElement(userRowLocator);
		            return userRow.isDisplayed();
		        } catch (org.openqa.selenium.NoSuchElementException e) {
		            return false;
		        }
		    }

		    public static boolean areAtLeastTwoCheckboxesSelected() {
		        int selectedCount = 0;
		        for (WebElement checkbox : checkboxes) {
		            if (checkbox.isSelected()) {
		                selectedCount++;
		                if (selectedCount >= 2) {
		                    return true;
		                }
		            }
		        }
		        return false;
		    }
		    public static boolean isEditIconEnabledForUser(String username) {
		        
		        By userRowLocator = By.xpath("//tr[contains(@class, 'user-row')][contains(., '" + username + "')]");

		        WebElement userRow = dataTable.findElement(userRowLocator);
		        WebElement editIcon = userRow.findElement(By.xpath(".//td[@class='edit-icon']/button")); 

		        return editIcon.isEnabled();
		    }
		    
		    public static void clickEditIcon() {
		        editIcon.click();
		    }
		    
		    
		    public static boolean isUserDetailsPopupDisplayed() {
		        return userDetailsPopup.isDisplayed();
		    }
		    
		    public static void updateUserInfo(String location) {
		        locationField.clear();
		        locationField.sendKeys(location);

		       // phoneField.clear();
		       // phoneField.sendKeys(lastName);

		        

		        usersubmitButton.click();
		    }
		    public static boolean isUserDetailsUpdated(String location) {
		        String expectedlocation = location;

		        
		        for (WebElement row : dataRows) {
		            if (row.getText().contains(expectedlocation)) {
		                return true;
		            }
		        }

		        return false; 
		    }
		    
		    public static String getErrorMessageText() {
		        return errorMessage.getText();
		    }
		    
		    public static void eraseFirstNameField() {
		        firstNameField.clear();
		    }
		    
		    public String getErrorMessageEraseText() {
		        return errorMessage.getText();
		    }
		    public static void erasedescriptionField() {
		    	descriptionInput.clear();
		    }
		}
		
		
		






		    
		    
	
	
	   





