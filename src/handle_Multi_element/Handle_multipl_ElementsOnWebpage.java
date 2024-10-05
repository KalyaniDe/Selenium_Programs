package handle_Multi_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_multipl_ElementsOnWebpage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
	    "C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
				     
	      driver.get("https://www.google.com/");
	      
	     List<WebElement> links = driver.findElements(By.xpath("//a"));
	     System.out.println("Total Links = "+ links.size());
	     
	     for(int i=0; i<links.size(); i++)
	     {
	    	 System.out.println(links.get(i).getText());
	     }
	     for(int i=0; i<links.size(); i++)
	     {
			String expectedLinks = "Business";
			String actualLinks = links.get(i).getText();
			
			if(expectedLinks.equals(actualLinks))
			{
				links.get(i).click();
				break;
			}
	     }
	     System.out.println("Title = "+ driver.getTitle());
	     Thread.sleep(4000);
	     
	     driver.close();
	}

}
