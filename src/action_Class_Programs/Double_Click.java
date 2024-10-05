package action_Class_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        
        WebElement clickMeBtn = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        
        Actions act = new Actions(driver);
        
        act.doubleClick(clickMeBtn).perform();
        
       //act.moveToElement(clickMeBtb).doubleClick().build().perform();
   	  //act.moveToElement(clickMeBtb).perform();
      //act.doubleClick().perform();
	}

}
