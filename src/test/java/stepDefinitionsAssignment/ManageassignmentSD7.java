package stepDefinitionsAssignment;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.config.Config;
import pageObjects.ManageAssignment;
import utilities.LoggerLoad;

public class ManageassignmentSD7 {

	
	@Given("Admin is in manage assignment page")
	public void Admin_is_in_manage_assignment_page() {
		System.out.format("Admin is in manage assignment page");
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("ManageClassesPageUrl");
	}
	@When("Admin clicks delete button in data table row level")
	public void Admin_clicks_delete_button_in_data_table_row_level() {
		System.out.format("Admin clicks delete button in data table row level");
	}
	@Then("Admin should see dialog box")
	public void Admin_should_see_dialog_box() {
		System.out.format("Admin should see dialog box");
		LoggerLoad.info("Admin should see dialog box ");
		try {
			ManageAssignment.Admin_should_see_dialog_box();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
	
	@When("Admin clicks delete button in data table row level")
	public void Admin_Clicks_delete_button_in_data_table_row_level() {
		System.out.format("Admin clicks delete button in data table row level");
	}
	@Then("Alert should have yes button to accept")
	public void Alert_should_have_yes_button_to_accept() {
		System.out.format("Alert should have yes button to accept");
		LoggerLoad.info("Admin should see dialog box ");
		try {
			ManageAssignment.Admin_should_see_dialog_box();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
	@When("Admin clicks delete button in data table row level")
	public void Admin_Clicks_Delete_button_in_data_table_row_level() {
		System.out.format("Admin clicks delete button in data table row level");
	}
	@Then("Alert should have No button to reject")
	public void Alert_should_have_No_button_to_reject() {
		System.out.format("Alert should have No button to reject");
		LoggerLoad.info("Alert should have No button to reject ");
		try {
			ManageAssignment.Alert_should_have_No_button_to_reject();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}

}
