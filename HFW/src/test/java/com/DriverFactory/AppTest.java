package com.DriverFactory;

import org.testng.annotations.Test;

public class AppTest 
{

@Test	
public void kickStart() throws Throwable 
{

DriverScript ds=new DriverScript();

try 
{
	ds.statrTest();
} 
catch (Exception e) 
{
e.printStackTrace();
}
}
}
