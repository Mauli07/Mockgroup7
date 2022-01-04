package seleniump;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignUp {
public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "D:\\Automation\\selenium\\ChromeDriver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805499%7Ce%7Cfacebook%20sign%20up%20new%20account%7C&placement=&creative=550525805499&keyword=facebook%20sign%20up%20new%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-26007876572%26loc_physical_ms%3D9062111%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiA78aNBhAlEiwA7B76p6peC_3ega4YpOfgVZo3-5l6oxzKoSCPTPNdyPsGsfGAUilSH4p4yBoC0DQQAvD_BwE");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Dnyaneshwar");
	
	
}
	
}
