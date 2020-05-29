package com.programme2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Userid {
	
	public static void main(String[] args) {
		WebDriver kai=new  FirefoxDriver();
		kai.get("http://primusbank.qedgetech.com");
		kai.findElement(By.id("txtUid")).sendKeys("Admin");
		kai.findElement(By.name("txtPword")).sendKeys("Admin");
		kai.findElement(By.name("Login")).click();
	    		
}
} 
