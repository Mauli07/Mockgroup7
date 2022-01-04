package seleniump;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		
		Select sel = new Select(day);//Create Select class object
		sel.selectByIndex(1);// select visible dropdown value on the basis on index.
		
		System.out.println(sel.getFirstSelectedOption().getText());
	
		sel.selectByVisibleText("22");
		System.out.println(sel.getFirstSelectedOption().getText());
		
		sel.selectByValue("30");
		System.out.println(sel.getFirstSelectedOption().getText());
		
		//Handling without Select Class
		day.sendKeys("31");
		System.out.println(sel.getFirstSelectedOption().getText());
	}

}
