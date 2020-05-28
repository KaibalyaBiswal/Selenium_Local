package com.programme;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DifferentCal {

	public static void main(String[] args) 
	{

		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://calculator.net");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("html/body/div[3]/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[3]/span[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		
		
		
	}

}
