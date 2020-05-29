package m18012018;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VarificationTable 
{
@Test
	public void varification()
{
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("http://primusbank.qedgetech.com");
driver.manage().window().maximize();
driver.findElement(By.id("txtuId")).sendKeys("Admin");
driver.findElement(By.id("txtPword")).sendKeys("Admin");
driver.findElement(By.id("login")).click();

driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]")).click();
String rdata=driver.findElement(By.xpath(".//*[@id='DGRoles']/tbody/tr[2]")).getText();
System.out.println(rdata);


if (rdata.contains("aaaaa")) 
{
System.out.println("Pass");	
} else 
{
System.out.println("Fail");
}
}
}
