package pageObjects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import factory.DriverFactory;

public class Studentpage extends DriverFactory {

	
	
	//public static WebDriver driver = DriverFactory.getdriver();
	Boolean isRequired;
	
		  
		 @ FindBy(xpath="//button[text()='student']")
		static
		WebElement student;
		 @FindBy(id = "navigationTimeout") 
		    private static WebElement navigationTimeoutElement;

		 @ FindBy(xpath="div//div//button")
		static WebElement inputField ;
		 @ FindBy(xpath="div//div//button")
			static WebElement nameElement ;
		 @ FindBy(xpath="div//div//button")
			static WebElement batchElement ;
		  @FindBy(tagName = "selectname")
		static WebElement dropdown1;
		  
		  @FindBy(id = "search-box") 
		    private static WebElement searchBox1;
		  @FindBy(id = "search-box") 
		    private static WebElement searchBox2;
		    
		  @FindBy(tagName = "selectbatch")
		static WebElement dropdown2;
		  
		  @FindBy(xpath = "//h1[contains(text(), 'LMS - Learning management system')]")
		    private static WebElement lmspageTitle;
		  @FindBy(xpath = "//h1[contains(text(), 'Student Detail')]")
		    private static WebElement studentDetailTitle;
		  
		  
		  @FindBy(xpath = "//div[contains(text(), 'select student name')]")
		    private static WebElement selectStudentNameText;
		  @FindBy(xpath = "//div[contains(text(), 'select batch id text')]")
		    private static WebElement selectBatchidText;
		  @FindBy(id = "studentNameElement") 
		    private static WebElement studentNameElement;
		  @FindBy(id = "BatchidElement") 
		    private static WebElement BatchidElement;
		  
		  
		  @FindBy(xpath = "//select[@id='studentNameSelect']/option[1]") 
		    private static WebElement firstStudentOption;
		  
		  @FindBy(xpath = "//select[@id='batchidSelect']/option[2]") 
		    private static WebElement secondOption;
		  
		  @FindBy(xpath = "//select[@id='studentNameDropdown']/option[starts-with(@value, 'x')]") // XPath to find student names starting with 'x'
		    private static List<WebElement> studentNamesStartingWithX;

		  @FindBy(xpath = "//select[@id='batchIdDropdown']/option[starts-with(@value, 'x')]") // XPath to find batch IDs starting with 'x'
		    private static List<WebElement> batchIdsStartingWithX;

		  @FindBy(id = "studentDetailsContainer") 
		    private static WebElement studentDetailsContainer;
		  @FindBy(id = "batchidsubmitButton") 
		    private static WebElement submitbatchidButton;
		  
		  
		  
		 
		 @FindBy(id = "programLink") 
		    private static WebElement programLink;
		 @FindBy(id = "programPageHeader") 
		    private static WebElement programPageHeader;
		 @FindBy(id = "batchLink") 
		    private static WebElement batchLink;
		 @FindBy(id = "batchPageHeader") 
		    private static WebElement batchPageHeader;
		 
		 @FindBy(id = "classLink") 
		    private static WebElement classLink;
		 @FindBy(id = "classPageHeader") 
		    private static WebElement classPageHeader;
		 
		 @FindBy(id = "userLink") 
		    private static WebElement userLink;
		 
		 @FindBy(id = "userPageHeader") 
		    private static WebElement userPageHeader;
		 
		 @FindBy(id = "assignmentLink") 
		    private static WebElement assignmentLink;
		 
		 @FindBy(id = "assignmentPageHeader") 
		    private static WebElement assignmentPageHeader;
		 
		 @FindBy(id = "attendancetLink") 
		    private static WebElement attendanceLink;
		 
		 @FindBy(id = "attendancePageHeader") 
		    private static WebElement attendancePageHeader;
		 
		 @FindBy(id = "logoutLink") 
		    private static WebElement logoutLink;
		 
		 @FindBy(id = "logoutPageHeader") 
		    private static WebElement logoutPageHeader;
		 
		 
		 //public void dashboardPage() {
			//  driver.get(dashboardUrl);}
		 public Studentpage ()
			{
			 PageFactory.initElements(driver, this);
			}	 
		 
		 public static  void Clickstudent (){
			 student.click();
			 
			   }
			 public static   String getpagetitle() {
					return "dashboard";
			   
			  }
			 
		 public static String verifyPageTitle() {
			  String pageTitle = driver.getTitle();
			  return pageTitle;

			 }
		 public static boolean isTitlelmsDisplayed() {
		        return lmspageTitle.isDisplayed();
		    }
		 public static int getNavigationTimeoutInSeconds() {
		        String navigationTimeoutText = navigationTimeoutElement.getText();
		        
		        int navigationTimeoutInSeconds = Integer.parseInt(navigationTimeoutText);
		        return navigationTimeoutInSeconds;
		    }
		 
		 
		 public static boolean areTwoDropdownsPresent() {
		       
		        
		        

		 return dropdown1.isDisplayed() && dropdown2.isDisplayed();
			}
		 
		 public static boolean isTitleInCenter() {
		 JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        
	       
	        int elementX = studentDetailTitle.getLocation().getX();
	        int elementY = studentDetailTitle.getLocation().getY();
	        
	        
	        long viewportWidth = (long) jsExecutor.executeScript("return window.innerWidth || document.documentElement.clientWidth || document.body.clientWidth;");
	        long viewportHeight = (long) jsExecutor.executeScript("return window.innerHeight || document.documentElement.clientHeight || document.body.clientHeight;");
	        
	        
	        long centerX = viewportWidth / 2;
	        long centerY = viewportHeight / 2;
	        
	        
	        int tolerance = 10; 
	        boolean isCentered = Math.abs(elementX - centerX) <= tolerance && Math.abs(elementY - centerY) <= tolerance;
	        
	        return isCentered;
		
		 }
		 
		 
		 public static boolean isSearchBoxInsideDropdown() {
		        
		        return dropdown1.isDisplayed() && searchBox1.isDisplayed();}
		 
		 public static boolean isSearchBoxInsidebatchDropdown() {
		        
		        return dropdown2.isDisplayed() && searchBox2.isDisplayed();}
		 
		 
		 
		 
		 public static String getSelectStudentNameText() {
		        return selectStudentNameText.getText();
		    }
		 
		 
		 public static String getSelectbatchidText() {
		        return selectBatchidText.getText();
		    }
		 
		 public static boolean areOnlyNumbersInBatchIdDropdown() {
		        List<WebElement> options = dropdown2.findElements(By.tagName("option"));

		        for (WebElement option : options) {
		            if (!option.getText().matches("^[0-9]+$")) {
		                return false; 
		            }
		        }

		        return true; }
		 
		 
		 public static void verifyStudentNameInGrayColor() {
		       // Wait.until(ExpectedConditions.visibilityOf(studentNameElement));
		        String color = studentNameElement.getCssValue("color");
		        String expectedColor = "rgba(128, 128, 128, 1)";

		        assertEquals("Expected student name to be in gray color", expectedColor, color);
		    }
		 
		 
		 public static void verifyBatchidInGrayColor() {
		      // Wait.until(ExpectedConditions.visibilityOf(BatchidElement));
		        String color = BatchidElement.getCssValue("color");
		        String expectedColor = "rgba(128, 128, 128, 1)";

		        assertEquals("Expected batch id to be in gray color", expectedColor, color);
		    }
		 public static void verifySelectStudentNameIsFirst() {
		       Assert. assertTrue("Expected 'Select Student Name' to be the first option", firstStudentOption.isSelected());
		    }
		 
		 public static void verifySelectbatchidIsSecond() {
		       Assert. assertTrue("Expected 'Select batch id' to be the second option", secondOption.isSelected());
		    }
		 
		 public static void scrollToNameElement() {
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'center'});", nameElement);
		    }
	  
		 
		 
		 public static void scrollToBatchElement() {
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'center'});", batchElement);
		    }
	  
		 
		 public static void selectStudentNameFromDropdown(String studentName) {
		        Select dropdown = new Select(dropdown1);
		        dropdown.selectByVisibleText(studentName);
		    }
		 public static boolean isSelectStudentNameTextVisible() {
		        return studentNameElement.isDisplayed();
		    }
		 
		 public static void selectBatchidFromDropdown(int batchid) {
		        Select dropdown = new Select(dropdown2);
		        dropdown.selectByIndex(batchid);
		    }
		 
		 public static boolean isSelectBatchIdTextVisible() {
		        return BatchidElement.isDisplayed();
		    }
		 
		 public static void clickSelectStudentNameDropdown() {
		        dropdown1.click();
		    }

		    public static void enterTextInSearchBox(String searchText) {
		        studentNameElement.sendKeys(searchText);
		    }
		 
		    public static List<WebElement> getStudentNamesStartingWithX() {
		        return studentNamesStartingWithX;}
		 
		        public static void clickSelectBatchIdDropdown() {
		            dropdown2.click();
		        }

		        public void enterNumberInSearchBox(CharSequence[] number) {
		            BatchidElement.sendKeys(number); 
		        
		        
}
		        public static List<WebElement> getBatchIdsStartingWithX() {
		            return batchIdsStartingWithX;
		        }
		     
		        public static void selectStudentNameOption() {
		            Select dropdown = new Select(dropdown1);
		            dropdown.selectByVisibleText("Student Name");
		        }
		        
		        public static String getStudentDetailspage() {
		            return studentDetailsContainer.getText();
		        }
		        
		        public static boolean isStudentDetailspageisDisplayed() {
		            return studentDetailsContainer.isDisplayed();
		        }
		        public static void clickSubmitbactid() {
		            submitbatchidButton.click();
		        }
  
		        public static String getStudentName() {
		            return studentNameElement.getText();
		        }

		        public static String getBatchId() {
		            return BatchidElement.getText();
		        }

 
		        public static void clickProgramLink() {
		            programLink.click();
		        }
		        public static boolean isProgramPageDisplayed() {
		            return programPageHeader.isDisplayed();
		        }
		        public static void clickBatchLink() {
		            batchLink.click();
		        }
		        public static boolean isBatchPageDisplayed() {
		           
						return batchPageHeader.isDisplayed();
					
		        }  
		        public static void clickClassLink() {
		            classLink.click();
		        }
		        public static boolean isClassPageDisplayed() {
		            return classPageHeader.isDisplayed();
		        }
		        public static void clickUserLink() {
		            userLink.click();
		        
		        }       
		        
		        public static boolean isUserPageDisplayed() {
		            return userPageHeader.isDisplayed();
		        }
		        public static void clickAssignmentLink() {
		            assignmentLink.click();
		        
		        }       
		        
		        public static boolean isAssignmentPageDisplayed() {
		            return assignmentPageHeader.isDisplayed();
		        }
		        
		        public static void clickAttendanceLink() {
		            attendanceLink.click();
		        
		        }       
		        
		        public static boolean isAttendancePageDisplayed() {
		            return attendancePageHeader.isDisplayed();
		        }
		        public static void clickLogoutLink() {
		            logoutLink.click();
		        }
		        public static boolean isLogoutPageDisplayed() {
		            return logoutPageHeader.isDisplayed();
		        } 
}
