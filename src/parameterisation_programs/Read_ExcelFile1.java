package parameterisation_programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_ExcelFile1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium_4Th_july\\Parametr\\Book1.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		
		String value = excel.getRow(1).getCell(0).getStringCellValue();
		String value1 = excel.getRow(1).getCell(1).getStringCellValue();
		String value2 = excel.getRow(1).getCell(2).getStringCellValue();
		String value3 = excel.getRow(1).getCell(3).getStringCellValue();
		String value4 = excel.getRow(1).getCell(4).getStringCellValue();
		String value5 = excel.getRow(1).getCell(5).getStringCellValue();
		String value6 = excel.getRow(1).getCell(6).getStringCellValue();
		
		System.out.print(value + " ");
		System.out.print(value1 + " ");
		System.out.print(value2 + " ");
		System.out.print(value3 + " ");
		System.out.print(value4 + " ");
		System.out.print(value5 + " ");
		System.out.print(value6 + " ");
	}

}
