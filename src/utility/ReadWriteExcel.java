package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcel {
	
	public static String readData(int row, int column) throws IOException {
		
		File src = new File("D:\\New Microsoft Excel Worksheet.xlsx");
//	To load that particular location in order to perform the action
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("Sheet1");
		
		//String value = sh1.getRow(row).getCell(column).getStringCellValue();
		DataFormatter df = new DataFormatter();
		String stringvalue = df.formatCellValue(sh1.getRow(row).getCell(column));
		
		return stringvalue;
	
	}

	public static String writeData(int row, int column, String keyvalue) throws IOException {
		//==========AccessFile========================
		File src = new File("D:\\New Microsoft Excel Worksheet.xlsx");
			FileInputStream fis = new FileInputStream(src);
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			XSSFSheet sh1 = wb.getSheet("Sheet1");
			// Write into excel file			
			
			File fout = new File("D:\\New Microsoft Excel Worksheet.xlsx");
			
			FileOutputStream fos = new FileOutputStream(fout);
//			To write for Already available row but not available column
//			sh1.getRow(row).createCell(column).setCellValue(keyvalue);
			sh1.getRow(row).getCell(column).setCellValue(keyvalue);
//				To write for unavailable row also not available column
			//sh1.createRow(50).createCell(3).setCellValue("Newrow and column");
			
			
//			to save the content
			wb.write(fos);

		
		return keyvalue;
		
	}
}
