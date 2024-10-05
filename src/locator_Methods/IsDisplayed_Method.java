package locator_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_Method {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://en-gb.facebook.com/");
				
				driver.manage().window().maximize();
				
				boolean txtimg = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
				System.out.println(txtimg);
				
				if(txtimg==true)
				{
					System.out.println("element is present on webpage");
				}
				else
				{
					System.out.println("element is not present on webpage");
				}
		}

	}

