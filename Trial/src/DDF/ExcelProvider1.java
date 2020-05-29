package DDF;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelProvider1 
{
	XSSFSheet sheet1;
	XSSFWorkbook wb;

public ExcelProvider1(String excelpath) 
{
	try 
	{
		File src = new File(excelpath);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook();
	} 
	catch (Exception e) 
	{
System.out.println(e.getMessage());
	}

}

public  String getData(int sheetnumber,int rownum,int colunmnno)
{
sheet1 = wb.getSheetAt(sheetnumber);
String data = sheet1.getRow(rownum).getCell(colunmnno).getStringCellValue();

return data;
}

public int getrow(int sheetindex)
{
int row=wb.getSheetAt(sheetindex).getLastRowNum();
row=row+1;

return row;
}

}
