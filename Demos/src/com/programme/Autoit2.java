package com.programme;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autoit2 {

	public static void main(String[] args) throws IOException 
	{

		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://orangehrm.qedgetech.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.partialLinkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Kaibalya");
		driver.findElement(By.id("lastName")).sendKeys("Biswal");
		System.out.println(driver.findElement(By.id("employeeId")).getAttribute("value"));
		driver.findElement(By.id("photofile")).click();
		
	//then we will execute the autoit script
		Runtime.getRuntime().exec("E:\\Eclipse project\\Autoit\\Demo3.exe");
	//then again we have to write the selenium code for web operation
		driver.findElement(By.id("btnSave")).click();
		
				
	}

}
