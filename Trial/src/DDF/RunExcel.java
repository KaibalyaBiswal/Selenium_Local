package DDF;

import org.testng.annotations.Test;

public class RunExcel 
{

	@Test
	public void dataRun() throws Exception
	{
DataConfig1 dc = new DataConfig1(1,"C:\\Users\\Kaiii\\Desktop\\New Microsoft Excel Worksheet.xlsx");	
	
	System.out.println(dc.getData(1, 3));
	
	}	
}
