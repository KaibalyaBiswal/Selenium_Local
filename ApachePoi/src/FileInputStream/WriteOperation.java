package FileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteOperation {

	public static void main(String[] args) throws IOException 
	{

		FileInputStream fi = new FileInputStream("C:\\Users\\Kaiii\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		Workbook wb = new XSSFWorkbook(fi);
		wb.createSheet("sheet");
		
		FileOutputStream fo = new FileOutputStream("C:\\Users\\Kaiii\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
	}

}