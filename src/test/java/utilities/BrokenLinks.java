package utilities;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.testng.Assert;

import baseClass.BaseClass;

public class BrokenLinks {
	public static WebDriver driver =BaseClass.getDriver();
	static String response;
	public boolean VerifyBrokenLinks(String Url ,String ErrorMessage) throws IOException {
		
		   driver.get(Url);
		       //link of url always by tag name a
		   List<WebElement> linkslist = driver.findElements(By.tagName("a"));
		   List<WebElement> activelink = new ArrayList<WebElement>();
				
				//iterate the list and exclude the link with no href
		   for(int i=0;i<linkslist.size();i++) {
					if(linkslist.get(i).getAttribute("href") != null) {
						activelink.add(linkslist.get(i));
					}
					
				}
				
				//iterate the active links having http connection
			for(int j=0;j<activelink.size();j++) {
				
				HttpURLConnection connection = (HttpURLConnection)new URL(activelink.get(j).getAttribute("href")).openConnection();
				connection.connect();
				response = connection.getResponseMessage();
				connection.disconnect();
			}
				if (response == ErrorMessage) {
						return true;
					}
				else {
						return false;
					}

				}
		
		
	}


