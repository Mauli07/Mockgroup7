package seleniump;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {
	
	public static void dynamicDropDown(WebDriver driver) throws InterruptedException {
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//*[@alt='Travel']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("0-travellerclasscount")).click();
		Thread.sleep(1000);
		for(int i=1; i<4; i++) {
			
			driver.findElement(By.xpath("(//*[@class='_2KpZ6l _34K0qG _37Ieie'])[1]")).click();
			
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		dynamicDropDown(driver);
		
//		driver.get("https://zoom.us/signup");
//		
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("//*[@id='select-0']")).click();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//*[@id='select-item-select-0-2']")).click();

	}

}
