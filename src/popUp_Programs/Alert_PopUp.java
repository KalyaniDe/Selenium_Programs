package popUp_Programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//What	is	alert?	How	we	can	automate	/	handle	it.	
public class Alert_PopUp {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement clickToDisplayAltBox = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickToDisplayAltBox.click();
		Alert pop = driver.switchTo().alert();
		Thread.sleep(3000);
		String altpop1 = pop.getText();
		System.out.println(altpop1);
		pop.accept();
		Thread.sleep(3000);
		
		WebElement AltWithOkCancel = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		WebElement RedAltBox = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		AltWithOkCancel.click();
		Thread.sleep(2000);
		RedAltBox.click();
		Thread.sleep(2000);
		Alert pop1 = driver.switchTo().alert();
		String val = pop1.getText();
		System.out.println(val);
		pop1.dismiss();
		
		Thread.sleep(2000);
		
		WebElement AltWithTxtBox = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		AltWithTxtBox.click();
		Thread.sleep(3000);
		WebElement promptBox = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		promptBox.click();
		Thread.sleep(3000);
		Alert pop2 = driver.switchTo().alert();
		String altpop = pop2.getText();
		System.out.println(altpop);
		pop2.sendKeys("Tom Jerrey");
		pop2.accept();
		Thread.sleep(3000);
		WebElement result = driver.findElement(By.xpath("//p[@id='demo1']"));
		System.out.println(result.getText());
		Thread.sleep(3000);
		driver.close();	
		
	}

}
