package practise_Problem_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Current_URL1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\HP\\Documents\\selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		
		Thread.sleep(2000);
		
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
	}

}
