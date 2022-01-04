package seleniump;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		//Fill Form
		driver.findElement(By.xpath("//*[@placeholder='Enter your name']")).sendKeys("Dnyaneshwar");
		driver.findElement(By.xpath("//*[@placeholder='Enter your mobile phone']")).sendKeys("9421460719");
		driver.findElement(By.xpath("//*[@placeholder='Enter email']")).sendKeys("dnimbhore@gamil.com");
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Today@123");
		driver.findElement(By.xpath("(//*[@id='address'])[1]")).sendKeys("Wagholi,Pune-412207");
		//CheckBox & Radio Button
		driver.findElement(By.xpath("//*[@id='male']")).click();
		
		driver.findElement(By.id("monday")).click();
		WebElement country = driver.findElement(By.className("custom-select"));
		Select sel =new Select(country);
		//sel.selectByVisibleText("Denmark");
		sel.selectByValue("1");//selected as per value mention in web element
		//sel.selectByIndex(7);//index value start from 0
		
		
		//		for(int i=0;i<7;i++)
		//		{
		//			driver.findElement(By.xpath("//*[contains(@type,'checkbox')]["+i+"]")).click();
		//		}
		}

}
