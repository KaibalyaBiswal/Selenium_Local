package com.fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Kai {
	
public static void main(String[] args) {
WebDriver	driver=new FirefoxDriver();
driver.get("http://calc.qedgetech.com");
driver.findElement(By.xpath("//*[@value='1']")).click();
driver.findElement(By.xpath("//*[@value='+']")).click();
driver.findElement(By.xpath("//*[@value='2']")).click();
driver.findElement(By.xpath("//*[@value='=']")).click();

 }
   }

