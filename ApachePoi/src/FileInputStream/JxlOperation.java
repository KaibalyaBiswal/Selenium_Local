package FileInputStream;

import java.io.File;
import java.io.FileOutputStream;

import org.testng.annotations.Test;

import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class JxlOperation 
{

	@Test
	public void jxlData() throws Throwable
	{
		
	//FileInputStream fis=new FileInputStream(new File("E:\\Selenium\\JxlSheet\\TestData3.xls"));
		
		FileOutputStream fos = new FileOutputStream(new File("E:\\Selenium\\JxlSheet\\TestData3.xls"));
		WritableWorkbook wwb = jxl.Workbook.createWorkbook(fos);
		WritableSheet sheet1 = wwb.getSheet(0);
		Label writing = new Label(1, 0, "test");
		sheet1.addCell(writing);
		wwb.write();
		fos.close();
	}
	
	
}
