package locator_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute_Flipkart {

		public static void main(String[] args) throws InterruptedException {
				
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
				
		// enter username
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Admin");
		
		//enter password
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Admin@123");
		
		//click on login button
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		//show the text present in site term of use
		WebElement text = driver.findElement(By.xpath("//a[text()='Terms of Use']"));
        String line = text.getText();
        System.out.println(line);    
        
        Thread.sleep(3000);
        driver.quit();
	}

}
