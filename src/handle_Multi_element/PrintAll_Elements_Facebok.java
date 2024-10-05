package handle_Multi_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAll_Elements_Facebok {

	public static void main(String[] args) {
		
		     System.setProperty("webdriver.chrome.driver",
			    "C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.manage().window().maximize();		     
			 driver.get("https://www.facebook.com/");
		     List<WebElement> AllLinks = driver.findElements(By.xpath("//a"));
		     System.out.println(AllLinks.size()); 
		     
		     for(WebElement link : AllLinks)
		     {
		    	 System.out.println(link.getText());
		     }
	}

}
