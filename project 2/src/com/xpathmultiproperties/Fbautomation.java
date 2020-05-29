package com.xpathmultiproperties;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fbautomation {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		driver.findElement(By.name("email")).sendKeys("kaibalya.kb@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("*******");
		driver.findElement(By.id("loginbutton")).click();
		
		
	}
}
