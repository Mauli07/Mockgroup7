package testframwork;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utility.ReadWriteExcel;

public class OrangeHRMTestCase {
	static WebDriver driver;

	
	@Test
	public void loginTest() throws IOException, InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	driver.manage().window().maximize();
	for(int i=1; i<=3;i++) {
		for(int j=0; j<2; j++) {
			if(j==0)
			{
				driver.findElement(By.id("txtUsername")).sendKeys(ReadWriteExcel.readData(i, j));
			}
			
			if(j==1) 
			{
				driver.findElement(By.id("txtPassword")).sendKeys(ReadWriteExcel.readData(i, j));
			}
			
			}
		driver.findElement(By.id("btnLogin")).click();
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(driver.findElement(By.xpath("//*[@id='spanMessage']")).getText(), "Invalid credentials");
		
		//Assert.assertEquals(driver.findElement(By.xpath("//*[@id='spanMessage']")), "Invalid credentials");
		sa.assertAll();
	}
	Thread.sleep(2000);
	}
}
