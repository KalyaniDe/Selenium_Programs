package locator_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	}

}
