package pageObjects;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import utilities.ExcelReader;

public class ManageClassSearchBox {
		
	public ManageClassSearchBox() {
		PageFactory.initElements(driver, this);
	}
	
	public static WebDriver driver = DriverFactory.getdriver();
	
	ExcelReader excelReader = new ExcelReader();
	
	
	@FindBy(xpath = ("//*[@id='searchbox']"))
	WebElement searchBox;
	
	//used to iterate all rows to find batchid,classno,classtopic,staffid,classdate in each row in classpage
	@FindBy(xpath = ("//*[@id=”datatable”]"))
	WebElement classtable;

	//batchId created in when statement & validation checked in class manageclasssearchboxsd.java 
	//creating batchid and passing to searchtextbox, then iterating eachrow to validate batchid created and present in page are same
	public String getBatchId() {

		String BatchName = null;
		String BatchDescription = null ;
		String ProgramName = null;
		String NoOfClasses = null;
		try {
			List<Map<String,String>> excelHeader = excelReader.getData(".\\src\\test\\resources\\Exceldata\\LMSTestData.xlsx", "ManageClass");			
			for ( Map<String,String> elements     : excelHeader) {	
			 BatchName = elements.get("BatchName");
			 BatchDescription = elements.get("Description");
			 ProgramName = elements.get("ProgramName");
			 NoOfClasses = elements.get("NoOfClasses");
			}
		} catch (InvalidFormatException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		driver.get("HTTPS://AddBatchesPageUrl.com");
		driver.findElement(By.id("BatchName")).sendKeys(BatchName);;
		driver.findElement(By.id("BatchDescription")).sendKeys(BatchDescription);;
		driver.findElement (By.id("ProgramName")).sendKeys(ProgramName);;
		driver.findElement(By.id("StatusActive")).click();
		driver.findElement(By.id("NumberOfClasses")).sendKeys(NoOfClasses.replaceAll("\"", ""));;
		driver.findElement(By.id("savebutton")).click();;		
	
		//Assuming batchid created will be always on 1 page and 1 row
		WebElement batchIdCreated = driver.findElement(By.xpath("//*[@id=”classtablebody”]/tbody/tr[1]/td[2]"));
		String batchIdCreatedInBatch = batchIdCreated.getText();
		return batchIdCreatedInBatch;
	}
	
	public void searchbox (String batchId ) {
		searchBox.sendKeys();
	}
	
	
	public List<WebElement> batchIdInEachRow() {
		List<WebElement> batchIdInRows = classtable.findElements(By.xpath(".//tr[position=0//batchid]"));
	return batchIdInRows;
	}	
	
	
	public String getInvalidBatchId() {		
		String InvalidBatchId = null;
		try {
			List<Map<String,String>> excelHeader = excelReader.getData(".\\src\\test\\resources\\Exceldata\\LMSTestData.xlsx","ManageClass");			
			for ( Map<String,String> elements     : excelHeader) {	
				InvalidBatchId = elements.get("InvalidBatchId").replaceAll("\"", "");		
			}
		} catch (InvalidFormatException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		return InvalidBatchId;
	}
	
	
public String getValidClassNo() {		
		String ValidClassNo = null;
		try {
			List<Map<String,String>> excelHeader = excelReader.getData(".\\src\\test\\resources\\Exceldata\\LMSTestData.xlsx","ManageClass");			
			for ( Map<String,String> elements     : excelHeader) {	
				 ValidClassNo = elements.get("ValidClassNo").replaceAll("\"", "");		
			}
		} catch (InvalidFormatException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		return ValidClassNo;
	}

public List<WebElement> classNoInEachRow() {
	List<WebElement> classNoInEachRow = classtable.findElements(By.xpath(".//tr[position=0//classno]"));
return classNoInEachRow;
}

public String getInValidClassNo() {
	
	String InValidClassNo = null;
	try {
		List<Map<String,String>> excelHeader = excelReader.getData
				(".\\src\\test\\resources\\Exceldata\\LMSTestData.xlsx", "ManageClass");		
		for ( Map<String,String> elements     : excelHeader) {
			 InValidClassNo = elements.get("InvalidClassNo").replaceAll("\"", "");		
		}
	} catch (InvalidFormatException e) {		
		e.printStackTrace();
	} catch (IOException e) {		
		e.printStackTrace();
	}
	return InValidClassNo;
}

public String getValidClassTopic() {
	
	String ValidClassTopic = null;
	try {
		List<Map<String,String>> excelHeader = excelReader.getData(".\\src\\test\\resources\\Exceldata\\LMSTestData.xlsx","ManageClass");		
		for ( Map<String,String> elements     : excelHeader) {
			 ValidClassTopic = elements.get("ValidClassTopic");		
		}
	} catch (InvalidFormatException e) {		
		e.printStackTrace();
	} catch (IOException e) {		
		e.printStackTrace();
	}
	return ValidClassTopic;
}

public List<WebElement> classTopicInEachRow() {
	List<WebElement> classTopicInEachRow = classtable.findElements(By.xpath(".//tr[position=0//classtopic]"));
return classTopicInEachRow;
}

public String getInValidClassTopic() {
String InValidClassTopic = null;
try {
	List<Map<String,String>> excelHeader = excelReader.getData(".\\src\\test\\resources\\Exceldata\\LMSTestData.xlsx","ManageClass");	
	for ( Map<String,String> elements     : excelHeader) {
		InValidClassTopic = elements.get("InvalidClassTopic");		
	}
} catch (InvalidFormatException e) {	
	e.printStackTrace();
} catch (IOException e) {	
	e.printStackTrace();
}
return InValidClassTopic;
}

public String getValidStaffId() {
	
	String ValidStaffId = null;
	try {
		List<Map<String,String>> excelHeader = excelReader.getData(".\\src\\test\\resources\\Exceldata\\LMSTestData.xlsx","ManageClass");		
		for ( Map<String,String> elements     : excelHeader) {
			ValidStaffId = elements.get("ValidStaffId").replaceAll("\"", "");		
		}
	} catch (InvalidFormatException e) {		
		e.printStackTrace();
	} catch (IOException e) {		
		e.printStackTrace();
	}
	return ValidStaffId;
}

public List<WebElement> staffIdInEachRow() {
	List<WebElement> staffIdInEachRow = classtable.findElements(By.xpath(".//tr[position=0//staffId]"));
return staffIdInEachRow;
}

public String getInvalidStaffId() {
	
	String InvalidStaffId = null;
	try {
		List<Map<String,String>> excelHeader = excelReader.getData(".\\src\\test\\resources\\Exceldata\\LMSTestData.xlsx","ManageClass");		
		for ( Map<String,String> elements     : excelHeader) {
			InvalidStaffId = elements.get("InvalidStaffId");		
		}
	} catch (InvalidFormatException e) {		
		e.printStackTrace();
	} catch (IOException e) {		
		e.printStackTrace();
	}
	return InvalidStaffId;
}

public String getValidClassdate() {
	
	String ValidClassDate = null;
	try {
		List<Map<String,String>> excelHeader = excelReader.getData(".\\src\\test\\resources\\Exceldata\\LMSTestData.xlsx","ManageClass");		
		for ( Map<String,String> elements     : excelHeader) {
			ValidClassDate = elements.get("ValidClassDate").replaceAll("\"", "");		
		}
	} catch (InvalidFormatException e) {		
		e.printStackTrace();
	} catch (IOException e) {		
		e.printStackTrace();
	}
	return ValidClassDate;
}
	
public List<WebElement> classdateInEachRow() {
	List<WebElement> classdateInEachRow = classtable.findElements(By.xpath(".//tr[position=0//classdate]"));
return classdateInEachRow;
}	

public String getInvalidClassdate() {
	
	String InvalidClassDate = null;
	try {
		List<Map<String,String>> excelHeader = excelReader.getData(".\\src\\test\\resources\\Exceldata\\LMSTestData.xlsx","ManageClass");		
		for ( Map<String,String> elements     : excelHeader) {
			InvalidClassDate = elements.get("InvalidClassDate").replaceAll("\"", "");		
		}
	} catch (InvalidFormatException e) {		
		e.printStackTrace();
	} catch (IOException e) {		
		e.printStackTrace();
	}
	return InvalidClassDate;
}

	
}
