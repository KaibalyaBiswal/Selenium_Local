package com.demomethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test 
{
public static void main(String[] args) 
{	

String 	expurl,acturl;
	expurl="adminflow.aspx";
	WebDriver driver=new FirefoxDriver();
	driver.get("http://primusbank.qedgetech.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
driver.findElement(By.id("txtuId")).sendKeys("Admin");
driver.findElement(By.id("txtPword")).sendKeys("Admin");
driver.findElement(By.id("login")).click();

	acturl=driver.getCurrentUrl();
	
if (acturl.toLowerCase().contains(expurl.toLowerCase())) 
{
System.out.println("True");
} 
else
{
System.out.println("False");
}	
	

}
}
