package basic_Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch_1 {
public static void main(String[] args) {
	
	//step 1: set a path of chromedriver.exe file
	//parameter 1: name of the browser---> small letter
	//parameter 2: path of browser
		
		System.setProperty("websdriver.chrome.driver", "C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

	// step 2: create an abject of chromeDriver class.
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

}
