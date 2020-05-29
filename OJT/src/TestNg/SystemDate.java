package TestNg;

import java.text.SimpleDateFormat;

import org.apache.tools.ant.types.resources.comparators.Date;

public class SystemDate 
{
public static void main(String[] args) 
{
Date dt = new Date();
SimpleDateFormat sdt = new SimpleDateFormat("dd/mm/yyyy");
System.out.println(sdt.format(dt));

	
	
	
}
}
