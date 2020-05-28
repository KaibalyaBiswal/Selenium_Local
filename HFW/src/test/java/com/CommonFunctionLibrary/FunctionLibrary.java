package com.CommonFunctionLibrary;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Utilities.PropertyFileUtil;

public class FunctionLibrary 
{

	//For Start Browser
	
public static WebDriver startBrowser(WebDriver driver) throws Throwable
{

	if(PropertyFileUtil.getProperty("browser").equalsIgnoreCase("Firefox"))
	{
		driver=new FirefoxDriver();
	}else
		if (PropertyFileUtil.getProperty("browser").equalsIgnoreCase("chrome")) 
		{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Software\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();	
		}else
			if (PropertyFileUtil.getProperty("browser").equalsIgnoreCase("opera")) 
			{
		System.setProperty("webdriver.opera.driver","E:\\Selenium\\Software\\operadriver_win64\\operadriver_win64\\operadriver.exe");
				driver=new ChromeDriver();	
			}else
				if (PropertyFileUtil.getProperty("browser").equalsIgnoreCase("ie")) 
				{
			System.setProperty("webdriver.ie.driver", "E:\\Selenium\\Software\\IEDriverServer_x64_3.5.1\\IEDriverServer.exe");		
				driver=new InternetExplorerDriver();	
				}
	
	return driver;
		
}

	//Open Application

public static void openApplication(WebDriver driver) throws Throwable
{
	
	driver.manage().window().maximize();
	driver.get(PropertyFileUtil.getProperty("url"));
	
}

	//Close Application

public static void closeApplication(WebDriver driver) 
{

	driver.close();
	
}

	//Click Action

public static void clickActon(WebDriver driver,String locatorType,String locatorValue) 
{

	if (locatorType.equalsIgnoreCase("id")) 
	{
	driver.findElement(By.id(locatorValue)).click();	
	}else
		if (locatorType.equalsIgnoreCase("name")) 
		{
		driver.findElement(By.name(locatorValue)).click();	
		}else
			if (locatorType.equalsIgnoreCase("className")) 
			{
			driver.findElement(By.className(locatorValue)).click();	
			}else
				if (locatorType.equalsIgnoreCase("xpath")) 
				{
				driver.findElement(By.xpath(locatorValue)).click();
				}

}


	//Type Action

public static void typeAction(WebDriver driver,String locatorType,String locatorValue,String data)
{
	
	if (locatorType.equalsIgnoreCase("id")) 
	{
	driver.findElement(By.id(locatorValue)).clear();
	driver.findElement(By.id(locatorValue)).sendKeys(data);
	}else
		if (locatorType.equalsIgnoreCase("className")) 
		{
		driver.findElement(By.className(locatorValue)).clear();
		driver.findElement(By.className(locatorValue)).sendKeys(data);
		}else
			if (locatorType.equalsIgnoreCase("xpath")) 
			{
			driver.findElement(By.xpath(locatorValue)).clear();
			driver.findElement(By.xpath(locatorValue)).sendKeys(data);
			}
			
		}
	
	//Wait For Element

public static void waitForElement(WebDriver driver,String locatorType,String locatorValue,String waitTime)
{
	
	WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(waitTime));

	if (locatorType.equalsIgnoreCase("id")) 
	{
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorValue)));	
	}else
		if (locatorType.equalsIgnoreCase("name")) 
		{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorValue)));	
		}else
			if (locatorType.equalsIgnoreCase("xpath")) 
			{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorValue)));	
			}
	
}	

//Capture Data

public static void captureData(WebDriver driver,String locatorType,String locatorValue) throws Throwable
{
String data = "";

if (locatorType.equalsIgnoreCase("id")) 
{
data=driver.findElement(By.id(locatorValue)).getAttribute("value");	
}else
	if (locatorType.equalsIgnoreCase("xpath")) 
	{
	data=driver.findElement(By.xpath(locatorValue)).getAttribute("value");	
	}else
		if (locatorType.equalsIgnoreCase("name")) 
		{
	data=driver.findElement(By.name(locatorValue)).getAttribute("value");
		}

FileWriter fr=new FileWriter("E:\\Selenium\\Notes\\OJT HybrideFrameWork\\DemoExcel\\CaptureData.txt");
BufferedWriter br = new BufferedWriter(fr);

br.write(data);
br.flush();					// It use for output Stream, make sure to it close after all the data written in the file.
br.close();
}

	//MOve Over Element

public static void moveOverElement(WebDriver driver,String locatorType,String locatorValue)
{
	Actions act=new Actions(driver);
	
	if (locatorType.equalsIgnoreCase("id")) 
	{
	act.moveToElement(driver.findElement(By.id(locatorValue))).build().perform();
	}else
		if (locatorType.equalsIgnoreCase("name")) 
		{
		act.moveToElement(driver.findElement(By.name(locatorValue))).build().perform();	
		}else
			if (locatorType.equalsIgnoreCase("xpath")) 
			{
			act.moveToElement(driver.findElement(By.xpath(locatorValue))).build().perform();	
			}						
}


	//Title Validation

public static void titleValidation(WebDriver driver,String exp_title)
{
	
String	act_title=driver.getTitle();
	
Assert.assertEquals(exp_title, act_title);	
}

	//Generate Date

public static String generateDate()
{
	
Date dt=new Date();
SimpleDateFormat	sdf=new SimpleDateFormat("YYYY_MMM_DD_SS");
return	sdf.format(dt);
	
}

	//DropDown

public static void dropDown(WebDriver driver,String locatorType,String locatorValue,String data)
{
	
if (locatorType.equalsIgnoreCase("id")) 
{
new Select(driver.findElement(By.id(locatorValue))).selectByVisibleText(data);
}else
	if (locatorType.equalsIgnoreCase("name")) 
	{
	new Select(driver.findElement(By.name(locatorValue))).selectByVisibleText(data);	
	}else
		if (locatorType.equalsIgnoreCase("xpath")) 
		{
		new Select(driver.findElement(By.xpath(locatorValue))).selectByVisibleText(data);	
		}
	
}


public static void datePicker(WebDriver driver, String locatorValue, String date)
{
	
	((JavascriptExecutor)driver).executeScript("document.getElementById('"+locatorValue+"').value='"+date+"'");

}



}
