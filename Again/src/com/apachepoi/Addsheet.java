package com.apachepoi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Addsheet 
{
	public static void main(String[] args) throws IOException 
	{
FileInputStream	fi=new FileInputStream("C:\\Users\\Kaiii\\Desktop\\new.xlsx");
Workbook wb=new XSSFWorkbook();
wb.createSheet("new sheet");
FileOutputStream fo=new FileOutputStream("C:\\Users\\Kaiii\\Desktop\\new.xlsx");
wb.write(fo);
wb.close();
fi.close();
fo.close();

	}

}
