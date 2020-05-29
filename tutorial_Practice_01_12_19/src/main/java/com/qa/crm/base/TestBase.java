package com.qa.crm.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.qa.crm.util.Common_util;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	
	public static Properties prop;
	public static WebDriver driver;
	
	
public TestBase()
{
	
	try {
		prop = new Properties();
		FileInputStream ev = new FileInputStream("D:\\c\\Workspaceeclipse1\\tutorial_Practice_01_12_19\\src\\main\\java\\com\\qa\\crm\\config\\Environment_variable.properties");
		prop.load(ev);
	} catch (Exception e) 
	{
		e.printStackTrace();
	}
	
}


public void initialization()
{
	
	String browserName = prop.getProperty("browser");
	
	if (browserName.equals("chrome")) 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	} else if(browserName.equals("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	
	}else if (browserName.equals("ie")) 
	{
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
	}

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Common_util.implicit_wait, TimeUnit.SECONDS);
	
	
	driver.get(prop.getProperty("url"));
	
}

}


