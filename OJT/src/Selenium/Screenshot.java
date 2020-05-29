package Selenium;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Screenshot {

	public static void main(String[] args) throws Throwable 
	{
WebDriver driver=new FirefoxDriver();
driver.get("http://google.com");

//.getScreenshotAs() is not present in WebDriver(I) Interface,it is present in TakeScreenshot(I) Interface
//so we type cast the driver to find .getScreenshotAs()

//Call getScreenshotAs method to create image file
File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

//As copyFile() method is static so we use FileUtils Class to call copyFile() method

//Copy file at destination
		FileUtils.copyFile(scr, new File("C:\\Users\\Kaiii\\Desktop\\New folder\\kaibalya.jpg"));
		System.out.println("Screenshot taken");
		
	}

}
