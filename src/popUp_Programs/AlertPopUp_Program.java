package popUp_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp_Program {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	     // enter custemer id
	     driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("Harrey Potter");
	     
	     // click on submit button  
	     driver.findElement(By.xpath("//input[@name='submit']")).click();
	     
	     Thread.sleep(2000);
	     // get text from alert pop up
	     String text = driver.switchTo().alert().getText();
	     System.out.println(text);
	     
	     driver.switchTo().alert().accept();
	     
	     //Thread.sleep(3000);
	     
	     driver.close();
	
	
	
	
	
	
	
	
	}

}
