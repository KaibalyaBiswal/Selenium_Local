package com.excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read {

	public static void main(String[] args) throws Exception 
	{

		File srcfile=new File("D:\\c\\Workspaceeclipse1\\Practice_27_07_19\\Test_Data.xlsx");
	FileInputStream fis=new FileInputStream(srcfile);	

	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	
	/*String row1=sheet1.getRow(0).getCell(0).getStringCellValue();
	System.out.println("data from excel  "+row1);
	String row11=sheet1.getRow(0).getCell(1).getStringCellValue();
	System.out.println("data from excel  "+row11);*/
	
	int rowCount=sheet1.getLastRowNum();
	//System.out.println(rowCount);
	
	for (int i = 0; i <rowCount; i++) 
	{
	
	String username=sheet1.getRow(i).getCell(0).getStringCellValue();
	System.out.print(" "+username);
	
	for (int j = 1; j <=1; j++) 
	{
	
		String password=sheet1.getRow(i).getCell(1).getStringCellValue();
		System.out.println(" "+password);
	}
	
	
	}
	
	
	wb.close();
	}

}