package m18012018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

public class MultipleFilesReading 
{
	static String readingLocation="E:\\Selenium\\Notes\\FilesMultipleRead";
	static String writingLocation="E:\\Selenium\\Notes\\MultipleFilesWrite\\New Text Document.txt";
	
	static BufferedReader br;
	static FileOutputStream fos;
	static String data;
	static BufferedWriter br1;
	
	public static void main(String[] args) throws Throwable 
	{
	
		File Folder = new File(readingLocation);
		//File files[]; or File[] files =
		File[] files = Folder.listFiles();

        if(files.length>1)
        {
           
        	for(int i = 0;i<files.length; i++)
            {
        		System.out.println(files.length);
                System.out.println("reading..."+   files[i]);
                //System.out.println(files[i]);
                
               br=new BufferedReader(new FileReader(files[i]));
               data="";
               while ((data=br.readLine())!=null) 
               {
				System.out.println(data);					
               }   
               
               // Reader in = new FileReader(files[i]);
               // Writer out = new FileWriter(writingLocation , false); 

                // should be in finally block
                // in.close();
                // out.close(); 
                             	
            }
           
        }
        else{
            System.out.println("no file or more than one file not present");
            System.out.println(files);
        }		
    
	}
		
}



