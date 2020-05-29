package com.automatingKeyboardmouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Movingoverelement 
{
public static void main(String[] args) 
{
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("http://orangehrm.qedgetech.com");
driver.manage().window().maximize();


driver.findElement(By.id("txtUsername")).sendKeys("admin");
driver.findElement(By.id("txtPassword")).sendKeys("Admin");
driver.findElement(By.id("btnLogin")).click();



Actions act=new Actions(driver);
act.moveToElement(driver.findElement(By.id("menu_pim_viewPimModule")));

act.build().perform();


act.moveToElement(driver.findElement(By.xpath("html/body/div[1]/div[2]/ul/li[2]/ul/li[1]/a")));

act.build().perform();


act.moveToElement(driver.findElement(By.xpath("html/body/div[1]/div[2]/ul/li[2]/ul/li[1]/ul/li[1]/a"))).click();

act.build().perform();



	}
	
}
