package pageObjects;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

//AddNewClass + ClassPopUpWindow pageobject

public class ClassPopUpWindow {

	@FindBy(xpath = ("//*[@id='AddNewClass']"))
	WebElement addNewClassButton;
	
	@FindBy(xpath = ("//*[@id='pageheaderclass']"))
	WebElement headerText;
	
	@FindBy(xpath = ("//*[@id='batchid']"))
	WebElement batchIdOnAddClassPage;
	
	@FindBy(xpath = ("//*[@id='NoofClasses']"))
	WebElement noOfclassesOnAddClassPage;
	
	@FindBy(xpath = ("//*[@id='classdate']"))
	WebElement classDateOnAddClassPage;

	@FindBy(xpath = ("//*[@id='classtopic']"))
	WebElement classTopicOnAddClassPage;
	
	@FindBy(xpath = ("//*[@id='staffid']"))
	WebElement staffIdOnAddClassPage;
	
	@FindBy(xpath = ("//*[@id='classdescription']"))
	WebElement classDescriptionOnAddClassPage;
	
	@FindBy(xpath = ("//*[@id='comments']"))
	WebElement commentsOnAddClassPage;
	
	@FindBy(xpath = ("//*[@id='notes']"))
	WebElement notesOnAddClassPage;
	
	@FindBy(xpath = ("//*[@id='recordings']"))
	WebElement recordingsOnAddClassPage;
	
	@FindBy(xpath = ("//*[@id='savebutton']"))
	WebElement savebutton;
	
	@FindBy(xpath = ("//*[@id='cancelbutton']"))
	WebElement cancelbutton;
	
	@FindBy(xpath = ("//*[@id='textbox']"))
	WebElement textbox;
	
	@FindBy(xpath = ("//*[@id='classdatetextbox']"))
	WebElement classdatetextbox;
	
	@FindBy(xpath = ("//*[@id='classnotextbox']"))
	WebElement classNotextbox;
	
	@FindBy(xpath = ("//*[@id='dropdownbatchid']"))
	WebElement dropdownbatchid;
	
	@FindBy(xpath = ("//*[@id='dropdown']"))
	WebElement dropdownstaffid;
	
	@FindBy(xpath = ("//*[@id='calendericon']"))
	WebElement calendericon;
	
	@FindBy(xpath = ("//*[@id='calender']"))
	WebElement calender;
	
	@FindBy(xpath = ("//*[@id='closebutton']"))
	WebElement closebutton;
	
	@FindBy(xpath = ("//*[@id='alert']"))
	WebElement alert;
	
	public void clickAddNewClassButton() {
		addNewClassButton.click();
	}
	
	public String headerText() {
		return 	headerText.getText();		
	}
	
	public String batchId() {
		return batchIdOnAddClassPage.getText();
	}
	
	public boolean selectBatchId(String batchidstring) {
		Select select = new Select(batchIdOnAddClassPage);
		try {
		select.selectByValue(batchidstring);		
		return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public String noOfClasses() {
		return noOfclassesOnAddClassPage.getText();
	}
	
	public String classDate() {
		return classDateOnAddClassPage.getText();
	}
	
	public String classTopic() {
		return classTopicOnAddClassPage.getText();
	}
	
	public String staffID() {
		return staffIdOnAddClassPage.getText();
	}
	
	public String classDescription() {
		return classDescriptionOnAddClassPage.getText();
	}
	
	public String comments() {
		return commentsOnAddClassPage.getText();
	}
	
	public String notes() {
		return notesOnAddClassPage.getText();
	}
	public String recordings() {
		return recordingsOnAddClassPage.getText();
	}
	
	public boolean textBox() {
		return textbox.isDisplayed();
	}
	
	public boolean dropdownBatchId() {
		return dropdownbatchid.isDisplayed();
	}
	
	public void dropdownBatchIdClick() {
		 dropdownbatchid.click();;
	}
	
	public   List<String> getdropDownOptionsText() {
		Select select = new Select (dropdownbatchid);
		 List <WebElement> optionElements = select.getOptions();
		 //declared optionTexts variable of type List<String> which will capture the text from dropdown
		 //& initializing it as an empty ArrayList<String>
		 List<String> optionTexts = new ArrayList<>();		 
		// for(i=0; i<optionElements.size(); i++) 
		 for (WebElement option : optionElements) {
			 optionTexts.add(option.getText());	        		 
	}
		 return optionTexts;
	}
	
	public boolean dropdownStaffId() {
		return dropdownstaffid.isDisplayed();
	}
	
	public void dropdownStaffIdClick() {
		dropdownstaffid.click();
		Select stafffromdropdown = new Select(dropdownstaffid);
		stafffromdropdown.selectByIndex(3);		
	}
	
	
	public boolean calenderIcon() {
		return calendericon.isDisplayed();
	}
	
	public void opencalenderIcon() {
		calendericon.click();;
	}
	
	public void opencalender(String date) {
		calender.sendKeys(date);
	}	
	
	public boolean cancelButtonDisplayed() {
		return cancelbutton.isDisplayed();
	}
	
	public void cancelButtonClik() {
		cancelbutton.click();
	}
		
	public boolean saveButtonDisplayed() {
		return savebutton.isDisplayed();
	}
	public void saveButtonClick() {
		savebutton.click();;
	}
	
	public boolean closeButtonDisplayed() {
		return closebutton.isDisplayed();
	}
	
	public void classNoTextBox(String InvalidClassNo) {
		classNotextbox.sendKeys(InvalidClassNo);
	}
	
}
