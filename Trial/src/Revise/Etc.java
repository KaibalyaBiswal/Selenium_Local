package Revise;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Etc 
{
//HtmlUnitDriver	
	
//	public static void main(String[] args) 
//	{
//WebDriver driver=new HtmlUnitDriver();
//driver.get("http://google.co.in");
//driver.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys("fb");
//driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
//System.out.println(driver.getCurrentUrl());
//
//	}

//getScreenShot
	
public static void main(String[] args) throws Throwable  
{
WebDriver driver=new FirefoxDriver();
driver.get("http://google.co.in");

//Convert web driver object to TakeScreenshot
TakesScreenshot sc = ((TakesScreenshot)driver);

//Call getScreenshotAs method to create image file
File scfile = sc.getScreenshotAs(OutputType.FILE);

//copy file to your required location
FileUtils.copyFile(scfile, new File("C:\\Users\\Babuni\\Desktop\\New folder\\kaibalya.jpg"));

System.out.println("screenshot taken");


}	
}
