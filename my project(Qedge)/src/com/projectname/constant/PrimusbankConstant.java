package com.projectname.constant;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class PrimusbankConstant 
{

public static	WebDriver driver=new FirefoxDriver();
public static	 String url="http://primusbank.qedgetech.com";


	 public static void lunchApp()
{
		 
		Sleeper.sleepTightInSeconds(5);
	driver.get(url);

}


	 public static void closeApp()
{
	 Sleeper.sleepTightInSeconds(5);
	 driver.close();
		
}

	 public static void adminLogin()
	 {
	
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://primusbank.qedgetech.com");
driver.findElement(By.id("txtuId")).sendKeys("Admin");
driver.findElement(By.id("txtPword")).sendKeys("Admin");
driver.findElement(By.id("login")).click();
		 
	 }

}
