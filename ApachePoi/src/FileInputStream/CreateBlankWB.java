package FileInputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateBlankWB {

	public static void main(String[] args) throws IOException 
	{
//create blank workbook	
		XSSFWorkbook wb = new XSSFWorkbook();
		
//create file system using specific name
		FileOutputStream fo = new FileOutputStream(new File("createworkbook.xlsx"));

//write operation workbook using file out object
		wb.write(fo);
		fo.close();
		wb.close();
		System.out.println("createworkbook.xlsx written successfully");
		
	}

}
