package handle_ListBox;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_singleSelectable_orMultiSelectable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
        Thread.sleep(2000);
        driver.switchTo().frame("iframeResult");
        
        WebElement cars = driver.findElement(By.xpath("//select[@id='cars']"));
        Select s = new Select(cars);
        List<WebElement> cars_el = s.getOptions();
        
        System.out.println("Print All option in list Box: ");
        for(int i=0; i<cars_el.size(); i++)
        {
        	System.out.println(cars_el.get(i).getText());
        }
        System.out.println(s.isMultiple());
        s.selectByVisibleText("Volvo");
        s.selectByVisibleText("Saab");
        Thread.sleep(2000);
        s.selectByVisibleText("Saab");
       
        driver.quit();
	}

}
