package com.kai;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getwindowhandles {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		
		
			driver.get("http://irctc.co.in");
	
	driver.findElement(By.xpath("html/body/div[1]/div/div[8]/div/div/ul/li[3]/a")).click();
	
	Set<String> windowids = driver.getWindowHandles();
System.out.println(windowids);

	}
}
