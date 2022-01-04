package testframwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecution {
	
	@Test
	public void navToGoogle()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver	driver = new ChromeDriver();
		
		// redirecting to a URL
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
	}
	
	
	@Test
	public void navToFacebook()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		// redirecting to a URL
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
}
