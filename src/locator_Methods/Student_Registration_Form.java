package locator_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Student_Registration_Form {
	 public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
				 
		 driver.get("https://demoqa.com/automation-practice-form");
	     Thread.sleep(2000);
	     
		 driver.manage().window().maximize();
		 //enter firstName
		 driver.findElement(By.id("firstName")).sendKeys("shyam");
		 //enter LastName
		 driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("patil");
		 //enter emailID
		 driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("shyampatil@123.com");
		 //enter gender button female(not working)
		// driver.findElement(By.xpath("//input[@id='gender-radio-2']")).click();
		// enter mobile no
		driver.findElement(By.id("userNumber")).sendKeys("5436538762");
		//enter date of birth
		//driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).sendKeys("22 august 2022");
		//enter subject
		//driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3's]")).sendKeys("softwareTesting");
	}
}
