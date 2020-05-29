package AgainDDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PrimusBank 
{
@Test(dataProvider="primusbankData")
	public void primusBankLogin(String uid,String pwd)
	{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://orangehrm.qedgetech.com");
	driver.findElement(By.id("txtUsername")).clear();
	driver.findElement(By.id("txtUsername")).sendKeys(uid);
	driver.findElement(By.id("txtPassword")).clear();
	driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	driver.findElement(By.id("btnLogin")).click();	
	Sleeper.sleepTightInSeconds(3);
	System.out.println(driver.getCurrentUrl() );
	driver.close();
	
	
	}
	
@DataProvider(name="primusbankData")
	public Object[][] inputdata()
	{
		
		Object[][] data = new Object[3][2];
		
		data[0][0]="Admin";
		data[0][1]="Admin";
		
		data[1][0]="admin";
		data[1][1]="admin";
		
		data[2][0]="Admin";
		data[2][1]="admin";
		return data;
		
	}
}
