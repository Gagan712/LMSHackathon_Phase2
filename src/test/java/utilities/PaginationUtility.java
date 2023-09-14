package utilities;

//import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginationUtility {
	public static WebDriver driver;

	public void clickElement(WebElement element) {
		WebElement pageNav = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOf(element));
		if (pageNav.isDisplayed() && pageNav.isEnabled()) {

			pageNav.click();

		}
		LoggerLoad.error("Element is not clickable");
	}

	public String getElementText(WebElement element) {
		WebElement textElement = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOf(element));
		return textElement.getText();
	}

	public boolean verifyElementText(String expectedMsg, WebElement element) {
		if (getElementText(element).equals(expectedMsg)) {
			return true;
		}

		return false;
	}
	
	public ArrayList<String> getAllPageData(WebElement tableContainer, String cellXPath) {
		WebElement tableElement = tableContainer.findElement(By.className("table"));
		WebElement nextBtn = tableContainer.findElement(By.className("next-btn"));
		ArrayList<String> result = new ArrayList<String>();
		while(nextBtn.isEnabled()) {
			String[] pageData = this.getPageData(tableElement, cellXPath);
			for(int i = 0; i < pageData.length; i++) {
				result.add(pageData[i]);
			}
			nextBtn.click();
		}
		return result;
	}
	
	public String[] getPageData(WebElement tableElement, String cellXPath) {
		List<WebElement> rows = tableElement.findElements(By.xpath(cellXPath));
		String[] pageData = new String[rows.size()];
		for(int i = 0; i < pageData.length; i++) {
			pageData[i] = rows.get(i).getText();
		}
		return pageData;
	}
	
	public int getTotalRows(WebElement tableElement) {
		List<WebElement> rows = tableElement.findElements(By.className("table"));
		return rows.size();
	}
}
