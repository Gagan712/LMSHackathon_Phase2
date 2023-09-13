package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.Hooks;
import utilities.Excelreader;
import utilities.LoggerLoad;

public class DeleteAttendancePage {
	 WebDriver driver = Hooks.driver;
		Excelreader read;
		
		 @FindBy(xpath = "//*[@id='oldSelectbatch']")List<WebElement> dropdownentryforbatchid;
		 @FindBy(xpath="//*[@id='table']/tbody/tr/td[1]") List<WebElement> batchidintablelist;
		 @FindBy(xpath="//*[@id='table']/tbody/tr[1]/td[1]") WebElement batchidintable;
		 @FindBy(xpath="//*[@id='table']/tbody/tr[2]/td[1]") WebElement classidintable;
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
		 @FindBy(name="closebutton") WebElement closebutton;
		 @FindBy(name="deletebutton") WebElement deleterowbutton;
		 @FindBy(name="yesbutton") WebElement yesbutton;
		 @FindBy(name="nobutton") WebElement nobutton;
		 @FindBy(name="successmessagedelete") WebElement successmessagefordelete;
		 @FindBy(xpath="label[for='hobbies-checkbox']") List<WebElement> checkbox;
		 @FindBy(xpath="label[for='hobbies-checkboxmain']") WebElement multiplerowlevelcheckbox;
		 @FindBy(name="multipledeletebutton") WebElement multipllerowdelbutton;
		 @FindBy(name="student") WebElement studentbutton;
		 @FindBy(name="program") WebElement programbutton;
		 @FindBy(name="batch") WebElement batchbutton;
		 @FindBy(name="user") WebElement userbutton;
		 @FindBy(name="assignment") WebElement assignmentbutton;
		 @FindBy(name="class") WebElement classbutton;
		 @FindBy(name="logout") WebElement logoutbutton;
		 @FindBy(name="loginpage") WebElement loginpage;
		 
		 
		 
		 public DeleteAttendancePage(WebDriver driver)
		 {
			 this.driver = driver;
			 PageFactory.initElements(driver, this);
		 }
		  public void homepage() { 
				LoggerLoad.info("User lands on Login PAge");
				driver.get("https://test-lmsapplication.com");
			} 
		 public void clickAttendance() {
			 attendancebutton.click();
			 
		 }
		 public void clickstudent() {
			 studentbutton.click();
			 
		 }
		
		 public void clickprogram() {
			 programbutton.click();
			 
		 }
		 public void clickbatch() {
			 batchbutton.click();
			 
		 }
		 public void clicklogout() {
			 logoutbutton.click();
			 
		 }
		 public void clickuser() {
			 userbutton.click();
			 
		 }
		 public void clickassignment() {
			 assignmentbutton.click();
			 
		 }
		 public void clickclass() {
			 classbutton.click();
			 
		 }
		 public void clickdeletrow() {
			 deleterowbutton.click();
			 
		 }
		 public String captureerrormessage() {
				String e= alertmessage.getText();
				 return e;
			 }
		 public boolean yesdisplay() {
			boolean b= yesbutton.isEnabled();
			return b;
			 
		 }
		 public boolean nodisplay() {
			 boolean b= nobutton.isEnabled();
				return b;
			 
		 }
		 public boolean deleticon() {
			 boolean b= deleterowbutton.isEnabled();
				return b;
			 
		 }
		 public void clickyes() {
			 yesbutton.click();
			 
		 }
		 public void clickmulticheckbox() {
			 multiplerowlevelcheckbox.click();
			 
		 }
		 public void clickno() {
			 nobutton.click();
			 
		 }
		 public void clickcheckbox() {
			 for(WebElement e: checkbox) {
				 e.click();
			 }
			 
		 }
		 public void clickmultirowdelete() {
			 multipllerowdelbutton.click();
			 
		 }
		 public boolean clickcheckboxtest() {
			 boolean t=false;
			 for(WebElement e: checkbox) {
				 e.click();
			 if(e.isSelected()) {
				 return true;
			 } 
			}
			 return t;
		 }
		 public boolean clickonecheckbox() {
			 checkbox.get(0).click();
			 if( checkbox.get(0).isSelected()) {
				 return true;
			 } else {
			return false; 
			 }
		 }
		 
		 public String successmessagefordelete() {
				String e= successmessagefordelete.getText();
				 return e;
			 }
		 public void enterclassid() {
			 read=new Excelreader("12");
			 searchbar.click();
			 searchbar.sendKeys(read.getdata());
			  
			 }
		 public int checkclassidintable() {
			int classid= Integer.parseInt(classidintable.getText());
			return classid;
			 
		 }
		 public String attendancepage() {
			 String title = driver.getTitle();
			 return title;
		 }
		 public String studentpage() {
			 String title = driver.getTitle();
			 return title;
		 }
		 public String programpage() {
			 String title = driver.getTitle();
			 return title;
		 }
		 public String batchpage() {
			 String title = driver.getTitle();
			 return title;
		 }
		 public String userpage() {
			 String title = driver.getTitle();
			 return title;
		 }
		 public String assignmentpage() {
			 String title = driver.getTitle();
			 return title;
		 }
		 public String classpage() {
			 String title = driver.getTitle();
			 return title;
		 }
		 public String loginpage() {
			 String title = driver.getTitle();
			 return title;
		 }
}
