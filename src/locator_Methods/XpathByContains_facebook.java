package locator_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains_facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jiomart.com/customer/account/login");
		
		//tagname[contains(@attributeName,attributeValue)]
		
		driver.findElement(By.xpath("//input[contains(@id,'phoneNumber')]")).sendKeys("5435425");
		
		
	}

}
