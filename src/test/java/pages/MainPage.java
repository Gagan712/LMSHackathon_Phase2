package pages;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

//import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.BaseClass;
import utilities.BrokenLinks;
import utilities.ConfigReader;
//import utils.LoggerLoad;

public class MainPage {
	public static WebDriver driver =BaseClass.getDriver();
	BrokenLinks BL = new BrokenLinks();
	String url =ConfigReader.applicationUrl();
	String invalidurl =ConfigReader.invalidUrl();
	String loginurl = "https://www.lmslogin345.com";
	String forgotuserOrpwdurl = "https://www.lmsforgotuserOrPassword345.com";
	
	//mainpage feature
	@FindBy (id="LoginButton") WebElement loginButtonlink;
	@FindBy (id="lmsmainblock") WebElement mainblock;
	@FindBy (id="lmslogoblock") WebElement logoblock;
	
	//login page feature
	@FindBy (id="loginheader") WebElement loginheader;
	@FindBy (linkText="forgot username or password") WebElement forgotUserPwd;
	@FindBy (linkText="Reset password") WebElement resetPwd;
	@FindBy (id="user") WebElement userTextbox;
	@FindBy (id="password") WebElement passwordTextbox;
	@FindBy (xpath ="//input[@type=\"text\"]") WebElement noOftxtBox;
	@FindBy (id="loginfield") WebElement loginfield;
	@FindBy (id="Login") WebElement loginButton;
	@FindBy (id="DashBoardHeader") WebElement Dashboardheader;
	@FindBy (xpath="//div[@class='alert alert-primary']" ) WebElement errorMsg;
	
	//forgot username or password page
	@FindBy (id="email") WebElement EmailTextbox;
	@FindBy (linkText="Send Link") WebElement sendLinkButton;
	@FindBy (id="Forgot user or pwd header") WebElement ForgotUorPheader;
	
	
	//Reset Password Page
	@FindBy (id="Submit") WebElement submitButton;
	@FindBy (id="Reset Password") WebElement resetPwdheader;
	@FindBy (id="new password") WebElement newpasswordTextbox;
	@FindBy (id="re-type password") WebElement retypepasswordTextbox;
	@FindBy (id="new password label") WebElement newpasswordlabel;
	@FindBy (id="re-type password label") WebElement retypepasswordLabel;
	@FindBy (xpath="//div[@class='alert alert-primary']/text" ) WebElement suceessMsg;
	
	
	public  MainPage() {
		PageFactory.initElements( driver,this);
		
	}
	public void mainPageurl() {
		driver.get(url);
	}
	public void verifyMainPage() {
		
		Assert.assertTrue(loginButtonlink.isDisplayed());
		
	}
    public void invalidurl() {
    	driver.get(invalidurl);
			
	}
    
    public String invalidurlmessage() throws MalformedURLException, IOException {
    	
        HttpURLConnection connection = (HttpURLConnection)new URL(invalidurl).openConnection();
	    connection.connect();
	    String response = connection.getResponseMessage();
	    connection.disconnect();
	    return response ;
    }
    public boolean verifyBrokenlink(String brokenlinkmessgae) throws IOException {
    	boolean bl = BL.VerifyBrokenLinks(url, brokenlinkmessgae);
		return bl;
    }
    public String verifyspellingOnMainPage() {
    	String mainblocktext = mainblock.getText();
    	return mainblocktext;
    }
    public String verifylogo() {
    	String logotext = logoblock.getText();
    	return logotext;
    }
    public void alignlogo() {
    	String alignment = logoblock.getCssValue("text-align");
    	assertEquals("centre",alignment);
    	int x = logoblock.getLocation().getX();
    	int y = logoblock.getLocation().getY();
    	assertEquals(393,x);
    	assertEquals(220,y);
    }
    public void VerifyLoginbtnenable() {
    	Assert.assertTrue(loginButtonlink.isEnabled());
    }
    public void verifyAdminOnmainpage() {
    	driver.get(url);
    	Assert.assertTrue(loginButtonlink.isDisplayed());
    }
    public void clickLoginbtnOnHomePage() {
    	loginButtonlink.click();
    }
    public boolean verifyBrokenlinkOnLogin(String brokenlinkmesg) throws IOException {
    	boolean bl1 = BL.VerifyBrokenLinks(loginurl, brokenlinkmesg);
		return bl1;
    }
    public String verifyheadertext() {
    	String loginheadertext = loginheader.getText();
    	return loginheadertext;
    }
    public void verifyspellingOnLoginPage() {
    	String loginheadertext = loginheader.getText();
    	assertEquals(loginheadertext,"Please login to LMS application");
    	assertEquals("login",loginButton.getText());
    	assertEquals("forgot username or password",forgotUserPwd.getText());
    	assertEquals("Reset password",resetPwd.getText());
    	
    }
    public int noOfTxtBoxes() {
    	
    	List<WebElement> getboxes =driver.findElements(By.xpath("//input[@type=\"text\"]"));
    	int noOFtxt = getboxes.size();
    	return noOFtxt;
    }
    public String getTextOfUser() {
    	String userTxt = userTextbox.getAttribute("aria-label");
    	return userTxt;
    }
    public String getTextOfPassword() {
    	String pwdTxt = passwordTextbox.getAttribute("aria-label");
    	return pwdTxt;
    }
    public void alignloginBtn() {
    	String alignmentLogin = loginButton.getCssValue("text-align");
    	int x1 = loginButton.getLocation().getX();
    	int y1 = loginButton.getLocation().getY();
    	assertEquals(393,x1);
    	assertEquals(220,y1);
    	assertEquals("centre",alignmentLogin);
    }
    public void alignLoginField() {
    	int x2 = loginfield.getLocation().getX();
    	int y2 = loginfield.getLocation().getY();
    	assertEquals(393,x2);
    	assertEquals(220,y2);
    	String alignmentLoginfield = loginfield.getCssValue("text-align");
    	assertEquals("centre",alignmentLoginfield);
    }
    public String verifyForgotUserPwdLink() {
    	String forgotUserPwdText = forgotUserPwd.getText();
    	return forgotUserPwdText;
    }
    public String verifyResetPwdLink() {
    	String ResetPwdText = resetPwd.getText();
    	return ResetPwdText;
    }
    public String verifyUsertxtcolor() {
    	String usercolor = userTextbox.getCssValue("color");
    	return usercolor;
    }
    public String verifyPasswordtxtcolor() {
    	String Pwdcolor = passwordTextbox.getCssValue("color");
    	return Pwdcolor;
    }
    public void verifyAdminOnloginPage() {
    	driver.get(url);
    	loginButtonlink.click();
    	String headertext =loginheader.getText();
    	assertEquals(headertext,"Please login to LMS application");
    }
    public void enterUsername(String userName) {

    	userTextbox.sendKeys(userName);

	}

	public void enterPassword(String passWord) {
		passwordTextbox.sendKeys(passWord);
	}

	public void clickLogin() {
		loginButton.click();
	}
	public String verifyDashboardheadertext() {
    	String Dashboardheadertext = Dashboardheader.getText();
    	return Dashboardheadertext;
    }
	public String verifyErrorMsg() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String mes1=errorMsg.getText();
		return mes1;
	}
	public void verifyloginwithKeyboard() {
		Actions action = new Actions(driver);
		//action.keyDown(Keys.CONTROL).sendKeys("a").perform();
		action.keyDown(Keys.TAB).sendKeys(userTextbox,"Ninja").
		keyUp(Keys.TAB).sendKeys(passwordTextbox, "Automators").
		keyUp(Keys.TAB).click(loginButton).perform();
		assertEquals("Manage Program", Dashboardheader.getText());
	}
	public void verifyloginwithMouse() {
		Actions action = new Actions(driver);
		action.doubleClick(userTextbox).sendKeys("Ninja");
		action.doubleClick(passwordTextbox).sendKeys("Automators");
		action.click(loginButton);
		assertEquals("Manage Program", Dashboardheader.getText());
		
	}
	public void clickforgotuserPwdLink() {
		forgotUserPwd.click();
	
	}
	public boolean verifyBrokenlinkOnForgotPwd(String brokenlinkmesg1) throws IOException {
    	boolean bl2 = BL.VerifyBrokenLinks(forgotuserOrpwdurl, brokenlinkmesg1);
		return bl2;
    }
	public String getPageTitle()
	{
		String Title=driver.getTitle();
		return Title;
	}
	public String verifyEmailtxtcolor() {
    	String emailTxtcolor = EmailTextbox.getCssValue("color");
    	return emailTxtcolor;
    }
	public String getTextOfEmail() {
    	String EmailTxt = EmailTextbox.getAttribute("aria-label");
    	return EmailTxt;
    }
	public String verifySendLinkButtontext() {
    	String SendLinkText = sendLinkButton.getText();
    	return SendLinkText;
    }
	 public void alignSendLinkBtn() {
	    	String alignmentSendLink = sendLinkButton.getCssValue("text-align");
	    	int x3 = sendLinkButton.getLocation().getX();
	    	int y3 = sendLinkButton.getLocation().getY();
	    	assertEquals(393,x3);
	    	assertEquals(220,y3);
	    	assertEquals("centre",alignmentSendLink);
	    }
	 public void verifyspellingOnForgotUserPwdPage() {
	    	String ForgotUorPheaderText = ForgotUorPheader.getText();
	    	assertEquals(ForgotUorPheaderText,"Forgot Username or Password Page");
	    	assertEquals("Send Link",sendLinkButton.getText());
	    	
	    	
	    }
	 public void verifyAdminOnForgotUserorPwdPage() {
	    	driver.get(url);
	    	loginButtonlink.click();
	    	String headertext =loginheader.getText();
	    	assertEquals(headertext,"Please login to LMS application");
	    	forgotUserPwd.click();
	    	String ForgotUorPheaderText = ForgotUorPheader.getText();
	    	assertEquals(ForgotUorPheaderText,"Forgot Username or Password Page");
	    }
	 public void enterEmail(String Email) {
		 EmailTextbox.sendKeys(Email);
		}
	 public void clickSendLinkButton() {
		 sendLinkButton.click();
	 }
	 public void clickresetlink() {
		 resetPwd.click();
	 }
	 public void alignSubmitBtn() {
	    	String alignmentSubmit = submitButton.getCssValue("text-align");
	    	assertEquals("centre",alignmentSubmit);
	    	int x5 = submitButton.getLocation().getX();
	    	int y5 = submitButton.getLocation().getY();
	    	assertEquals(393,x5);
	    	assertEquals(220,y5);
	    }
	 public String TextoflabelNewPassword() {
		 String textlabel1 = newpasswordlabel.getText();
		 return textlabel1;
	 }
	 public String TextoflabelreTypePassword() {
		 String textlabel2 = retypepasswordLabel.getText();
		 return textlabel2;
	 }
	 public void verifyresetTextBoxesDisabled() {
		 Assert.assertFalse(newpasswordTextbox.isEnabled());
		 Assert.assertFalse(retypepasswordTextbox.isEnabled());
	 }
	 public void clickonNewpwdFelid() {
		 newpasswordlabel.click();
	 }
	 public void clickonreTypePwdFelid() {
		 retypepasswordLabel.click();
	 }
	 public void verifyresetTextBoxesEnalbed() {
		 Assert.assertTrue(newpasswordTextbox.isEnabled());
		 Assert.assertTrue(retypepasswordTextbox.isEnabled());
	 }
	 public void enterNewPassword(String newpassword) {
		 newpasswordTextbox.sendKeys(newpassword);
	 }
	 public void RetypePassword(String newpwd) {
		 retypepasswordTextbox.sendKeys(newpwd);
	 }
	 public void clickSubmitBtn() {
		 submitButton.click();
	 }
	 public String verifySuccessMsg() {
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String message=suceessMsg.getText();
			return message;
		}
	 public void verifyResetPasswordPage() {
	    	driver.get(url);
	    	loginButtonlink.click();
	    	String headertext =loginheader.getText();
	    	assertEquals(headertext,"Please login to LMS application");
	    	resetPwd.click();
	    	String resetHeaderText = resetPwdheader.getText();
	    	assertEquals(resetHeaderText,"Reset Password Page");
	    }
	 public void verifyspellingOnResetPwdPage() {
		    String resetHeaderText = resetPwdheader.getText();
	    	assertEquals(resetHeaderText,"Reset Password Page");
	    	assertEquals("Submit",submitButton.getText());
	    	
	    	
	    }
    }

