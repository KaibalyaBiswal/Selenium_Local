package m18012018;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DemoDDF 
{
	public static void main(String[] args) throws Throwable 
	{
	File f=new File("C:\\Users\\Babuni\\Desktop\\New Microsoft Excel Worksheet.xlsx");
	FileInputStream fis=new FileInputStream(f);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet1=wb.getSheetAt(0);
	int rownum = sheet1.getLastRowNum();
	System.out.println(rownum);
	String shell=sheet1.getRow(0).getCell(0).getStringCellValue();
	System.out.println(shell);

	for (int i = 0; i <rownum; i++) 
	{
	System.out.println(sheet1.getRow(i).getCell(2).getStringCellValue());
	}
	}
}
