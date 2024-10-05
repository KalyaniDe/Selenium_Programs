package screenShot_Programs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_Facebook {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.facebook.com/");
	    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File des = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium_4Th_july\\ScreenShot_Capture//facebook.jpg");
	    FileHandler.copy(src, des);
	    Thread.sleep(2000);
	    driver.close();
	
	
	
	}

}
