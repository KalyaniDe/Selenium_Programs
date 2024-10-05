package iFrame_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    
	        driver.manage().window().maximize();
	        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	        
	        WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
	        driver.switchTo().frame(iframe1);
	        //driver.switchTo().frame("iframeResult");
	        WebElement DateTimeBtn = driver.findElement(By.xpath("//button[@type='button']"));
	        DateTimeBtn.click();
	        
	        driver.switchTo().parentFrame();
	        WebElement HomeIcon = driver.findElement(By.xpath("//a[@id='tryhome']"));
	        HomeIcon.click();
	        Thread.sleep(2000);
	        
	        driver.quit();
	}

}
