package seleniump;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
		
		WebElement phoneNo = driver.findElement(By.xpath("//*[@id='email']"));
		act.click(phoneNo).sendKeys("9421460719").build().perform();
		act.sendKeys(Keys.TAB).sendKeys("abcdefgh");
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
	}

	
}
