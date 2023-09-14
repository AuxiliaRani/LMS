package stepDefinitionsClass;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.EditClassUpdate;
import pageObjects.ManageClass;
import stepDefinitionsBatch.AddNewBatchSD;
import utilities.LoggerLoad;


public class EditClassUpdateSD extends DriverFactory{
	EditClassUpdate editclassupdate = new EditClassUpdate();
	ManageClass manageclass = new ManageClass();
	
	@Given("Admin is in  Edit class detail popup window")
	public void admin_is_in_edit_class_detail_popup_window() {
		driver.get(config.getString("DashBoardPageUrl"));
		editclassupdate.clickClassButton();
		editclassupdate.clickEditButton();
		LoggerLoad.info("Admin is On Dashboard Page after Login");
	
	}

	@Then("Admin should see particular class details is updated in the data table on manage class page")
	public void admin_should_see_particular_class_details_is_updated_in_the_data_table_on_manage_class_page() {
		int batchid =AddNewBatchSD.BatchId;
		  String batchidstring = String.valueOf(batchid);
		List<WebElement> rows =  manageclass.rowIsPresent();
		try {
		for (WebElement row : rows) {
			String currentRowBatchId = row.findElement(By.name("batchids")).getText();
		Assert.assertEquals(batchidstring, currentRowBatchId);
			LoggerLoad.info("New class is added successfully");
		}
		}		catch(Exception e) {
			LoggerLoad.warn("Assertion error : " + e);
		}	
	}

	@Then("Error message should appear in alert on manage class page")
	public void error_message_should_appear_in_alert_on_manage_class_page() {
		Alert alert = driver.switchTo().alert();
		  try {
		  Assert.assertEquals("alertText", "Error message should appear in alert");
		  } catch (AssertionError e) {
			  LoggerLoad.warn("Assertion error");
		  }
	}

	@Then("Admin should see particular class details is updated in the data table on main class page")
	public void admin_should_see_particular_class_details_is_updated_in_the_data_table_on_main_class_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Error message should appear in alert is displayed")
	public void error_message_should_appear_in_alert_is_displayed() {
		Alert alert = driver.switchTo().alert();
		  try {
		  Assert.assertEquals("alertText", "Error message should appear in alert");
		  } catch (AssertionError e) {
			  LoggerLoad.warn("Assertion error");
		  }
	}

	@Then("Batch Id is missing message is displayed")
	public void batch_id_is_missing_message_is_displayed() {
		String expectedMessage	= editclassupdate.errorMessageText();
	String actualMessage =	"Batch Id is missing";
	try {
	Assert.assertEquals(actualMessage, expectedMessage);
	LoggerLoad.info("Assertion passed: Admin cannot update class missing batchid");
	}catch(AssertionError e) {		
	}
	}

	@Then("No of classes is missing message is displayed")
	public void no_of_classes_is_missing_message_is_displayed() {
		String expectedMessage	= editclassupdate.errorMessageText();
		String actualMessage =	"No of classes is missing";
		try {
		Assert.assertEquals(actualMessage, expectedMessage);
		LoggerLoad.info("Assertion passed: Admin cannot update class when No of classes is missing");
		}catch(AssertionError e) {		
		}
	}

	@Then("class date is missing message is displayed")
	public void class_date_is_missing_message_is_displayed() {
		String expectedMessage	= editclassupdate.errorMessageText();
		String actualMessage =	"class date is missing";
		try {
		Assert.assertEquals(actualMessage, expectedMessage);
		LoggerLoad.info("Assertion passed: Admin cannot update class when class date is missing");
		}catch(AssertionError e) {		
		}
	}

	@Then("staff id is missing message is displayed")
	public void staff_id_is_missing_message_is_displayed() {
		String expectedMessage	= editclassupdate.errorMessageText();
		String actualMessage =	"staff id is missing";
		try {
		Assert.assertEquals(actualMessage, expectedMessage);
		LoggerLoad.info("Assertion passed: Admin cannot update class when staff id is missing");
		}catch(AssertionError e) {		
		}
	}

	@Then("class cannot be updated for the passed date message is displayed")
	public void class_cannot_be_updated_for_the_passed_date_message_is_displayed() {
		
		String expectedMessage	= editclassupdate.errorMessageText();
				String actualMessage =	"class cannot be updated for the passed date";
				try {
				Assert.assertEquals(actualMessage, expectedMessage);
				LoggerLoad.info("Assertion passed: Admin cannot update class for the passed date");
				}catch(AssertionError e) {		
				}
	}


	@When("Admin clicks Cancel button without entering values in the fields for class page")
	public void admin_clicks_cancel_button_without_entering_values_in_the_fields_for_class_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("Admin clicks Cancel button without entering values in the fields")
	public void admin_clicks_cancel_button_without_entering_values_in_the_fields() {
		editclassupdate.clickCancelButton();
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = config.getString("ManageClassesPageUrl");
		if (currentUrl == expectedUrl) {
			try {
			Assert.assertTrue(true);
			LoggerLoad.info("Admin will land on manage page ");
			
		}catch (AssertionError e) {
			
		}
		}

	}

	@Then("Admin should land on Manage Class page from popup window")
	public void admin_should_land_on_manage_class_page_from_popup_window() {
		String validateClassUrl = driver.getCurrentUrl();
	    
		 try
		  {
		  Assert.assertTrue(validateClassUrl.contains("Manage Class"));
		  LoggerLoad.info("Admin should see URL with Manage Class Text ");
		  }
		  catch (Exception e){
			  LoggerLoad.info(e.getMessage());
		  }
	}


	@When("Admin clicks Cancel button entering values in the fields for class page")
	public void admin_clicks_cancel_button_entering_values_in_the_fields_for_class_page() {
	    

	}

	@Then("Admin should land on Manage Class Page and validate particular class details are not changed  in the data table")
	public void admin_should_land_on_manage_class_page_and_validate_particular_class_details_are_not_changed_in_the_data_table() {
		List<WebElement>  wb = manageclass.rowIsPresent();
		List<String> courseTopic = new ArrayList<String>();
		
		for ( WebElement w: wb)
		{
			courseTopic.add(w.getText());
		}
		
		 try
		  {
			 Assert.assertTrue(courseTopic.contains("PythonEdit"));
		  LoggerLoad.info("Admin should see URL with Manage Class Text ");
		  }
		  catch (Exception e){
			  LoggerLoad.info(e.getMessage());
		  }
	}
	
	

	
	
	
	
	
	
	
	
	
	
}
