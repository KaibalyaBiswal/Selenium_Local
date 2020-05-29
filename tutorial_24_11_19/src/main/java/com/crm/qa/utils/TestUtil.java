package com.crm.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase
{

//create long value,base class take long value for time
	public static long implicity_wait=30;
	
	public static String testData_sheet_path="D:\\c\\Workspaceeclipse1\\tutorial_24_11_19\\src\\main\\java\\com\\crm\\qa\\testdata\\TestData.xlsx";
	static Workbook book;
	static Sheet sheet;
	
	public void switchToFrame()
	{
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/iframe[1]")));
		
	}

	public static Object[][] getTestData(String sheetName) throws Throwable
	{

		FileInputStream file=null;
		
		
		try {
			file =new FileInputStream(testData_sheet_path);
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e)
		{
			e.printStackTrace();
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		
		sheet=book.getSheet(sheetName);
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for (int i = 0; i < sheet.getLastRowNum(); i++) 
		{
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) 
			{
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();		
			}
		
		}
		return data;
		
	}
	
	
}
