package seleniump;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintDropDownValues {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
		List<WebElement> vacancy = driver.findElements(By.xpath("//*[@id='candidateSearch_jobVacancy']//option"));
		
		System.out.println("Number of Job Title="+ vacancy.size());//Size
		
		for(WebElement jobTitle:vacancy) {
			System.out.println(jobTitle.getText());
			
		}
		System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size());
	}

}
