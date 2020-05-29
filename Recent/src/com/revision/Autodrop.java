package com.revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autodrop {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//*[@id='day']")).sendKeys("2");
		
		
		
	}

}
