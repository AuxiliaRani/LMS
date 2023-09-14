
package stepDefinitionsProgram;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myHooks.Hooks;
import pageObjects.BatchModule;
import pageObjects.ProgramModule;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class ManageProgramValidation_1_SD {

	Hooks hooks;
	ProgramModule programModule;
	
	public ManageProgramValidation_1_SD(Hooks hooks)
	{
		this.hooks=hooks;
		this.programModule = hooks.getProgramModuleObject();
	}
	
	@Given("Admin is on dashboard page after Login to validate  Program Page")
	public void admin_is_on_dashboard_page_after_login_to_validate_program_page() {
		String dashBoardURL = ConfigReader.getDashboardURL();
	    
	}

	@When("Admin clicks Program on the navigation bar on Program Page")
	public void admin_clicks_program_on_the_navigation_bar_on_program_page() {
		programModule.programbutton();
	    
	}

	@Then("Admin should see URL with {string}")
	public void admin_should_see_url_with(String string) {
	    
		
		String batchUrl = programModule.getCurrentUrl();
		try {
			Assert.assertTrue(batchUrl.contains("Manage program"));
		} catch (Exception e) {
			LoggerLoad.info(e.getMessage());
		}
	}



	@Then("Admin should see header text as {string} on Program Page")
	public void admin_should_see_header_text_as_on_program_page(String string) {
	    
		programModule.verifyPageTitle();
	}

}
