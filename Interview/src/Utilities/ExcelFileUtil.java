package Utilities;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtil 
{
Workbook wb;
	
	//It will load the excel sheet
	public ExcelFileUtil() throws Throwable
	{

	FileInputStream fis=new FileInputStream("./TestInputs/InputSheet.xlsx");
	
		wb = WorkbookFactory.create(fis);
		
	}
	
public int rowCount(String sheetname)
{
	
return	wb.getSheet(sheetname).getLastRowNum();
	
}
	
public int colCount(String sheetname,int rowno)
{
	
return wb.getSheet(sheetname).getRow(rowno).getLastCellNum();
	
}
	
public String getData(String sheetname,int row,int column)
{
	
	String data ="";
	
	if (wb.getSheet(sheetname).getRow(row).getCell(column).getCellType()==Cell.CELL_TYPE_NUMERIC) 
	{
		int celldata=(int) (wb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue());
		data=String.valueOf(celldata);
	}
	else
	{
		data=wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
	}
return data;

}

}
