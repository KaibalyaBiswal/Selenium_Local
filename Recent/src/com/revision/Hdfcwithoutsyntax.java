package com.revision;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Hdfcwithoutsyntax 
{

	public static void main(String[] args) 
	{
	WebDriver driver=new FirefoxDriver();
		driver.get("http://hdfcbank.com/");
	driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/a/img")).click();
	
	//not execute
	
	
	}
}
