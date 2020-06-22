package DDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Primusbank 
{
	
	
	@Test(dataProvider="pdata")
public void loginpbank(String username,String password)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='txtuId']")).sendKeys(username);
		driver.findElement(By.xpath(".//*[@id='txtPword']")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='login']")).click();
		driver.switchTo().alert().accept();
		Sleeper.sleepTightInSeconds(3);
Assert.assertTrue(driver.getTitle().contains("Primus"));
System.out.println("Login Successfully");
	}

@DataProvider(name="pdata")
public Object[][] passdatas()
	{
		Object[][] data=new Object[3][2];
		
	data[0][0]="admin";
	data[0][1]="admin";
	
	data[1][0]="amin";
	data[1][1]="adm";
	
	data[2][0]="Admin";
	data[2][1]="Admin";
	return data;
	
	}
	
	
}
