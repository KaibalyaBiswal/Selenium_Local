package DDF;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataConfig1 
{

	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public  DataConfig1(int Sheetnum,String excel) throws Exception
	{
	
		try {
			File scr=new File(excel);
			FileInputStream fis=new FileInputStream(scr);
			 wb = new XSSFWorkbook(fis);
			 sheet1=wb.getSheetAt(Sheetnum);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
		
	public String getData(int rownum,int cellnum)
	{
		 
		
		
		return sheet1.getRow(rownum).getCell(cellnum).getStringCellValue();
		
	}
	
	
}
