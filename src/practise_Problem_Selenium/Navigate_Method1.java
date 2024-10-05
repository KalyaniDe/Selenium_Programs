package practise_Problem_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Method1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        
        driver.navigate().to("https://www.youtube.com");
        Thread.sleep(3000);
        
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);
        
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.quit();
	}

}
