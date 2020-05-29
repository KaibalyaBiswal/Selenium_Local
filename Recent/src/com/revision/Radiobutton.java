package com.revision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobutton 
{
public static void main(String[] args) 
{

	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://cleartrip.com");
	driver.findElement(By.id("RoundTrip")).click();
	
	if (driver.findElement(By.id("RoundTrip")).isSelected()) 
	{
	System.out.println("Test pass");	
	} 
	else {
System.out.println("Test fail");
	}

}
}
