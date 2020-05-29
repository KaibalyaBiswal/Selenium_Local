package DDF;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDT 
{
	public static void main(String[] args) throws Exception 
	{
File src=new File("C:\\Users\\Kaiii\\Desktop\\New Microsoft Excel Worksheet.xlsx");
FileInputStream fis=new FileInputStream(src);
XSSFWorkbook wb = new XSSFWorkbook(fis);
XSSFSheet sheet1 = wb.getSheetAt(0);
int rowcount=sheet1.getLastRowNum();

System.out.println(rowcount);

System.out.println(sheet1.getRow(1).getCell(4).getStringCellValue());
	
for (int i = 1; i <=rowcount; i++) 
{
String data=sheet1.getRow(i).getCell(3).getStringCellValue();	
System.out.println("The data is "+ data);
}
wb.close();
	}

}
