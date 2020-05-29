package Library;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig 
{
 XSSFWorkbook wb;
 XSSFSheet sheet1;
	
	
	//Constructor to load excel every time
	public ExcelConfig(String excelPath) 
	{
		//Surround try catch block because next time it may through exception so we didnt' give throw (exceptions)
		try {
			File srcfile=new File(excelPath);
			FileInputStream fis=new FileInputStream(srcfile);	

			wb=new XSSFWorkbook(fis);
			
			//Keep base exception 
		} catch (Exception e)
		{
			
			//If any exception will come it will pint the message
		  System.out.println(e.getMessage()); 
		}
		
	}
	

	public String getData(int sheet,int row,int column)
	{
		sheet1 = wb.getSheetAt(sheet);
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}