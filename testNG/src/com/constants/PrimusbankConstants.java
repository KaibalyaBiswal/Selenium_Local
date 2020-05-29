package com.constants;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrimusbankConstants 
{

public static WebDriver driver=new FirefoxDriver();
public static String url="htttp://primusbank.qedgetech.com";

public static void 	lunchApp()
{
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get(url);
  }

public static void closeApp()
{
driver.close();
		
}
}		
