package pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.Hooks;
import utilities.Excelreader;

public class Attendancepopuppage {
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
		 @FindBy(xpath = "//*[@id='table']/thead/tr[4]/td[1]") WebElement attendanceddpresent;
		 @FindBy(xpath = "//*[@id='table']/thead/tr[4]/td[2]") WebElement attendanceddabsent;
		 @FindBy(xpath = "//*[@id='table']/thead/tr[4]/td[3]") WebElement attendanceddlate;
		 @FindBy(xpath = "//*[@id='table']/thead/tr[4]/td[4]") WebElement attendanceddexcused;
		 @FindBy(xpath = "//*[@id='table']/thead/tr[5]") WebElement attendancedate;
		 @FindBy(xpath = "//*[@id='table']/thead[1]/tr[1]/a")WebElement textboxprogname;
		 @FindBy(xpath = "//*[@id='table']/thead[1]/tr[2]")WebElement textboxclassname;
		 @FindBy(xpath = "//*[@id='table']/thead[1]/tr[3]")WebElement textboxstudentname;
		 @FindBy(xpath = "//*[@id='table']/thead[1]/tr[4]")WebElement textboxattendance;
		 @FindBy(xpath = "//*[@id='table']/thead[1]/tr[5]")WebElement textboxattendancedate;
		 @FindBy(name="closebutton") WebElement closebutton;
		 
		 
		 public Attendancepopuppage(WebDriver driver)
		 {
			 this.driver = driver;
			 PageFactory.initElements(driver, this);
		 }
		 public void clickAttendance() {
			 attendancebutton.click();
			 
		 }
		 public void clickNewAttendance() {
			 newattendancebutton.click();	 
		 }
		 public int noofdropdown() {
			int no= driver.findElements(By.xpath("//*[@id='table']/thead/tr")).size();
			return no;
			 
		 }
		 public List<String> spellingfortextbox() {
			 List<String> namesintextboox=new ArrayList<String>();
			 for(int i=1; i<6; i++) {
				 namesintextboox.add(driver.findElement(By.xpath("//*[@id='table']/thead/tr["+i+"]")).getText());
			 }
			 return namesintextboox;
		 }
		 public boolean closedisplay() {
			boolean result= closebutton.isDisplayed();
			return result;
			 
		 }
		 
		 public boolean positionofclose() {
			Point position= closebutton.getLocation();
			if(position.getX()>0) {
				return true;
			} else {
				return false;
			}
			 
		 }
		 public boolean checkattendanceddspelling() {
			 int count= driver.findElements(By.xpath("//*[@id='table']/thead/tr[4]/td")).size();
			boolean e=false;
			 for(int i=1; i<=count; i++) {
				 driver.findElement(By.xpath("//*[@id='table']/thead/tr[4]/td["+i+"]")).isDisplayed();
				 if( driver.findElement(By.xpath("//*[@id='table']/thead/tr[4]/td["+i+"]")).isDisplayed()) {
					 return true;
				 } 
			 }
			return e;
			
		 }
		 public List<String> checkattendancedd() {
			 int count= driver.findElements(By.xpath("//*[@id='table']/thead/tr[4]/td")).size();
			 List<String> dropdownattendance=new ArrayList<String>();
			 for(int i=1; i<=count; i++) {
				 dropdownattendance.add(driver.findElement(By.xpath("//*[@id='table']/thead/tr[4]/td["+i+"]")).getText()); 
			 }
			return dropdownattendance;
		 }
		 
		 public String textboxprogname() {
			String txt= textboxprogname.getText();
			return txt;
		 }
		 public String textboxclassname() {
				String txt= textboxclassname.getText();
				return txt;
			 }
		 public String textboxstudentname() {
				String txt= textboxstudentname.getText();
				return txt;
			 }
		 public String textboxsattendancee() {
				String txt= textboxattendance.getText();
				return txt;
			 }
		 public String textinprognamedd() {
			 String txt= programnamedd.getText();
			 return txt;
		 }
		 public String textinclassnamedd() {
			 String txt= classnameattendancedd.getText();
			 return txt;
		 }
		 public String getcoloroftext() {
			String colorofprogname= textboxprogname.getCssValue("color");
			return colorofprogname;
			
		 }
		 public String getcoloroftextclass() {
				String colorofclassname= textboxclassname.getCssValue("color");
				return colorofclassname;
				
			 }
		 public String getcolorofstudentclass() {
				String colorofstudname= textboxstudentname.getCssValue("color");
				return colorofstudname;
				
			 }
		 public String getcolorofattendance() {
				String colorofattend= textboxattendance.getCssValue("color");
				return colorofattend;
				
			 }
public boolean checksavebutton() {
boolean results=	savebutton.isDisplayed();
return results;
}
public boolean checkcancelbutton() {
boolean results=cancelbutton.isDisplayed();
return results;
}
public LinkedHashSet<Object> checkorderoftexts() {
	LinkedHashSet<Object> orderoffields = new LinkedHashSet<Object>();
	orderoffields.add(textboxprogname.getText());
	orderoffields.add(textboxclassname.getText());
	orderoffields.add(textboxstudentname.getText());
	orderoffields.add(textboxattendance.getText());
	return orderoffields;
	
}
public void clickprognamedropdown() {
	programnamedd.click();
	 
}
public void clickclassnamedropdown() {
	classnameattendancedd.click();
	 
}
public void clickstudentdropdown() {
	studentname.click();
	 
}
public void clickattenddropdown() {
	attendance.click();
	 
}
public void clickdatepicker() {
	 datepickr.click();
}
public void selectdate() {
	highlighteddate.click();
}
public String gethighdate() {
	String date=highlighteddate.getText();
	return date;
}
public void isvaliddate() throws ParseException {
	
//	 String currentDate = new SimpleDateFormat("MM/dd/yyyy").format(new Date());
//	return currentDate;
		 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
	        Date date1 = simpleDateFormat.parse(datepickrtable.getText());
	        Date date2 = simpleDateFormat.parse("2023-09-11");
	        System.out.println(date2.compareTo(date1));
	        if(date2.compareTo(date1) == 0) {
	        	System.out.println("The date is in correct format");
	        } else {
	        	System.out.println("The date is in incorrect format");
	        }
	 }
public void clicknextmonth() {
	 nextmonth.click();
}
public String monthincalendar() {
	String monthname= monthincalendar.getText();
	return monthname;
 }
public void clickprevmonth() {
	 prevmonth.click();
}
public String findhighlighteddate() {
	String date= highlighteddate.getText();
	return date;
 }
public void clickfuturedate() {
	 futuredate.click();
	 }



}
