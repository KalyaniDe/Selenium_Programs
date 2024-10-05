package parameterisation_programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadComplete_ExcelFile_program {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium_4Th_july\\Parametr\\Book1.xlsx");
	    Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
	    
	    for(int row=0; row<2; row++)
	    {
	    	for(int col=0; col<6; col++)
	    	{
	    		String value = excel.getRow(row).getCell(col).getStringCellValue();
	    		System.out.print(value + " ");
	    	}
	    	System.out.println();
	    	
	    }
		
	}

}
