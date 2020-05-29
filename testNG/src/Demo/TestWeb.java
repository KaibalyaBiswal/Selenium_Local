package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestWeb 
{
	WebDriver driver;
	
	@BeforeSuite
	public void lunchBrowser()
	{
		System.out.println("Browser Lunched");
	}

	@BeforeTest
	public void openApplication()
	{
		System.out.println("Application Will Open");
	}

	@BeforeClass
	public void readyToOpen()
	{
		System.out.println("Ready To Open Application");
	}

@BeforeMethod
public void setUp()
{
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://primusbank.qedgetech.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath(".//*[@id='txtuId']")).sendKeys("Admin");
	driver.findElement(By.xpath(".//*[@id='txtPword']")).sendKeys("Admin");
	driver.findElement(By.xpath(".//*[@id='login']")).click();
	
}

@Test
public void bankTest()
{
System.out.println(driver.getCurrentUrl());	
Assert.assertEquals("http://primusbank.qedgetech.com/adminflow.aspx","http://primusbank.qedgetech.com/adminflow.aspx");
}

@AfterMethod
public void logOut()
{
	driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
}

@AfterClass
public void logOutted() 
{
System.out.println("Application Logout");	
}

@AfterTest
public void loggingOut() 
{
System.out.println("Application Already Logout");	
}

@AfterSuite
public void close()
{
	System.out.println("Browser Closed");
	driver.quit();
}
}
