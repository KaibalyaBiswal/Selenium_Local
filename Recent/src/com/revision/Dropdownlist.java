package com.revision;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;							//For Select Class//
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlist 
{

	public static void main(String[] args) 
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://primusbank.qedgetech.com");
	
Select blist = new Select(driver.findElement(By.id("drlist")));	
blist.selectByVisibleText("AngryBird");

//blist.selectByIndex("");	("Index")
//blist.selectByValue("");	("Value")
		
	}
}
						