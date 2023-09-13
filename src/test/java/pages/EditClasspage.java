package pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.Hooks;
import utilities.Excelreader;

public class EditClasspage {
	
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
		 public EditClasspage(WebDriver driver)
		 {
			 this.driver = driver;
			 PageFactory.initElements(driver, this);
		 }
		 
		 public List<String> getallbatchidsfrompage() {
			 List<String> getbatchid = new ArrayList<String>();
			 for(WebElement s : batchidintablelist) {
			 getbatchid.add(s.getText());
			 }
			return getbatchid;
			 
		 }
		 
		 public void fillmandawithvaliddata() {
			 read=new Excelreader("1", "mandatoryfieldsvalid");
		 
			// Batch ID , No of Classes, Class Date, Staff Id
			 List<Object> datas= read.getsetofdata();
			 BatchId.sendKeys(datas.get(0).toString());
			 ClassNo.sendKeys(datas.get(1).toString());
			 Classdate.sendKeys(datas.get(2).toString());
			 Staffid.sendKeys(datas.get(4).toString());
		 
		
}
		 public void clicksavebutton() {
			 savebutton.click();
		 }
		 
		 public String searchbatchid() {
			 List<Object> datass= read.getsetofdata();
			 searchbar.click();
			 searchbar.sendKeys(datass.get(0).toString());
			String batchid= batchidintable.getText();
			return batchid;
		 }
		 
		 public void fillmandawithinvaliddata() {
			 read=new Excelreader("2", "mandatoryfieldsinvalid");
		 
			 //Batch ID , No of Classes, Class Date, Staff Id
			 List<Object> datas= read.getsetofdata();
			 BatchId.sendKeys(datas.get(0).toString());
			 ClassNo.sendKeys(datas.get(1).toString());
			 Classdate.sendKeys(datas.get(2).toString());
			 Staffid.sendKeys(datas.get(4).toString());
		 
		
}
		 public String captureerrormessage() {
			String e= alertmessage.getText();
			 return e;
		 }
		 
		 public void fillallwithvaliddata() {
			 read=new Excelreader("3", "allfieldsvalid");
		 
			 //Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings
			 List<Object> datasvalid= read.getsetofdata();
			 BatchId.sendKeys(datasvalid.get(0).toString());
			 ClassNo.sendKeys(datasvalid.get(1).toString());
			 Classdate.sendKeys(datasvalid.get(2).toString());
			 ClassTopic.sendKeys(datasvalid.get(3).toString());
			 Staffid.sendKeys(datasvalid.get(4).toString());
			 Classdescription.sendKeys(datasvalid.get(5).toString());
			 Comments.sendKeys(datasvalid.get(6).toString());
			 Notes.sendKeys(datasvalid.get(7).toString());
			 Recording.sendKeys(datasvalid.get(8).toString());
		
}
		 
		 public void filloptionalwithinvaliddata() {
			 read=new Excelreader("4", "optionalinvalid");
		 
			 //Batch ID , No of Classes, Class Date, Staff Id
			 List<Object> datasopt= read.getsetofdata();
			 BatchId.sendKeys(datasopt.get(0).toString());
			 ClassNo.sendKeys(datasopt.get(1).toString());
			 Classdate.sendKeys(datasopt.get(2).toString());
			 Staffid.sendKeys(datasopt.get(4).toString());
		
}
		 
		 public void missingvalueinbatchid() {
			 read=new Excelreader("5", "missbatchid");
		 
			 //No of Classes, Class Date, Staff Id
			 List<Object> missb= read.getsetofdata();
			 ClassNo.sendKeys(missb.get(1).toString());
			 Classdate.sendKeys(missb.get(2).toString());
			 Staffid.sendKeys(missb.get(4).toString());
		
}
		 
		 public void missingnoofclass() {
			 read=new Excelreader("6", "missnoofclass");
		 
			 //Batch ID ,  Class Date, Staff Id
			 List<Object> missc= read.getsetofdata();
			 BatchId.sendKeys(missc.get(0).toString());
			 Classdate.sendKeys(missc.get(2).toString());
			 Staffid.sendKeys(missc.get(4).toString());
		
}
		 
		 public void missingclassdate() {
			 read=new Excelreader("7", "missclassdate");
		 
			 //Batch ID , No of Classes, Staff Id
			 List<Object> missd= read.getsetofdata();
			 BatchId.sendKeys(missd.get(0).toString());
			 ClassNo.sendKeys(missd.get(1).toString());
			 Staffid.sendKeys(missd.get(4).toString());
		
}
		 public void missingstaffid() {
			 read=new Excelreader("8", "missstaffid");
			 //Batch ID , No of Classes, Class Date
			 List<Object> misssid= read.getsetofdata();
			 BatchId.sendKeys(misssid.get(0).toString());
			 ClassNo.sendKeys(misssid.get(1).toString());
			 Classdate.sendKeys(misssid.get(2).toString());
		
}
		 
		 public void invalidcdate() {
			 read=new Excelreader("9", "invaliddate");
			 //Batch ID , No of Classes, Class Date, Staff Id
			 List<Object> ind= read.getsetofdata();
			 BatchId.sendKeys(ind.get(0).toString());
			 ClassNo.sendKeys(ind.get(1).toString());
			 Classdate.sendKeys(ind.get(2).toString());
			 Staffid.sendKeys(ind.get(4).toString());
		
}
		 
		 public void clickdate() {
			 datepickr.click();
			 datepickrtable.click();
		 }
		 
		 public String checkclassdate() {
			String date= Classdate.getText();
			return date;
		 }
		 public String selecteddate() {
				String sdate= datepickrtable.getText();
				return sdate;
			 }
		 public void isvaliddate() throws ParseException {
		
//			 String currentDate = new SimpleDateFormat("MM/dd/yyyy").format(new Date());
//			return currentDate;
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
		 public void clickdatepicker() {
			 datepickr.click();
		 }
		 
		 public String findhighlighteddate() {
			String date= highlighteddate.getText();
			return date;
		 }
		 public void clickfuturedate() {
			 futuredate.click();
			 }
		 public void clickcancel() {
			 cancelbutton.click();
			 }
		 public String manageclasspage() {
			String pagetitle= driver.getTitle();
			return pagetitle;
		 }
		 public void checkbatchid() {
			String batchid= batchidintable.getText();
		 }

}
