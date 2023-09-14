package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static Properties prop;
//	public final static String propertyFilePath = "./src/test/resources/config/config.properties";
	public final static String propertyFilePath = "./src/test/resources/config.properties";


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
		if (browser != null) {
			return browser;
		} else {
			throw new RuntimeException("browser not specified in config.properties file");
		}
	}

	// method to get the invalid url
	public static String getInvalidUrl() {
		String invalidurl = prop.getProperty("invalidUrl");
		if (invalidurl != null)
			return invalidurl;
		else
			throw new RuntimeException("url not specified in the config.properties file.");
	}

	
	// method to get the Dashboard url
		public static String getDashboardURL() {
			String url = prop.getProperty("dashboard_url");
			if (url != null)
				return url;
			else
				throw new RuntimeException("url not specified in the config.properties file.");
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
		
		// method to get the excel file path
				public static String getExcelFilePath() {
					String excelfilepath = prop.getProperty("excelfilepath");
					if (excelfilepath != null) {
						return excelfilepath;
					} else {
						throw new RuntimeException("excelfilepath not specified in the config.properties file.");
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

	// method to get the excel file path
	public static String getExcelFilePath() {
		String excelfilepath = prop.getProperty("excelfilepath");
		if (excelfilepath != null) {
			return excelfilepath;
		} else {
			throw new RuntimeException("excelfilepath not specified in the config.properties file.");
		}
	}
	
	public static String getJsonFilePath() {
		String excelfilepath = prop.getProperty("jsonfilepath");
		if (excelfilepath != null) {
			return excelfilepath;
		} else {
			throw new RuntimeException("excelfilepath not specified in the config.properties file.");
		}
	}
	
	public static String getDashboardURL() {
		String urlPath = prop.getProperty("dashboardurl");
		if (urlPath != null) {
			return urlPath;
		} else {
			throw new RuntimeException("dashboardurl not specified in the config.properties file.");
		}
	}
	/*
	 * Create Batch Inputs from config */
	
	public static String getBatchName() {
		return prop.getProperty("batchName");
	}
	
	public static String getNoOfClasses() {
		return prop.getProperty("noOfClasses");
	}
	public static String getProgramName() {
		return prop.getProperty("SDETPro");
	}
	public static String getInvalidBatchName() {
		return prop.getProperty("invalidBatchName");
	}
	public static String getblankBatchName() {
		return prop.getProperty("blankBatchName");
	}
	
}
