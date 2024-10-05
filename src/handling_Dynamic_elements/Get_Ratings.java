package handling_Dynamic_elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Ratings {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			//driver.manage().timeouts().implicitlyWait (10, TimeUnit.SECONDS);
			
			//click on cancel button
			//enter mobile name
			driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Oneplus nord2");
			//click on search icon
			driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
			//Get Ratings
	 	    String rating = driver.findElement(By.xpath("(//div[@data-id='MOBGMFREBAHZQGY9']//span)[2]")).getText();
			
	 	    System.out.println(rating);
	 	    
	 	    driver.quit();
	 	    
	}

}
