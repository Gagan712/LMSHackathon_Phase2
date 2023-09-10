package utilities;

import java.util.ArrayList; 
import java.util.List; 
import org.openqa.selenium.WebElement; 



public class SearchUtility {
	
	public void setInputText(String inputText, WebElement element) { 

		element.sendKeys(inputText); 

		} 

		 

		public boolean verifySearch(ArrayList<String> data, String searchString) throws Exception { 

		for (int i = 0; i < data.size(); i++) { 

		String temp = data.get(i); 

		if ((temp.toLowerCase().contains(searchString.toLowerCase()))) { 

		return true; 

		} else { 

		return false; 

		} 

		} 

		throw new Exception("No data found"); 

		} 
	
	
	

}
