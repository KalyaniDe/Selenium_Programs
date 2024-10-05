package basic_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Method3 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        
        driver.manage().window().maximize();
        driver.get("https://is.rediff.com/signup/register");
        String title1= driver.getTitle();
        
        System.out.println(title1);
        Thread.sleep(2000);
        
        String expectedTitle = "rediff.com";
        String actualTitle = "rediff.com";
        
        if(expectedTitle.equals(actualTitle))
        {
        	System.out.println("Rediff mail test case pass");
        }
        else
        {
        	System.out.println("Rediff mail test case fail");
        }
        String CurrentURL = driver.getCurrentUrl();
        System.out.println(CurrentURL);
        driver.quit();
	}

}
