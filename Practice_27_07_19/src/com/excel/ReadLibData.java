package com.excel;

import Library.ExcelConfig;

public class ReadLibData 
{

	public static void main(String[] args)
	
	{
		
		ExcelConfig exceldata = new ExcelConfig("D:\\c\\Workspaceeclipse1\\Practice_27_07_19\\Test_Data.xlsx");
		
		System.out.println(exceldata.getData(0, 0, 0));
		
	}
}