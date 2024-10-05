package practise_Problem_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://is.rediff.com/signup/register");
		//enter fullName
		driver.findElement(By.xpath("//input[@id='fullname']")).sendKeys("Admin");
		//enter current email id
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("admin@gmail.com");
		//enter password
		driver.findElement(By.id("pass")).sendKeys("test1234");
		//enter re password
		driver.findElement(By.xpath("//input[@name='repass']")).sendKeys("test1234");
		//click on gender button
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		//enter the location
		driver.findElement(By.id("signup_city")).sendKeys("Dhule");
		//enter School
		driver.findElement(By.name("school")).sendKeys("ABC");
		//enter collage
		driver.findElement(By.id("college")).sendKeys("svkm");
		//enter the no of captcha
		driver.findElement(By.name("fld_captcha")).sendKeys("64330");
		//click on signup button
	    driver.findElement(By.xpath("//input[@class='submitbtn vmiddle']")).click();
		//clink on privacy policy link
	    driver.findElement(By.linkText("Privacy Policy")).click();
	    //show the text
	    WebElement text = driver.findElement(By.xpath("//b[text()='New User? Register here']"));
		String line = text.getText();
		System.out.println(line);
		
		Thread.sleep(3000);
		driver.close();
		
	}

}


