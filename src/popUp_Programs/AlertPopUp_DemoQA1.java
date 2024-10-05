package popUp_Programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp_DemoQA1 {

	public static void main(String[] args) throws InterruptedException {
		 
		    System.setProperty("webdriver.chrome.driver",
		    "C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
			     
		    driver.get("https://demoqa.com/alerts");
		    
		    // click 3 clickme btn
		    
		    /*driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		    Thread.sleep(3000);
		    driver.switchTo().alert().accept();
		    Thread.sleep(3000);
		    driver.close();*/
		    
		    driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		    
		   Alert promtBox = driver.switchTo().alert();
		   promtBox.sendKeys("Hello Tom");
		   Thread.sleep(4000);
		   driver.switchTo().alert().accept();
		   driver.close();
				    
	}

}
