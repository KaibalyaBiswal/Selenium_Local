package DDF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.Test;
public class DataProvider 
{
@Test(dataProvider="value")	
public static void login(String username,String password)
{
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://orangehrm.qedgetech.com");
	driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys(username);
	driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys(password);
	driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
	Sleeper.sleepTightInSeconds(3);
	Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	System.out.println("Login Successfully");
	driver.close();
}

@org.testng.annotations.DataProvider(name="value")
public Object[][] datas()
{
	Object[][] obj=new Object[3][2];
	
obj[0][0]="Admin";
obj[0][1]="Admin";

obj[1][0]="admin";
obj[1][1]="admin";

obj[2][0]="Admin";
obj[2][1]="admin";

return obj;

}
}
