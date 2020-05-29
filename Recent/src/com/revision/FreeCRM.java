package com.revision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FreeCRM 
{

	@Test
	public void clickContact()
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com");
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();
		
		
	}
	
	
}
