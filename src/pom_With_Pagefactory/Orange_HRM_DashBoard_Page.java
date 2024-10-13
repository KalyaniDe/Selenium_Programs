package pom_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orange_HRM_DashBoard_Page {
	// step 1: Declaration
	
	@FindBy (xpath = "//h6[text()='Dashboard']") WebElement DashBoardName;
	@FindBy (xpath = "//span[text()='My Info']") WebElement MyInfo;
	
	// step 2: Initialization(Constructor)
	public Orange_HRM_DashBoard_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void VarifyDashBoardtitle()
	{
		String actTitle = DashBoardName.getText();
		String expTitle = "Dashboard";
		
		if(actTitle.equals(expTitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	public void MyinfoBtn ()
	{
		MyInfo.click();
	}

}

