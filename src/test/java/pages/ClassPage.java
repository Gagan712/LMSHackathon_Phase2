package pages;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import hooks.Hooks;
import utilities.Excelreader;
import utilities.LoggerLoad;

public class ClassPage {
	
	 WebDriver driver = Hooks.driver;
	Excelreader read;
	 @FindBy(linkText="Class") WebElement classlink;
	 @FindBy(id = "Header") WebElement hr;
	 @FindBy(id = "BatchId") WebElement BatchId;
	 @FindBy(id = "ClassNo") WebElement ClassNo;
	 @FindBy(id = "Classdate") WebElement Classdate;
	 @FindBy(id = "ClassTopic") WebElement ClassTopic;
	 @FindBy(id="Staffid") WebElement Staffid;
	 @FindBy(id = "Description") WebElement Classdescription;
	 @FindBy(id="Comments") WebElement Comments;
	 @FindBy(id="Notes") WebElement Notes;
	 @FindBy(linkText="Recording") WebElement Recording;
	 @FindBy(id = "EditHeader")WebElement EditHeader;
	 @FindBy(id="DeleteHeader")WebElement DeleteHeader;
	 @FindBy(id="Multipledelete")WebElement Multipledelete;
	 @FindBy(id="Searchbar") WebElement searchbar;
	 @FindBy(id="addnewclass") WebElement Addnewclass;
	 @FindBy(name="editbutton") WebElement editbutton;
	 @FindBy(name="deletebutton") WebElement deletebutton;
	 @FindBy(name="savebutton") WebElement savebutton;
	 @FindBy(name="closebutton") WebElement closebutton;
	 @FindBy(xpath="//*[@id='table']/tbody/tr[1]/td[1]") WebElement batchidintable;
	 @FindBy(xpath="//*[@id='table']/tbody/tr[1]/td[2]") WebElement classnointable;
	 @FindBy(xpath="//*[@id='table']/tbody/tr[1]/td[3]") WebElement classdateintable;
	 @FindBy(xpath="//*[@id='table']/tbody/tr[1]/td[4]") WebElement classtopicintable;
	 @FindBy(xpath="//*[@id='table']/tbody/tr[1]/td[5]") WebElement staffidintable;
	 @FindBy(id = "dropdown")WebElement dropdownforbatchid;
	 @FindBy(id = "dropdownstaff")WebElement dropdownforstaffid;
	 @FindBy(xpath = "//*[@id='table']/thead/tr/th[1]")WebElement sortBtn_BatchId;
	 @FindBy(xpath = "//*[@id='table']/thead/tr/th[2]")WebElement sortBtn_ClassNo;
	 @FindBy(xpath = "//*[@id='table']/thead/tr/th[4]")WebElement sortBtn_ClassDate;
	 @FindBy(xpath = "//*[@id='table']/thead/tr/th[1]")WebElement sortBtn_ClassTopic;
	 @FindBy(xpath = "//*[@id='table']/thead/tr/th[2]")WebElement sortBtn_StaffId;
	 @FindBy(xpath = "//*[@id='table']/thead/tr/th[4]")WebElement sortBtn_Descripton;
	 @FindBy(xpath = "//*[@id='table']/thead/tr/th[2]")WebElement sortBtn_Comments;
	 @FindBy(xpath = "//*[@id='table']/thead/tr/th[4]")WebElement sortBtn_Notes;
	 @FindBy(xpath = "//*[@id='table']/thead/tr/th[1]")WebElement sortBtn_Recording;
	 @FindBy(xpath = "//*[@id='table']/tbody/tr/td")List<WebElement> ascTableData;
	 @FindBy(xpath = "//*[@id='table']/tbody/tr/td")List<WebElement> descTableData;
	 @FindBy(id = "entries")WebElement showingentries;
	 @FindBy(id = "totalentries")WebElement totalentries;
	 @FindBy(id = "firstCheckbox")WebElement firstCheckbox;
	 @FindBy(xpath = "//*[@class='checkbox']//*[@type='Checkbox']")List<WebElement> allCheckbox;
	 @FindBy(xpath = "//*[@id='oldSelectbatch']")List<WebElement> dropdownentryforbatchid;
	 @FindBy(id = "datepicker")WebElement calendarclick;
	 @FindBy(xpath = "//table[@class='ui-datepicker-calendar']//td")List<WebElement> calendar;
	 @FindBy(xpath = "//*[@id='table']/thead/tr[1]")WebElement textboxBatchId;
	 @FindBy(xpath = "//*[@id='table']/thead/tr[2]")WebElement textboxClassNo;
	 @FindBy(xpath = "//*[@id='table']/thead/tr[3]")WebElement textboxClassDate;
	 @FindBy(xpath = "//*[@id='table']/thead/tr[4]")WebElement textboxClassTopic;
	 @FindBy(xpath = "//*[@id='table']/thead/tr[5]")WebElement textboxStaffId;
	 @FindBy(xpath = "//*[@id='table']/thead/tr[6]")WebElement textboxDescripton;
	 @FindBy(xpath = "//*[@id='table']/thead/tr[7]")WebElement textboxComments;
	 @FindBy(xpath = "//*[@id='table']/thead/tr[8]")WebElement textboxNotes;
	 @FindBy(xpath = "//*[@id='table']/thead/tr[9]")WebElement textboxRecording;
	
	 
	
	 
	 //Pagination
	 @FindBy(id = "paginate_button current")WebElement currentPageNumber;
	 @FindBy(id = "nextPgBtn")WebElement nextPgBtn;
	 @FindBy(id = "prevPgBtn")WebElement prevPgBtn;
	 @FindBy(id = "firstPgBtn")WebElement firstPgBtn;
	 @FindBy(id = "lastPgBtn")WebElement lastPgBtn;
	 @FindBy(id = "PgText")WebElement pgText;
	 
		public ClassPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 
	   public void homepage() { 
			LoggerLoad.info("User lands on Login PAge");
			driver.get("https://test-lmsapplication.com");
		} 
	   
		public void clickclasslink() {
			LoggerLoad.info("Class page");
			classlink.click();
		}
		
		public String ManageclassUrl() {
			String Url= driver.getCurrentUrl(); 
			return Url;
		}
		
		public long pageloadtime() {
			long start = System.currentTimeMillis();
			classlink.click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(classlink));
			long end = System.currentTimeMillis();
			long totaltime = end - start;
			return totaltime;
		}
		public String verifyHeaderText() {
			LoggerLoad.info("Admin/User/Staff see the header Text");    
         String headers = hr.getText();
         return headers;
			}

		public List<Object> verifyColumnHeaderText()  {
			LoggerLoad.info("Admin/User/Staff see the verifyColumnHeaderText");
			List<Object> headerlist= new ArrayList<Object>();
			headerlist.add(BatchId.getText());
			headerlist.add(ClassNo.getText());
			headerlist.add(Classdate.getText());
			headerlist.add(ClassTopic.getText());
			headerlist.add(Staffid.getText());
			headerlist.add(Classdescription.getText());
			headerlist.add(Comments.getText());
			headerlist.add(Notes.getText());
			headerlist.add(Recording.getText());
			headerlist.add(EditHeader.getText());
			headerlist.add(DeleteHeader.getText());
			
			return headerlist;
				 
		}
		
		public boolean verifymaindeletedisabled() {
			if(Multipledelete.isEnabled()) {
				return true;
			} else {
				return false;
			}
			
		}
		
		public boolean searchbarpresent() {
			if(searchbar.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		}
		public boolean addnewclasspresent() {
			if(Addnewclass.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		}
		public boolean editbuttonenabled() {
			if(editbutton.isEnabled()) {
				return true;
			} else {
				return false;
			}
		}
		
		public boolean verifydataintable() {
			List<Object> data = new ArrayList<Object>();
			data.add(batchidintable.getText());
			data.add(classtopicintable.getText());
			data.add(staffidintable.getText());
			if(data.isEmpty()) {
				return false;
			} else {
				return true;
			}
			
		}
		
		public boolean deletebuttonenabled() {
			if(deletebutton.isEnabled()) {
				return true;
			} else {
				return false;
			}
		}
		
		public boolean sortinginheaders() {
			List<WebElement> listing = new ArrayList<WebElement>();
			boolean resl= false;
			listing.add(sortBtn_BatchId);
			listing.add(sortBtn_ClassNo);
			listing.add(sortBtn_ClassDate);
			listing.add(sortBtn_ClassTopic);
			listing.add(sortBtn_StaffId);
			listing.add(sortBtn_Descripton);
			listing.add(sortBtn_Comments);
			listing.add(sortBtn_Notes);
			listing.add(sortBtn_Recording);
			for(WebElement e : listing) {
				if(e.isDisplayed()) {
					return true;
				}
			}
			return resl;
				
		}
		
		public boolean checkboxesclick() {
			
			boolean check= false;
			for(int i=0; i<=allCheckbox.size(); i++) {
				allCheckbox.get(i).click();
				if(allCheckbox.get(i).isSelected()) {
					return true;
				}} 
					return check; 
				
			}
			public String entriestext() {
				String entry = showingentries.getText();
				return entry;
			}
			
		public boolean nextpage() {
			boolean ren=false;
			int pagenumber =  Integer.parseInt(currentPageNumber.getText());
			nextPgBtn.click();
			if(pagenumber==pagenumber+1) {
				return true;
			}
			return ren;
		}
		
		public boolean previouspage() {
			boolean rent=false;
			int pagenumber =  Integer.parseInt(currentPageNumber.getText());
			prevPgBtn.click();
			if(pagenumber==pagenumber-1) {
				return true;
			}
			return rent;
		}
		
		public boolean firstpage() {
			boolean ren=false;
			int pagenumber =  Integer.parseInt(currentPageNumber.getText());
			firstPgBtn.click();
			if(pagenumber==1) {
				return true;
			}
			return ren;
		}
		
		
		public boolean lastpage() {
			String text= totalentries.getText(); //"In total there are 3 classes"
			String totalpages = text.substring(19, 21);
			int totalpage= Integer.parseInt(totalpages);
			boolean rentt=false;
			int pagenumber =  Integer.parseInt(currentPageNumber.getText());
			lastPgBtn.click();
			if(pagenumber==totalpage) {
				return true;
			}
			return rentt;
		}
		
		public String totallyclasses() {
			String tets=totalentries.getText();
			return tets;
		}
		
		public void clicksearhbox() {
			searchbar.click();
		}
		
		public void enterbatchid(String testid) {
			read = new Excelreader(testid);
			searchbar.sendKeys(read.getdata());
		}
		
		public String batchidintable() {
			String txt = batchidintable.getText();
			return txt;
		}
		public void invalidbatchid(String testid) {
			read = new Excelreader(testid);
			searchbar.sendKeys(read.getdata());
		}
		public boolean emptybatchdetails() {
			 String datas= batchidintable.getText();
			  if(datas.isEmpty()) {
				  return true;
			  } else {
				  return false;
			  }
				  
		}
		public void enterclassno(String testid) {
			read = new Excelreader(testid);
			searchbar.sendKeys(read.getdata());
		}
		public int classnointable() {
			int txt = Integer.parseInt(batchidintable.getText());
			return txt;
		}
		public void invalidclassno(String testid) {
			read = new Excelreader(testid);
			searchbar.sendKeys(read.getdata());
		}
	
		public void enterclasstopic(String testid) {
			read = new Excelreader(testid);
			searchbar.sendKeys(read.getdata());
		}
		
		public String classtopicintable() {
			String txtss = classtopicintable.getText();
			return txtss;
		}
		public void invalidclasstopic(String testid) {
			read = new Excelreader(testid);
			searchbar.sendKeys(read.getdata());
		}
		public void enterstaffid(String testid) {
			read = new Excelreader(testid);
			searchbar.sendKeys(read.getdata());
		}
		public int staffidintable() {
			int txt = Integer.parseInt(staffidintable.getText());
			return txt;
		}
		public void invalidstaffid(String testid) {
			read = new Excelreader(testid);
			searchbar.sendKeys(read.getdata());
		}
		public String classdateintable() {
			String txtss = classdateintable.getText();
			return txtss;
		}
		public void enterclassdate(String testid) {
			read = new Excelreader(testid);
			searchbar.sendKeys(read.getdata());
		}
		
		public void invalidclassdate(String testid) {
			read = new Excelreader(testid);
			searchbar.sendKeys(read.getdata());
		}
		
		public void clickaddnewclass() {
			Addnewclass.click();
		}
		public void clickdropdownforbatchid() {
			dropdownforbatchid.click();
		}
		public List<String> checklistforbatchid() {
			List<String> entryforbatchid=new ArrayList<String>();
			for(WebElement e: dropdownentryforbatchid) {
				entryforbatchid.add(e.getText());
			}
			return entryforbatchid;
			
			
		}
		
		public void clickdropdownforstaffid() {
			dropdownforstaffid.click();
		}
		public List<Object> checklistforstaffid() {
			List<Object> entryforstaffid=new ArrayList<Object>();
			for(WebElement e: dropdownentryforbatchid) {
				entryforstaffid.add(e.getText());
			}
			return entryforstaffid;
			
			
		}
		
		public boolean calendarclick() {
			boolean displayresult=calendarclick.isDisplayed();
			return displayresult;
		}
		
		public boolean viewsave() {
			boolean displayreslt=savebutton.isDisplayed();
			return displayreslt;
		}
		
		public boolean viewdelete() {
			boolean displayrslt=deletebutton.isDisplayed();
			return displayrslt;
		}
		
		public boolean viewclose() {
			boolean displarslt=closebutton.isDisplayed();
			return displarslt;
		}
		public void clickeditbutton() {
			editbutton.click();
		}
		 public String checkheading() {
				String editpagetitle=	driver.getTitle();
				return editpagetitle;
				 }
		 
		 public List<Object> checkvaluesintextbox() {
			 List<Object> valuesintextbox = new ArrayList<Object>();
				for(int i=1; i<10; i++) {
					valuesintextbox.add(driver.findElement(By.xpath("//*[@id='table']/thead/tr["+i+"]")).getText());
				}
				return valuesintextbox;
				 }
	public List<Object> checkvaluesintable() {
		 List<Object> valuesintable = new ArrayList<Object>();
		for(int i=1; i<10; i++) {
			valuesintable.add(driver.findElement(By.xpath("//*[@id='table']/thead/tr[1]/td["+i+"]")).getText());
		}
		return valuesintable;
	}
}


