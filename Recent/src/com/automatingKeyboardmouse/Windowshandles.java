package com.automatingKeyboardmouse;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowshandles {

	public static void main(String[] args) 
	{
WebDriver driver=new FirefoxDriver();
driver.get("http://irctc.co.in");


driver.findElement(By.linkText("Flights")).click();


Set<String> allwindows = driver.getWindowHandles();		
Object[] windows = allwindows.toArray();
String window1 = windows[0].toString();
String window2 = windows[1].toString();

System.out.println(driver.getTitle());

driver.switchTo().window(window2);

System.out.println(driver.getTitle());




	}

}
