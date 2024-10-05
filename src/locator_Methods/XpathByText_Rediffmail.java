package locator_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText_Rediffmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		//enter Choose a Rediffmail ID
		//text is >inbetween bracket<
		//text() is common for all textpath
		driver.findElement(By.xpath("//td[text()='Choose a Rediffmail ID']"));
		
		driver.findElement(By.xpath("//td[text()='@rediffmail.com']"));
		

	}

}
