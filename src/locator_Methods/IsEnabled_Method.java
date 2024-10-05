package locator_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_Method {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://en-gb.facebook.com/");
			
			driver.manage().window().maximize();
			
			boolean txtloginbuttan = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
			System.out.println(txtloginbuttan);
			
			if(txtloginbuttan==true)
			{
				System.out.println("loginbutton element is enabled");
			}
			else
			{
				System.out.println("loginbutton element is not enabled");
			}
	}

}

