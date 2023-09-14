package baseClass;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver;
	public Properties prop;

	// public static ThreadLocal<WebDriver> tdriver=new ThreadLocal<WebDriver>();

	public WebDriver driverlaunchApp() throws InterruptedException, IOException {
	
			prop = new Properties();
			String conPath = System.getProperty("user.dir")+"/src/test/resources/config/Config.properties";
			FileInputStream input = new FileInputStream(conPath);
			prop.load(input);
		
	
			String browserName = prop.getProperty("browser");
			System.out.println(browserName);

			if(driver==null) 
			{
				if (browserName.equalsIgnoreCase("Chrome")) {
					WebDriverManager.chromedriver().setup();
					driver=new ChromeDriver();
				} else if (browserName.equalsIgnoreCase("FireFox")) {
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
				} else if (browserName.equalsIgnoreCase("Edge")) {
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver(); 
					} 
				
				// Maximize the screen
				driver.manage().window().maximize();

				//Delete all the cookies
				driver.manage().deleteAllCookies();

				// Launching the URL
				driver.get(prop.getProperty("url"));
				
				//Global wait for 10sec
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				//tdriver.set(driver);
			
			}
		//return getDriver();
		return driver;
	}
	/*
	 * public static synchronized WebDriver getDriver() { return tdriver.get(); }
	 * 
	 * 
	 * public void failedTest1(String methodName) throws IOException { try { File
	 * source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 * 
	 * String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new
	 * Date(0)); String path = System.getProperty("user.dir") + "/ScreenShots/" +
	 * methodName + "/screenshot_" + timestamp+ ".jpeg";
	 * 
	 * FileUtils.copyFile(source, new File(path)); } catch(Exception e) {
	 * e.printStackTrace(); } }
	 * 
	 * 
	 * public void tearDown() { driver.quit(); }
	 */

	
	
	public void tearDown() 
	{ 
		driver.quit();
	}
}