package com.automatingKeyboardmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandle 
{
public static void main(String[] args) 
{
WebDriver driver=new FirefoxDriver();
driver.get("http://irctc.co.in");	
driver.findElement(By.linkText("Lucky Draw")).click();
System.out.println(driver.getWindowHandles());
	
	
}
}
