package com.programme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Element { 
	
	public static void main(String[] args) {
WebDriver driver=new FirefoxDriver();
driver.get("http://google.com");
driver.findElement(By.linkText("Gmail")).click();
	}
}