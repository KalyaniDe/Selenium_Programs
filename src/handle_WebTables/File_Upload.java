package handle_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {

	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("Webdriver.chrome.driver", 
				"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    
		    driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		    
		    WebElement chooseFileBtn = driver.findElement(By.xpath("//input[@name='upfile']"));
		    
		    WebElement pressBtn = driver.findElement(By.xpath("//input[@value='Press']"));
		    chooseFileBtn.sendKeys("C:\\Users\\HP\\eclipse-workspace\\Selenium_4Th_july\\Parametr\\Book1.xlsx");
            Thread.sleep(3000);
            pressBtn.click();
            Thread.sleep(3000);
            driver.close();
	}

}
