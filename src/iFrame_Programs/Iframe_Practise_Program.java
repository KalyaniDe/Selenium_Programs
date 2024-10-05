package iFrame_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Practise_Program {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ui.vision/demo/webtest/frames/");
        
        //driver.switchTo().frame("//b[text()='Frame Test Page']");
        
        driver.findElement(By.xpath("//b[text()='Frame Test Page']"));
        
        
        driver.switchTo().frame("mytext1");
        WebElement Frame1 = driver.findElement(By.xpath("//input[@name='mytext1']"));
        Frame1.sendKeys("TestData");
        
        driver.switchTo().parentFrame();
        
        driver.switchTo().frame("mytext2");
        WebElement Frame2 = driver.findElement(By.xpath("//input[@name='mytext2']"));
        Frame2.sendKeys("TestData1");
        
        driver.switchTo().parentFrame();
        
        driver.switchTo().frame("mytext3");
        WebElement Frame3 = driver.findElement(By.xpath("//input[@name='mytext3']"));
        Frame3.sendKeys("TestData2");
        
        driver.quit();     
	}

}
