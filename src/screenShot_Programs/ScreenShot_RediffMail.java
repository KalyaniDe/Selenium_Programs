package screenShot_Programs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_RediffMail {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://is.rediff.com/signup/register");
        driver.manage().window().maximize();
        
       File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       File destination = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium_4Th_july\\ScreenShot_Capture\\photo.jpeg");
       FileHandler.copy(source, destination); 
       
       Thread.sleep(2000);
       driver.quit();
	}

}
