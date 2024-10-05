package action_Class_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_Handle_DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		// Step 1: idendify dropdown element
		WebElement Login = driver.findElement(By.xpath("//span[text()='Login']"));
		
	    // Step 2: create an object of Actions class with webdriver object as a input
		Actions act = new Actions(driver);
		
		// Step 3: call Actions class methods--> movetoElement
		act.moveToElement(Login).perform();
		
		Thread.sleep(3000);
		
		// //click on options present in dropdown  -->GiftCard
		
		driver.findElement(By.xpath("//span[text()='Gift Cards']")).click();
		driver.close();
		
		
	}

}
