package com.oops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Primusbankhomepage {

	public static WebDriver driver;
	public static String url="http://primusbank.qedgetech.com";
	
	public String adminuid;
	public String adminpwd;
	public static void lunchApp(String url)
	{
	driver=new FirefoxDriver();
	driver.get("url");
    }
	
	public boolean adminlogin(String uid,String pwd)
	{
String expurl,acturl;
expurl="adminflow.aspx";
driver.findElement(By.id("txtid")).sendKeys("uid");
driver.findElement(By.id("pwd")).sendKeys("pwd");
driver.findElement(By.id("login")).click();
acturl=driver.getCurrentUrl();
if(acturl.toLowerCase().contains(expurl.toLowerCase()))
{
return true;
}else
{
	return false;
	
	}

	}

public static void closeApp() 
{
driver.close();
}
}



