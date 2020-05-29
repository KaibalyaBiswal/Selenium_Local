package com.automatingKM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) 
	{
WebDriver driver=new FirefoxDriver();
driver.navigate().to("http://jqueryui.com");
driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[2]/aside[1]/ul/li[2]/a")).click();

driver.switchTo().frame(driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/iframe")));

WebElement sourceelement,targetelement;
sourceelement=driver.findElement(By.xpath("html/body/div[1]"));
targetelement=driver.findElement(By.xpath("html/body/div[2]"));
Actions act=new Actions(driver);
act.dragAndDrop(sourceelement, targetelement);
act.build().perform();

	}

}
