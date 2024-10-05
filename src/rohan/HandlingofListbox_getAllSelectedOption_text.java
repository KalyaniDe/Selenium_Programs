package rohan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingofListbox_getAllSelectedOption_text {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
			driver.switchTo().frame("iframeResult");
			
			WebElement cars = driver.findElement(By.xpath("//select[@id='cars']"));

			Select s = new Select(cars);
			
		    s.selectByVisibleText("Audi");
		    s.selectByVisibleText("Volvo");
		
		    List<WebElement> allOptions = s.getAllSelectedOptions();
		    
		    for (WebElement ap :allOptions)
		    {
		    	System.out.println(ap.getText());
		    }
		    
		    
		      WebElement first = s.getFirstSelectedOption();
		      
		      System.out.println(first.getText());
		    
		
	}
	
	

}
