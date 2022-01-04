package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	
	public static String getDataFromConfig(String keyvalue) throws IOException {
		
		Properties prop = new Properties();	//1. Create Properties Object
		
		FileInputStream fis = new FileInputStream("C:\\Users\\ithape\\eclipse-workspace\\seleniump\\src\\config.properties"); 
				
		prop.load(fis); //3. Copy from fis to prop object
		
		String actualvalue = prop.getProperty(keyvalue);
		
		return actualvalue;
	}

}
