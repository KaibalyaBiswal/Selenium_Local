package com.programme;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail 
{
	public static void main(String[] args) throws Throwable 
	{
	
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("http://gmail.com");
driver.manage().window().maximize();
driver.findElement(By.id("identifierId")).sendKeys("kaibalya.kb@gmail.com");
driver.findElement(By.xpath("//div[2]/div[1]/div/content/span")).click();
driver.findElement(By.xpath("//div[2]/div/div[3]/div[1]/div[1]/div/div[1]/div/div[1]/input")).sendKeys("KSKKAKSKKAKSKKA");
Thread.sleep(3000);
driver.findElement(By.xpath("//div/div[3]/div[2]/div[1]/div/content/span")).click();
Thread.sleep(3000);driver.findElement(By.className("CwaK9")).click();
Thread.sleep(3000);
driver.findElement(By.className("IMH1vc lUHSR Hj2jlf")).click();
Thread.sleep(3000);
driver.findElement(By.className("vdE7Oc")).click();
//driver.findElement(By.id("idvPin")).sendKeys("293193");
//driver.findElement(By.id("CwaK9")).click();

	}
	
}


