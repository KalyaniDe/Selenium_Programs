package action_Class_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        
        WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
        WebElement dest = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
        
        Actions act = new Actions(driver);
        
        //act.dragAndDrop(src, dest).perform();
       // Thread.sleep(2000);
        act.moveToElement(dest).clickAndHold().moveToElement(dest).release().build().perform();
	}

}
