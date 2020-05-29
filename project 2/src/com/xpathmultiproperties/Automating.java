package com.xpathmultiproperties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automating {

	public static void main(String[] args) {
		
WebDriver	driver=new FirefoxDriver();

driver.get("http://orangehrm.qedgetech.com");
driver.findElement(By.id("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin");
driver.findElement(By.id("btnLogin")).click();
driver.findElement(By.linkText("PIM")).click();
String  result= driver.findElement(By.linkText("Add Employee")).getAttribute("value");
System.out.println(result);
driver.findElement(By.linkText("Add Employee")).clear();

	}
	
	}
