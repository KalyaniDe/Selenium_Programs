package locator_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/account/login?ret=/");
		
		driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("admin@123");
	}

}
