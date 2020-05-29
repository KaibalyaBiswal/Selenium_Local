package com.programme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Primusbank {
public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com");
			driver.findElement(By.linkText("Site Map")).click();
				driver.findElement(By.linkText("payments")).click();
}
		}


