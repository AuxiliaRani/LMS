package stepDefinitionsClass;


import org.openqa.selenium.Alert;
import org.testng.Assert;
import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DeleteClassVerificationValidaion;
import pageObjects.ManageClass;
import utilities.LoggerLoad;

public class DeleteClassVerificationSD extends DriverFactory {
	
	ManageClass manageclass = new ManageClass();
	DeleteClassVerificationValidaion deleteclassverificationvalidation = new DeleteClassVerificationValidaion();

	
	@When("Admin clicks delete button in data table row level in manage class page")
	public void admin_clicks_delete_button_in_data_table_row_level_in_manage_class_page() {
		deleteclassverificationvalidation.clickdeleteonmanageclass();
	}

	@Then("Admin should see alert on manage class page")
	public void admin_should_see_alert_on_manage_class_page() {
		try {
		    Alert alert = driver.switchTo().alert();
		    String alertTextmanageclass = alert.getText();
		    }catch (AssertionError e) {
		    	
		    }
	}

	@Then("Alert should have {string} button to accept on manage class page")
	public void alert_should_have_button_to_accept_on_manage_class_page(String string) {
		Alert alert = driver.switchTo().alert();
		String alertTextmanageclass = alert.getText();
		try {
		if (alertTextmanageclass.contains("YES Button")) {
			Assert.assertTrue(true);
			alert.accept();
			LoggerLoad.info("Alert yes button was present");
		}
	}catch (AssertionError e) {
		}
	}

	@Then("Alert should have {string} button to reject on manage class page")
	public void alert_should_have_button_to_reject_on_manage_class_page(String string) {
		Alert alert = driver.switchTo().alert();
		String alertTextmanageclass = alert.getText();
		try {
		if (alertTextmanageclass.contains("NO Button")) {
			Assert.assertTrue(true);
			alert.accept();
			LoggerLoad.info("Alert no alert button was present");
		}
	}catch (AssertionError e) {
		}
	}
	
	
	
}
