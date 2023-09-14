package pages;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import baseClass.BaseClass;
//import io.cucumber.java.it.Date;
import utilities.BrokenLinks;
import utilities.ConfigReader;


public class Attendance {
	public static WebDriver driver =BaseClass.getDriver();
	BrokenLinks BL = new BrokenLinks();
	String url =ConfigReader.applicationUrl();
	String attendanceUrl ="https://www.attendance123.com";
	
	@FindBy (linkText="Login") WebElement loginlink;
	//attendance page
	@FindBy (linkText="Attendance") WebElement Attendancelink;
	@FindBy (id="AttendanceHeader") WebElement attendanceHeader;
	@FindBy (id="lmstitle") WebElement lmstitle;
	@FindBy (id="delete") WebElement maindeleteicon;
	@FindBy (id="search") WebElement searchtextbox;
	@FindBy (id="new attendace") WebElement addNewAttendance;
	@FindBy(xpath = "//section[//*[@id='table']]")WebElement tableContainer;
	@FindBy (id="delete icon") WebElement deleteicon;
	
	//sort buttons
	 @FindBy(xpath = "//*[@id='table']/thead/tr/th[1]")WebElement sortBtn_classID;
	 @FindBy(xpath = "//*[@id='table']/thead/tr/th[2]")WebElement sortBtn_StudentID;
	 @FindBy(xpath = "//*[@id='table']/thead/tr/th[3]")WebElement sortBtn_Present;

	//all links on navigate bar
	 
	 @FindBy (linkText="student") WebElement studentlink;
	 @FindBy (linkText="program") WebElement programlink;
	 @FindBy (linkText="batch") WebElement batchlink;
	 @FindBy (linkText="class") WebElement classlink;
	 @FindBy (linkText="user") WebElement userlink;
	 @FindBy (linkText="Assignment") WebElement Assignmentlink;
	 @FindBy (linkText="logout") WebElement logoutlink;
	 
	 //footer
	 @FindBy (id="footer") WebElement footer;
	 
	 //pagination
	 @FindBy(xpath = "//section[//*[@id='page']]")WebElement paginationbar;
	 @FindBy(xpath="//*[@id='table']/tbody/tr[@id='checkbox']")List<WebElement> attendancetablerows ;
	 
	 //edit 
	 @FindBy (id="edit") WebElement editbtn;
	 
	 //Attendance pop up window
	
	 @FindBy(xpath = "//*[@id='SelectprogramName']")WebElement programNameDD;
	 @FindBy(xpath = "//*[@id='SelectprogramName']")WebElement classNameDD;
	 @FindBy(xpath = "//*[@id='SelectprogramName']")WebElement studentNameDD;
	 @FindBy(xpath = "//*[@id='SelectprogramName']")WebElement attendanceDD;
	 @FindBy(xpath = "//*[@id='datepicker']")WebElement datepicker;
	 @FindBy(xpath = "//div[@class='ui-datepicker-title']/span[1]")List<WebElement> months ;
	 @FindBy(xpath ="//div[@class='ui-datepicker-inline ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-datepicker-multi ui-datepicker-multi-2']/div[2]/table/tbody/tr/td/a")
     List<WebElement> days;
	 @FindBy (id="save") WebElement savebtn;
	 @FindBy (id="cancel") WebElement cancelbtn;
	 @FindBy(xpath = "div//div//a ") WebElement errormsg;
	 @FindBy(id = "successMessage") WebElement successmsg;
	 
	public  Attendance() {
		PageFactory.initElements( driver,this);
		
	}
	
	public void clickLoginlink() {
		loginlink.click();
	}
	public void clickAttendancelink() {
		Attendancelink.click();
	}
	
	public String verifyAttendanceHeader() {
		String AttendHeadertext = attendanceHeader.getText();
		return AttendHeadertext;
		
	}
	public boolean verifyBrokenlinkonattendance(String brokenlinkmessgae) throws IOException {
    	boolean bl = BL.VerifyBrokenLinks(attendanceUrl, brokenlinkmessgae);
		return bl;
    }
	public String verifylmsTitle() {
    	String lmsTitletext = lmstitle.getText();
    	return lmsTitletext;
    }
	public void alignAttendanceHeader() {
		
	    	String alignment = lmstitle.getCssValue("text-align");
	    	assertEquals("left",alignment);
	    	int x = lmstitle.getLocation().getX();
	    	int y = lmstitle.getLocation().getY();
	    	assertEquals(120,x);
	    	assertEquals(100,y);
	    
	}
	public void verifymainDeleteDisabled() {
		Assert.assertFalse(maindeleteicon.isEnabled());
		
	}
	public void addNewAttendanceisDisplayed() {
		Assert.assertTrue(searchtextbox.isDisplayed());
	}
	public void tableisDisplayed() {
		Assert.assertTrue(addNewAttendance.isDisplayed());
	}
	public void searchbarisDisplayed() {
		Assert.assertTrue(tableContainer.isDisplayed());
	}
	public void sortbtnisDisplayed() {
		Assert.assertTrue(sortBtn_classID.isDisplayed());
		Assert.assertTrue(sortBtn_StudentID.isDisplayed());
		Assert.assertTrue(sortBtn_Present.isDisplayed());
	}
	public void clickstudentLink() {
		studentlink.click();
	}
	public void clickProgramLink() {
		programlink.click();
	}
	public void clickBatchLink() {
		batchlink.click();
	}
	public void clickClassLink() {
		classlink.click();
	}
	public void clickUserLink() {
		userlink.click();
	}
	public void clickAssignmentLink() {
		Assignmentlink.click();
	}
	public void clickLogoutLink() {
		logoutlink.click();
	}
	public String getPageTitle()
	{
		String Title=driver.getTitle();
		return Title;
	}
	public String footerText() {
		String footerTxt = footer.getText();
		return footerTxt;
	}
	public void paginationisDisplayed() {
		Assert.assertTrue(paginationbar.isDisplayed());
	}
	public String paginationText() {
		String pagiTxt = paginationbar.getText();
		return pagiTxt;
	}
	public void verifyeditbtn() {
		int tablerows = attendancetablerows.size();
		if (tablerows == 0) {
			Assert.assertTrue(editbtn.isDisplayed());
		}
		else {
			Assert.assertFalse(editbtn.isDisplayed());
		}
	}
	public void verifydeletebtn() {
		int tablerows1 = attendancetablerows.size();
		if (tablerows1 == 0) {
			Assert.assertTrue(deleteicon.isDisplayed());
		}
		else {
			Assert.assertFalse(deleteicon.isDisplayed());
		}
	}
	public long calculateNavigateTime() {
		long startTime = System.currentTimeMillis();
		Attendancelink.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(Attendancelink));
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		return totalTime;
	}
	public void selectProgramDD() {
		Select se = new Select(programNameDD);
		se.selectByIndex(2);
	}
	public void selectClassDD() {
		Select se = new Select(classNameDD);
		se.selectByIndex(1);
	}
	public void selectStudentDD() {
		Select se = new Select(studentNameDD);
		se.selectByIndex(0);
	}
	public void selectAttendanceDD() {
		Select se = new Select(attendanceDD);
		se.selectByVisibleText("Present");
	}
	public void selectDate() throws InterruptedException {
		
		  datepicker.click();
		
		  Thread.sleep(2000);
		  Date d = new Date(1);
		  SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");
		  String date = formatter.format(d);
		  String splitter[] = date.split("-");
		  String month_year = splitter[1];
		  String day = splitter[0]; 
	
		  selectDate(month_year,day); 
		   Thread.sleep(3000); 

	}
		public void  selectDate(String month_year, String select_day) throws InterruptedException
		{ 
		//selecting month
		    for (int i=0; i<months.size();i++)
		     {
		
		        if(months.get(i).getText().equals(month_year))
		      { 

		       //Selecting date 
		         for (WebElement d:days)
		           { 
		
		             if(d.getText().equals(select_day))
		                  {
		                       d.click();
		                       Thread.sleep(10000);
		                       return;
		                      }
		             } 

	      	} 
		     }

		}
		
      public void clickSavebtn() {
    	  savebtn.click();
      }	
      public void clickCancelbtn() {
    	  cancelbtn.click();
      }	
      public void clickEditbtn() {
    	  editbtn.click();
      }
      public void clickAddNewAttendance() {
    	  addNewAttendance.click();
      }
      public String verifyErrorMsg() {
  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  		String mes1=errormsg.getText();
  		return mes1;
  	}
      public String verifySuccessMsg() {
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    		String mes2=successmsg.getText();
    		return mes2;
    	}
}


	
	
	

