package m18012018;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDataretrive 
{
@Test
	public void excelData() throws Throwable
{
FileInputStream fis=new FileInputStream("C:\\Users\\Babuni\\Desktop\\New Microsoft Excel Worksheet.xlsx");
XSSFWorkbook wb = new XSSFWorkbook(fis);
XSSFSheet sheet1 = wb.getSheetAt(0);
String data1 = sheet1.getRow(0).getCell(2).getStringCellValue();
System.out.println(data1);

double data2 = wb.getSheetAt(1).getRow(1).getCell(1).getNumericCellValue();
System.out.println(data2);



}
}
