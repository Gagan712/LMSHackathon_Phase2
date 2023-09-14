package pages;

import static org.testng.Assert.assertEquals;
import utilities.*;
import java.sql.DriverManager;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UserPage {

	public WebDriver driver;
	PaginationUtility Pgu = new PaginationUtility();
	SearchUtility SU = new SearchUtility();
	AscDscOrderUtility AsDs = new AscDscOrderUtility();
	String cellXPathID = "//*[@id='table']/tbody/tr/td[1]";
	String cellXPathUserName = "//*[@id='table']/tbody/tr/td[2]";
	String cellXPathLocation= "//*[@id='table']/tbody/tr/td[3]";
	String cellXPathPhoneNumber = "//*[@id='table']/tbody/tr/td[4]";
	static int Flag;

	@FindBy(linkText = "User")
	WebElement userlink;
	@FindBy(id = "Header")
	WebElement header;
	@FindBy(id = "IDHeader")
	WebElement IDHeader;
	@FindBy(id = "NameHeader")
	WebElement NameHeader;
	@FindBy(id = "LocationHeader")
	WebElement LocationHeader;
	@FindBy(id = "PhoneNumberHeader")
	WebElement PhoneNumberHeader;
	@FindBy(id = "EditHeader")
	WebElement EditHeader;
	@FindBy(id = "DeleteHeader")
	WebElement DeleteHeader;
	@FindBy(id = "Footer")
	WebElement footer;
	@FindBy(linkText = "Paginator")
	WebElement pagntr;
	@FindBy(linkText = "A New User")
	WebElement userbtn;

	
	

	// UserDetail Window
	@FindBy(id = "Userpopup")
	WebElement Userpop;
	@FindBy(id = "first name")
	WebElement FirstName;
	@FindBy(id = "Middle Name")
	WebElement   MiddleName;
	
	@FindBy(id = "Last Name")
	WebElement LastName;
	@FindBy(id = "Location")
	WebElement Location;
	@FindBy(id = "phone")
	WebElement phone;
	@FindBy(id = "linkedin Url")
	WebElement linkedinUrl;
	@FindBy(id = "User Role")
	WebElement UserRole;
	@FindBy(id = "Role Status")
	WebElement RoleStatus;
	@FindBy(id = "Visa Status")
	WebElement VisaStatus;
	@FindBy(id = "email")
	WebElement email;
	@FindBy(id = "Undergraduate")
	WebElement Undergraduate;
	
	@FindBy(id = "postgraduate")
	WebElement postgraduate;
	@FindBy(id = "time zone")
	WebElement timezone;
	@FindBy(id = "user comments")
	WebElement usercomments;
	
	
	@FindBy(linkText = "Save button")
	WebElement savebtn;
	@FindBy(linkText = "cancel button")
	WebElement cancelbtn;
	@FindBy(xpath = "div//div//a ")
	By errormsg;
	@FindBy(id = "successMessage")
	By successmsg;

	
	
	
	
	
	// Edit and Delete
	@FindBy(id = "yes button")
	WebElement yesbtn;
	@FindBy(id = "edit button")
	WebElement editbtn;
	@FindBy(id = "updatedMsg")
	WebElement updatedMsg;
	@FindBy(id = "deletebutton1")
	WebElement deleteButton1;
	@FindBy(id = "deletebutton2")
	WebElement deleteButton2;
	
	
	// multiple delete

	@FindBy(id = "Main delete button")
	WebElement maindeleteBtn;
	@FindBy(id = "checkbox1")
	WebElement checkBox1;
	@FindBy(id = "checkbox2")
	WebElement checkBox2;
	@FindBy(id = "UserName1")
	WebElement userName1;
	@FindBy(id = "UserName2")
	WebElement userName2;

	// check box
	@FindBy(id = "firstCheckbox")
	WebElement firstCheckbox;
	@FindBy(xpath = "//*[@class='checkbox']//*[@type='Checkbox']")
	List<WebElement> allCheckbox;

	// Pagination
	@FindBy(className = "paginate_button current")
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

	// Search
	@FindBy(id = "searchText")
	WebElement searchText;
	@FindBy(id = "searchBtn")
	WebElement searchBtn;
	@FindBy(id = "searchTextbox")
	WebElement searchTxtBox;

	@FindBy(xpath = "//*[@id='table']/tbody/tr/td")
	List<WebElement> tableData;
	@FindBy(xpath = "//section[//*[@id='table']]")
	WebElement tableContainer;

	// Ascending and descending
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[1]")
	WebElement sortBtn_ProName;
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[2]")
	WebElement sortBtn_ProDesc;
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[4]")
	WebElement sortBtn_ProStatus;
	@FindBy(xpath = "//*[@id='table']/tbody/tr/td")
	List<WebElement> ascTableData;
	@FindBy(xpath = "//*[@id='table']/tbody/tr/td")
	List<WebElement> descTableData;

	// no of rows
	@FindBy(xpath = "//*[@id='table']/tbody/tr")
	List<WebElement> usertablerow;
	
	
	//Alert msg
	@FindBy(xpath="//*[@id='alert-msg")
	WebElement alertmsg;

	public void initializedriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public void homepage() {

		LoggerLoad.info("User lands on Login PAge");
		driver.get("https://test-lmsapplication.com");
		PageFactory.initElements(driver, this);
	}

	public void clickuserlink() {
		LoggerLoad.info("User page");
		userlink.click();
	}

	public String verifyHeaderText() {
		LoggerLoad.info("Admin see the header Text");

		// assertEquals(header.getText(), expheaderTxt);
		String actualHeaderText = header.getText();
		return actualHeaderText;
	}

	public String verifyColumnHeaderText(String headers) {
		LoggerLoad.info("Admin/User/Staff see the verifyColumnHeaderText");

		String headertext = driver.findElement(By.linkText(headers)).getText();
		return headertext;

//			assertEquals(IDHeader.getText(),"header");
//			assertEquals(NameHeader.getText(),"Name");
//			assertEquals(LocationHeader.getText(),"Location");
//			assertEquals(PhoneNumberHeader.getText(),"PhoneNumber");
//			assertEquals(EditHeader.getText(),"Edit");
//			assertEquals(DeleteHeader.getText(),"Delete");

	}

	public void verifyFooterText(String expfooterTxt) {
		LoggerLoad.info("Admin/User/Staff see the footer Text");
		assertEquals(footer.getText(), expfooterTxt);
	}

	// Paginator
	public void verifyPaginatorText(String paginator) {
		LoggerLoad.info("Admin/User/Staff see the paginator Text");
		pagntr.getText();
		assertEquals(pagntr.getText(), paginator);
	}

	public void verifyPaginatorTextafter(String message) {
		// Pgu.getElementText(lastPgBtn);
		Pgu.verifyElementText(message, lastPgBtn);
	}

	public void clickNextPage() throws Exception {
		LoggerLoad.info("Admin/User/Staff clicks on Enabled paginator -next button");
		Pgu.clickElement(nextPgBtn);
	}

	public void clickPrevPage() throws Exception {
		LoggerLoad.info("Admin/User/Staff clicks on Enabled paginator -prev button");
		Pgu.clickElement(prevPgBtn);
	}

	public void clickFirstPage() throws Exception {
		LoggerLoad.info("Admin/User/Staff clicks on Enabled paginator-first button");
		Pgu.clickElement(firstPgBtn);
	}

	public void clickLastPage() throws Exception {
		LoggerLoad.info("Admin/User/Staff clicks on Enabled paginator-last button");
		Pgu.clickElement(lastPgBtn);
	}

	public void verifyCurrentPageNumber(String pageNum) {
		LoggerLoad.info("Admin/User/Staff see Page number navigated to page");
		assertEquals(currentPageNumber.getText(), pageNum);
	}

	public void verifyPage() {
		LoggerLoad.info("Admin/User/Staff is on Manage user page");
		assertEquals(driver.getCurrentUrl(), "URL");
	}

	// search
	public void verifySearchText(String searchTxt) {
		LoggerLoad.info("Admin see the Search Text box has text as \"Search\"");
		assertEquals(searchText.getText(), searchTxt);

	}

	public void enterSearchText(String searchString) {
		LoggerLoad.info("Admin/User/Staff enters string to be searched" + searchString);
		new Actions(driver).sendKeys(searchTxtBox, searchString).sendKeys(searchTxtBox, Keys.ENTER).perform();
	}

	public void verifySearchResultUserName(String searchString) throws Exception {
		LoggerLoad.info("Entries for the searched are shown" + searchString);
		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathUserName);
		Assert.assertTrue("Searched Result are not Found", SU.verifySearch(data, searchString));
	}

	public void verifySearchResultUserID(String searchString) throws Exception {
		LoggerLoad.info("Entries for the searched are shown" + searchString);
		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathID);
		Assert.assertTrue("Searched Result are not Found", SU.verifySearch(data, searchString));
	}

	public void verifySearchResultLocation(String searchString) throws Exception {
		LoggerLoad.info("Entries for the searched are shown" + searchString);
		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathLocation);
		Assert.assertTrue("Searched Result are not Found", SU.verifySearch(data, searchString));
	}

		// add a new User
	public void clickNewUserbtn() {
		LoggerLoad.info("Clicks on a new user button");
			userbtn.click();
	}
	
	public String newUserOrNewassignText(String text)
	{
		
		String value=driver.findElement(By.xpath("//button[contains(text()"+text+")]")).getAttribute("value");
		return value;
	}

	public void verifyPopUPWindow(String popuptext) {
		String poptxt = Userpop.getText();
		assertEquals(poptxt, popuptext);
	}

	public void verifyNewUserWindow() {
		LoggerLoad.info("Admin is on A New User Window");
		driver.switchTo().activeElement();
		
	}
	
	public boolean verifySwitchToWindow() {
		WebElement userDetailsWindow=driver.findElement(By.cssSelector("user details"));
		if(userDetailsWindow.equals(driver.switchTo().activeElement()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	
	public void verifySearchUserNameResultFound(String searchstring) throws Exception {
		//Loggerload.info("Entries for the searched are shown" + searchstring);
		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathUserName);
		Assert.assertFalse("Searched Result are Found", SU.verifySearch(data, searchstring));

	}

	
	
	
	public void setUserWindowDetails(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14)
	{  FirstName.clear();
	   FirstName.sendKeys(string);
	   MiddleName.clear();
	   MiddleName.sendKeys(string2);
	   LastName.clear();
	   LastName.sendKeys(string3);
	   Location.clear();
	   Location.sendKeys(string4);
	   phone.clear();
	   phone.sendKeys(string5);
	   linkedinUrl.clear();
	   linkedinUrl.sendKeys(string6);
	   Select dropdown=new Select(UserRole);
	   dropdown.selectByVisibleText(string7);
	   Select dropdown2=new Select(RoleStatus);
	   dropdown2.selectByVisibleText(string8);
	   Select dropdown3=new Select(VisaStatus);
	   dropdown3.selectByVisibleText(string9);
	   email.clear();
	   email.sendKeys(string10);
	   Undergraduate.clear();
	   Undergraduate.sendKeys(string11);
	   postgraduate.clear();
	   postgraduate.sendKeys(string12);
	   timezone.clear();
	   timezone.sendKeys(string13);
	   usercomments.clear();
	   usercomments.sendKeys(string14);
	   
	}
	
	public String verifytextboxtype(String string)
	{
		String type=driver.findElement(By.id(string)).getAttribute("type");
		return type;
	}
	
	
	public String verifydropdownype(String string)
	{
		String type=driver.findElement(By.id(string)).getAttribute("type");
		return type;
	}
	
	
	

	public void clicksaveButton() {
		LoggerLoad.info("Click save button");
		savebtn.click();
	}

	public void clickCancelButton() {
		LoggerLoad.info("Click cancel button");
		cancelbtn.click();
	}

		public String verifyMsg() {
		WebElement errorMessage = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(errormsg));
		//LoggerLoad.error(errorMessage.getText());
		//assertEquals(errorMessage.getText(), message);
		String msg=errorMessage.getText();
		return msg;
		

	}

	public String getsuccessmsg() {
		WebElement successMessage = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(successmsg));
		LoggerLoad.error(successMessage.getText());
		return successMessage.getText();
	}

	// Edit Functionality

	public void clickEditButton() {
		LoggerLoad.info("Click Edit button");
		
			editbtn.click();
		
			

	}
	
	public boolean verifyEditButton() {
		LoggerLoad.info("verify Edit button");
		
			if(editbtn.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		
			

	}
	

	public void verifyUpdatedMsg(String msg) {
		LoggerLoad.info("Admin verify successful message for update");
		assertEquals(updatedMsg.getText(), msg);
	}

	// delete functionality
	public void clickOnfirstDeleteButton() {
		LoggerLoad.info("Click first Delete button on right side");
		
			deleteButton1.click();
	

	}
	public void clickOnSecondDeleteButton() {
		LoggerLoad.info("Click Second Delete button on right side");
		
			deleteButton2.click();
		

	}

	public void verifyDeleteWindowPresent() {
		LoggerLoad.info("Admin Verify that Admin is on Delete Window");
		assertEquals(driver.getTitle(), "Delete");

	}

	public void clickYesButton() {
		LoggerLoad.info("Click Yes button");
		yesbtn.click();
	}

	public void clickNoButton() {
		LoggerLoad.info("Click No button");
		// nobtn.click();
	}

	public void isUserNameDeleted(String searchstring) throws Exception {
		LoggerLoad.info("Admin check if user name is deleted");
		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathUserName);
		Assert.assertTrue("Search result not found", SU.verifySearch(data, searchstring));

	}

	// multiple delete Functionality
	public void clickmaindelete() {
		
			maindeleteBtn.click();
		
	}

	public void verifyMainDeleteBtnDisabled() {
		LoggerLoad.info("Admin verify that delete button is disabled");
		Assert.assertFalse("Delete Button is Enabled", maindeleteBtn.isEnabled());
	}
	
	public boolean verifyEnableMainBtn() {
		if(maindeleteBtn.isEnabled())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean verifySearchtextbox()
	{
		if(searchTxtBox.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void getAlertmsg() {
		alertmsg.getText();
	}
	
	public boolean verifyfirstDeletBtn() {
		if(deleteButton1.isEnabled())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean verifySecondDeletBtn() {
		if(deleteButton2.isEnabled())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public void selectMultipleCheckboxes() {
		LoggerLoad.info("Admin select check box");
		checkBox1.click();
		LoggerLoad.info("Admin select check box");
		checkBox2.click();
	}

	public void verifyMainDeleteBtnEnabled() {
		LoggerLoad.info("Admin verify that delete button is enabled");
		Assert.assertTrue("Delete Button is disabled", maindeleteBtn.isEnabled());

	}

	public void clickEnabledDeleteBtn() {
		LoggerLoad.info("Admin Click on enabled Delete button");
		if (maindeleteBtn.isEnabled()) {
			maindeleteBtn.click();
		}

	}

	public void verifyUserNameExist() throws Exception {
		LoggerLoad.info("Admin can see user Names not deleted");
		LoggerLoad.info("check if user name is deleted");
		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathUserName);
		Assert.assertTrue("Search result not found for" + userName1.getText(),
				SU.verifySearch(data, userName1.getText()));
		Assert.assertTrue("Search result not found for" + userName2.getText(),
				SU.verifySearch(data, userName2.getText()));

	}
	
	
	
	


	// checkbox functionality
	public void selectFirstCheckbox() {
		LoggerLoad.info("Admin verify that first check boxes is selected");
		firstCheckbox.click();

	}
	
	

	public void verifyAllCheckbox() {
		LoggerLoad.info("Admin verify all check boxes are checked");
		for (WebElement e : allCheckbox) {
			Assert.assertTrue("check box is not checked for" + e.getAttribute("value"), e.isSelected());

		}
	}


	
	
	
	public boolean verifyPagination() {
		if(nextPgBtn.isEnabled()&&prevPgBtn.isEnabled()&&firstPgBtn.isEnabled()&&lastPgBtn.isEnabled())
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}
	
	public boolean verifyButtonVisible(String text)	{
		Boolean visible=driver.findElement(By.linkText(text)).isDisplayed();
		return visible;
	}

}
