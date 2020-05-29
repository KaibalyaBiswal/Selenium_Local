package com.automatingKM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles {

	public static void main(String[] args) 
	{
WebDriver driver=new FirefoxDriver();
driver.navigate().to("http://irctc.co.in");
driver.findElement(By.linkText("Flight Tickets")).click();
System.out.println(driver.getWindowHandles());
		
		
	}

}
