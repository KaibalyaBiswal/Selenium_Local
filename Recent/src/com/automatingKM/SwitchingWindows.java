package com.automatingKM;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchingWindows {

	public static void main(String[] args) 
	{
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("http://irctc.co.in");
driver.findElement(By.linkText("Flight Tickets")).click();

Set<String> allwindows = driver.getWindowHandles();
Object[] windows = allwindows.toArray();
String window1 = windows[0].toString();
String window2 = windows[1].toString();		

driver.switchTo().window(window1);
System.out.println(driver.getTitle());

driver.switchTo().window(window2);
System.out.println(driver.getTitle());    
		
		
	}

}
