package testNG_Practise;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	
	
	public class example4_Annotations 
	{
		@AfterClass
		public void closeBrowser() 
		{
			Reporter.log("close browser..",true);
		}
		
		@BeforeClass
		public void openBrowser() 
		{
			Reporter.log("open browser..",true);
		}
		
		
		@BeforeMethod
		public void loginToApp() 
		{
			Reporter.log("login to app..",true);
		}

		@Test
		public void verifyUserID() 
		{
			Reporter.log("running verifyUserID test case...",true);
		}
		
		@Test
		public void verifyUserID1() 
		{
			Reporter.log("running verifyUserID1 test case...",true);
		}
		
		@AfterMethod
		public void logoutFromApp() 
		{
			Reporter.log("logout from app..",true);
		}
	}

}
