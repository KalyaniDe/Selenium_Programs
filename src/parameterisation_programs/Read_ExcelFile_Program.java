package parameterisation_programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_ExcelFile_Program {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium_4Th_july\\Parametr\\Book1.xlsx");
		
        Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
	    String value =  excel.getRow(0).getCell(0).getStringCellValue(); // java
	    String value1 = excel.getRow(0).getCell(1).getStringCellValue(); // Selenium
	    String value2 = excel.getRow(0).getCell(2).getStringCellValue(); // Manual
	    String value3 = excel.getRow(0).getCell(3).getStringCellValue(); // Api
	    String value4 = excel.getRow(0).getCell(4).getStringCellValue(); // Sql
	    String value5 = excel.getRow(0).getCell(5).getStringCellValue(); // 17
	    String value6 = excel.getRow(0).getCell(6).getStringCellValue(); // 27
	    
	    System.out.println(value);
	    System.out.println(value1);
	    System.out.println(value2);
	    System.out.println(value3);
	    System.out.println(value4);
	    System.out.println(value5);
	    System.out.println(value6);
	}

}
