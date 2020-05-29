package m18012018;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class WritingMulFilesToSingle 
{
	
	public static void main(String[] args) throws Throwable 
	{
	
		FileInputStream fis1=null;
		FileInputStream fis2=null;
		FileOutputStream fos=null;
		SequenceInputStream sis=null;
		
		
		try {
			fis1=new FileInputStream("E:\\Selenium\\Notes\\FilesMultipleRead\\file1.txt");
			fis2=new FileInputStream("E:\\Selenium\\Notes\\FilesMultipleRead\\file2.txt");
			fos=new FileOutputStream("E:\\Selenium\\Notes\\MultipleFilesWrite\\file3.txt");
			
			Vector<FileInputStream> vector = new Vector<FileInputStream>();
			vector.add(fis1);
			vector.add(fis2);
			
			Enumeration<FileInputStream> enumuration = vector.elements();
			
			sis=new SequenceInputStream(enumuration);
			int i;
			while ((i=sis.read())!=-1)
			{
				fos.write(i);
			}
			System.out.println("successfully read fom multiple files and written to one file");
		}
		finally 
		{
		if (fis1!=null)
		{
		fis1.close();
		}
		if (fis2!=null)
		{
		fis2.close();
		}
		if (fos!=null)
		{
		fos.close();
		}
		if (sis!=null)
		{
		sis.close();
		}
		}
	}
		
	}
		
