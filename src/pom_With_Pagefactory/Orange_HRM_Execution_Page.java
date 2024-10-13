package pom_With_Pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_HRM_Execution_Page {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Orange_HRM_LoginPage login = new Orange_HRM_LoginPage(driver);
		login.enterUN();
		login.enterPSW();
		login.clickOnLoginBtn();
		
		Orange_HRM_DashBoard_Page dashboard = new Orange_HRM_DashBoard_Page(driver);
		dashboard.VarifyDashBoardtitle();
		dashboard.MyinfoBtn();
		
		Orange_HRM_Myinfo_Page page = new Orange_HRM_Myinfo_Page(driver);
		page.enterFN();
		page.enterMN();
		page.enterLN();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
