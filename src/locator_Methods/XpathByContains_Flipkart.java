package locator_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains_Flipkart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/account/login?ret=/");
			
			//tagname[contains(@attributeName,attributeValue)]
			
			//enter mobile no
			driver.findElement(By.xpath("//input[contains(@class,'r4vIwl BV+Dqf')]")).sendKeys("5435425453");
			
			//enter otp
			driver.findElement(By.xpath("//button[contains(@class,'QqFHMw twnTnD _7Pd1Fp')]")).click();
			
			
			

	}

}
