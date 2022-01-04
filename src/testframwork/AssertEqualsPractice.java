package testframwork;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import utility.Screenshots;



public class AssertEqualsPractice {
	
	@Test
	public void errorMsgValidation() throws IOException{
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\ChromeDriver\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	
	// redirecting to a URL
	driver.manage().window().maximize();
	
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("addmin");
	
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
	
	
	driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	
	
WebElement message = driver.findElement(By.xpath("//*[@id='spanMessage']"));
	
//	System.out.println(message.getText());
//	
//	String messagestring = message.getText();
//	
//	System.out.println(messagestring);
	
//	String expectedmessage = "Invalid credentialss";
	
Assert.assertEquals(message.getText(),"Invalid credentialss");
	
//	ScreenShots
//	TakesScreenshot captureScrShots = (TakesScreenshot) driver;
//	File source = captureScrShots.getScreenshotAs(OutputType.FILE);
//	File destination = new File("D:\\Automation\\filename.png");
//	String path = System.getProperty("user.dir")+"\\Screenshots\\filename.png";
//	File destination =new File(path);
//	FileHandler.copy(source, destination);
//	Screenshots.captureScrShot(driver, "Failed2");

}
}
