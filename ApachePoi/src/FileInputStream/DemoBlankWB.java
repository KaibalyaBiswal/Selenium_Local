package FileInputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoBlankWB {

	public static void main(String[] args) throws IOException 
	{

//create blank workbook
		XSSFWorkbook wb = new XSSFWorkbook();
		
//create file using specific name
		FileOutputStream fo = new FileOutputStream(new File("kaibalya.xlsx"));
		
//write operation in workbook using fo object
		wb.write(fo);
		fo.close();
		wb.close();
		System.out.println("kaibalya.xlsx created successfully");
	
	}

}
