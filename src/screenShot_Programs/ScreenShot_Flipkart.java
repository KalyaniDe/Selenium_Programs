package screenShot_Programs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_Flipkart {

	private static Object object;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("wendriver.chrome.driver", 
			"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.flipkart.com/");
        
        File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File desti = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium_4Th_july\\ScreenShot_Capture\\picture.jpg");
        FileHandler.copy(s, desti);
    
        Thread.sleep(2000);
        driver.quit();
	}

}
