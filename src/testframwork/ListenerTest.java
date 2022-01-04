package testframwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerTest {
	static WebDriver driver;
	
	@Test(priority = 1)
	public void kiteLogin() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://zerodha.com");
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://zerodha.com");
		
	}
	@Test(priority = 2, dependsOnMethods = "kiteLogin")
	public void home() {
		
		System.out.println("Profile Created");
	}
	
	@Test(priority = 3)
	public void logOut() {
		System.out.println("Logout from kite");
	}

}
