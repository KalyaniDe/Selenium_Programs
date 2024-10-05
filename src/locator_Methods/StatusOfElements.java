package locator_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://megrecruitment.nic.in/rpa/register.htm");
        
        driver.manage().window().maximize();
        
       WebElement emailIdTxtBox = driver.findElement(By.xpath("//input[@name='emailid']"));
       System.out.println("is Displayed = "+ emailIdTxtBox.isDisplayed());
       System.out.println("is Enabled = "+ emailIdTxtBox.isEnabled());
       System.out.println("is Selected ="+ emailIdTxtBox.isSelected());
       
       driver.quit();
       
        
	}

}
