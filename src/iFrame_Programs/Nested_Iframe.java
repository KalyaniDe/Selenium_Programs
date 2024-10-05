package iFrame_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_Iframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		WebElement sglIframe = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		sglIframe.click();
		WebElement ifrmbtn = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		ifrmbtn.click();
		Thread.sleep(2000);
		WebElement outeriframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outeriframe);
		WebElement inneriframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(inneriframe);
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("Hi Harrey");
		Thread.sleep(3000);
		
      //  driver.switchTo().defaultContent();
		driver.quit();	
	}

}
