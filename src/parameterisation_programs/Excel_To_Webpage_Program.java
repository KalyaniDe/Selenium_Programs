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
import org.openqa.selenium.support.ui.Select;

public class Excel_To_Webpage_Program {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	    Thread.sleep(3000);
	   
	    WebElement FN = driver.findElement(By.xpath("//input[@name='firstname']")); // first name
	    WebElement SN = driver.findElement(By.xpath("//input[@name='lastname']"));  // surname
	    WebElement EmailID = driver.findElement(By.xpath("(//input[@type='text'])[4]")); // email id
	    WebElement NewPass = driver.findElement(By.xpath("//input[@id='password_step_input']")); // new password
	    WebElement DayDate = driver.findElement(By.xpath("//select[@id='day']"));    //dob- date
	    WebElement Month= driver.findElement(By.xpath("//select[@id='month']"));     //dob - month
	    WebElement Year = driver.findElement(By.xpath("//select[@id='year']")); //  dob - year
	    
	    driver.findElement(By.xpath("//label[text()='Female']")).click();   //female radio button        
	    
	    FileInputStream file = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium_4Th_july\\Parametr\\Book1.xlsx");
	    
	    Sheet excel = WorkbookFactory.create(file).getSheet("Sheet2");
	    
	    FN.sendKeys(excel.getRow(0).getCell(0).getStringCellValue());
	    Thread.sleep(1000);
	    SN.sendKeys(excel.getRow(0).getCell(1).getStringCellValue());
	    Thread.sleep(1000);
	    EmailID.sendKeys(excel.getRow(0).getCell(2).getStringCellValue());
	    Thread.sleep(1000);
	    NewPass.sendKeys(excel.getRow(0).getCell(3).getStringCellValue());
	    Thread.sleep(1000);
	    
	    Select date = new Select(DayDate);
	    date.selectByVisibleText(excel.getRow(0).getCell(4).getStringCellValue());
	    
	    Select month = new Select(Month);
	    month.selectByVisibleText(excel.getRow(0).getCell(5).getStringCellValue());
	    
	    Select year = new Select(Year);
	    year.selectByVisibleText(excel.getRow(0).getCell(6).getStringCellValue());
	    
	    driver.findElement(By.xpath("//button[@name='websubmit']")).click();  //sign button
	    Thread.sleep(2000);
	    driver.quit();    
	}

}
