package AgainDDF;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDT 
{
public static void main(String[] args) throws Exception 
{

	File src=new File("C:/Users/Kaiii/Desktop/New Microsoft Excel Worksheet.xlsx");
	FileInputStream fis=new FileInputStream(src);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	
	
	int rowcount = sheet1.getLastRowNum();
	System.out.println(rowcount);
	
	String data = sheet1.getRow(3).getCell(0).getStringCellValue();
	System.out.println(data);
}
	
}
