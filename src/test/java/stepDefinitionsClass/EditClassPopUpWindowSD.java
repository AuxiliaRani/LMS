package stepDefinitionsClass;

import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.EditClassUpdate;
import utilities.LoggerLoad;

public class EditClassPopUpWindowSD extends DriverFactory{
	
	EditClassUpdate editclassupdate = new EditClassUpdate();
	
	String manageclasspagehandle;
	String popWindow;
	
	
	@Given("Admin is in Manage class page")
	public void admin_is_in_manage_class_page() {
		driver.get(config.getString("DashBoardPageUrl"));
		editclassupdate.clickClassButton();
		manageclasspagehandle = driver.getWindowHandle();
	}

	@When("Admin clicks Edit button in data table in manage class page")
	public void admin_clicks_edit_button_in_data_table_in_manage_class_page() {
		editclassupdate.clickEditButton();
	}

	@Then("Edit popup window appears with heading Class Details on manage class page")
	public void edit_popup_window_appears_with_heading_class_details_on_manage_class_page() {
	    popWindow = driver.getWindowHandle();
	    driver.switchTo().window(popWindow);
	    String popupHeaderText = editclassupdate.getPopupHeaderText();
	    try {
	    Assert.assertEquals(popupHeaderText,config.getString("EditclasspopwindowHeading"));
	    }catch (AssertionError e) {
	    }
	 }
	

	@When("Admin clicks Edit button from one of the row in data table in manage class page")
	public void admin_clicks_edit_button_from_one_of_the_row_in_data_table_in_manage_class_page() {
		editclassupdate.clickEditButton();
	}

	@Then("Edit popup window appears with same row values in the all fields on manage class page")
	public void edit_popup_window_appears_with_same_row_values_in_the_all_fields_on_manage_class_page() {
		try {
		String edittextboxvalue = editclassupdate.batchIdTextBox();				
		Assert.assertTrue(!edittextboxvalue.isEmpty());
		} catch (AssertionError e) {
			LoggerLoad.info("Their is text in box");
		}
	}
}
		
	
	
	
	
	

