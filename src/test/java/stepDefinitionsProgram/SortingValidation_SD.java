package stepDefinitionsProgram;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myHooks.Hooks;
import pageObjects.ProgramModule;

public class SortingValidation_SD {
	
	Hooks hooks;
	ProgramModule programModule;
	
	public SortingValidation_SD(Hooks hooks)
	{
		this.hooks=hooks;
		this.programModule = hooks.getProgramModuleObject();
	}

	@Given("Admin is on Manage Program page  to verify sort icon of program name columns")
	public void admin_is_on_manage_program_page_to_verify_sort_icon_of_program_name_columns() {
		programModule.navigateToProgam();
	    
	}

	@When("Admin clicks the sort icon of program name column")
	public void admin_clicks_the_sort_icon_of_program_name_column() {
		programModule.setProgramNameAscProgpg();
	    
	}

	@Then("The data get sorted on the table based on the program name column values in ascending order  in Program Page")
	public void the_data_get_sorted_on_the_table_based_on_the_program_name_column_values_in_ascending_order_in_program_page() throws InterruptedException {
		String sortingDesc = programModule.checkNameColoumnSorting();
		Assert.assertEquals(sortingDesc, "Ascending");
	    
	}

	@Given("The data is in the ascending order on the table based on Program Name column")
	public void the_data_is_in_the_ascending_order_on_the_table_based_on_program_name_column() {
		programModule.navigateToProgam();
	    
	}

	@When("Admin clicks the sort icon of program name column for descending order in Program Page")
	public void admin_clicks_the_sort_icon_of_program_name_column_for_descending_order_in_program_page() {
	    
		programModule.setProgramNameDescProgpg();
	}

	@Then("The data get sorted on the table based on the program name column values in descending order in Program Page")
	public void the_data_get_sorted_on_the_table_based_on_the_program_name_column_values_in_descending_order_in_program_page() throws InterruptedException {
		String sortingDesc = programModule.checkNameColoumnSorting();
		Assert.assertEquals(sortingDesc, "Descending");
	    
	}
//////////////////////////////////////////
	@Given("Admin is on Manage Program page to verify sort icon of program Desc column")
	public void admin_is_on_manage_program_page_to_verify_sort_icon_of_program_desc_column() {
		programModule.navigateToProgam();
	    
	}

	@When("Admin clicks the sort icon of program asce column")
	public void admin_clicks_the_sort_icon_of_program_asce_column() {
	    
		programModule.setProgramDescriptionAscProgpg();
	}

	@Then("The data get sorted on the table based on the program description column values in ascending order in Program Page")
	public void the_data_get_sorted_on_the_table_based_on_the_program_description_column_values_in_ascending_order_in_program_page() throws InterruptedException {
		String sortingDesc = programModule.checkProgramDescriptionColoumnSorting();
		Assert.assertEquals(sortingDesc, "Ascending");
	}

	@Given("The data is in the ascending order on the table based on Program Description column")
	public void the_data_is_in_the_ascending_order_on_the_table_based_on_program_description_column() {
		programModule.navigateToProgam();
	    
	}

	@When("Admin clicks the sort icon of program Desc column")
	public void admin_clicks_the_sort_icon_of_program_desc_column() {
		programModule.setProgramDescriptionDescProgpg();
	    
	}

	@Then("The data get sorted on the table based on the program description column values in descending order in Program Page")
	public void the_data_get_sorted_on_the_table_based_on_the_program_description_column_values_in_descending_order_in_program_page() throws InterruptedException {
	    
		String sortingDesc = programModule.checkProgramDescriptionColoumnSorting();
		Assert.assertEquals(sortingDesc, "Descending");
	}

	@Given("Admin is on Manage Program page to verify sort icon of program Status column")
	public void admin_is_on_manage_program_page_to_verify_sort_icon_of_program_status_column() {
		programModule.navigateToProgam();
	}

	@When("Admin clicks the sort icon of program Status column to verify ascending order in program page")
	public void admin_clicks_the_sort_icon_of_program_status_column_to_verify_ascending_order_in_program_page() {
	    
		programModule.setProgramStatusAscProgpg();
	}

	@Then("The data get sorted on the table based on the program status column values in ascending order in Program Page")
	public void the_data_get_sorted_on_the_table_based_on_the_program_status_column_values_in_ascending_order_in_program_page() throws InterruptedException {
		String sortingDesc = programModule.checkProgramStatusColoumnSorting();
		Assert.assertEquals(sortingDesc, "Ascending");
	    
	}

	@Given("The data is in the ascending order on the table based on Program Status column")
	public void the_data_is_in_the_ascending_order_on_the_table_based_on_program_status_column() {
		programModule.navigateToProgam();
	    
	}

	@When("Admin clicks the sort icon of program Status column to verify descending order in program page")
	public void admin_clicks_the_sort_icon_of_program_status_column_to_verify_descending_order_in_program_page() {
		programModule.setProgramStatusDescProgpg();
	    
	}

	@Then("The data get sorted on the table based on the program status column values in descending order in Program Page")
	public void the_data_get_sorted_on_the_table_based_on_the_program_status_column_values_in_descending_order_in_program_page() {
	    
		String sortingDesc = programModule.checkProgramStatusColoumnSorting();
		Assert.assertEquals(sortingDesc, "Descending");
	}

}
