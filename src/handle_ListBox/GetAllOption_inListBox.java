package handle_ListBox;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class GetAllOption_inListBox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://is.rediff.com/signup/register");
        Thread.sleep(2000);
        
       WebElement DayListBox = driver.findElement(By.xpath("//select[@id='date_day']"));
       Select s = new Select(DayListBox);
       List<WebElement> Totaloption= s.getOptions();
       
       for(int i=0; i<Totaloption.size(); i++)
       {
    	   System.out.println(Totaloption.get(i).getText());
       }
       
       System.out.println("****************************");
       
       WebElement MonthLixtBox = driver.findElement(By.xpath("//select[@id='date_mon']"));
       Select s1 = new Select(MonthLixtBox);
       List<WebElement> monthoption = s1.getOptions();
       
       for(WebElement elements : monthoption)
       {
    	  System.out.println(elements.getText());
       }
       
//       for(int i=0;i<=12;i++)			
//		{	
//			System.out.println(monthoption.get(i).getText());	
//		}						
//       
       System.out.println("****************************");
       
       WebElement YearListBox = driver.findElement(By.xpath("//select[@name='Date_Year']"));
       Select s2 = new Select(YearListBox);
       List<WebElement> yearoption = s2.getOptions();
       
       for(int i=0; i<yearoption.size(); i++)
       {
    	   System.out.println(yearoption.get(i).getText());
       }
        
       driver.quit();
	}
}
