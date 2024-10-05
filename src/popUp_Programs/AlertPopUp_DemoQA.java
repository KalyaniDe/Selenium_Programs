package popUp_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp_DemoQA {

	public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver",
		    "C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
			     
		    driver.get("https://demoqa.com/alerts");
		    
		    // click 1 clickme btn
		    
		    driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]")).click();
		   
		  
		
		    
		    
		    
		    
	}

}
