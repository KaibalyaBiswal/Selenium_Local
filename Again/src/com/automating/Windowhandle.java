package com.automating;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandle {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://irctc.co.in");
	String	windowid=driver.getWindowHandle();
System.out.println(windowid);
	driver.findElement(By.linkText("flight Tickets")).click();
Set<String>	allwindows=driver.getWindowHandles();
System.out.println(allwindows);

	}	
}
