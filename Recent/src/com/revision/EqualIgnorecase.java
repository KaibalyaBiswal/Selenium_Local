package com.revision;

public class EqualIgnorecase 
{
	public static void main(String[] args) 
	{
	String s1,s2;
	s1="kai";
	s2="Kai";
	if (s1.equals(s2)) 
	{
	System.out.println("Pass");
	
	}
	else 
	{
System.out.println("Fail");
	}
		if (s1.equalsIgnoreCase(s2)) 
		{
		System.out.println("Pass");
		
		}
		else 
		{
System.out.println("Fail");
		}
		
}
}
