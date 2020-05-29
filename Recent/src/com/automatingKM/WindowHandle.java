package com.automatingKM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {

	public static void main(String[] args) 
	{
WebDriver driver=new FirefoxDriver();
driver.navigate().to("http://irctc.co.in");

System.out.println(driver.getWindowHandle());
		
		
		
	}

}
