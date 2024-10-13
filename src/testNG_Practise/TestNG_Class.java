package testNG_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Class {
	
	@Test
	public void m1()
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	
	
	
	
	
	
	
	
	
}
	
