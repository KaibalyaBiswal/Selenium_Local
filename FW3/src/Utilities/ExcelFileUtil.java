package Utilities;

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

public void setDate(String sheetname,int row,int column,String status) throws Throwable
{
	Sheet sh=wb.getSheet(sheetname);
	Row rownum=sh.getRow(row);
	Cell cell =rownum.createCell(column);
	cell.setCellValue(status);
	
	if (status.equalsIgnoreCase("pass")) 
	{
	CellStyle style=wb.createCellStyle();
	Font font=wb.createFont();
	
	
	//Apply color to the text
	font.setColor(IndexedColors.GREEN.getIndex());
	
	//Apply Bold to the text
	font.setBoldweight(font.BOLDWEIGHT_BOLD);
	
	style.setFont(font);
	
	rownum.getCell(column).setCellStyle(style);
	
	}
	else
	if (status.equalsIgnoreCase("fail")) 
	{
	CellStyle style=wb.createCellStyle();
	Font font=wb.createFont();
	
	
	//Apply color to the text
	font.setColor(IndexedColors.RED.getIndex());
	
	//Apply Bold to the text
	font.setBoldweight(font.BOLDWEIGHT_BOLD);
	
	style.setFont(font);
	
	rownum.getCell(column).setCellStyle(style);
}
	else
	if (status.equalsIgnoreCase("not executed")) 
	{
	
	CellStyle style=wb.createCellStyle();
	Font font=wb.createFont();
	
	
	//Apply color to the text
	font.setColor(IndexedColors.BLUE.getIndex());
	
	//Apply Bold to the text
	font.setBoldweight(font.BOLDWEIGHT_BOLD);
	
	style.setFont(font);
	
	rownum.getCell(column).setCellStyle(style);
}

	FileOutputStream fos=new FileOutputStream("./TestOutput/OutputSheet.xlsx");
	wb.write(fos);
	fos.close();
	
}
}