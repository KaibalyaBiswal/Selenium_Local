package com.programme;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionRobot 
{

	public static void main(String[] args) 
	{
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.uipath.com");
		String keyPress = Keys.chord(Keys.CONTROL,"t");
		driver.findElement(By.xpath("//a[text()='Introduction to UiPath']")).sendKeys(keyPress);

	}		
}
