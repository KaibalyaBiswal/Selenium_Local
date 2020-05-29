package com.programme2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Findelements {
	
public static void main(String[] args) {
WebDriver	driver=new FirefoxDriver();
   driver.get("http://primusbank.qedgetech.com");
    driver.findElement(By.linkText("Site Map")).click();
    java.util.List<WebElement> list = driver.findElements(By.tagName("a"));       //(tagaName=to find a link or create a link or option)
  System.out.println(list.size());
for(int i=0;i<list.size();i++)
{
String	linkname=list.get(i).getText();
System.out.println(linkname);
   }
  }
}


