package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.Hooks;
import utilities.Excelreader;

public class ManageAttendancePage {
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
		 @FindBy(name="attendance") WebElement attendancebutton;
		 @FindBy(name="newattendance") WebElement newattendancebutton;
		 @FindBy(xpath = "//*[@id='table']/thead/tr[1]") WebElement programnamedd;
		 @FindBy(xpath = "//*[@id='table']/thead/tr[2]") WebElement classnameattendancedd;
		 @FindBy(xpath = "//*[@id='table']/thead/tr[3]") WebElement studentname;
		 @FindBy(xpath = "//*[@id='table']/thead/tr[4]") WebElement attendance;
		 @FindBy(xpath = "//*[@id='table']/thead/tr[5]") WebElement attendancedate;
		 @FindBy(xpath = "//*[@id='table']/thead[1]/tr[1]/a")WebElement textboxprogname;
		 @FindBy(xpath = "//*[@id='table']/thead[1]/tr[2]")WebElement textboxclassname;
		 @FindBy(xpath = "//*[@id='table']/thead[1]/tr[3]")WebElement textboxstudentname;
		 @FindBy(xpath = "//*[@id='table']/thead[1]/tr[4]")WebElement textboxattendance;
		 @FindBy(xpath = "//*[@id='table']/thead[1]/tr[5]")WebElement textboxattendancedate;
		 @FindBy(xpath="label[for='hobbies-checkbox']") List<WebElement> checkbox;
		 @FindBy(name="closebutton") WebElement closebutton;
		 @FindBy(name="pagenumber") WebElement pagenumber;
		 @FindBy(xpath = "//li[@class='pagination-link next-link']/a[./span[text()='next']]")WebElement rightarrow;
		 @FindBy(xpath = "//li[@class='pagination-link next-link']/a[./span[text()='previous']]")WebElement leftarrow;
		
		
		 
		 public ManageAttendancePage(WebDriver driver)
		 {
			 this.driver = driver;
			 PageFactory.initElements(driver, this);
		 }
public void clickattendace() {
	attendancebutton.click();
}

public int testpagenumber() {
int pn= Integer.parseInt(pagenumber.getText());
return pn;
}
public boolean checkrightarrowenabled() {
	boolean ena=rightarrow.isEnabled();
	return ena;
}
public boolean checkleftarrowenabled() {
	boolean ena=leftarrow.isEnabled();
	return ena;
}
public int checknoofentries() {
	int entries=checkbox.size();
	return entries;
}



}
