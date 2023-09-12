package pageObjects;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ProgramModule {
	
	WebDriver driver;
	  //LMS Program button
	  @FindBy(xpath="//tagname[@attribute='value']")
	  WebElement programbutton;
	//LMS Header and Footer
	  @FindBy (xpath="//tagname[@attribute='value']")
	  WebElement HeaderMsg;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	  WebElement FooterMsg;
	  
	  //LMS Delete MultipleRecords 
	  @FindBy (xpath="//tagname[@attribute='value']")
	  WebElement btnDeleteMulRecords;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	  WebElement btnYes;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	  WebElement btnNo;
	  
	  //LMS Suggestion Message 
	  @FindBy(xpath=("//tagname[@attribute='value']"))
	  WebElement Suggestionmsg;

	  
	  //LMS Paginator Validation
	  @FindBy (xpath="//tagname[@attribute='value']")
	  WebElement PaginatorMsg;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	  WebElement btnFirstNav;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	  WebElement btnNext;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	  WebElement btnPrevoius;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	  WebElement btnLastNav;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	  WebElement txtSearch;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	  WebElement AscProgramName;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	  WebElement DesProgramName;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	  WebElement AscProgramDes;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	  WebElement DesProgramDes;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	  WebElement AscProgramStatus;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	  WebElement DesProgramStatus;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	  WebElement btnAddNewPro;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	  WebElement txtProStatus;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	  WebElement txtProName;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	  WebElement txtProDescription;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	  WebElement rdoSActive;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	  WebElement rdoSInActive;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	  WebElement btnCancel;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	  WebElement btnSave;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	  WebElement btnClose;
	  
	  //LMS Row Count 
	  @FindBy(xpath=("//tagname[@attribute='value']"))
	  List<WebElement> rows;
	  
	  //LMS Checkbox
	  @FindBy (xpath="//tagname[@attribute='value']")
	    WebElement rowcheckBox1;
	   
	  @FindBy (xpath="//tagname[@attribute='value']")
	    WebElement rowcheckBox2;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	    WebElement rowcheckBox3;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	    WebElement rowcheckBox4;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	    WebElement rowcheckBox5;
	   
	  //LMS Check All Checkbox
	  @FindBy (xpath="//tagname[@attribute='value']")
	    WebElement checkAll;
	  
	  //LMS Edit File
	  @FindBy (xpath="//tagname[@attribute='value']")
	    WebElement rowEdit1;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	    WebElement rowEdit2;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	    WebElement rowEdit3;
	   
	  @FindBy (xpath="//tagname[@attribute='value']")
	    WebElement rowEdit4;
	  
	  @FindBy (xpath="//tagname[@attribute='value']")
	    WebElement rowEdit5;
	  
	  //LMS Delete file
	    @FindBy (xpath="//tagname[@attribute='value']")
	      WebElement rowDelete1;
	    
	    @FindBy (xpath="//tagname[@attribute='value']")
	      WebElement rowDelete2;
	    
	    @FindBy (xpath="//tagname[@attribute='value']")
	      WebElement rowDelete3;
	    
	    @FindBy (xpath="//tagname[@attribute='value']")
	      WebElement rowDelete4;
	    
	    @FindBy (xpath="//tagname[@attribute='value']")
	      WebElement rowDelete5;

	  @FindBy(xpath="//tagname[@attribute='value']")
	  WebElement Save;
	    @FindBy(xpath="//tagname[@attribute='value']")
	    WebElement ErrorMessage;
	    
	    @FindBy(xpath="//tagname[@attribute='value']")
	    WebElement deletebtnchk;
	    
	    @FindBy(xpath="//tagname[@attribute='value']")
	    WebElement dialogbox;
	  //Action Methods
	  //LMS Header and Footer
	  
	  
	  public ProgramModule(WebDriver driver) {
	      this.driver=driver;
		  PageFactory.initElements(driver,this);
				
			}
	  
	public String getHeader() {
	    String Header = HeaderMsg.getText();
	    return Header;
	    }
	  public String getFooter() {
	    String Footer = FooterMsg.getText();
	    return Footer;
	      }
	  
	  //LMS Delete MultipleRecords 
	  
	  public void DeleteMultipleRecords()
	  {
	    btnDeleteMulRecords.click();
	  }
	  
	  public void ConfYes()
	  {
	    btnYes.click();
	    
	  }
	  //lms program button
	  public void clickProgramButton()
	  {
		  programbutton.click();
	  }
	  

	  public void ConfNo()
	  {
	    btnNo.click();
	    
	  }
	  public String addnewUser()
	  {
		  String dialogtext=dialogbox.getText();
		  return dialogtext;
	  }
	  public String getSuggestionBox()  {
	    String SuggestionMSg = Suggestionmsg.getText();
	    return SuggestionMSg;
	    }
	public String getPaginatorMsg() 
	  {
	    String Paginator = PaginatorMsg.getText();
	    return Paginator;
	  }
	  
	  public void clickFirstNav()
	  {
	    btnFirstNav.click();
	  }
	  
	  public void clickNextButton()
	  {
	    btnNext.click();
	  }
	  
	  public void clickPrevoiusButton()
	  {
	    btnPrevoius.click();
	  }
	  
	  public void clickLastNav()
	  {
	    btnLastNav.click();
	  }
	  
	  public String getSearch()
	  {
		  String Searctext=txtSearch.getText(); 
		  return Searctext;
	  }
	  public void Search(String SearchElement)
	  {
	    txtSearch.sendKeys(SearchElement +Keys.ENTER);
	  }
	  
	  public void AscProName()
	  {
	    AscProgramName.click();
	  }
	  
	  public void DesProName()
	  {
	    DesProgramName.click();
	  }
	  
	  public void AscProDes()
	  {
	    AscProgramDes.click();
	  }
	  
	  public void DesProDes()
	  {
	    DesProgramDes.click();
	  }
	  
	  public void AscProStatus()
	  {
	    AscProgramStatus.click();
	  }
	  
	  public void DesProStatus()
	  {
	    DesProgramStatus.click();
	  }
	  public void getErrormessage()
	  {
		  ErrorMessage.getText(); 
	  }
	  public void AddNewProgram()
	  {
	    btnAddNewPro.click();
	  }
	  public String getProgramName()
	  {
		  String prognames=txtProName.getText();
		  return prognames;
	  }
	  public String getProgramDescription()
	  {
		  String progdescriptions=txtProName.getText();
		  return progdescriptions;
	  }
	  public String getProgramStatus()
	  {
		  String progstatus=txtProName.getText();
		  return progstatus;
	  }
	  public void txtProgramName(String enterName)
	  {
	   txtProName.sendKeys(enterName +Keys.TAB);
	  }
	  public void txtProgramStatus(String enterName)
	  {
	   txtProStatus.sendKeys(enterName +Keys.TAB);
	  }
	  public void txtProgramDesciption(String description)
	  {
	    txtProDescription.sendKeys(description);
	  }
	  
	  public void radioSActive()
	  {
	    rdoSActive.click();
	  }
	  
	  public void radioSInActive()
	  {
	    rdoSInActive.click();
	    
	  }
	  
	  public void Cancelbutton()
	  {
	    btnCancel.click();
	  }
	  
	  public void Savebutton()
	  {
	    btnSave.click();
	  }
	  
	  public void Closebutton()
	  {
	    btnClose.click();
	  }
	  
	  //
	  public int getrows() {
	    int rowSize = rows.size();
	    return rowSize;
	  }
	  
	  //LMS Checkbox 
	  public void clickrowcheck1()
	  {
	    rowcheckBox1.click();
	  }
	  
	  public void clickrowcheck2()
	  {
	    rowcheckBox2.click();
	  }
	  
	  public void clickrowcheck3()
	  {
	    rowcheckBox3.click();
	  }
	  
	  public void clickrowcheck4()
	  {
	    rowcheckBox4.click();
	  }
	  
	  public void clickrowcheck5()
	  {
	    rowcheckBox5.click();
	  }
	  
	  //LMS Check All Checkbox
	  
	  public void ClickCheckAll()
	  {
	    checkAll.click();
	  }
	  //LMS Edit file button
	  public void ClickRowEdit1()
	  {
	     rowEdit1.click();
	  }
	  
	  public void ClickRowEdit2()
	  {
	     rowEdit2.click();
	  }
	  
	  public void ClickRowEdit3()
	  {
	     rowEdit3.click();
	  }
	  
	  public void ClickRowEdit4()
	  {
	     rowEdit4.click();
	  }
	  
	  public void ClickRowEdit5()
	  {
	     rowEdit5.click();
	  }
	  
	  public void ClickSave()
	  {
		  Save.click();
	  }
	  
	  //LMS Delete file
	  public void Deletebtneableordisablechk()
	  {
		  deletebtnchk.click();
	  }
	  
	  public void ClickRowDelete1()
	  {
	    rowDelete1.click();
	  }
	  
	  public void ClickRowDelete2()
	  {
	    rowDelete2.click();
	  }
	  
	  public void ClickRowDelete3()
	  {
	    rowDelete3.click();
	  }
	  
	  public void ClickRowDelete4()
	  {
	    rowDelete4.click();
	  }
	  public void ClickRowDelete5()
	  {
	    rowDelete5.click();
	  }
	  
	  
}
