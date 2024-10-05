package basic_Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize_Method {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    Dimension d = new Dimension(1000, 100);
		driver.manage().window().setSize(d);
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);	
		
		driver.quit();
	}

}
