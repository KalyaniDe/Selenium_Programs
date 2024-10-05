package locator_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBy_ID_Tagname_ClassName {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.manage().window().maximize();
		
		//locator=tagname
		driver.findElement(By.tagName("input")).sendKeys("harry");
		//locator=ID
		driver.findElement(By.id("newpasswd")).sendKeys("harry12");
		//locator=className
		driver.findElement(By.className("btn_checkavail")).sendKeys("haryclass");
		//locator=linktext
		driver.findElement(By.linkText("terms and conditions")).click();
		//locator= partial link text
		driver.findElement(By.partialLinkText("term")).click();
		//locator= getText
	   WebElement text = driver.findElement(By.xpath("//td[text()='Create a Rediffmail account']"));
	   String name = text.getText();
	   System.out.println(name);
	   
	}

}
