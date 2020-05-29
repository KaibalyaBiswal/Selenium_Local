package com.demomethods;

import org.testng.annotations.Test;

import com.projectname.constant.PrimusbankConstant;

public class AdminLogin extends PrimusbankConstant
{
String adminuid="Admin";
String adminpwd="Admin";

@Test
public boolean adminlogin()
{
	
String expurl="adminflow.aspx";
driver.get(url);
String acturl=driver.getCurrentUrl();
	
if (acturl.toLowerCase().contains(expurl.toLowerCase())) 
{
	
return true;

}
else {
	
return false;

}	

}

}
