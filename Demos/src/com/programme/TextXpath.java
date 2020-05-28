package com.programme;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextXpath {

	public static void main(String[] args) 
	{

	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://orangehrm.qedgetech.com");
	//driver.findElement(By.xpath("//*[text()='Username']")).sendKeys("Admin");
	driver.findElement(By.xpath("html/body/div[1]/div/div[1]/form/div[2]/input")).sendKeys("Admin");
	

	}

}
