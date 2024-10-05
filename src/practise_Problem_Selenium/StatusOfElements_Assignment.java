package practise_Problem_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfElements_Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://megrecruitment.nic.in/rpa/register.htm");
	        driver.manage().window().maximize();
	        //enter date of birth
	       WebElement dobTxtBox = driver.findElement(By.xpath("//input[@id='dob']"));
	       System.out.println("is Displayed ="+ dobTxtBox.isDisplayed());
	       System.out.println("is Enabled ="+ dobTxtBox.isEnabled());
	       System.out.println("is Selected ="+ dobTxtBox.isSelected());
	       
	       System.out.println("--------------------------------");
	       //enter checkbox
	      WebElement langucheckbox = driver.findElement(By.xpath("(//input[@class='languages validate[required] ng-pristine ng-valid'])[1]"));
	      System.out.println("is Displayed ="+ langucheckbox.isDisplayed());
	      System.out.println("is Enabled ="+ langucheckbox.isDisplayed());
          System.out.println("is Selected "+ langucheckbox.isDisplayed());
	}

}
