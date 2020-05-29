package TestNg;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RetrivingIndividual {
 
	public static void main(String[] args) throws Throwable
	{

		File f = new File("E:\\kai.xlsx");
		Workbook wb=new WorkbookFactory().create(f);
		Sheet s = wb.getSheet("Sheet1");
     		Row r = s.getRow(1);
		Cell c = r.getCell(0);
		String value = c.getStringCellValue();
		System.out.println(value);
		
//		String k = s.getRow(0).getCell(0).getStringCellValue();
//		System.out.println(k);
		
		
		
	}

}
