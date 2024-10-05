package parameterisation_programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class VerifyTypeOfCell1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium_4Th_july\\Parametr\\Book1.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet4");
	    CellType sh = excel.getRow(3).getCell(1).getCellType();
	    System.out.println(sh);

	    if(sh==CellType.STRING)
	    {
	    	String val = excel.getRow(0).getCell(0).getStringCellValue();
	    	System.out.println(val);
	    }
	    else if(sh==CellType.NUMERIC)
	    {
	        double val = excel.getRow(3).getCell(1).getNumericCellValue();
	    	System.out.println(val);
	    }
	    else if(sh==CellType.BOOLEAN)
	    {
	    	boolean val = excel.getRow(0).getCell(0).getBooleanCellValue();
	    	System.out.println(val);
	    }
	}

}
