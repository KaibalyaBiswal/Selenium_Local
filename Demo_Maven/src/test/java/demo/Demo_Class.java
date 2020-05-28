package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo_Class 
{

	public static void main(String[] args) throws Throwable 
	{
	FileInputStream fis = new FileInputStream(new File("C:\\Users\\kaiba\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx"));
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	int rowCount = sheet1.getLastRowNum();
	short colCount = sheet1.getRow(rowCount).getLastCellNum();
	System.out.println(rowCount);
	System.out.println(colCount);
	
	
	for (int i = 0; i <=rowCount; i++)
	{
		String data = sheet1.getRow(i).getCell(0).getStringCellValue();
		
		System.out.println(data);
		
		//sheet1.getRow(i).createCell(0).setCellValue("Pass");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\kaiba\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		sheet1.getRow(i).createCell(colCount).setCellValue("Pass");
		wb.write(fos);
		fos.close();
		
		
	}

	}
	
	
}


