package com.programme2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Gmail{
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("Kaibalya.kb@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Sleeper.sleepTightInSeconds(5)
		;
		driver.findElement(By.name("password")).sendKeys("**********");
		driver.findElement(By.className("CwaK9")).click();
		
		
	}
}
