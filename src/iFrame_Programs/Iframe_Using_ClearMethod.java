package iFrame_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Using_ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
		WebElement search = driver.findElement(By.xpath("//input[@id='s']")); 
		search.sendKeys("Harrey");
		Thread.sleep(3000);
		driver.switchTo().frame("globalSqa");
		WebElement search1 = driver.findElement(By.xpath("//input[@id='s']")); 
		search1.sendKeys("Harrey");
		Thread.sleep(3000);
		search1.clear();
		search1.sendKeys("potter");
		driver.switchTo().parentFrame();

		search.sendKeys("Potter");
		Thread.sleep(2000); 
		WebElement searchBtn = driver.findElement(By.xpath("//button[@class='button_search']"));
        Thread.sleep(3000);
        driver.close();	
	}

}
