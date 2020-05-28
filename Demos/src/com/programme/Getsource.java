package com.programme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getsource 
{
public static void main(String[] args) 
{
WebDriver driver=new FirefoxDriver();
driver.get("http://google.com");
String source=driver.getPageSource();
System.out.println(source);
}
}
