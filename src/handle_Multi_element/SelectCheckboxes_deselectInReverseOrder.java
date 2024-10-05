package handle_Multi_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCheckboxes_deselectInReverseOrder {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
			    "C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 
			 driver.get("https://www.ironspider.ca/forms/checkradio.htm");
			 
		     List<WebElement> MultipleCheckBoxs = driver.findElements(By.xpath("//input[@type='checkbox']"));
		     
		     for(int i=0; i<=MultipleCheckBoxs.size()-1; i++)
		     {
		    	 MultipleCheckBoxs.get(i).click();
		    	 Thread.sleep(2000);
		     }
		     for(int i=MultipleCheckBoxs.size()-1; i>=0; i--)
		     {
		    	 MultipleCheckBoxs.get(i).click();
		    	 Thread.sleep(2000);
		     }
		     
		     driver.close();

	}

	
}
