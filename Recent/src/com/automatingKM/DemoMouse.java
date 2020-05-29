package com.automatingKM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoMouse {

	public static void main(String[] args) 
	{
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.navigate().to("http://snapdeal.com");

Actions act=new Actions(driver);
act.moveToElement(driver.findElement(By.xpath("html/body/div[11]/div[3]/div/div[1]/div[2]/ul/li[2]/a/span[2]")));
act.build().perform();
driver.findElement(By.partialLinkText("Intex")).click();
		
		
		
	}

}
