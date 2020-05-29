package DDF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelProvider2 
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
public Object[][] getData()
{
	ExcelProvider1 edp=new ExcelProvider1("E:\\c\\workspaceeclipse\\Trial\\Testdata\\Datainput.xlsx");
int	rows=edp.getrow(0);
	Object[][] data=new Object[rows][2];	
	for (int i = 0; i < rows; i++) 
	{
	data[i][0]=edp.getData(0, i,0);	
	data[i][1]=edp.getData(0, i, 1);
	}
	return data;
}

}
