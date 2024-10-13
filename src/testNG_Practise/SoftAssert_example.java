package testNG_Practise;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_example {
	
	@Test
	public void softAssertExp()
	{
	   SoftAssert soft= new SoftAssert();
	   
	   String s1 = "Kalyani";
	   String s2 = "Deore";
	   
	   Assert.assertEquals(s1, s2, "Failed1: both results are diff");
	   
	   String s3 = "abc";
	   String s4 = "xyz";
	   
	   Assert.assertNotEquals(s3, s4, "Failed2: both results are same");
	   
	   boolean s5=false;
	   soft.assertTrue(s5,"Failed3: act result is false");
		
	   soft.assertAll();
	}
}