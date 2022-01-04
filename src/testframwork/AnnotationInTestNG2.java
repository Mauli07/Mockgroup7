package testframwork;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationInTestNG2 {
	
//	@BeforeClass
//	public void beforeClass2() {
//		Reporter.log("@Before Class from AnnoatationInTestNG2 Class", true);
//	}
	
	@AfterClass
	public void afterClass2() {
		Reporter.log("@After Class from AnnoatationInTestNG2 Class", true);
	}
	
	@BeforeMethod
	public void beforeM1() {
		
		Reporter.log("@BeforeMethod Running from AnnoatationInTestNG2 Class", true);
	}
	
	@Test
	public void testCase1() {
		
		Reporter.log("Actual Test case 1 from AnnoatationInTestNG2 Class",true);
	}
	@Test
	public void testCase2() {
		
		Reporter.log("Actual Test case 2 from AnnoatationInTestNG2 Class",true);
	}
	@AfterMethod(enabled =true)
	public void beforeM2() {
		
		Reporter.log("@AfterMethod Running from AnnoatationInTestNG2 Class", true);
	}

}
