package testframwork;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationInTestNG {
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("@BeforeTest from Annotation1", true);
	}
	
	@BeforeClass
	public void beforeClass() {
		Reporter.log("@Before Class from annotation 1", true);
	}
	
	@AfterClass
	public void afterClass() {
		Reporter.log("@After Class", true);
	}
	
	@BeforeMethod
	public void beforeM1() {
		
		Reporter.log("@BeforeMethod Running", true);
	}
	
	@Test
	public void testCase1() {
		
		Reporter.log("Actual Test case 1",true);
	}
	@Test
	public void testCase2() {
		
		Reporter.log("Actual Test case 2",true);
	}
	@AfterMethod(enabled =true)
	public void beforeM2() {
		
		Reporter.log("@AfterMethod Running", true);
	}
}
