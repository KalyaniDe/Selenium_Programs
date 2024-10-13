package pom_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orange_HRM_LoginPage {
	
	 //Step 1: Declaration ------> global variable
	
	@FindBy(xpath = "//input[@name='username']") private WebElement UN;
	@FindBy(xpath = "//input[@name='password']") private WebElement PSW; 
	@FindBy(xpath = "//button[@type= 'submit']") private WebElement LoginBtn; 
	
	// step 2: Initialization
	public Orange_HRM_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterUN()
	{
		UN.sendKeys("Admin");
	}
	public void enterPSW()
	{
		PSW.sendKeys("admin123");
	}
	public void clickOnLoginBtn()
	{
		LoginBtn.click();
	}
	

}
