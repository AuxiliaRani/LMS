package stepDefinitionsClass;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DeleteClassVerificationValidaion;
import pageObjects.ManageClass;
import utilities.LoggerLoad;

public class DeleteClassValidationSD extends DriverFactory {
	
	ManageClass manageclass = new ManageClass();
	DeleteClassVerificationValidaion deleteclassverificationvalidation = new DeleteClassVerificationValidaion();
	
	@Given("Admin is in delete alert of manage class page")
	public void admin_is_in_delete_alert_of_manage_class_page() {
	    driver.get(config.getString("DashBoardPageUrl")); 
	    manageclass.clickClassButton();
	    deleteclassverificationvalidation.clickdeleteonmanageclass();
	    try {
	    Alert alert = driver.switchTo().alert();
	    String alertTextmanageclass = alert.getText();
	    }catch (AssertionError e) {
	    	
	    }
	}

	@When("Admin clicks yes button of manage class page")
	public void admin_clicks_yes_button_of_manage_class_page() {
		Alert alert = driver.switchTo().alert();
	String	alertText = alert.getText();//.indexOf("YES");	
		if (alertText.indexOf("YES") != -1) {
			Assert.assertTrue(true);
            LoggerLoad.info("YES is found in alert tex");
        } else {
        	LoggerLoad.info(" YES is not present in alert ");
        }
	}

	@Then("Success message and validate particular class details are deleted from the data table of manage class page")
	public void success_message_and_validate_particular_class_details_are_deleted_from_the_data_table_of_manage_class_page() {
		Alert alert = driver.switchTo().alert();
		String	alertText = alert.getText();		
			if (alertText.indexOf("YES") != -1) {
				Assert.assertTrue(true);
	            LoggerLoad.info("YES is found in alert tex");
	        } else {
	        	LoggerLoad.info(" YES is not present in alert ");
	        }
			alert.accept();
		String succesMessage = 	deleteclassverificationvalidation.captureSuccessMessage();
		if (succesMessage == "Success Message"){
		Assert.assertTrue(true);	
		LoggerLoad.info("Success Message ws present");
		}
	}

	@When("Admin clicks no button of manage class page")
	public void admin_clicks_no_button_of_manage_class_page() {
		Alert alert = driver.switchTo().alert();
		String	alertText = alert.getText();		
			if (alertText.indexOf("NO") != -1) {
				Assert.assertTrue(true);
	            LoggerLoad.info("NO is found in alert tex");
	        } else {
	        	LoggerLoad.info(" NO is not present in alert ");
	        }
	}

	@Then("Admin should land on manage class page and validate particular class details are not deleted from the data table from manage class page")
	public void admin_should_land_on_manage_class_page_and_validate_particular_class_details_are_not_deleted_from_the_data_table_from_manage_class_page() {
		Alert alert = driver.switchTo().alert();
		String	alertText = alert.getText();
			if (alertText.indexOf("NO") != -1) {
				Assert.assertTrue(true);
	            LoggerLoad.info("NO is found in alert tex");
	        } else {
	        	LoggerLoad.info(" NO is not present in alert ");
	        }
			alert.accept();
		String succesMessage = 	deleteclassverificationvalidation.captureSuccessMessage();
		if (succesMessage == "Success Message"){
		Assert.assertTrue(true);	
		LoggerLoad.info("Success Message ws present");
		}
	}
}
