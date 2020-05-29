package com.libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.constants.PrimusbankConstants;

public class BankerLogin extends PrimusbankConstants
{
	public boolean bankerLogin(String branch, String buid, String bpwd)
	{	
	String expurl,acturl;
	expurl="Bankers_flow.aspx";
	Select blist = new Select(driver.findElement(By.id("drlist")));
	blist.selectByVisibleText("Ameerpet");	
		driver.findElement(By.id("txtuId")).sendKeys("buid");
		driver.findElement(By.id("txtPword")).sendKeys("bpwd");
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
