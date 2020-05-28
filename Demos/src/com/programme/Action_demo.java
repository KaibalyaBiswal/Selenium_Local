package com.programme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_demo {
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://snapdeal.com");
		driver.manage().window().maximize();
		
		
//1st method (success)
		
	Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.className("navlink")));
		act.build().perform();
		driver.findElement(By.linkText("Refrigerators")).click();
		driver.findElement(By.partialLinkText("Blue Star 100 LTR Chest Freezer - CHF 100C/ CHFSD100D Deep Freezer White and Blue")).click();

//2nd method (not executed)	
		
//	Actions act=new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("html/body/div[11]/div[3]/div/div[1]/div[2]/ul/li[2]/a/span[2]")));
//		Sleeper.sleepTightInSeconds(3);
//		act.build().perform();
//		Sleeper.sleepTightInSeconds(3);
//		driver.findElement(By.linkText("Smartphones")).click();
	
	}

}
