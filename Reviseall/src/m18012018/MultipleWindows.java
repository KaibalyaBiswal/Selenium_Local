package m18012018;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MultipleWindows 
{
@Test
	public void windows() throws Throwable
{
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://primusbank.qedgetech.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	driver.findElement(By.id("txtPword")).sendKeys("Admin");
	driver.findElement(By.id("login")).click();
	
	Actions act=new Actions(driver);
	act.contextClick(driver.findElement(By.xpath(".//*[@src='images/emp_btn.jpg']")));
	act.build().perform();
	act.sendKeys(Keys.ARROW_DOWN);
	act.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	act.sendKeys(Keys.ENTER);
	act.build().perform();
	
Set<String> allwindows=driver.getWindowHandles();	

Object[] windows=allwindows.toArray();	

String window1 = windows[0].toString();
String window2=windows[1].toString();

driver.switchTo().window(window2);
driver.findElement(By.xpath(".//*[@src='images/emp_btn.jpg']")).click();
driver.findElement(By.xpath(".//*[@id='DGBanker']/tbody/tr[2]/td[7]/a")).click();

String text=driver.switchTo().alert().getText();
System.out.println(text);
driver.switchTo().alert().dismiss();

driver.switchTo().window(window1);
driver.findElement(By.xpath(".//*[@src='images/emp_btn.jpg']")).click();
driver.findElement(By.xpath(".//*[@id='BtnNew']")).click();
driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[3]/a")).click();


}
}
