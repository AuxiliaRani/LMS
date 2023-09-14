
package myHooks;

import java.io.ByteArrayInputStream;
import java.util.ResourceBundle;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import factory.DriverFactory;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import pageObjects.BatchModule;
import pageObjects.ProgramModule;
import pageObjects.AttendanceModule;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class Hooks {
	
	public static WebDriver driver;

	public static DriverFactory driverfactory;
	private BatchModule batch;
	private ProgramModule pm;
	public static ResourceBundle config = ResourceBundle.getBundle("config");//sudha
	private AttendanceModule attendance;



	@BeforeAll
	public static void before() throws Throwable {
		
		//Get browser Type from config file
		LoggerLoad.info("Loading Config file");
		ConfigReader.loadConfig();
		String browser = ConfigReader.getBrowserType();
       
		//Initialize driver from driver factory
		driverfactory = new DriverFactory();
		String browser = config.getString("browser");//coming from resourcebundle
		if (browser != null) {
			LoggerLoad.error( "browser is null ");
		} else {
			throw new RuntimeException("homepage not specified in the config.properties file.");
		}
		driver = driverfactory.initializeDrivers(browser);		
		LoggerLoad.info("Initializing driver for : "+browser);	
	}
	
	@Before
	public void scenario(Scenario scenario) {
		LoggerLoad.info("===============================================================================================");
		LoggerLoad.info(scenario.getSourceTagNames() +" : "+scenario.getName());

		LoggerLoad.info("-----------------------------------------------------------------------------------------------");

	}
	
	@AfterStep
	public void afterstep(Scenario scenario) {
		if (scenario.isFailed()) {
			LoggerLoad.error("Steps Failed , Taking Screenshot");
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "My screenshot");
			Allure.addAttachment("MyScreenshot",new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		}
	}
	
	
	
	@AfterAll
	public static void after() {
		LoggerLoad.info("Closing Driver");
		driverfactory.closeallDriver();
	}
	


	public void setBatchProgramModule() {
		batch=new BatchModule(driver);
		pm = new ProgramModule(driver);
	}
	
	public BatchModule getBatchModuleObject() {
		if (this.batch == null) {
			batch=new BatchModule(driver);
		}
		return batch;
	}
	
	public ProgramModule getProgramModuleObject() {
		if (this.pm == null) {
			pm=new ProgramModule(driver);
		}
		return pm;
	}

	
	

	public void setAttendanceModule() {
		attendance = new AttendanceModule(driver);
		
	}
	
	public AttendanceModule getAttendanceModuleObject() {
		return attendance;
	}
	

}



