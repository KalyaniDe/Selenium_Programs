package practise_Problem_Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAll_DataIn_Row {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium_4Th_july\\Parametr\\Book1.xlsx");
		Sheet source = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int lastcellIndex = source.getRow(1).getLastCellNum();
		
		for(int i=0; i<lastcellIndex; i++)
		{
			String value = source.getRow(1).getCell(i).getStringCellValue();
			System.out.print(value + " ");
		}
		
	}

}
