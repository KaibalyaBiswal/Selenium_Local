package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite 
{

	public static void main(String[] args) throws Exception 
	{
	
		File srcfile=new File("D:\\c\\Workspaceeclipse1\\Practice_27_07_19\\Test_Data.xlsx");
		FileInputStream fis=new FileInputStream(srcfile);	

		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		sheet1.getRow(0).createCell(2).setCellValue("Pass");
		sheet1.getRow(1).createCell(2).setCellValue("Fail");
	
		FileOutputStream fos=new FileOutputStream(srcfile);
		
		//To write the content and while reading we use FileInputStream so while writing we use FileOutputStream
		wb.write(fos);
		wb.close();
	}
	
	
}



