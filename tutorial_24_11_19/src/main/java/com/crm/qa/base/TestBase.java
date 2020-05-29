package com.crm.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.utils.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase
{											//Parent class which will extend to each and every child class

	public static WebDriver driver;
	public static Properties prop;
//	public static EventFiringWebDriver e_driver;
//	public static WebEventListener eventListener; 
	
	
//Create one constructor and surround by try catch block
	public TestBase()
	{
		
		try {
			prop = new Properties();
			FileInputStream rp = new FileInputStream("D:\\c\\Workspaceeclipse1\\tutorial_24_11_19\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(rp);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static void initialization()
	{
		
		String browser = prop.getProperty("browser");
		
		if (browser.equals("chrome")) 
		{
		
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
						
		} else 	if (browser.equals("firefox")) 
		{
		
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if (browser.equals("edge")) 
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TestUtil.implicity_wait, TimeUnit.SECONDS);
		
		
		
		//this will be use for the webdriverEventListener class (will be use later)
		
		/*
		 * e_driver= new EventFiringWebDriver(driver); 
		 * eventListener= new WebEventListener(); 
		 * e_driver.register(eventListener); 
		 * driver=e_driver;
		 */
		
		
		driver.get(prop.getProperty("url"));
	}
	
	 	
}
