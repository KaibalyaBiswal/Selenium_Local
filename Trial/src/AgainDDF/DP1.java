package AgainDDF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP1 
{
@Test(dataProvider="input")	
public void login(String username,String password) throws Exception
{

	WebDriver driver=new FirefoxDriver();
	driver.get("http://orangehrm.qedgetech.com");
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(3000);
	driver.close();

	}

@DataProvider(name="input")
public Object[][] datas()
{
	Object[][] obj = new Object[2][2];
	
	obj[0][0]="Admin";
	obj[0][1]="admin";
	
	obj[1][0]="Admin";
	obj[1][1]="Admin";
	
	return obj;
	
	
}

}
