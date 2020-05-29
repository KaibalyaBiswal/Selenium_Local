package Revise;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

//create a library to reuse the code
public class DataConfig 
{

	XSSFWorkbook wb;
	XSSFSheet sheet1;
//create a constructor to load the excel sheet every time
	
	public DataConfig(String excelpath)
	{
		try {
			File src=new File(excelpath);
			FileInputStream fis=new FileInputStream(src);

			//this will load the complete excel file
			 wb=new XSSFWorkbook(fis);

			 
		} 
		 catch (Exception e) 
		{
			e.printStackTrace();
		}

	}
	public String getData(int sheetnumber,int row,int column)
	{
		 sheet1 = wb.getSheetAt(sheetnumber);
		 return sheet1.getRow(row).getCell(column).getStringCellValue();
 
	}
	
	
	
	
	
	
	
	
	
	
}
