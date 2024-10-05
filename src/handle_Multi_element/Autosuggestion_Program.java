package handle_Multi_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_Program {

	public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    
		    driver.get("https://www.google.co.in/");
		    
		   WebElement SearchBar = driver.findElement(By.xpath("//textarea[@name='q']"));
		   SearchBar.sendKeys("mama"); 
		   Thread.sleep(2000);
		   
		  List<WebElement> autosuggesion = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		  
		  for(int i=0; i<autosuggesion.size(); i++)
		  {
			  System.out.println(autosuggesion.get(i).getText());
		  }
		  for(int i=0; i<autosuggesion.size(); i++)
		  {
			  String explink = "mamaearth shampoo";
			  String actlink = autosuggesion.get(i).getText();
			  
			  if(explink.equals(actlink));
			  {
				  autosuggesion.get(i).click();
				  break;
			  }
			  
		  }
		     Thread.sleep(4000);
		     driver.close();
		    
	}
}