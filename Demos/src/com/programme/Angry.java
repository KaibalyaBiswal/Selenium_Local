package com.programme;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Angry 
{

public static void main(String[] args) 
{
WebDriver driver=new FirefoxDriver();
driver.get("http://orangehrm.qedgetech.com");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.findElement(By.id("txtUsername")).sendKeys("Admin");	
driver.findElement(By.id("txtPassword")).sendKeys("admin");	
driver.findElement(By.id("btnLogin")).click();

driver.findElement(By.linkText("Recruitment")).click();
driver.findElement(By.partialLinkText("Candidates")).click();
	
	
}
		
}
