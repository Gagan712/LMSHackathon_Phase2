package pages;

import static org.testng.Assert.assertEquals;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.DriverManager;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import utilities.LoggerLoad;
import utilities.SearchUtility;
import baseClass.BaseClass;
import utilities.PaginationUtility;
import utilities.AscDscOrderUtility;
import utilities.ConfigReader;

public class DashboardPage {

		public static WebDriver driver = BaseClass.getDriver();
		static String url = ConfigReader.loginUrl();
		public  DashboardPage() {
		PageFactory.initElements(driver,this);
			
		}
		
		PaginationUtility Pgu = new PaginationUtility();
		SearchUtility SU = new SearchUtility();
		AscDscOrderUtility AsDs = new AscDscOrderUtility();

		
		@FindBy(id ="id_username") WebElement txtusername;
		@FindBy(id ="id_password") WebElement txtpassword;		
		@FindBy(id = "Header") WebElement header;		
		@FindBy(id = "LMS Title") WebElement LMSTitle;		
		@FindBy(id = "Student") WebElement Student_Pos;		
		@FindBy(id = "Program") WebElement Program_Pos;
		@FindBy(id = "Batch") WebElement Batch_Pos;
		@FindBy(id = "Class") WebElement Class_Pos;
		@FindBy(id = "User") WebElement User_Pos;
		@FindBy(id = "Assignment") WebElement Assignment_Pos;
		@FindBy(id = "Attendance") WebElement Attendance_Pos;
		@FindBy(id = "Logout") WebElement Logout;
		@FindBy(className ="navbar-text") WebElement navigation_Bar;
		@FindBy (xpath="/html/body/div[2]/div/tr[0]/td[1]") WebElement Studentposition;		
		@FindBy(xpath = "/html/body/div[2]/div/div[2]/form/input[4]")WebElement btnLogin;
		
		
	
		public String get_Current_Page_Title() {
			return driver.getTitle().trim();
			}
		
		public void ValidInputs(String user1, String pwd) {
			txtusername.sendKeys(user1);
			txtpassword.sendKeys(pwd);
		}
		public void login(){
			btnLogin.click();
		}
		
		public String Login_Gettittle(){
			return driver.getTitle();
		}

		public String verifyHeaderText() {
			LoggerLoad.info("Admin see the header Text");
			String HeaderText = header.getText();
			return HeaderText;
		}
		
		public void verifyLink() {
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
			} catch (Exception e) {
			System.out.println(url + " - " + "is a broken link");
			}
		}
		
		public String verifyLMSTitle() {
			LoggerLoad.info("Admin see the LMS Title");
			String LMS_Title = LMSTitle.getText();
			return LMS_Title;

		}
		public void Navigation_Time() throws InterruptedException {
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


		public void Title_Alignment() {
			 assertEquals("left",LMSTitle.getAttribute("align"));

		}

		public void Navigation_Bar_Alignment() {
			 assertEquals("Right",Student_Pos.getAttribute("align"));

		}

		public String Title_Text() {
			return LMSTitle.getText();

		} 
		
		public String Navigation_Bar_Text() {

			return navigation_Bar.getText();

		}

		public void StudentPlace() {

		Point location1 = Student_Pos.getLocation();
		   int x1 = location1.getX();
		   int y1 = location1.getY();

		Point location2 = Program_Pos.getLocation();

		    int x2 = location2.getX();

			int y2 = location2.getY();

			if(y1<y2)

		{ System.out.println("The Student is in first position");}

				else {
		  System.out.println("The Student is not in first position");}
		}


		public void ProgramPlace() {
			
			Point location2 = Program_Pos.getLocation();

		    int x2 = location2.getX();

			int y2 = location2.getY();

			Point location3 = Batch_Pos.getLocation();

		    int x3 = location3.getX();

			int y3 = location3.getY();

			if (y2<y3)

			{ System.out.println("The Program is in second position");
				}

			else {
			  System.out.println("The Program is not in first position");

		}
		}

		public void BatchPlace() {
			
			Point location3 = Batch_Pos.getLocation();

		    int x3 = location3.getX();

			int y3 = location3.getY();

			Point location4 = Batch_Pos.getLocation();

		    int x4 = location4.getX();

			int y4 = location4.getY();

			if (y3<y4)

			{ System.out.println("The Batch is in third position");
				}
			else {System.out.println("The Batch is not in third position");

		}
		}
		
		public void ClassPlace() {
			
			Point location4 = Batch_Pos.getLocation();

		    int x4 = location4.getX();

			int y4 = location4.getY();

			Point location5 = Class_Pos.getLocation();

		    int x5 = location5.getX();

			int y5 = location5.getY();

			if (y4<y5)

			{ System.out.println("The Class is in fourth position");

				}
			else { System.out.println("The Class is not in fourth position");

		}

		}

		public void UserPlace()

		{ 	Point location5 = Class_Pos.getLocation();

		    int x5 = location5.getX();

			int y5 = location5.getY();

			Point location6 = User_Pos.getLocation();

		    int x6 = location6.getX();

			int y6 = location6.getY();

			if (y5<y6)

			{ System.out.println("The User is in fifth position");

		}

			else { System.out.println("The User is not in fifth position");

		}
		}

		public void AssignmentPlace()

		{ 	Point location6 = User_Pos.getLocation();

		    int x6 = location6.getX();

			int y6 = location6.getY();

			Point location7= Assignment_Pos.getLocation();

		    int x7 = location7.getX();

			int y7 = location7.getY();

			if (y6<y7)

			{ System.out.println("The Assignment is in sixth position");
				}
		
			else {
				
				System.out.println("The Assignmet is not in sixth position");
		}
		}

		public void AttendancePlace()

			{ 	Point location7= Assignment_Pos.getLocation();

			    int x7 = location7.getX();

				int y7 = location7.getY();
			  
				Point location8 = Attendance_Pos.getLocation();

			    int x8 = location8.getX();

				int y8= location8.getY();
			    
				if (y7<y8)

				{  System.out.println("The Attendance is in seventh position");

					}

				else {
					
					System.out.println("The Attendance is not in seventh position");

		}
		}
		public void LogoutPlace()

			{ 	Point location8 = Attendance_Pos.getLocation();

			    int x8 = location8.getX();

				int y8= location8.getY();
			  
				Point location9 = Logout.getLocation();

			    int x9 = location9.getX();

				int y9 = location9.getY();

				if (y8<y9)

				{ System.out.println("The Logout is in eigth position");
					}
		
				else { System.out.println("The Logout is not in eigth position");

		}
		}
		public void LMS_Logout()
			{ Logout.click();
		}

		}
		
		
		

