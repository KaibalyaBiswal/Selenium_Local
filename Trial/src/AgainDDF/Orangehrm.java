package AgainDDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Orangehrm 
{
	@Test(dataProvider="datainput")
	public static void orangehrm(String uid,String pwd) 
	{	
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://Orangehrm.qedgetech.com");
	driver.findElement(By.xpath(".//*[@id='txtUsername']")).clear();
	driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys(uid);
	driver.findElement(By.xpath(".//*[@id='txtPassword']")).clear();
	driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys(pwd);
	driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
	Sleeper.sleepTightInSeconds(3);
	driver.close();
	}

@DataProvider(name="datainput")
public Object[][] datas()
		{
	Object[][] input = new Object[3][2];
	
	input[0][0]="Admin";
	input[0][1]="admin";
	
	input[1][0]="admin";
	input[1][1]="Admin";
	
	input[2][0]="Admin";
	input[2][1]="Admin";
	
	return input;
	
		}
}
