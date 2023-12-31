package runner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty", "html:target/CucumberReport/LMSCucumberReport.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, // reporting purpose
		monochrome = false, // console output
		tags = "", // tags from feature file
		features = { "src/test/resources/features" }, // location of feature files



		glue = { "stepDefinitionsMainLoginPage", "stepDefinitionsDashboardPage", "stepDefinitionsStudent",
				"stepDefinitionsProgram", "stepDefinitionsBatch", "stepDefinitionsClass", "stepDefinitionsUser",
				"stepDefinitionsAssignment", "stepDefinitionsAttendance", "myHooks" }) // location of step definition
																						// files




public class TestRunner extends AbstractTestNGCucumberTests {
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}

}


