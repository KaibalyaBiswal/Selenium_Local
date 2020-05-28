package com.testNGconstants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PrimusbankConstants 
{
	static WebDriver driver=new FirefoxDriver();
	static String url="http://primusbank.qedgetech.com";

	@Test(priority=0)
	 public static void lunchApp()
	 {
	driver.get(url);

	}

	@Test(priority=1)
	public static void closeApp()
	{
	driver.close();
			 
			 
		 }
	}	 
	 
