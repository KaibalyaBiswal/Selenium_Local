package com.demomethods;

import com.projectname.constant.PrimusbankConstant;

public class PrimusbankHomepage extends PrimusbankConstant
{	

String adminuid;
String adminpwd;

public static boolean adminLogin(String uname,String pwrd)
{
String	acturl,expurl;
expurl="adminflow.aspx";
	   driver.get(url);
acturl=driver.getCurrentUrl();
	
if (acturl.toLowerCase().contains(expurl.toLowerCase())) 
{
return true;	
}
else 
{
return false;
}	
}
}
