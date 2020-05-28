package FileInputStream;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadWriteExcel 
{

	@Test
	public void writeXlsxExtension() throws Throwable
	{
		
	/*	String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@192.168.0.121:1521:xe";
		String username="hr";
		String password="hr";
		String result1="";
		String result2="";
		String result3="";
		
		
		 * //Load the oracle driver Class.forName("driver"); //Create connection object
		 * Connection con = DriverManager.getConnection(url, username, password);
		 * //Create statement object Statement stmt = con.createStatement(); //execute
		 * query ResultSet res =
		 * stmt.executeQuery("select * from country order by asc");
		 * 
		 * while (res.next()) { result1=res.getString("COUNTRY_ID");
		 * result2=res.getString("COUNTRY_NAME"); result3=res.getString("REGION_ID"); }
		 * 
		 * System.out.println(result1+result2+result3);
		 */	
		
		FileInputStream fis = new FileInputStream(new File("D:\\c\\Workspaceeclipse1\\ExcelOperation\\TestData\\TestData_database.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		 int rowCount = sheet1.getLastRowNum();
		System.out.println(rowCount);
		CellAddress activesheet = sheet1.getActiveCell();
		System.out.println(activesheet);
		
		for (int i = 1; i <=rowCount; i++) 
		{
		
			String firstrow = sheet1.getRow(i).getCell(0).getStringCellValue();
			String secondrow = sheet1.getRow(i).getCell(1).getStringCellValue();
			int thirdrow= (int) sheet1.getRow(i).getCell(2).getNumericCellValue();
			System.out.println(firstrow+" - "+secondrow+" - "+thirdrow);
		}
			
	}
	
	
}



