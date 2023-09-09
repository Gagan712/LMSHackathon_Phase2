package baseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public WebDriver initializeWebdriver(String browser)throws  Exception {
		if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}
		else if (browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} 
		else {
			throw new RuntimeException("BrowserType Not Supported");

		}
		      //Setting implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				driver.manage().window().maximize();
				
				//Setting WebDriverWait with max timeout value of 20 seconds
				wait =new WebDriverWait(driver,Duration.ofSeconds(20));
				return driver;

		
	}
	public static WebDriver getDriver() {
		return driver;
	}

	public static void closeallDriver() {
		driver.close();
	}

}
