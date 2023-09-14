package stepDefinitionsProgram;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myHooks.Hooks;
import pageObjects.ProgramModule;

public class Pagination_SD {
	Hooks hooks;
	ProgramModule programModule;
	
	public Pagination_SD(Hooks hooks)
	{
		this.hooks=hooks;
		this.programModule = hooks.getProgramModuleObject();
	}
	
	@Given("Admin is on Manage Program page to verify pagination")
	public void admin_is_on_manage_program_page_to_verify_pagination() {
	    
		programModule.navigateToProgam();
	}

	@When("Admin clicks Next page link on the program table in Program Page")
	public void admin_clicks_next_page_link_on_the_program_table_in_program_page() {
	    
		programModule.clickOnNextLinkProgpg();
	}

	@Then("Admin should see the Pagination has {string} link  in Program Page")
	public void admin_should_see_the_pagination_has_link_in_program_page(String Next) {
		String actmsg=programModule.checkPaginationTextProgpg();
		assertEquals(actmsg,Next);
	    
	}

	@When("Admin clicks Last page link of  Program Page")
	public void admin_clicks_last_page_link_of_program_page() {
		programModule.lastEnabledLinkProgpg();
	    
	}

	@Then("Admin should see the last page record on the table with Next page link are disabled in Program Page")
	public void admin_should_see_the_last_page_record_on_the_table_with_next_page_link_are_disabled_in_program_page() {
		boolean isenabled=programModule.clickOnNextLinkProgpgEnabled();
		assertEquals(false,isenabled);
	}

	@Given("Admin is on last page of Program table")
	public void admin_is_on_last_page_of_program_table() {
		programModule.lastEnabledLinkProgpg();
	    
	}

	@When("Admin clicks First page link of Program Page")
	public void admin_clicks_first_page_link_of_program_page() {
		programModule.firstEnabledLinkProgpg();
	    
	}
	@Then("Admin should see the very first page record on the table with Previous page link are disabled in Program Page")
	public void admin_should_see_the_very_first_page_record_on_the_table_with_previous_page_link_are_disabled_in_program_page() {
	    
		boolean isenabled=programModule.clickOnPreviousLinkProgpgEnabled();
		assertEquals(false,isenabled);
		
	}
	
	@Given("Admin is on Previous Program page")
	public void admin_is_on_previous_program_page() {
		programModule.lastEnabledLinkProgpg();
	    
	}

	@When("Admin clicks Start page link Program Page")
	public void admin_clicks_start_page_link_program_page() {
		programModule.clickOnPreviousLinkProgpg();
	    
	}
	@Then("Admin should see the previous page record on the table with pagination has previous page link in Program Page")
	public void admin_should_see_the_previous_page_record_on_the_table_with_pagination_has_previous_page_link_in_program_page() {
		boolean isenabled= programModule.clickOnPreviousLinkProgpgEnabled();
		assertEquals(true,isenabled);
		boolean isenabled1 = programModule.clickOnNextLinkProgpgEnabled();
		assertEquals(true,isenabled1);
		int pagenum=programModule.checkHighLightedPageNumberProgpg();
		assertEquals(pagenum,pagenum-1);
	}
	}

	


