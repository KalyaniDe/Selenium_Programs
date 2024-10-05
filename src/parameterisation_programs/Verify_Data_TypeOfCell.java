package parameterisation_programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Verify_Data_TypeOfCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium_4Th_july\\Parametr\\Book1.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet4");
		CellType val = excel.getRow(0).getCell(0).getCellType();
		
		System.out.println(val);
	}

}
