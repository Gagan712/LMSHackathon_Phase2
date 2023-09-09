package hooks;

import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class Hooks {
	public static WebDriver driver;
	private static BaseClass baseclass;
	//private static ConfigReader configread;
	@BeforeAll
	public static void launchbrowser()  throws Throwable {
		//Get Browser Type
		LoggerLoad.info("Loading Config file");
		ConfigReader.readConfig();
		String browser = ConfigReader.browserType();
		
		//Initialze driver from baseclass
		baseclass = new BaseClass();
		driver = baseclass.initializeWebdriver(browser);
		LoggerLoad.info("Intializing" + browser +"driver");
		
	}
	/*
	@AfterStep
	public void afterstep(Scenario scenario) {
		if (scenario.isFailed()) {
			LoggerLoad.error("Steps Failed , Taking Screenshot");
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "My screenshot");
			Allure.attachment("Myscreenshot",new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		
		}
	}*/

	@AfterAll
	public static void after() throws InterruptedException {
		LoggerLoad.info("Closing Driver");
		//Thread.sleep(5000);
		BaseClass.closeallDriver();
	}
	

}
