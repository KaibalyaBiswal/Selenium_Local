package com.xpathmultiproperties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selecting {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com");
	String	linkname="contact";
	try
	{
		driver.findElement(By.linkText(linkname));
		System.out.println("Test Pass");
		}catch(Exception e)
	{
	System.out.println("Test Fail");	
}
	}
	}
