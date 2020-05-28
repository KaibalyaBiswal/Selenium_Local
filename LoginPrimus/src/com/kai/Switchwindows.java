package com.kai;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switchwindows {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://irctc.co.in");
		driver.findElement(By.linkText("Flight Tickets")).click();
	Set<String>	allwindows=driver.getWindowHandles();
	
Object[] windows=allwindows.toArray();
String window1=windows[0].toString();
String window2=windows[1].toString();
String title=driver.getTitle();
System.out.println(title);
driver.switchTo().window(window2);
title=driver.getTitle();
System.out.println(title);
driver.switchTo().window(window1);
title=driver.getTitle();
System.out.println(title);
	
	}
}
