package testNG_Practise;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount 
	{
		@Test(invocationCount=5)			
		public void TC1() 
		{
			Reporter.log("running TC1...",true);
		}

	}



