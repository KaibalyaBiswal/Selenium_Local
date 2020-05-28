package com.kai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TryCatch {

	public static void main(String[] args)  {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com");
		
		String linkname ="contact" ;
		try{
		driver.findElement(By.linkText(linkname));
		System.out.println("test pass");
		}catch(Exception e){
		System.out.println("test fail");
	}
	}
}
		


