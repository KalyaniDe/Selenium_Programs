package handle_ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption_InMulti {

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
	    
	   List<WebElement> selectedOption = s.getAllSelectedOptions();
	   
	   for(WebElement option : selectedOption)
	   {
		   System.out.println(option.getText());
	   }
	   
	   WebElement firstOption = s.getFirstSelectedOption();
	   System.out.println(firstOption.getText());

	}

}
