package DDF;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataConfiguration 
{
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	//create a constructor to load the excel file every time
	public DataConfiguration(int sheetnum,String excelpath) throws Exception
	{
	
		try {
			File src=new File(excelpath);
			FileInputStream fis=new FileInputStream(src);
			 wb=new XSSFWorkbook(fis);
			  sheet = wb.getSheetAt(sheetnum);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
public String getData(int rownum,int cellnum)
{
	
String data= sheet.getRow(rownum).getCell(cellnum).getStringCellValue();	
return data;	
}


}
