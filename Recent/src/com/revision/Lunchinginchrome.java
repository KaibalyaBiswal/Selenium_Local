package com.revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lunchinginchrome 
{
public static void main(String[] args)
{
System.setProperty("WebDriver.Chrome.driver","E:\\Selenium\\Software\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://google.com");



     //not execute
}
}

