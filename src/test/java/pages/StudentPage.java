package pages;

import static org.testng.Assert.assertEquals;
import utilities.PaginationUtility;
import utilities.SearchUtility;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import baseClass.BaseClass;
import utilities.AscDscOrderUtility;
import utilities.ConfigReader;
import utilities.LoggerLoad;
import utilities.SearchUtility;
import org.openqa.selenium.support.ui.Select;

public class StudentPage {

	public static WebDriver driver = BaseClass.getDriver();
	String url = ConfigReader.loginUrl();
	public StudentPage() {
	PageFactory.initElements(driver,this);
	
	}
	
	PaginationUtility Pgu = new PaginationUtility();
	SearchUtility SU = new SearchUtility();
	AscDscOrderUtility AsDs = new AscDscOrderUtility();
	
	String cellXPathStudentName = "//*[@id='table']/tbody/tr/td[1]";
	@FindBy(id ="id_username") WebElement username;
	@FindBy(id ="id_password") WebElement passwrd;
	@FindBy(id ="Student")WebElement student;
	@FindBy(id ="Student")WebElement Batchid;
	@FindBy(id ="Student")WebElement studentname;
	@FindBy(id ="Student")WebElement studentname1;
	@FindBy(id = "LMS Title")WebElement TitleLMS;
	@FindBy(id = "Logout") WebElement Log_out;
	@FindBy(id = "Dropdown-Example") WebElement dropDown;
	@FindBy(id = "/select[@name=’selType’]") WebElement StudentName;
	@FindBy(id = "/select[@ID=’selType’]") WebElement BatchID;
	@FindBy(className ="Select Student Text") WebElement Student_Text;
	@FindBy(className ="Select Batch ID Text") WebElement Batch_Text;
	@FindBy(xpath ="/html/body/div/div/text/color")WebElement StudentColor;
	@FindBy(xpath ="/html/body/div/div/txt/color")WebElement BatchColor;
	@FindBy(xpath ="/html/body/div/div[2]/form/div/div")WebElement ProgramLink;
	@FindBy(xpath ="/html/body/div/div[2]/form/div")WebElement BatchLink;
	@FindBy(xpath ="/html/body/div/div[2]/form")WebElement ClassLink;
	@FindBy(xpath ="/html/body/div[2]/div/div[1]/div/a")WebElement UserLink;
	@FindBy(xpath ="/html/body/div[2]/div/div[1]/div")WebElement AssignmentLink;
	@FindBy(xpath ="/html/body/div[2]/div/div[1]")WebElement AttendanceLink;
	@FindBy(xpath ="//*[@id='oldSelectMenu']")WebElement DropDownName;
	@FindBy(xpath="//*[@class='dropdown-menu Name']/a[1]")@CacheLookup WebElement FirstMenuName;
	@FindBy(xpath="//*[@class='dropdown- Name']/a")@CacheLookup WebElement SecondMenuName;
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/form/input[4]")WebElement btnLogin;
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/form/input[4]")WebElement batchDropDown;
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/form")WebElement studentDropDown;
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/form")WebElement studentDropDownSearch;
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/form")WebElement SearchBox;
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/form")WebElement 	SearchBoxBatch;
	@FindBy(xpath = "//section[//*[@id='table']]")WebElement tableContainer;
	@FindBy(xpath="Student Details Title")WebElement StudentTitle;
	@FindBy(xpath ="Dropdown Menu")WebElement DropMenu;

	
	public String Get_tittle(){
		return driver.getTitle();
	}
	
	public String Current_Page_Title() {
		 return driver.getTitle().trim();
	}
	
	public void Student(){
		student.click();
	}
	
	public void Navigation_Time_Student() throws InterruptedException {
		BaseClass.getDriver().navigate().back();
		Thread.sleep(1000);
		long startTime = System.currentTimeMillis();
		 WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
		 WebElement manageDashboard= new WebDriverWait(driver,Duration.ofSeconds(30))
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='accordion']/div[2]/div/h4/a")));
				
		Assert.assertTrue(manageDashboard.isDisplayed(), "Login is not displayed");
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Response Time: " + totalTime + " milliseconds");
	    long expectedResponseTime = 30;
	    Assert.assertTrue(totalTime <= expectedResponseTime, "Response time is longer than expected");
	    
	}
	
	public void verifyLink_student() {
		try {
		URL link = new URL(url);
		HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
		httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
		httpURLConnection.connect();

		if (httpURLConnection.getResponseCode()> 400) {
		System.out.println(url + " - " + httpURLConnection.getResponseMessage());
		} else {
		System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
	}
	} 	catch (Exception e) {
		System.out.println(url + " - " + "is a broken link");
	}
	}
		public String verifyTitle() {
			LoggerLoad.info("Admin see the LMS Title");
			String LMS_Title = TitleLMS.getText();
			return LMS_Title;
	}
	
		public void Student_Title_Alignment() {
			  assertEquals("Center",StudentTitle.getAttribute("align"));
	}
		public void Click_DropDown() {
			DropMenu.click();
	}
	
		public String Select_Student_Text() {

			return Student_Text.getText();

	}
		public String Select_BatchID_Text() {

			return Batch_Text.getText();

	}
		public String Student_Text_Color() {
			
			String StudentText = StudentColor.getCssValue("color");
			return StudentText;
	
	}
		public String Batch_Text_Color() {
			
			String BatchText = BatchColor.getCssValue("color");
			return BatchText;
	
	}
		
		public String getCurrentPageTitle() {
			 return driver.getTitle().trim();
	}
		
		public void Click_Program() {
			ProgramLink.click();
	
	}

		public String Page_gettitle() {
			return driver.getTitle();

	}
		public void Click_Batch() {
			BatchLink.click();
	
	}
		public void Click_Class() {
			ClassLink.click();
	
	}
		public void Click_User() {
			UserLink.click();
	
	}
		public void Click_Assignment() {
			AssignmentLink.click();
	
	}
		public void Click_Attendance() {
			AttendanceLink.click();
		
	}
		public void LMSLogout() {
			Log_out.click();
	}
		
		public void dropdownvalues() {
		
		String expectedOptions[] = { "Select", "3456", "5678", "7890" };
		Select s = new Select(dropDown);
		List<WebElement> options= s.getOptions();
		boolean match  = false;
		for (int i=0; i<options.size(); i++) {
			System.out.println(options.get(i).getText()+" == "+ expectedOptions[i]);
			if(options.get(i).getText().equals(expectedOptions[i])) {
				match = true;
			}
			
			Assert.assertTrue(match);
	}
	}
		
		public String CheckfirstDropdownText() {
			Select x= new Select(FirstMenuName);
			x.selectByIndex(0);
			WebElement FirstText = x.getFirstSelectedOption();
			String OptionSel = FirstText.getText();
			return OptionSel;
	}
		
		public String CheckSecondDropdownText() {
			Select x= new Select(SecondMenuName);
			x.selectByIndex(0);
			WebElement Text = x.getFirstSelectedOption();
			String OptionSelect = Text.getText();
			return OptionSelect;
	}
		
		public void Select_Student_Name() {
		StudentName.click();
		Select s = new Select(StudentName);
	      // select an option by value method
	      s.selectByValue("Robert");
	      
	}
		
		public void Select_BatchID() {
		BatchID.click();
		Select s = new Select(BatchID);
		      // select an option by value method
		s.selectByValue("8428");
		      
	}
		
		public void BatchIDTextVisibility() {
			Assert.assertFalse(BatchID.isDisplayed());
			
	}
		
		public void StudentNameTextVisibility() {
			Assert.assertFalse(studentname.isDisplayed());
	}
		
		public void DropDownScrollBatch() {
                // Create instance of Javascript executor
                JavascriptExecutor je = (JavascriptExecutor) driver;
                je.executeScript("arguments[0].scrollIntoView(true);",BatchID);
	}
		
		public void DropDownScrollStudent() {
            // Create instance of Javascript executor
            JavascriptExecutor je = (JavascriptExecutor) driver;
            je.executeScript("arguments[0].scrollIntoView(true);",BatchID);
	}

		
		public void StudentSearchBox() {
				Assert.assertTrue(studentDropDownSearch.isSelected());
				Assert.assertTrue(SearchBox.isDisplayed());
	}
	
		public void BatchSearchBox() {
			Assert.assertTrue(batchDropDown.isSelected());
			Assert.assertTrue(SearchBoxBatch.isDisplayed());
	}
		
		public void verifystudentinfo () throws Exception {
			ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathStudentName);
			Assert.assertEquals("Search result found for" + studentname.getText(),
			SU.verifySearch(data, studentname.getText()));
			Assert.assertEquals("Search result found for" + studentname1.getText(),
			SU.verifySearch(data, studentname1.getText()));	
			
	}
		
	}
		
		

		
		
		
