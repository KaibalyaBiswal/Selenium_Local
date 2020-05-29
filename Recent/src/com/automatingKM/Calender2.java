package com.automatingKM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender2 {

	public static void main(String[] args) {

	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://cleartrip.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//section[2]/div[1]/dl/dd/div/input[1]")).click();
	
	driver.findElement(By.className("ui-datepicker-month")).click();
	
	driver.findElement(By.className("ui-datepicker-year")).click();
	

	WebElement table = driver.findElement(By.id("ui-datepicker-div"));
	
	List<WebElement> rows = driver.findElements(By.tagName("tr"));	
	System.out.println(rows.size());
	
	
	 
	}

}
