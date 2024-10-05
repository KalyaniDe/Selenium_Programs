package basic_Selenium;

import java.awt.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize_Method{

			public static void main(String[] args) throws InterruptedException {

				System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
			
				driver.get("https://www.flipkart.com");
				Thread.sleep(2000);
				
				org.openqa.selenium.Dimension d1 = driver.manage().window().getSize();
				System.out.println(d1);	
				
				driver.manage().window().maximize();
				
				org.openqa.selenium.Dimension d2 = driver.manage().window().getSize();
				System.out.println(d2);		
				
	}

}
