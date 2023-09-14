 package pages;
 	import static org.testng.Assert.assertEquals;

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
	import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.AscDscOrderUtility;
import utilities.LoggerLoad;
import utilities.PaginationUtility;
import utilities.SearchUtility;
	    
	public class Program_POM {
		 
		// public static WebDriver driver = BaseClass.getDriver();
		public WebDriver driver;
		PaginationUtility Pgu = new PaginationUtility();
		SearchUtility SU = new SearchUtility();
		AscDscOrderUtility AsDs = new AscDscOrderUtility();
		String cellXPathProgramName = "//*[@id='table']/tbody/tr/td[1]";
		String cellXPathProgramDesc = "//*[@id='table']/tbody/tr/td[2]";
		String cellXPathProgramStatus = "//*[@id='table']/tbody/tr/td[3]";
		static int Flag;
	    
		
		 @FindBy(linkText="Program") WebElement programlink;
		 @FindBy(id = "Header")WebElement header;
		 @FindBy(id = "ProgramnameHeader")WebElement ProgramnameHeader;
		 @FindBy(id = "ProgramDescriptionHeader")WebElement ProgramDescriptionHeader;
		 @FindBy(id = "ProgramstatusHeader")WebElement ProgramstatusHeader;
		 @FindBy(id = "EditHeader")WebElement EditHeader;
		 @FindBy(id="DeleteHeader")WebElement DeleteHeader;
		  @FindBy(id = "Footer")WebElement footer;
		 @FindBy(linkText="Paginator") WebElement pagntr;
		 @FindBy(linkText="A New Program") WebElement programbtn;
		 
		 //Program Detail Window
		 @FindBy(id="programpopup") WebElement programpop;
		 @FindBy(id="programdetail name") WebElement programName;
		 @FindBy(id="program description") WebElement programDescription;
		 @FindBy(id = "prgmStatusActive")WebElement radioActive;
		 @FindBy(id = "prgmStatusInActive")WebElement radioInActive;
		 @FindBy (linkText="Save button") WebElement savebtn;
		 @FindBy(linkText="cancel button") WebElement cancelbtn;
		 @FindBy(xpath="div//div//a ") By errormsg;
		 @FindBy(id = "successMessage") By successmsg;
		 
		 //Edit and Delete 
		 @FindBy(id="yes button") WebElement yesbtn;		 
		 @FindBy(id="edit button") WebElement editbtn;
		 @FindBy(id = "updatedMsg")WebElement updatedMsg;
		 @FindBy(id="right delete button") WebElement rightdeletebtn;
		 
		 //multiple delete 
		 
		 @FindBy(id = "Main delete button")WebElement maindeleteBtn;
		 @FindBy(id = "checkbox1")WebElement checkBox1;
		 @FindBy(id = "checkbox2")WebElement checkBox2; 
		 @FindBy(id = "prgName1")WebElement prgName1;
		 @FindBy(id = "prgName2")WebElement prgName2;
		 
		 //check box
		 @FindBy(id = "firstCheckbox")WebElement firstCheckbox;
		 @FindBy(xpath = "//*[@class='checkbox']//*[@type='Checkbox']")List<WebElement> allCheckbox;
			
		 
		 //Pagination
		 @FindBy(className = "paginate_button current")WebElement currentPageNumber;
		 @FindBy(id = "nextPgBtn")WebElement nextPgBtn;
		 @FindBy(id = "prevPgBtn")WebElement prevPgBtn;
		 @FindBy(id = "firstPgBtn")WebElement firstPgBtn;
		 @FindBy(id = "lastPgBtn")WebElement lastPgBtn;
		 @FindBy(id = "PgText")WebElement pgText;
		 
		 //Search
		 @FindBy(id = "searchText")WebElement searchText;
		 @FindBy(id = "searchBtn")WebElement searchBtn;
		 @FindBy(id = "searchTextbox")WebElement searchTxtBox;
		 
		 
		 @FindBy(xpath = "//*[@id='table']/tbody/tr/td")List<WebElement> tableData;
		 @FindBy(xpath = "//section[//*[@id='table']]")WebElement tableContainer;
		 
		 //Ascending and descending
		 @FindBy(xpath = "//*[@id='table']/thead/tr/th[1]")WebElement sortBtn_ProName;
		 @FindBy(xpath = "//*[@id='table']/thead/tr/th[2]")WebElement sortBtn_ProDesc;
		 @FindBy(xpath = "//*[@id='table']/thead/tr/th[4]")WebElement sortBtn_ProStatus;
		 @FindBy(xpath = "//*[@id='table']/tbody/tr/td")List<WebElement> ascTableData;
		 @FindBy(xpath = "//*[@id='table']/tbody/tr/td")List<WebElement> descTableData;
		 
		 //no of rows
		 @FindBy(xpath="//*[@id='table']/tbody/tr")List<WebElement> programtablerow;
		
		 
		      public void initializedriver()
		      {
		    	  WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
		      } 
		    	  
		      
		      public void homepage() {
		      
				LoggerLoad.info("User lands on Login PAge");
				driver.get("https://test-lmsapplication.com");
				PageFactory.initElements(driver, this);
			}

			public void clickprogramlink() {
				LoggerLoad.info("Program page");
				programlink.click();
			}
			
			public void ManageprogramUrl() {
				String Url= driver.getCurrentUrl(); 
				Assert.assertEquals("manageprogram",Url.contains("manageprogram"));
			}
			public void verifyHeaderText(String expheaderTxt) {
				LoggerLoad.info("Admin/User/Staff see the header Text");

				assertEquals(header.getText(), expheaderTxt);
			}

			public void verifyColumnHeaderText()  {
				LoggerLoad.info("Admin/User/Staff see the verifyColumnHeaderText");

				assertEquals(ProgramnameHeader.getText(),"Program Name");
				assertEquals(ProgramDescriptionHeader.getText(),"Program Description");
				assertEquals(ProgramstatusHeader.getText(),"Program Status");
				assertEquals(EditHeader.getText(),"Edit");
				assertEquals(DeleteHeader.getText(),"Delete");
				 
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
				LoggerLoad.info("Admin/User/Staff is on Manage Program page");
				assertEquals(driver.getCurrentUrl(), "URL");
			}

			// search
			public void verifySearchText(String searchTxt) {
				LoggerLoad.info("Admin/User/Staff see the Search Text box has text as \"Search\"");
				assertEquals(searchText.getText(), searchTxt);

			}

			public void enterSearchText(String searchString) {
				LoggerLoad.info("Admin/User/Staff enters string to be searched" + searchString);
				new Actions(driver).sendKeys(searchTxtBox, searchString).sendKeys(searchTxtBox, Keys.ENTER).perform();
			}

			public void verifySearchResultProgramName(String searchString) throws Exception {
				LoggerLoad.info("Entries for the searched are shown" + searchString);
				ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathProgramName);
				Assert.assertTrue("Searched Result are not Found", SU.verifySearch(data, searchString));
			}

			public void verifySearchResultProgramDesc(String searchString) throws Exception {
				LoggerLoad.info("Entries for the searched are shown" + searchString);
				ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathProgramDesc);
				Assert.assertTrue("Searched Result are not Found", SU.verifySearch(data, searchString));
			}

			public void verifySearchResultProgramStatus(String searchString) throws Exception {
				LoggerLoad.info("Entries for the searched are shown" + searchString);
				ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathProgramStatus);
				Assert.assertTrue("Searched Result are not Found", SU.verifySearch(data, searchString));
			}

			// sorting
			public void clickOnSortBtn_Name() {
				LoggerLoad.info("Admin/User/Staff Clicks on Program Name Sorting Arrow");
				sortBtn_ProName.click();
			}

			public void clickOnSortBtn_Desc() {
				LoggerLoad.info("Admin/User/Staff Clicks on Program Description Sorting Arrow");
				sortBtn_ProDesc.click();
			}

			public void clickOnSortBtn_Status() {
				LoggerLoad.info("Admin/User/Staff Clicks Program Status Sorting Arrow");
				sortBtn_ProStatus.click();
			}

			// Ascending order
			public void verifyASCOrder_Name() {
				LoggerLoad.info("Admin/User/Staff see the result displayed in Ascending order");
				ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathProgramName);
				Assert.assertTrue("Results are in not in Asceding Order", AsDs.verifyAscendingOrder(data));
			}

			public void verifyASCOrder_Desc() {
				LoggerLoad.info("Admin/User/Staff see the result displayed in Ascending order");
				ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathProgramDesc);
				Assert.assertTrue("Results are in not in Asceding Order", AsDs.verifyAscendingOrder(data));

			}

			public void verifyASCOrder_Status() {
				LoggerLoad.info("Admin/User/Staff see the result displayed in Ascending order");
				ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathProgramStatus);
				Assert.assertTrue("Results are in not in Asceding Order", AsDs.verifyAscendingOrder(data));

			}

			// descending order
			public void verifyDESCOrder_Name() {
				LoggerLoad.info("Admin/User/Staff see the result displayed in Descending order");
				ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathProgramName);
				Assert.assertTrue("Results are not in Desceding Order", AsDs.verifyDescendingOrder(data));
			}

			public void verifyDESCOrder_Desc() {
				LoggerLoad.info("Admin/User/Staff see the result displayed in Descending order");
				ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathProgramDesc);
				Assert.assertTrue("Results are not in Desceding Order", AsDs.verifyDescendingOrder(data));
			}

			public void verifyDESCOrder_Status() {
				LoggerLoad.info("Admin/User/Staff see the result displayed in Descending order");
				ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathProgramStatus);
				Assert.assertTrue("Results are not in Desceding Order", AsDs.verifyDescendingOrder(data));
			}

	// total no of rows 

			public void noOfRows(int rows_count) {
				rows_count = programtablerow.size();
				LoggerLoad.info("No of rows in Program Table" + rows_count);
			}

			// add a new Program
			public void clickprogrambtn() {
				LoggerLoad.info("Clicks on a new program button");
				if (Flag == 2)
					programbtn.click();
				else
					LoggerLoad.info("Denied Access");
			}

			public void verifyPopUPWindow(String popuptext) {
				String poptxt = programpop.getText();
				assertEquals(poptxt, popuptext);
			}

			public void verifyNewProgramWindow() {
				LoggerLoad.info("Admin is on A New Program Window");
				driver.switchTo().activeElement();
			}

			public void setProgramName(String Name) {
				LoggerLoad.info("Enter Program Name");
				programName.click();
				programName.clear();
				programName.sendKeys(Name);
			}

			public void setProgramDescription(String Description) {
				LoggerLoad.info("Enter description for program ");
				programDescription.click();
				programDescription.clear();
				programDescription.sendKeys(Description);
			}

			public void setstatusbutton() {
				radioActive.click();
			}

			public void clicksaveButton() {
				LoggerLoad.info("Click save button");
				savebtn.click();
			}

			public void clickCancelButton() {
				LoggerLoad.info("Click cancel button");
				cancelbtn.click();
			}

			public void verifyWindowClose() {
				LoggerLoad.info("Admin verify window closed after cancel button");
				assertEquals(driver.getCurrentUrl(), "Manage Program page URL");
			}

			public void verifyProgramPage() {
				LoggerLoad.info("Admin verify that admin is on Manage Program page");
				assertEquals(driver.getCurrentUrl(), "Manage Program page URL");
			}

			public void verifyMsg(String message) {
				WebElement errorMessage = new WebDriverWait(driver, Duration.ofSeconds(30))
						.until(ExpectedConditions.visibilityOfElementLocated(errormsg));
				LoggerLoad.error(errorMessage.getText());
				assertEquals(errorMessage.getText(), message);

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
				if (Flag == 2)
					editbtn.click();
				else
					LoggerLoad.info("Denied Access");

			}

			public void verifyUpdatedMsg(String msg) {
				LoggerLoad.info("Admin verify successful message for update");
				assertEquals(updatedMsg.getText(), msg);
			}

			// delete functionality
			public void clickRightDeleteButton() {
				LoggerLoad.info("Click Delete button on right side");
				if (Flag == 2)
					rightdeletebtn.click();
				else
					LoggerLoad.info("Denied Access");

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
				//nobtn.click();
			}

			public void isPrgmNameDeleted(String searchstring) throws Exception {
				LoggerLoad.info("Admin check if program name is deleted");
				ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathProgramName);
				Assert.assertTrue("Search result not found", SU.verifySearch(data, searchstring));

			}

			// multiple delete Functionality
			public void clickmaindelete() {
				if (Flag == 2)
					maindeleteBtn.click();
				else
					LoggerLoad.info("Denied Access");

			}

			public void verifyMainDeleteBtnDisabled() {
				LoggerLoad.info("Admin verify that delete button is disabled");
				Assert.assertFalse("Delete Button is Enabled", maindeleteBtn.isEnabled());
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

			public void verifyPrgmNameExist() throws Exception {
				LoggerLoad.info("Admin can see Program Names not deleted");
				LoggerLoad.info("check if program name is deleted");
				ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathProgramName);
				Assert.assertTrue("Search result not found for" + prgName1.getText(),
						SU.verifySearch(data, prgName1.getText()));
				Assert.assertTrue("Search result not found for" + prgName2.getText(),
						SU.verifySearch(data, prgName2.getText()));

			}

			// checkbox functionality
			public void selectFirstCheckbox() {
				LoggerLoad.info("Admin verify that delete button is enabled");
				firstCheckbox.click();

			}

			public void verifyAllCheckbox() {
				LoggerLoad.info("Admin verify all check boxes are checked");
				for (WebElement e : allCheckbox) {
					Assert.assertTrue("check box is not checked for" + e.getAttribute("value"), e.isSelected());

				}
			}

			public void validadmin(String Admin) {
				if (Admin.equalsIgnoreCase("admin")) {
					Flag = 2;
				}
			}

			public void validUserStaff(String User, String Staff) {
				if (User.equalsIgnoreCase("admin") || (Staff.equalsIgnoreCase("staff"))) {
					Flag = 1;
				}
			}


			public String Message(String expectedMsg) {
				// TODO Auto-generated method stub
				return null;
			}


			public void setProgramstatus(String status) {
				// TODO Auto-generated method stub
				
			}


			public void Studentpage() {
				// TODO Auto-generated method stub
				
			}


			public void Batchlink() {
				// TODO Auto-generated method stub
				
			}


			public void batchpage() {
				// TODO Auto-generated method stub
				
			}


			public void clickstartpage() {
				// TODO Auto-generated method stub
				
			}


			public void ClickStudentpage() {
				// TODO Auto-generated method stub
				
			}


			public void ClickBatchlink() {
				// TODO Auto-generated method stub
				
			}


			public void clickClasslink() {
				// TODO Auto-generated method stub
				
			}


			public void Class() {
				// TODO Auto-generated method stub
				
			}


			public void ClickUser() {
				// TODO Auto-generated method stub
				
			}


			public void User() {
				// TODO Auto-generated method stub
				
			}


			public void ClickAssignmentlink() {
				// TODO Auto-generated method stub
				
			}


			public void Assignment() {
				// TODO Auto-generated method stub
				
			}


			public void ClickAttendance() {
				// TODO Auto-generated method stub
				
			}


			public void Attendance() {
				// TODO Auto-generated method stub
				
			}


			public void Clicklogout() {
				// TODO Auto-generated method stub
				
			}


			public void loginpage() {
				// TODO Auto-generated method stub
				
			}
	 


			 
			 
		}

	

