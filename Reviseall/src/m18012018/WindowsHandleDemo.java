package m18012018;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandleDemo 
{
public static void main(String[] args) 
{
//System.setProperty("webdriver.firefox.driver", "path od the correspoing driver");	
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("http://primusbank.qedgetech.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath(".//*[@id='txtuId']")).sendKeys("Admin");
driver.findElement(By.xpath(".//*[@id='txtPword']")).sendKeys("Admin");
driver.findElement(By.xpath(".//*[@id='login']")).click();

 Actions act = new Actions(driver);
 act.contextClick(driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")));
act.build().perform();

act.sendKeys(Keys.ARROW_DOWN);
act.sendKeys(Keys.ARROW_DOWN);
act.sendKeys(Keys.ENTER);
act.build().perform();


Set<String> allwindows= driver.getWindowHandles();
Object[] window = allwindows.toArray();
String window1 = window[0].toString();
String window2 = window[1].toString();

WebDriver url1 = driver.switchTo().window(window1);
System.out.println(driver.getCurrentUrl());
WebDriver url2 = driver.switchTo().window(window2);
System.out.println(driver.getCurrentUrl());






}
}
