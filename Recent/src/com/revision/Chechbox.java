package com.revision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chechbox {

	public static void main(String[] args) 
	{
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("http://irctc.co.in");
driver.findElement(By.id("otpId")).click();;;

if (driver.findElement(By.id("otpId")).isSelected()) 
{
System.out.println("check box is selected");	
} 
else {
System.out.println("check box is not selectrd");

}
				
	}

}
