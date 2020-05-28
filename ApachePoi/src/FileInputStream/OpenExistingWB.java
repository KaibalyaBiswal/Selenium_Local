package FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class OpenExistingWB {

	public static void main(String[] args) throws IOException 
	{
//create a new file
		File file = new File("openwb.xlsx");
		
		FileInputStream fi = new FileInputStream(file);
		
		
		
	}

}
