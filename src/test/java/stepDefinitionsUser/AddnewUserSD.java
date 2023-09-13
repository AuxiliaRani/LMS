package stepDefinitionsUser;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Userpage;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class AddnewUserSD extends DriverFactory{
	
String excelpath=ConfigReader.getExcelFilePath();;
	
@Given("A new pop up with user details appears")
	public void a_new_pop_up_with_user_details_appears() {
		boolean isPopupDisplayed = Userpage.isPopupDisplayed();
try {
        Assert.assertTrue("User details pop-up is not displayed.", isPopupDisplayed);
	} catch (AssertionError e) {
		LoggerLoad.error("Assertion failed: " + e.getMessage());
	}}

	@Then("The pop up should include the fields First Name,Middle name, Last Name, Location phone, email,linkedin Url,Undergraduate,postgraduate,time zone and user comments as text box User Role, Role status, visa status as drop down")
	public void the_pop_up_should_include_the_fields_first_name_middle_name_last_name_location_phone_email_linkedin_url_undergraduate_postgraduate_time_zone_and_user_comments_as_text_box_user_role_role_status_visa_status_as_drop_down() {
		try {
		
			Assert.assertTrue("First Name field is missing.", Userpage.getFirstNameField().isDisplayed());
		
        Assert.assertTrue("Middle Name field is missing.", Userpage.getMiddleNameField().isDisplayed());
        Assert.assertTrue("Last Name field is missing.", Userpage.getLastNameField().isDisplayed());
        Assert.assertTrue("location field is missing.", Userpage.getLocationField().isDisplayed());
        Assert.assertTrue("phone field is missing.", Userpage.getPhoneField().isDisplayed());
        Assert.assertTrue("Linkedin url field is missing.", Userpage.getLinkdinUrlField().isDisplayed());
        Assert.assertTrue("undergraduate field is missing.", Userpage.getUndergraduateField().isDisplayed());
        Assert.assertTrue("postgraduate is missing.", Userpage.getPostgraduateField().isDisplayed());
        Assert.assertTrue("Timezone field is missing.", Userpage.getTimezoneField().isDisplayed());
        Assert.assertTrue("Usercomments field is missing.", Userpage.getUsercommentsField().isDisplayed());
        Assert.assertTrue("UserRole field is missing.", Userpage.getUserroleField().isDisplayed());
        Assert.assertTrue("Rolestatus field is missing.", Userpage.getRoleStatusField().isDisplayed());
        Assert.assertTrue("Visa status field is missing.", Userpage.getVisastatusField().isDisplayed());
		
		
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	@When("Fill in all the fields {string},{int}")
	public void fill_in_all_the_fields(String sheetName, Integer rownumber) throws InvalidFormatException, IOException {
	    ExcelReader reader= new ExcelReader();
	   
	    List<Map<String,String>>testdata=reader.getData(excelpath, sheetName);
	    
	    String Field=testdata.get(rownumber).get("firstname");
	    String value=testdata.get(rownumber).get("lastname");
	    String Location=testdata.get(rownumber).get("location");
	    String Phone =testdata.get(rownumber).get("phone");
	    
	    Userpage.UserRoleselect();
	    Userpage.UserStatusselect();
	    Userpage.VisaStatusselect();
	}

	@When("click submit")
	public void click_submit() {
	    Userpage.clickuserSubmit();
	}


	@Then("The newly added user should be present in the data table in Manage User page")
	public void the_newly_added_user_should_be_present_in_the_data_table_in_manage_user_page() {
		String newlyAddedUser =ConfigReader.getnewuser(); 

        
        boolean isNewUserPresent;
		
			isNewUserPresent = Userpage.isNewUserPresentInTable(newlyAddedUser);

			

		try {
        Assert.assertTrue("The newly added user is not present in the data table.", isNewUserPresent);
	} catch (Exception e) {
		e.printStackTrace();}}
	
	
	@When("Fill in all the fields with valid values  {string},\"{int}\"and click submit")
	public void fill_in_all_the_fields_with_valid_values_and_click_submit(String sheetName, Integer rownumber)throws InvalidFormatException, IOException {
		ExcelReader reader= new ExcelReader();
		   
		    List<Map<String,String>>testdata=reader.getData(excelpath, sheetName);
		    
		    String Firstname=testdata.get(rownumber).get("firstname");
		    String Lastname=testdata.get(rownumber).get("lastname");
		    String Location=testdata.get(rownumber).get("location");
		    String Phone =testdata.get(rownumber).get("phone");
		    String linkedinurl=testdata.get(rownumber).get("linkedinurl");
		    String usercomments =testdata.get(rownumber).get("usercomments");
		    String postgraduate =testdata.get(rownumber).get("postgraduate");
		    String undergraduate =testdata.get(rownumber).get("undergraduate");
		    Userpage.UserRoleselect();
		    Userpage.UserStatusselect();
		    Userpage.VisaStatusselect();
		    Userpage.clickuserSubmit();
	}

	@When("any of the fields have invalid values\"<sheetname>\",{string}")
	public void any_of_the_fields_have_invalid_values_sheetname(String sheetName ,int rownumber) throws InvalidFormatException, IOException {
		ExcelReader reader= new ExcelReader();
		   // String sheetname= sheet1;
		    List<Map<String,String>>testdata=reader.getData(excelpath, sheetName);
		    
		    String Firstname=testdata.get(rownumber).get("firstname");
		    String Lastname=testdata.get(rownumber).get("lastname");
		    String Location=testdata.get(rownumber).get("location");
		    String Phone =testdata.get(rownumber).get("phone");
		    String linkedinurl=testdata.get(rownumber).get("linkedinurl");
		    String usercomments =testdata.get(rownumber).get("usercomments");
		    String postgraduate =testdata.get(rownumber).get("postgraduate");
		    String undergraduate =testdata.get(rownumber).get("undergraduate");
		    Userpage.UserRoleselectstudent();
		    Userpage.UserStatusselect();
		    Userpage.VisaStatusselect();
		    Userpage.clickuserSubmit();
	}
	@Then("Error message should appear")
	public void error_message_should_appear() {
		boolean isErrormsgDisplayed = Userpage.isErrorMsgDisplayed();

        Assert.assertTrue("Error Msg is not displayed.", isErrormsgDisplayed);
	}
	

	@When("Any of the mandatory fields are blank {string},{string}")
	public void any_of_the_mandatory_fields_are_blank(String sheetName, int rownumber) throws InvalidFormatException, IOException {
		ExcelReader reader= new ExcelReader();
		 
		    List<Map<String,String>>testdata=reader.getData(excelpath, sheetName);
		    
		     String Firstname=("");
		    String Lastname=testdata.get(rownumber).get("lastname");
		    String Location=testdata.get(rownumber).get("location");
		    String Phone =testdata.get(rownumber).get("phone");
		    String linkedinurl=testdata.get(rownumber).get("linkedinurl");
		    String usercomments =testdata.get(rownumber).get("usercomments");
		    String postgraduate =testdata.get(rownumber).get("postgraduate");
		    String undergraduate =testdata.get(rownumber).get("undergraduate");
		    Userpage.UserRoleselect();
		    Userpage.UserStatusselect();
		    Userpage.VisaStatusselect();
		
		
	}

	@Then("Error message should appear for Userpage with mandatoryfieldblank")
	public void error_message_should_appear_for_userpage_with_mandatoryfieldblank() {
		boolean isErrormsgDisplayed = Userpage.isErrorMsgDisplayed();

        Assert.assertTrue("Error Msg is not displayed.", isErrormsgDisplayed);
	}
	}


	

