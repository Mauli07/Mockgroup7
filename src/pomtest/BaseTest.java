package pomtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pompages.DashBoardPage;
import pompages.LoginPage;


public class BaseTest {
	static WebDriver driver;
	LoginPage lp;				//declare global variable to avoid multiple object creation.
	DashBoardPage db;
	
	@BeforeSuite				//to initialize first we give annotation before suite
	public void initDriver() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com");
		driver.manage().window().maximize();
	}
	
	@BeforeClass					//before execution of any class object should be created, thats why declared.
	public void createObject() {
		lp = new LoginPage(driver);	//Create Login Page Object
		db = new DashBoardPage(driver);
	}

}
