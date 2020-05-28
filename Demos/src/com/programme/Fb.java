package com.programme;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Fb {

	public static void main(String[] args) 
	{
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("http://www.facebook.com");
driver.manage().window().maximize();
driver.findElement(By.id("email")).sendKeys("kaibalya.kb@gmail.com");
driver.findElement(By.id("pass")).sendKeys("*******");
driver.findElement(By.xpath("//form/table/tbody/tr[2]/td[3]/label")).click();

driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[1]/div/div/div/div[2]/div[2]/div[1]/div/a/div")).click();
driver.findElement(By.xpath("//div/div/div[2]/div[3]/div[2]/div/div[1]/a/div")).click();
driver.findElement(By.xpath("//div/div/ul/li[12]/a/span/span")).click();

		
		
	}

}
