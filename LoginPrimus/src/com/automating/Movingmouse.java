package com.automating;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Movingmouse {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://snapdeal.com");
Actions act=new Actions(driver);
act.moveToElement(driver.findElement(By.xpath("//div[2]/ul/li[2]/a/span[2]"))).click();

act.build().perform();
driver.findElement(By.partialLinkText("Mi")).click();


		
	}
}
