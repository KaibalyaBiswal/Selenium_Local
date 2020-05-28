package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Second_Class_Suite 
{

	@Test
	public static void suite_test()
	{
	WebDriverManager.chromedriver().setup();
	//to remove the time out log from the consoles
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
	WebDriver driver = new ChromeDriver();
	//it will open the google page
	driver.get("http://google.in"); 
	System.out.println(driver.getTitle());
	driver.quit();
	
	
}
}



