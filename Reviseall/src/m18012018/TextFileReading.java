package m18012018;

import java.io.BufferedReader;
import java.io.FileReader;

public class TextFileReading
{
	static BufferedReader br;
	static String data="";
	static String alldata="";
	public static void main(String[] args) throws Throwable
	{
		br = new BufferedReader(new FileReader("E:\\Selenium\\Notes\\FilesMultipleRead\\clipResults_300_Distinct.txt"));
		//String data="";
		/*if (br.readLine()!= null)
		{
		System.out.println("The file is not Empty and reading the file data: ");
		
		
		while ((data=br.readLine())!=null)
		{
			
			System.out.println(data);
		}
		} else 
		{
		System.out.println("The file is Empty");
		}*/
		while ((data=br.readLine())!=null)
		{
			alldata=alldata+data+"\n";
			//System.out.println(alldata +data);
		}
		//System.out.println(alldata);
		String[] datas = alldata.split("\n");
		System.out.println(datas.length);
		for (int i = 0; i < datas.length; i++)
		{
			//System.out.println(datas[i]);
		}		
		//if (datas[1]!=null && datas[1].trim()!=null) 
		if (datas.length>1)
		{
		System.out.println("data available in file");
		//System.out.println(datas[1]);
		}else 
		{
		System.out.println("data is not available in file");
		}
		
		
		
		
		
		//String data="";
	/*	while ((data=br.readLine())!=null)
		{
			System.out.println(data);
		}*/
		
		/*String find = "^([^,]*,[^,]*,[^,]*);,.*$";
		String replace = "$1";
		
		String edited = data.replace(find, replace);
		System.out.println(edited);
		if (edited.endsWith("SOMETHING")) 
		{
			System.out.println("Pass");
		}else 
		{
		System.out.println("Fail");	
		}*/
	}	
}
