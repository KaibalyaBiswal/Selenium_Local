
package com.projectname.library;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.projectname.constant.PrimusbankConstant;

public class PrimusbankHomepage extends PrimusbankConstant
{
String adminuid;
String adminpwd;
String Branchname;
String bankeruid;
String bankerpwd;
String customeruid;
String customerpwd;

public boolean adminLogin(String auid,String apwd)
{
String expurl;
String acturl;
expurl="adminflow.aspx";
 		driver.get(url);
acturl= driver.getCurrentUrl();

if (acturl.toLowerCase().contains(expurl.toLowerCase())) 
{	
	return true;
}
else 
{
	return false;
}
}


public boolean bankerLogin(String Branchname,String uname,String pwd)
{
String expurl;
String acturl;
expurl="Bankers_flow.aspx";
driver.get(url);
Select blist=new Select(driver.findElement(By.id("drlist")));
blist.selectByVisibleText("AngryBird");
driver.findElement(By.id("txtuId")).sendKeys("uname");
driver.findElement(By.id("txtPword")).sendKeys("pwd");
driver.findElement(By.id("login")).click();

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

public boolean customerLogin()
{
driver.get(url);
driver.findElement(By.id("personal")).click();	

driver.findElement(By.id("idtxt")).sendKeys("uname");
driver.findElement(By.id("pswdtxt")).sendKeys("pwd");
driver.findElement(By.id("btnGO")).click();

	if (driver.findElement(By.xpath("//table/tbody/tr[2]/td/a/img")).isDisplayed()) 
	{
	return true;	
	} else {
return false;
	}
}
}