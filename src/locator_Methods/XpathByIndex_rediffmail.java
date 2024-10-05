package locator_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex_rediffmail {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
			
			// (//input[@type=”text”])[1] OR [2]
			
			driver.findElement(By.xpath("(//input[@type='text'])[5]"));
			
		    driver.findElement(By.xpath("(//input[@type='password'])[1]"));
			
			
		}		

}
