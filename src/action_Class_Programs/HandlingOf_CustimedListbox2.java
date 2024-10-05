package action_Class_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingOf_CustimedListbox2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/");
      //click create new account button
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(3000);
        //click on month
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        
        Actions act = new Actions(driver);
        act.click(month).perform();
        
        for(int i=0; i<=4; i++)
        {
        	act.sendKeys(Keys.ARROW_UP).perform();
        }
        Thread.sleep(3000);
        act.sendKeys(Keys.ENTER).perform();

	}

}
