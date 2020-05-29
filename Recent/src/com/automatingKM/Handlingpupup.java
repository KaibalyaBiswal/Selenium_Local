package com.automatingKM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlingpupup {

	public static void main(String[] args) 
	{
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.navigate().to("http://primusbank.qedgetech.com");
driver.findElement(By.id("login")).click();


System.out.println(driver.switchTo().alert().getText());

driver.switchTo().alert().accept();
		
		
	}

}
