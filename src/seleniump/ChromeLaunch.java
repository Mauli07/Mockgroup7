package seleniump;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\ChromeDriver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	
	driver.manage().window().maximize();
//	System.out.println(driver.getCurrentUrl());
//	System.out.println(driver.getTitle().length());
		
	//Click on signup
	WebElement signupnow = driver.findElement(By.partialLinkText("Signup"));
	signupnow.click();
	
	//driver.findElement(By.id("user_mobile")).sendKeys("9421460719");
	
	//driver.findElement(By.xpath("//*[@id='user_mobile']")).sendKeys("9421460719");
	Thread.sleep(2000);
	driver.quit();
	}

}
