package pages;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import hooks.Hooks;
import net.bytebuddy.implementation.auxiliary.MethodCallProxy.AssignableSignatureCall;
import utilities.AscDscOrderUtility;
//import utilities.AscDscOrderUtility;
//import utilities.Excelreader;
import utilities.LoggerLoad;
import utilities.PaginationUtility;
import utilities.SearchUtility;
//import utilities.PaginationUtility;
//import utilities.SearchUtility;
import baseClass.BaseClass;

public class Assignment {

	WebDriver driver = Hooks.driver;
	// Excelreader read;
	PaginationUtility Pgu = new PaginationUtility();
	SearchUtility SU = new SearchUtility();
	AscDscOrderUtility AsDs = new AscDscOrderUtility();
	@FindBy(linkText = "Class")
	WebElement classlink;
	@FindBy(id = "Header")
	WebElement hr;
	@FindBy(id = "BatchId")
	WebElement BatchId;
	@FindBy(id = "ClassNo")
	WebElement ClassNo;
	@FindBy(id = "Classdate")
	WebElement Classdate;
	@FindBy(id = "ClassTopic")
	WebElement ClassTopic;
	@FindBy(id = "Staffid")
	WebElement Staffid;
	@FindBy(id = "Description")
	WebElement Classdescription;
	@FindBy(id = "Comments")
	WebElement Comments;
	@FindBy(id = "Notes")
	WebElement Notes;
	@FindBy(linkText = "Recording")
	WebElement Recording;
	@FindBy(id = "EditHeader")
	WebElement EditHeader;
	@FindBy(id = "DeleteHeader")
	WebElement DeleteHeader;
	@FindBy(id = "Multipledelete")
	WebElement Multipledelete;
	@FindBy(id = "Searchbar")
	WebElement searchbar;
	@FindBy(id = "addnewclass")
	WebElement Addnewclass;
	@FindBy(name = "editbutton")
	WebElement editbutton;
	@FindBy(name = "deletebutton")
	WebElement deletebutton;
	@FindBy(name = "savebutton")
	WebElement savebutton;
	@FindBy(name = "closebutton")
	WebElement closebutton;
	@FindBy(xpath = "//*[@id='table']/tbody/tr[1]/td[1]")
	WebElement batchidintable;
	@FindBy(xpath = "//*[@id='table']/tbody/tr[1]/td[2]")
	WebElement classnointable;
	@FindBy(xpath = "//*[@id='table']/tbody/tr[1]/td[3]")
	WebElement classdateintable;
	@FindBy(xpath = "//*[@id='table']/tbody/tr[1]/td[4]")
	WebElement classtopicintable;
	@FindBy(xpath = "//*[@id='table']/tbody/tr[1]/td[5]")
	WebElement staffidintable;
	@FindBy(id = "dropdown")
	WebElement dropdownforbatchid;
	@FindBy(id = "dropdownstaff")
	WebElement dropdownforstaffid;
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[1]")
	WebElement sortBtn_BatchId;
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[2]")
	WebElement sortBtn_ClassNo;
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[4]")
	WebElement sortBtn_ClassDate;
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[1]")
	WebElement sortBtn_ClassTopic;
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[2]")
	WebElement sortBtn_StaffId;
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[4]")
	WebElement sortBtn_Descripton;
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[2]")
	WebElement sortBtn_Comments;
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[4]")
	WebElement sortBtn_Notes;
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[1]")
	WebElement sortBtn_Recording;
	@FindBy(xpath = "//*[@id='table']/tbody/tr/td")
	List<WebElement> ascTableData;
	@FindBy(xpath = "//*[@id='table']/tbody/tr/td")
	List<WebElement> descTableData;
	@FindBy(id = "entries")
	WebElement showingentries;
	@FindBy(id = "totalentries")
	WebElement totalentries;
	@FindBy(id = "firstCheckbox")
	WebElement firstCheckbox;
	@FindBy(xpath = "//*[@class='checkbox']//*[@type='Checkbox']")
	List<WebElement> allCheckbox;
	@FindBy(xpath = "//*[@id='oldSelectbatch']")
	List<WebElement> dropdownentryforbatchid;
	@FindBy(id = "datepicker")
	WebElement calendarclick;
	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']//td")
	List<WebElement> calendar;

	// Pagination
	@FindBy(id = "paginate_button current")
	WebElement currentPageNumber;
	@FindBy(id = "nextPgBtn")
	WebElement nextPgBtn;
	@FindBy(id = "prevPgBtn")
	WebElement prevPgBtn;
	@FindBy(id = "firstPgBtn")
	WebElement firstPgBtn;
	@FindBy(id = "lastPgBtn")
	WebElement lastPgBtn;
	@FindBy(id = "PgText")
	WebElement pgText;

	public Assignment(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void homepage() {
		LoggerLoad.info("User lands on Login PAge");
		driver.get("https://test-lmsapplication.com");
	}

	public void clickAssignmentlink() {
		LoggerLoad.info("Assignment page");
		Assignmentlink.click();
	}

	public String ManageAssignmentUrl() {
		String Url = driver.getCurrentUrl();
		return Url;
	}

	public long pageloadtime() {
		long start = System.currentTimeMillis();
		Assignmentlink.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(Assignmentlink));
		long end = System.currentTimeMillis();
		long totaltime = end - start;
		return totaltime;
	}

	public String verifyHeaderText() {
		LoggerLoad.info("Admin/User/Staff see the header Text");
		String headers = hr.getText();
		return headers;
	}

	public List<Object> verifyColumnHeaderText() {
		LoggerLoad.info("Admin/User/Staff see the verifyColumnHeaderText");
		List<Object> headerlist = new ArrayList<Object>();
		headerlist.add(BatchId.getText());
		WebElement AssignmentNo = null;
		headerlist.add(AssignmentNo.getText());
		WebElement Assignmentdate = null;
		headerlist.add(Assignmentdate.getText());
		WebElement AssignmentTopic = null;
		headerlist.add(AssignmentTopic.getText());
		headerlist.add(Staffid.getText());
		WebElement Assignmentdescription;
	//	headerlist.add(Assignmentdescription.getText());
		headerlist.add(Comments.getText());
		headerlist.add(Notes.getText());
		headerlist.add(Recording.getText());
		headerlist.add(EditHeader.getText());
		headerlist.add(DeleteHeader.getText());

		return headerlist;

	}

	public boolean verifymaindeletedisabled() {
		if (DeleteHeader.isEnabled()) {
			return true;
		} else {
			return false;
		}

	}

	public boolean searchbarpresent() {
		if (searchbar.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean addnewAssignmentpresent() {
		WebElement AddnewAssignment = null;
		if (AddnewAssignment.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean editbuttonenabled() {
		if (editbutton.isEnabled()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifydataintable() {
		List<Object> data = new ArrayList<Object>();
		data.add(batchidintable.getText());
		WebElement Assignmenttopicintable = null;
		data.add(Assignmenttopicintable.getText());
		data.add(staffidintable.getText());
		if (data.isEmpty()) {
			return false;
		} else {
			return true;
		}

	}

	public boolean deletebuttonenabled() {
		if (deletebutton.isEnabled()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean sortinginheaders() {
		List<WebElement> listing = new ArrayList<WebElement>();
		boolean resl = false;
		listing.add(sortBtn_BatchId);
		WebElement sortBtn_AssignmentNo = null;
		listing.add(sortBtn_AssignmentNo);
		WebElement sortBtn_AssignmentDate = null;
		listing.add(sortBtn_AssignmentDate);
		WebElement sortBtn_AssignmentTopic = null;
		listing.add(sortBtn_AssignmentTopic);
		listing.add(sortBtn_StaffId);
		listing.add(sortBtn_Descripton);
		listing.add(sortBtn_Comments);
		listing.add(sortBtn_Notes);
		listing.add(sortBtn_Recording);
		for (WebElement e : listing) {
			if (e.isDisplayed()) {
				return true;
			}
		}
		return resl;

	}

	public boolean checkboxesclick() {

		boolean check = false;
		for (int i = 0; i <= allCheckbox.size(); i++) {
			allCheckbox.get(i).click();
			if (allCheckbox.get(i).isSelected()) {
				return true;
			}
		}
		return check;

	}

	public String entriestext() {
		String entry = showingentries.getText();
		return entry;
	}

	public boolean nextpage() {
		boolean ren = false;
		int pagenumber = Integer.parseInt(currentPageNumber.getText());
		nextPgBtn.click();
		if (pagenumber == pagenumber + 1) {
			return true;
		}
		return ren;
	}

	public boolean previouspage() {
		boolean rent = false;
		int pagenumber = Integer.parseInt(currentPageNumber.getText());
		prevPgBtn.click();
		if (pagenumber == pagenumber - 1) {
			return true;
		}
		return rent;
	}

	public boolean firstpage() {
		boolean ren = false;
		int pagenumber = Integer.parseInt(currentPageNumber.getText());
		firstPgBtn.click();
		if (pagenumber == 1) {
			return true;
		}
		return ren;
	}

	public boolean lastpage() {
		String text = totalentries.getText(); // "In total there are 3 Assignments"
		String totalpages = text.substring(19, 21);
		int totalpage = Integer.parseInt(totalpages);
		boolean rentt = false;
		int pagenumber = Integer.parseInt(currentPageNumber.getText());
		lastPgBtn.click();
		if (pagenumber == totalpage) {
			return true;
		}
		return rentt;
	}

	public String totallyAssignmentes() {
		String tets = totalentries.getText();
		return tets;
	}

	public void clicksearhbox() {
		searchbar.click();
	}

//		public void enterbatchid(String testid) {
//			read = new Excelreader("1");
//			searchbar.sendKeys(read.getdata());
//		}

	public String batchidintable() {
		String txt = batchidintable.getText();
		return txt;
	}

//		public void invalidbatchid(String testid) {
//			read = new Excelreader("3");
//			searchbar.sendKeys(read.getdata());
//		}
	public boolean emptybatchdetails() {
		String datas = batchidintable.getText();
		if (datas.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}

//		public void enterAssignmentno(String testid) {
//			read = new Excelreader("4");
//			searchbar.sendKeys(read.getdata());
//		}
	public int Assignmentnointable() {
		int txt = Integer.parseInt(batchidintable.getText());
		return txt;
	}
//		public void invalidAssignmentno(String testid) {
//			read = new Excelreader("5");
//			searchbar.sendKeys(read.getdata());
//		}
//	
//		public void enterAssignmenttopic(String testid) {
//			read = new Excelreader("6");
//			searchbar.sendKeys(read.getdata());
//		}

	//public String Assignmenttopicintable() {
	//	WebElement Assignmenttopicintable;
	//	String txtss = Assignmenttopicintable.getText();
	//	return txtss;
	//}

//		public void invalidAssignmenttopic(String testid) {
//			read = new Excelreader("7");
//			searchbar.sendKeys(read.getdata());
//		}
//		public void enterstaffid(String testid) {
//			read = new Excelreader("8");
//			searchbar.sendKeys(read.getdata());
//		}
	public int staffidintable() {
		int txt = Integer.parseInt(staffidintable.getText());
		return txt;
	}

//		public void invalidstaffid(String testid) {
//			read = new Excelreader("9");
//			searchbar.sendKeys(read.getdata());
//		}
	public String Assignmentdateintable() {
		WebElement Assignmentdateintable = null;
		String txtss = Assignmentdateintable.getText();
		return txtss;
	}
//		public void enterAssignmentdate(String testid) {
//			read = new Excelreader("10");
//			searchbar.sendKeys(read.getdata());
//		}
//		
//		public void invalidAssignmentdate(String testid) {
//			read = new Excelreader("11");
//			searchbar.sendKeys(read.getdata());
//		}

	public void clickaddnewAssignment() {
		WebElement AddnewAssignment = null;
		AddnewAssignment.click();
	}

	public void clickdropdownforbatchid() {
		dropdownforbatchid.click();
	}

	public List<String> checklistforbatchid() {
		List<String> entryforbatchid = new ArrayList<String>();
		for (WebElement e : dropdownentryforbatchid) {
			entryforbatchid.add(e.getText());
		}
		return entryforbatchid;

	}

	public void clickdropdownforstaffid() {
		dropdownforstaffid.click();
	}

	public List<Object> checklistforstaffid() {
		List<Object> entryforstaffid = new ArrayList<Object>();
		for (WebElement e : dropdownentryforbatchid) {
			entryforstaffid.add(e.getText());
		}
		return entryforstaffid;

	}

	public boolean calendarclick() {
		boolean displayresult = calendarclick.isDisplayed();
		return displayresult;
	}

	public boolean viewsave() {
		boolean displayreslt = savebutton.isDisplayed();
		return displayreslt;
	}

	public boolean viewdelete() {
		boolean displayrslt = deletebutton.isDisplayed();
		return displayrslt;
	}

	public boolean viewclose() {
		boolean displarslt = closebutton.isDisplayed();
		return displarslt;
	}

	// part 2 Assignment

	//PaginationUtility Pgu = new PaginationUtility();
	//SearchUtility SU = new SearchUtility();
	//AscDscOrderUtility AsDs = new AscDscOrderUtility();

	String cellXBatchID = "//*[@id='table']/tbody/tr[1]/td[1]";
	String cellXPathClassName = "//*[@id='table']/tbody/tr/td[2]";

	@FindBy(xpath = "//*[@id='table']/tbody/tr/td")
	List<WebElement> tableData;
	@FindBy(xpath = "//section[//*[@id='table']]")
	WebElement tableContainer;

	@FindBy(id = "entries")
	WebElement numberofEntries;
	
	@FindBy(linkText = "Student")
	WebElement Studentlink;

	@FindBy(linkText = "Program")
	WebElement Programlink;
	
	@FindBy(linkText = "Batch")
	WebElement Batchlink;
	@FindBy(linkText = "User")
	WebElement Userlink;
	@FindBy(linkText = "Assignment")
	WebElement Assignmentlink;
	@FindBy(linkText = "Attendance")
	WebElement Attendancelink;
	@FindBy(linkText = "Logout")
	WebElement Logoutlink;

	@FindBy(id="yes button") 
	WebElement yesbtn;
	@FindBy(id="no button")
	WebElement nobtn;
	
	
	@FindBy(xpath="div//div//a ") 
	WebElement errormsg;
	 @FindBy(id = "successMessage") 
	 WebElement successmsg;
	
	public void clickonNavigatiobButton(String module)
	{
		if(module.equalsIgnoreCase("Student"))
		{
			Studentlink.click();
		}
		else if(module.equalsIgnoreCase("Program"))
		{
			Programlink.click();
		}
		else if (module.equalsIgnoreCase("Batch"))
		{
			Batchlink.click();
		}
		else if (module.equalsIgnoreCase("User"))
		{
			Userlink.click();
		}
		else if(module.equalsIgnoreCase("Assignment"))
		{
			Assignmentlink.click();
		}
		else if(module.equalsIgnoreCase("Attendance"))
		{
			Attendancelink.click();
		}
		else if(module.equalsIgnoreCase("logout"))
		{
			Logoutlink.click();
		}
	}

	public void clickonBatchID() {
		sortBtn_BatchId.click();
	}

	public void doubleclickonBatchID() {
		Actions action = new Actions(driver);
		action.doubleClick(sortBtn_BatchId).perform();

	}

	// Ascending order
	public void verifyASCOrder_Batchid() {
		LoggerLoad.info("Admin/User/Staff see the result displayed in Ascending order");
		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXBatchID);
		Assert.assertTrue(AsDs.verifyAscendingOrder(data), "Results are in not in Asceding Order");
	}

	// descending order
	public void verifyDESCOrder_Batchid() {
		LoggerLoad.info("Admin/User/Staff see the result displayed in Descending order");
		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXBatchID);
		Assert.assertTrue(AsDs.verifyDescendingOrder(data), "Results are not in Desceding Order");
	}

	public boolean verifyPageAvailableFirstPage() {
		String enTriesString = numberofEntries.getAttribute("value");

		int entries = Integer.parseInt(enTriesString);
		if (entries > 1 ) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifyleftRightArrowinFirstPage (String entry) {

		int entries = Integer.parseInt(entry);
		
		
		if (entries > 5)
		{
			if (nextPgBtn.isEnabled()) {
				if (prevPgBtn.isEnabled()) {
					return  false;
				}
			}
			else
			{
				return true;
			}
			
			
		}
		else
		{
			if(nextPgBtn.isEnabled()||prevPgBtn.isEnabled())
			{
				return false;
			}
		}
		return false;
		
		
		

	}
	
	public boolean verifyLeftRightPageTwo(String entry) {
		
		int entries = Integer.parseInt(entry);
		if(entries>10)
		{
			if(prevPgBtn.isEnabled()&&nextPgBtn.isEnabled())
			{
				return false;
			}
			else
			{
				return true;
			}
			
		}
		else
		{
			if(prevPgBtn.isEnabled())
			{
				if(nextPgBtn.isEnabled())
				{
					return false;
				}
				return true;
			}
			
		}
		
		return false;
		
		
		
	}
	
	public boolean verifyLeftArrowPagetwo()
	{
		if(prevPgBtn.isEnabled())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public void selectFirstcheckbox() {
		firstCheckbox.click();
	}
	
	public boolean Firstcheckboxclick() {

		
			if (firstCheckbox.isSelected()) {
				return true;
			}
			else {
		return false;
			}
	}
	
	public boolean verifycheckboxesclick() {

		for (int i = 0; i <= allCheckbox.size(); i++) {
			if (!allCheckbox.get(i).isSelected()) {
				return false;
			}
		}
		return true;

	}

	
	
	public void clickOndeleteheader() {
		DeleteHeader.click();
	}
	public void clickYesButton() {
		LoggerLoad.info("Click Yes button");
		yesbtn.click();
	}

	public void clickNoButton() {
		LoggerLoad.info("Click No button");
		nobtn.click();
	}

	
	public String verifyMsg() {
		String msg=successmsg.getText();
		return msg;

	}
	
	public void verifySearchResultAssignmentName(String searchString) throws Exception {
		LoggerLoad.info("Entries for the searched are shown" + searchString);
		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathClassName);
		Assert.assertTrue(SU.verifySearch(data, searchString), "Searched Result are not Found");
	}


	
}
