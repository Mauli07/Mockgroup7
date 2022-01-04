package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
	
public static void captureScrShot(WebDriver driver, String filename) throws IOException {
		
// 		Convert web driver object to TakesScreenshot
		TakesScreenshot captureScrShots = (TakesScreenshot) driver;
//		create image file from source
		
		File source = captureScrShots.getScreenshotAs(OutputType.FILE);
		
//		Copy file to Desired Location
//		File destination = new File("D:\\Automation\\"+filename+".png");
		String path = System.getProperty("user.dir")+"\\Screenshots\\"+filename+".png";
		File destination =new File(path);
		
		FileHandler.copy(source, destination);
		
	}


}
