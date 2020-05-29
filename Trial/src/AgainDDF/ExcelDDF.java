package AgainDDF;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDDF 
{
	@Test
public void readExcel() throws Throwable
{

	File src = new File("C:\\Users\\Kaiii\\Desktop\\New Microsoft Excel Worksheet.xlsx");
	FileInputStream fis=new FileInputStream(src);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
    XSSFSheet sheet1 = wb.getSheetAt(0);
    XSSFCell data = sheet1.getRow(1).getCell(0);
    System.out.println(data);
   wb.close();
   
   
	
	
}
}
