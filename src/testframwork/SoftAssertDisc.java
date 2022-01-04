package testframwork;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDisc {
	
	@Test
	public void testCase1()
	{
	Reporter.log("First line", true);
	
	SoftAssert sa = new SoftAssert();
	
	sa.assertEquals(true, false);
	
	Reporter.log("second line", true);
	
	sa.assertAll();
	
	
	}

@Test
	
	public void testCase2()
	{
	Reporter.log("First line", true);
	
	SoftAssert sa = new SoftAssert();
	
	sa.assertTrue(true, "Test case failed");
	
	Reporter.log("second line", true);
	
	sa.assertEquals("abc", "ghi");
	
	Reporter.log("Third line", true);
	
	sa.assertAll();
	
	
	}


}
