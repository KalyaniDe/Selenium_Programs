package handle_Multi_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi_Elements_Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
	    
	   List<WebElement> AllLinks = driver.findElements(By.xpath("//a"));
	   System.out.println(AllLinks.size());
	   
	   for(int i=0; i<AllLinks.size(); i++)
	   {
		   System.out.println(AllLinks.get(i).getText());
	   }
	   for(int i=0; i<AllLinks.size(); i++)
	   {
		   String expLink = "Beauty";
		   String actLink = AllLinks.get(i).getText();
				   if(expLink.equals(actLink))
				   {
					   AllLinks.get(i).getText();
					   break;
				   }
	       }
	         System.out.println("Title = "+ driver.getTitle());
	         Thread.sleep(3000);
	         driver.close();
	   

	}

}
