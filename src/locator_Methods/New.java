package locator_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[contains(@name,'namedd')])[1]")).sendKeys("Admin111");
			
		
	}

}
