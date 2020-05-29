package com.programme2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Partiallink {
	
public static void main(String[] args) {
	
WebDriver driver=new FirefoxDriver();
    driver.get("http://primusbank.qedgetech.com");
        driver.findElement(By.linkText("Site Map")).click();

   java.util.List<WebElement>link=driver.findElements(By.partialLinkText("Banking"));
System.out.println(link.size());
   
for(int i=0;i<link.size();i++)
{ 
String Link=link.get(i).getText();
     System.out.println(Link);
}
  }
    }
