package parameterisation_programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_All_DataIn_Sheet_New {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium_4Th_july\\Parametr\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		
		int LastRowIndex = sh.getLastRowNum()+1;
		for(int i=0; i<LastRowIndex; i++ )
		{
			int LastColIndex = sh.getRow(i).getLastCellNum()-1;
			for(int j=0; j<LastColIndex; j++)
			{
				String val = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(val + " ");
			}
			System.out.println();
			
		}
	
	
	}

}
