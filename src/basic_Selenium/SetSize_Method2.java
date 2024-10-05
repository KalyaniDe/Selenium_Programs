package basic_Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize_Method2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        driver.get("https://www.flipkart.com");
        Thread.sleep(2000);
        
        Dimension d = new Dimension(300, 500);
        driver.manage().window().setSize(d);
        Thread.sleep(3000);
        
        Point p = new Point(80, 700);
        driver.manage().window().setPosition(p);
        Thread.sleep(2000);
        driver.quit();
        
	}

}
