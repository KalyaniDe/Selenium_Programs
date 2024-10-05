package parameterisation_programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class VerifyTypeOfCell2 {

		    public static void main(String[] args) throws EncryptedDocumentException, IOException {
			FileInputStream file = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium_4Th_july\\Parametr\\Book1.xlsx");
			Cell CellInfo = WorkbookFactory.create(file).getSheet("Sheet4").getRow(3).getCell(0);
			
			CellType s1 = CellInfo.getCellType();
			
			if(s1==CellType.STRING)
			{
				String value = CellInfo.getStringCellValue();
				System.out.println(value);
			}
			else if (s1==CellType.NUMERIC)
			{
				double value = CellInfo.getNumericCellValue();
				System.out.println(value);
			}
			else if (s1==CellType.BOOLEAN)
			{
				boolean value = CellInfo.getBooleanCellValue();
				System.out.println(value);
			}
		}
	}