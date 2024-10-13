package testNG_Practise;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_Priority {

		@Test(priority=2)
		public void TC1() 
		{
			Reporter.log("running TC1...",true);
		}
		
		@Test(priority=1)
		public void TC2() 
		{
			Reporter.log("running TC2...",true);
		}	
		
	}

