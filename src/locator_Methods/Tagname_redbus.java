package locator_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname_redbus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://business.phonepe.com/register");
		//enter email
		driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("web@123");
		//enter mobile no
		//driver.findElement(By.xpath("//input[@class='ant-input css-1xvh1z3']")).sendKeys("7648564123");
		
		
;
	}

}
