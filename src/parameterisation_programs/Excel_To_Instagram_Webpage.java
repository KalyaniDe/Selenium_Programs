package parameterisation_programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_To_Instagram_Webpage {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		 System.setProperty("webdriver.chrome.driver", 
		 "C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.instagram.com/");
	     
	     WebElement UN = driver.findElement(By.xpath("//input[@name='username']"));
	     WebElement PWd = driver.findElement(By.xpath("//input[@type='password']"));
	     
	     FileInputStream file = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium_4Th_july\\Parametr\\Book1.xlsx");
	     Sheet excel = WorkbookFactory.create(file).getSheet("Sheet3");
	     
	     UN.sendKeys(excel.getRow(0).getCell(0).getStringCellValue());
	     Thread.sleep(1000);
	     
	     PWd.sendKeys(excel.getRow(0).getCell(1).getStringCellValue());
	     Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	}

}
