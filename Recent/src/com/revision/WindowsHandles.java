package com.revision;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandles {

	public static void main(String[] args) 
	{
WebDriver driver=new FirefoxDriver();
driver.get("http://cleartrip.com");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().window().maximize();

Actions act=new Actions(driver);
act.contextClick(driver.findElement(By.xpath(".//*[@id='Home']/div/div/ul/li/div/div[2]/aside[1]/nav/ul[1]/li[2]/a[1]")));
act.sendKeys(Keys.ARROW_DOWN);
act.sendKeys(Keys.ARROW_DOWN);
act.sendKeys(Keys.ENTER);
act.build().perform();

Set<String> allwindows=driver.getWindowHandles();

 Object[] windows = allwindows.toArray();

String window1=windows[0].toString();
String window2 = windows[1].toString();



driver.switchTo().window(window1);

driver.findElement(By.xpath(".//*[@id='localsNav']")).click();
	}

}
