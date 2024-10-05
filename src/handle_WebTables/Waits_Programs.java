package handle_WebTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits_Programs {

	public static void main(String[] args) {
		
		    System.setProperty("Webdriver.chrome.driver", 
				"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		    driver.get("https://edition.cnn.com/");
		    driver.close();

	}

}
