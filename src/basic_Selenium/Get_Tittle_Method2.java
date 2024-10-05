package basic_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Tittle_Method2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		String actuTitle = driver.getTitle();
		String expTitle = "Google";
		
		if(actuTitle.equals(expTitle))
		{
			System.out.println("navigate the correct webpage");
		}
		else
		{
			System.out.println("navigate to wrong webpage");
		}
	}

}
