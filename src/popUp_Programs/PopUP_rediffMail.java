package popUp_Programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUP_rediffMail {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		 WebElement SignInBtn = driver.findElement(By.xpath("//input[@class='signinbtn']"));
		 SignInBtn.click();
		 Thread.sleep(3000);
		 Alert pop = driver.switchTo().alert();
		 String value = pop.getText();
		 System.out.println(value);
		
		 pop.accept();
		 Thread.sleep(2000);
		 driver.close();
		 
		 
		 
		
		
		
		
		
	}

}
