package handle_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://is.rediff.com/signup/register");
			
			driver.manage().window().maximize();
			WebElement date_ele = driver.findElement(By.xpath("//select[@id='date_day']"));
			Select s = new Select(date_ele);
			s.selectByIndex(17);
			
			WebElement mon_ele = driver.findElement(By.xpath("//select[@id='date_mon']"));
			Select s1 = new Select(mon_ele);
			s1.selectByVisibleText("AUG");
			
			WebElement year_ele = driver.findElement(By.xpath("//select[@name='Date_Year']"));
			Select s2 = new Select(year_ele);
			s2.selectByValue("2001");
			Thread.sleep(2000);
			driver.quit();
	}

}

