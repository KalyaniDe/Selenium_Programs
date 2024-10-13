package pom_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orange_HRM_Myinfo_Page {
    
	// step 1: Declaration
	
	@FindBy(xpath = "//input[@name='firstName']") WebElement FN;
	@FindBy(xpath = "//input[@name='middleName']") WebElement MN;
	@FindBy(xpath = "//input[@name='lastName']") WebElement LN;
	
	// step 2: Initialization(Constructor)
	
	public Orange_HRM_Myinfo_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	public void enterFN()
	{
		FN.sendKeys("Kalyani");
	}
	public void enterMN()
	{
		MN.sendKeys("Vikas");
	}
	public void enterLN()
	{
		LN.sendKeys("Deore");
	}
	
}
