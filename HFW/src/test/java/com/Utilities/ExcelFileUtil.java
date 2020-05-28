package com.Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtil 
{
	Workbook wb; 

	public ExcelFileUtil() throws Throwable					//Constructor Created to load the excel every time
	{
FileInputStream	fis=new FileInputStream("./TestInputs/HFWOrangeHRM.xlsx");
//XSSFWorkbook wb=new XSSFWorkbook(fis);
 wb = WorkbookFactory.create(fis);	
		
	}

	//Row Count
	
public int rowCount(String sheetName)
{
return wb.getSheet(sheetName).getLastRowNum();
}
	
	//Column Count
	
public int columnCount(String sheetName,int rowno)
{
return	wb.getSheet(sheetName).getRow(rowno).getLastCellNum();
}
	
	
	//Cell Data

public String getData(String sheetName,int row,int column)
{
	String data="";
	
	if (wb.getSheet(sheetName).getRow(row).getCell(column).getCellType()==Cell.CELL_TYPE_NUMERIC) 
	{
int	celldata=(int) (wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue());

	data=String.valueOf(celldata);
	}else
	{
		data=wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
	return data;
	
}
	
	//Set Data

public void setData(String sheetName,int row,int column,String status) throws Throwable
{
	
	Sheet sh = wb.getSheet(sheetName);
    Row rownum = sh.getRow(row);
    Cell cell=rownum.getCell(column);
    
	cell.setCellValue(status);
	
if (status.equalsIgnoreCase("pass")) 
{
CellStyle style = wb.createCellStyle();	
Font font = wb.createFont();	

//Apply color to text

font.setColor(IndexedColors.GREEN.getIndex());

//Apply Bold To The Text

font.setBoldweight(Font.BOLDWEIGHT_BOLD);
style.setFont(font);
rownum.getCell(column).getCellStyle();

}else
	if (status.equalsIgnoreCase("fail")) 
	{
	CellStyle style = wb.createCellStyle();	
	Font font = wb.createFont();	

	//Apply color to text

	font.setColor(IndexedColors.RED.getIndex());

	//Apply Bold To The Text

	font.setBoldweight(Font.BOLDWEIGHT_BOLD);
	style.setFont(font);
	rownum.getCell(column).getCellStyle();
	
}else
	if (status.equalsIgnoreCase("Not Executed")) 
	{
	CellStyle style = wb.createCellStyle();	
	Font font = wb.createFont();	

	//Apply color to text

	font.setColor(IndexedColors.BLUE.getIndex());

	//Apply Bold To The Text

	font.setBoldweight(Font.BOLDWEIGHT_BOLD);
	style.setFont(font);
	rownum.getCell(column).getCellStyle();
	
	}

FileOutputStream fos = new FileOutputStream(".\\TestOutput\\OutputSheet.xlsx");
wb.write(fos);
fos.close();

}
}