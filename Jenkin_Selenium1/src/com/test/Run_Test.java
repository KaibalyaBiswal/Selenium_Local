package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Run_Test 
{
	@Test
	public void testgooglrsearch(){
	
	WebDriverManager.chromedriver().setup();
	//to remove the time out log from the consoles
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
	WebDriver driver = new ChromeDriver();
	//it will open the google page
	driver.get("http://google.in"); 
	//we expect the title “Google “ should be present 
	String Expectedtitle = "Google";
	//it will fetch the actual title 
	String Actualtitle = driver.getTitle();
	System.out.println("Before Assetion :" + Expectedtitle + Actualtitle);
	//it will compare actual title and expected title
	Assert.assertEquals(Actualtitle, Expectedtitle);
	//print out the result
	System.out.println("After Assertion :" + Expectedtitle + Actualtitle);
	driver.quit();
	 }
	
	
}

