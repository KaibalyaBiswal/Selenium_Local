package com.xpathmultiproperties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calculator {
	public static void main(String[] args) {
WebDriver	driver=new FirefoxDriver();
driver.get("http://calc.qedgetech.com");
driver.findElement(By.xpath("//*[@value='1']")).click();
driver.findElement(By.xpath("//*[@value='+']")).click();
driver.findElement(By.xpath("//*[@value='2']")).click();
driver.findElement(By.xpath("//*[@value='=']")).click();
String value=driver.findElement(By.name("display")).getAttribute("value");
System.out.println(value);
		
	}

}
