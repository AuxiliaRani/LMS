package utilities;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ConfigReader {

	public static Properties prop;
	//public final static String propertyFilePath = "./src/test/resources/config/config.properties";//auxi
	public final static String propertyFilePath = "./src/test/resources/config.properties"; //sudha

	// method to find and load the config.properties file
	public static void loadConfig() {

		try {

			FileInputStream Fis = new FileInputStream(propertyFilePath);
			prop = new Properties();
			try {
				prop.load(Fis);
				Fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("config.properties not found at " + propertyFilePath);
		}
	}

	// method to get the browser type(chrome,firefox,etc.,)
	public static String getBrowserType() {
		String browser = prop.getProperty("browser");
		System.out.println("==========Sudhabrowser============"+browser);
		if (browser != null) {
			return browser;
		} else {
			throw new RuntimeException("browser not specified in config.properties file");
		}
	}

	// method to get the application url
	public static String getApplicationUrl() {
		String url = prop.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the config.properties file.");
	}

	// method to get the home page url
	public static String getHomePage() {
		String homepage = prop.getProperty("homepage");
		if (homepage != null) {
			return homepage;
		} else {
			throw new RuntimeException("homepage not specified in the config.properties file.");
		}
	}
	
	// method to get the login page url
		public static String getLoginPage() {
			String loginpage = prop.getProperty("loginpage");
			if (loginpage != null) {
				return loginpage;
			} else {
				throw new RuntimeException("loginpage not specified in the config.properties file.");
			}
		}
		/* 
		 * Used ResourceBUndle to read dashboard/manageclass/addclass url from config.properties file
		// method to get the DashBoard page url
				public static String getDashBoardPage() {
					String DashBoardPageUrl = prop.getProperty("DashBoardPageUrl");
					if (DashBoardPageUrl != null) {
						return DashBoardPageUrl;
					} else {
						throw new RuntimeException("DashBoardPageUrl not specified in the config.properties file.");
					}
				}
				
				// method to get the ManageClass page url
				public static String ManageClassesPageUrl() {
					String ManageClassesPageUrl = prop.getProperty("DashBoardPageUrl");
					if (ManageClassesPageUrl != null) {
						return ManageClassesPageUrl;
					} else {
						throw new RuntimeException("ManageClassesPageUrl not specified in the config.properties file.");
					}
				}
				
				// method to get the AddClass page url
				public static String AddClassesPageUrl() {
					String AddClassesPageUrl = prop.getProperty("DashBoardPageUrl");
					if (AddClassesPageUrl != null) {
						return AddClassesPageUrl;
					} else {
						throw new RuntimeException("AddClassesPageUrl not specified in the config.properties file.");
					}
				}
				*/
		
		
		
		// method to get the excel file path
				public static String getExcelFilePath() {
					String excelfilepath = prop.getProperty("excelfilepath");
					if (excelfilepath != null) {
						return excelfilepath;
					} else {
						throw new RuntimeException("excelfilepath not specified in the config.properties file.");
					}
				}
	
	

}
