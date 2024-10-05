package handle_WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_WebTable_Program {
public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", 
			"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://money.rediff.com/index.html");
	   List<WebElement> row = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul"));
	    
	   List<WebElement> colum = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul[1]//li"));
	
	   System.out.println(row.size());
	   System.out.println(colum.size());
	   
	   for(int i=0; i<row.size();i++)
	   {
		   System.out.println(row.get(i).getText());
	   }
	   driver.close();
	
	}

}

