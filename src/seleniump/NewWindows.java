package seleniump;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindows {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://zerodha.com/");
		driver.manage().window().maximize();
		
				
////		Actions act=new Actions(driver);
////		act.click().keyDown(Keys.DOWN).sendKeys("t").keyUp(Keys.UP).build().perform();
//		
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("window.open('https://www.facebook.com')");
		
		jse.executeScript("window.open('https://www.instagram.com')");
			
		jse.executeScript("window.open('https://www.linkedin.com/signup')");
		
		String parentId = driver.getWindowHandle();
		
	Set<String> allWindowId = driver.getWindowHandles();
	
	
	String[] winid = new String[allWindowId.size()];//Create array to store windows ID
	
	System.out.println("Size="+allWindowId.size());//used to find string size
	
	
	// Fill Array
	int i=0;
	for(String id:allWindowId) 
	{
		winid[i]=id;
		i++;
	}
	System.out.println("Length="+winid.length);// used to find array size
		for(int j=0;j<allWindowId.size();j++)
		{
			System.out.println(winid[j]+"Title="+driver.getTitle());
			
		}
		driver.switchTo().window(parentId);
		
		driver.findElement(By.xpath("//*[@id='menu_btn']")).click();
		driver.switchTo().window(winid[1]);
		driver.findElement(By.xpath("//*[@name='email-or-phone']")).sendKeys("9923220061");
	}

}
