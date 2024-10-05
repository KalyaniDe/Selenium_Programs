package practise_Problem_Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAll_DataIn_Row1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium_4Th_july\\Parametr\\Book1.xlsx");
		Sheet s = WorkbookFactory.create(file).getSheet("Sheet1");
	
		short LastCellIndex = s.getRow(2).getLastCellNum();
	    
		for(int i=0; i<7; i++)
		{
		    String val = s.getRow(2).getCell(i).getStringCellValue();
		    System.out.print(val + " ");
		}
	
	}

}
