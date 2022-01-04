package pompages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {	//Create Constructor to initialize driver value
		
		this.driver = driver;
	}
	public void loginWithCorrectCred() {
		
		WebElement username = driver.findElement(By.id("userid"));
		username.sendKeys("HI2158");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("ra$berry#7");
		
		WebElement loginbutton = driver.findElement(By.xpath("//*[@type='submit']"));
		loginbutton.click();
	}
	
	public void enterPin()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement pin = driver.findElement(By.xpath("//*[@id='pin']"));
		pin.sendKeys("990990");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

}
