package com.programme;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autoit_angry {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.partialLinkText("Add")).click();
		driver.findElement(By.id("firstName")).sendKeys("bobula");
		driver.findElement(By.id("middleName")).sendKeys("lolo");
		driver.findElement(By.id("lastName")).sendKeys("jhio");
		String ss = driver.findElement(By.id("employeeId")).getAttribute("value");
		System.out.println("ss");
		
		driver.findElement(By.id("photofile")).click();

	Runtime.getRuntime().exec("C:\\Users\\Kaiii\\Desktop\\angry auo.exe");
	driver.findElement(By.id("btnSave")).click();
		
		
		
	}

}
