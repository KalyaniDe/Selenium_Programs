package testNG_Practise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Equals {
	
	@Test
	public void asserequals()
	{
		String expResult = "Hii";
		String actResult ="Hii";
		
		Assert.assertEquals(expResult, actResult, "Falied: both results are diff: ");
	}

	@Test
	public void assertNotEquals()
	{
		String expResult = "Hii";
		String actResult ="Hii";
		
		Assert.assertEquals(expResult, actResult, "Falied: both results are same: ");
	}
	
	@Test
	public void assertTrue()
	{
		boolean actresult = false;
		Assert.assertTrue(actresult, "Failed: act result is false: ");
	}
	
	@Test
	public void assertFalse()
		{
			boolean actResult= true;
			Assert.assertFalse(actResult,"Failed: act result is true");
		}
	
	@Test
	public void assertNull() 
	{
		String actResult= "abc";
		Assert.assertNull(actResult, "act result is not null: ");
	}

	@Test
	public void assertNotNull() 
	{
		String actResult= null;
		Assert.assertNotNull(actResult,"Failed: act result is null");
	}

}
	

