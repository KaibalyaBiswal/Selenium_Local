package programme;

import java.io.IOException;

public class OpenNotepad 
{
public static void main(String[] args) throws Throwable 
{
try {
		Runtime.getRuntime().exec("notepad.exe");
} 
catch (IOException e) 
{
	e.printStackTrace();
}	
}
}
