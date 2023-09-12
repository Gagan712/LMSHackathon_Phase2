package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.Hooks;
import utilities.Excelreader;

public class DeleteClassPage {
	 WebDriver driver = Hooks.driver;
		Excelreader read;
		
		 @FindBy(xpath = "//*[@id='oldSelectbatch']")List<WebElement> dropdownentryforbatchid;
		 @FindBy(xpath="//*[@id='table']/tbody/tr/td[1]") List<WebElement> batchidintablelist;
		 @FindBy(xpath="//*[@id='table']/tbody/tr[1]/td[1]") WebElement batchidintable;
		 @FindBy(id = "BatchIddropdown") WebElement BatchId;
		 @FindBy(id = "ClassNo") WebElement ClassNo;
		 @FindBy(id = "Classdate") WebElement Classdate;
		 @FindBy(id = "ClassTopic") WebElement ClassTopic;
		 @FindBy(id="Staffid") WebElement Staffid;
		 @FindBy(id = "Description") WebElement Classdescription;
		 @FindBy(id="Comments") WebElement Comments;
		 @FindBy(id="Notes") WebElement Notes;
		 @FindBy(linkText="Recording") WebElement Recording;
		 @FindBy(name="savebutton") WebElement savebutton;
		 @FindBy(id="Searchbar") WebElement searchbar;
		 @FindBy(id="error") WebElement alertmessage;
		 @FindBy(id="dateSelector") WebElement datepickr;
		 @FindBy(id="travel_date") WebElement datepickrtable;
		 @FindBy(id="nextmonth") WebElement nextmonth;
		 @FindBy(id="prevmonth") WebElement prevmonth;
		 @FindBy(xpath="//div/select[@class='ui-datepicker-month']") WebElement monthincalendar;
		 @FindBy(xpath="//*[@id='table']/tbody/tr/td[1]/a") WebElement highlighteddate;
		 @FindBy(xpath="//*[@id='table']/tbody/tr/td[2]/a") WebElement futuredate;
		 @FindBy(name="cancelbutton") WebElement cancelbutton;
		
		 @FindBy(name="deletebutton") WebElement deletebutton;
		 @FindBy(name="yesbutton") WebElement yesbutton;
		 @FindBy(name="nobutton") WebElement nobutton;
		 @FindBy(name="successmessagedelete") WebElement successmessagefordelete;
		 public DeleteClassPage(WebDriver driver)
		 {
			 this.driver = driver;
			 PageFactory.initElements(driver, this);
		 }
		 
		 public void clickdeleteicon() {
			 deletebutton.click();
		 }
		 
		 public String captureerrormessage() {
				String e= alertmessage.getText();
				 return e;
			 }
		 
		 public boolean yesbuttondisplay() {
				boolean result= yesbutton.isDisplayed();
				return result;
			 }
		 public boolean nobuttondisplay() {
				boolean result= nobutton.isDisplayed();
				return result;
			 }
		 public void clickyes() {
			 yesbutton.click();
		 }
		 public void clickno() {
			 nobutton.click();
		 }
		 public String successmessagefordelete() {
				String e= successmessagefordelete.getText();
				 return e;
			 }
		 public String checkbatchid() {
				String batchid= batchidintable.getText();
				return batchid;
			 }
		 public void clicksearch() {
			 searchbar.click();
		 }
		 public void enterbatchid() {
			 read=new Excelreader("1");
			 searchbar.click();
			 searchbar.sendKeys(read.getdata());
		 }
		 
		 public String checkclasspagetitle() {
			 String title= driver.getTitle();
			 return title;
		 }
		 
		 
		 
}
