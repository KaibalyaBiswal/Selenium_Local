/**
 * 
 */
package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Kaibalya
 *
 */
public class BrowsersUtility
{
	static WebDriver driver;
	
	public static WebDriver browsers(String browsername,String url) 
	{
		if (browsername.equalsIgnoreCase("firefox")) 
		{
		
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		
		} else if (browsername.equalsIgnoreCase("chrome")) 
		{
		
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if (browsername.equalsIgnoreCase("IE")) 
		{
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
	}
	
	
}
