package handle_WebTables;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_WebTable_Program2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", 
				"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    
		    driver.get("https://money.rediff.com/indices?src=moneyhome_bseIndices_more%22");
		    Thread.sleep(3000);
		    
	       driver.findElement(By.xpath("//a[@id='showMoreLess']")).click();
		   
	      List<WebElement> row = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
		    
	      List<WebElement> column = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]//th"));
	      
	      for(int i=0; i<row.size(); i++)
	      {
	    	  System.out.println(row.get(i).getText());
	      }
	      driver.close();
	}

}
