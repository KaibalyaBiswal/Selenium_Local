package com.apachepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata {

	public static void main(String[] args) throws IOException
{
FileInputStream fi=new FileInputStream("‪C:\\Users\\Kaiii\\Desktop\\New Microsoft Excel Worksheet.xlsx");
Workbook wb=new XSSFWorkbook(fi);
Sheet sheet = (Sheet) wb.getSheet("kai");
System.out.println(sheet);
	
   }
}
