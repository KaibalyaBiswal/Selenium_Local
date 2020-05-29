package com.libraries;

import org.openqa.selenium.By;
import com.constants.PrimusbankConstants;

public class AdminLogin extends PrimusbankConstants
{
	public boolean adminLogin(String uid, String pwd)
	{
	String expurl,acturl;
	
	expurl="adminflow.aspx";
			driver.findElement(By.id("txtuId")).sendKeys("uid");
			driver.findElement(By.id("txtPword")).sendKeys("pwd");
		    driver.findElement(By.id("login")).click();
	acturl=driver.getCurrentUrl();
	
	if (acturl.contains(expurl)) 
	{
	return true;	
	} 
	else {
    return false;
	}
  }
}