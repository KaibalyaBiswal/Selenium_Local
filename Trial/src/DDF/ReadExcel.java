package DDF;

import org.testng.annotations.Test;

public class ReadExcel 
{
@Test
public void dataRun() throws Exception
{
	DataConfiguration dc=new DataConfiguration(1, "C:\\Users\\Kaiii\\Desktop\\New Microsoft Excel Worksheet.xlsx");
System.out.println(dc.getData(0, 1));
}	
}
