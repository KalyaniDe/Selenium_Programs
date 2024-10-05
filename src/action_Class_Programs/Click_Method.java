package action_Class_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Method {
	
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.flipkart.com/");
        
        WebElement cart = driver.findElement(By.xpath("//a[text()='Cart']"));
        
        Actions act = new Actions(driver);
        
        act.contextClick(cart).perform();
        
        act.moveToElement(cart).click().build().perform();
        
        //act.moveToElement(cart).perform();
       // act.click().perform();
	}

}
