package pageObjects;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import utilities.LoggerLoad;

public class ManageAssignment {
	
	public static WebDriver driver = DriverFactory.getdriver();

	
	@FindBy(xpath = "//a[@href='/assignment']")
	WebElement assignment;
	@FindBy(xpath = "//*[@value='searchBox']")
	WebElement searchBox;
	@FindBy(xpath = "//*[@id='id_assignmentbutton']")
	WebElement assignmentbutton;
	@FindBy(xpath = "//*[@id='newassignmentbutton']")
	WebElement Addnewassignmentbutton;
	@FindBy(xpath = "//*[@id='id_assignmentbutton']")
	WebElement clicksassignmentbutton;
	@FindBy(xpath = "//*[@class='Editbutton']")
	WebElement clicksEditbutton;
	@FindBy(xpath = "//*[@id='id_assignmentbutton1']")
	WebElement assignmentbutton1;
	@FindBy(xpath = "//*[@class='deletebutton']")
	WebElement clickdeletebutton;
	@FindBy(xpath = "//*[@class='assignmentbutto2']")
	WebElement clickassignmentbutton;
	@FindBy(xpath = "//*[@class='deletebutton']")
	WebElement clicksdeletebutton;
	@FindBy(xpath = "//*[@class='assignmentname']")
	WebElement assignmentname;
	@FindBy(xpath = "//*[@class='assignmentname']")
	WebElement clicksAssignment;
	@FindBy(xpath = "//*[@class='AddNewassignmentbutton']")
	WebElement clickAddNewassignmentbutton;
	@FindBy(xpath = "//*[@class='Studentbutton']")
	WebElement clicksStudentbutton;
	
	public ManageAssignment() {
		PageFactory.initElements(driver, this);
		
	}
	// method to select assignment in home page
		public void navigateToassignment() {
			assignment.click();
		}
		public void navigateTosearchBox() {
			searchBox.click();
		}
		public void assignmentbutton() {
			assignmentbutton.click();
		}
		public void Addnewassignmentbutton() {
			assignmentbutton.click();
		}
		public void clicksassignmentbutton() {
			assignmentbutton.click();
		}
		public void clicksEditbutton() {
			clickassignmentbutton.click();
		}
		public void clickdeletebutton() {
			clickdeletebutton.click();
		}
		public void assignmentbutton1() {
			clickassignmentbutton.click();
		}
		public void clicksdeletebutton() {
			clicksdeletebutton.click();
		}
		public void clickAddNewassignmentbutton() {
			clickAddNewassignmentbutton.click();
		}
		public void clicksStudentbutton() {
			clicksStudentbutton.click();
		}
		
		
		//Verify landing in manage assignment page
		public String manageAssignment() {
			return assignment.getAttribute("Admin is on dashboard page after login");
		}

		// Admin is on dashboard page after Login
		public String getdashboardpageafterLogin() {
			return assignment.getAttribute("Get the response time for navigation from dashboard page to manage assignment pagee");
		}
		
		//capture the response time to navigate to manage assignment page
		public String dashboardpageafterLogin() {
			return assignment.getAttribute("apture the response time to navigate to manage assignment page");
		}
		
		//Verify manage assignment page Header
				public String afterLogin() {
					return assignment.getAttribute("Admin should see header with Manage assignment");
				}
				
		//Validate text in manage assignment page
				public String dashboardpageafterLogin1() {
					return assignment.getAttribute("correct spelling for the all the fields");
				}
				
				//Verify delete icon below the header
				public String dashboardpageafterLogin2() {
					return assignment.getAttribute("disabled delete icon below the \"Manage assignment\"");
				}

				
				//Verify search bar on the manage assignment page
				public String dashboardpageafterLogin3() {
					return assignment.getAttribute("search bar on the manage assignment page");
				}
				
				//Verify add new assignment button on manage assignment page
				public String dashboardpageafterLogin4() {
					return assignment.getAttribute("Add New assignment button on the manage assignment pagee");
				}
				
				//Verify data table on the manage assignment page
				public String dashboardpageafterLogin5() {
					return assignment.getAttribute("manage assignment page With following column headers");
				}
				
				//VVerify Edit icon when no data in the table
				public String dashboardpageafterLogin6() {
					return assignment.getAttribute("Edit Icon will not be present in data table");
				}
		// method to enter the username value
		public void enterValidUsername(DataTable dataTable) {
			List<Map<String, String>> userDetail = dataTable.asMaps(String.class, String.class);
			for (Map<String, String> form : userDetail) {
				String user = form.get("username");
				LoggerLoad.info("The User enters the username as : " + user);
				username.sendKeys(user);
			}

		}
		
		

		// method to enter the password value
		public void enterValidPassword(DataTable datatable) {
			List<Map<String, String>> pwdDetail = datatable.asMaps(String.class, String.class);
			for (Map<String, String> form : pwdDetail) {
				String pwd = form.get("password");
				LoggerLoad.info("The User enters the password as : " + pwd);
				password.sendKeys(pwd);
			}
		}

		// method to enter password confirmation value
		public void enterValidPwdConfirm(DataTable datatable) {
			List<Map<String, String>> pwdConfirmDetail = datatable.asMaps(String.class, String.class);
			for (Map<String, String> form : pwdConfirmDetail) {
				String passwordConfirm = form.get("password confirmation");
				LoggerLoad.info("The User enters the password confirmation as : " + passwordConfirm);
				pwdConfirm.sendKeys(passwordConfirm);
			}
		}

		public String getErrorMsg() {
			String error = null;
			try {
				error = alertMsg.getText();
			} catch (NoSuchElementException e) {
				e.printStackTrace();
				LoggerLoad.info("No Such Element Found");

			}
			return error;

		}

		// Verify the title of the page
		public String verifyPageTitle() {
			String pageTitle = driver.getTitle();
			return pageTitle;

		}
		
		//method to get the message
		public String getMsg() {
			String msg = null;
			try {
				msg = alertMsg.getText();
			} catch (NoSuchElementException e) {
				e.printStackTrace();
				LoggerLoad.info("No Such Element Found");

			}
			return msg;

		}
		//method to click signout link
		public void clickSignOutLink() {		
			signout.click();
			
		}
	
}
