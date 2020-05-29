package Revise;


public class ReadExcelData {

	public static void main(String[] args) 
	{
DataConfig excel=new DataConfig("C:\\Users\\Kaiii\\Desktop\\New Microsoft Excel Worksheet.xlsx");
	System.out.println(excel.getData(1, 0, 1));
	

	}

}
