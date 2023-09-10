package utilities;


import java.util.ArrayList; 
import java.util.Collections; 
import java.util.List; 
import org.openqa.selenium.WebElement;

public class AscDscOrderUtility {
	
	
	
	
	
	public boolean verifyDescendingOrder(ArrayList<String> originalList) { 

		 

		// Making copy 

		ArrayList<String> sortedList = new ArrayList<>(); 

		for (String s : originalList) { 

		sortedList.add(s); 

		} 

		 

		Collections.sort(sortedList, Collections.reverseOrder()); 

		return sortedList.equals(originalList); 

		} 

		 

		public boolean verifyAscendingOrder(ArrayList<String> originalList) { 

		 

		// Making copy 

		ArrayList<String> sortedList = new ArrayList<>(); 

		for (String s : originalList) { 

		sortedList.add(s); 

		} 

		 

		Collections.sort(sortedList); 

		return sortedList.equals(originalList); 

		} 

}
