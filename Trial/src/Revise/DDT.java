package Revise;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDT {

	public static void main(String[] args) throws Exception  
	{
File src=new File("C:\\Users\\Kaiii\\Desktop\\New Microsoft Excel Worksheet.xlsx");
FileInputStream fis=new FileInputStream(src);

//this will load the complete excel file
XSSFWorkbook wb=new XSSFWorkbook(fis);

XSSFSheet sheet1 = wb.getSheetAt(0);

//String data = sheet1.getRow(1).getCell(0).getStringCellValue();
//System.out.println("the data is " + data );
//
//String data1 = sheet1.getRow(1).getCell(1).getStringCellValue();
//System.out.println("the data is "+data1);
		
		
int rowcount = sheet1.getLastRowNum();
System.out.println("total row is " + rowcount);

for (int i = 1; i <=rowcount; i++) 
{
	String data2 = sheet1.getRow(i).getCell(0).getStringCellValue();
	System.out.println("the data from row " +i +" is "+ data2);

}
		wb.close();
	}

}
