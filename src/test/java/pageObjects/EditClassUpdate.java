package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;

public class EditClassUpdate {

	//Editclassupdate + Editclasspopupwindowpageobject 
	public EditClassUpdate() {
		PageFactory.initElements(driver, this);
	}
		
	public static WebDriver driver = DriverFactory.getdriver();
	
	@FindBy(xpath = "//*[@value='Class']")
	WebElement addClassButton;	
	
	@FindBy(xpath = "//*[@value='AddClass']")
	WebElement classButton;	
	
	@FindBy(xpath = "//*[@value='editbutton']")
	WebElement editButton;
	
	 @FindBy(xpath = "//div[@class='popup-header']")
	    private WebElement popupHeader;
	 
	 @FindBy(xpath = "//div[@class='batchidtextbox']")
	    private WebElement batchidtextbox;
	 
	 @FindBy(xpath = "//div[@class='noOfClasstextbox']")
	    private WebElement noOfClasstextbox;
	 
	 @FindBy(xpath = "//div[@class='classDatetextbox']")
	    private WebElement classDatetextbox;
	 
	 @FindBy(xpath = "//*[@value='Cancel']")
		WebElement cancelButton;	
	 
	 @FindBy(xpath = ("//*[@id='ClassTopic']"))
		WebElement classTopicTextBox;
	 
	 @FindBy(xpath = ("//*[@id='ClassTopic']"))
		WebElement errorMessageelement;
	 
	
	public void clickClassButton() {
		classButton.click();
	}
	
	public void clickEditButton() {
		editButton.click();
	}
	
	public String getPopupHeaderText() {
        return popupHeader.getText();
    }
	
	public void addClassButton() {
      addClassButton.click();
    }
	
	public String batchIdTextBox() {
        return batchidtextbox.getAttribute("value");
    }
	
	public String noOfClasstextbox() {
        return noOfClasstextbox.getAttribute("value");
    }
	
	
	public String classDatetextbox() {
        return classDatetextbox.getAttribute("value");
    }

// method to click class button
	public void clickCancelButton() {
		cancelButton.click();
			}
//method to click Add New Class Button
	public void editClassTopic(String topic) {
		classTopicTextBox.sendKeys(topic);
			}
	
	public String errorMessageText() {
        return errorMessageelement.getText();
    }
	
	
	
	
	
	
}
