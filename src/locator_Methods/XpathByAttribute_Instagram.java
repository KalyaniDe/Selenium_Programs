package locator_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class XpathByAttribute_Instagram {

	public static void main(String[] args) {
				
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		  driver.get("https://www.instagram.com/");
		        
		   //enter email or mobile no
		   driver.findElement(By.xpath("//input[@value name='username']")).sendKeys("admin111");
	}

}
