package popUp_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopUP_flipkart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.flipkart.com/");
        
        driver.findElement(By.xpath("//span[text()='Login']")).click();
        
        driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("Harrey");
        
        driver.close();
        
        
	
	
	
	
	
	
	
	
	
	
	}

}
