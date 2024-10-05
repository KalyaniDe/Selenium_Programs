package handle_Multi_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_Program2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
				     
	    driver.get("https://www.google.com/");
	    String ExpText = "redmi 11 pro";
	    WebElement searchBar = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
	    searchBar.sendKeys("redmi 11");
	    
	    Thread.sleep(3000);
	    
	    List<WebElement> MultipleElements = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	    
	    for(WebElement singleElement : MultipleElements)
	    {
	    	String actText = singleElement.getText();
	    	if(actText.equals(ExpText))
	    	{
	    		singleElement.click();
	    		break;
	    	}
	    }
	    
	}

}
