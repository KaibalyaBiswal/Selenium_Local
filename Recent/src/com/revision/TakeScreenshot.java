package com.revision;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenshot 
{
public static void main(String[] args) throws Throwable 
{
WebDriver driver=new FirefoxDriver();
driver.get("http://google.com");

File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scr, new File("D:\\kai.jpg"));
System.out.println("Screenshot Taken");
}
}
