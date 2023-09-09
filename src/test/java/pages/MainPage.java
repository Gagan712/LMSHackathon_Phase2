package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import utilities.ConfigReader;

public class MainPage {
	public static WebDriver driver =BaseClass.getDriver();
	String url =ConfigReader.applicationUrl();
	public  MainPage() {
		PageFactory.initElements( driver,this);
		
	}
	public void mainPageurl() {
		driver.get(url);
	}

}
