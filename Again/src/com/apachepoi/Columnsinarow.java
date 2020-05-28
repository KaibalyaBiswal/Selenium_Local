package com.apachepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Columnsinarow {

	public static void main(String[] args) throws IOException
	{
		
FileInputStream	fi=new FileInputStream("C:\\Users\\Kaiii\\Desktop\\new.xlsx");
Workbook wb=new XSSFWorkbook(fi);
Sheet ws=wb.getSheet("uid");
Row r =ws.getRow(1);
int cc=r.getLastCellNum();
System.out.println(cc);

	}
}
