package practise_Problem_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_Method1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com");
        String T = driver.getTitle();
        System.out.println(T);
        
        String expectedTitle = "facebook.com";
        String actualTitle = driver.getTitle();
        
        if(expectedTitle.equals(actualTitle))
        {
        	System.out.println("Test case is pass");
        }
        else
        {
        	System.out.println("Test case is fail");
        	
        }
	}
}
