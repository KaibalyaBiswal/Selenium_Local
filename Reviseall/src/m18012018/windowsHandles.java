package m18012018;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class windowsHandles 
{
public static void main(String[] args) 
{
//System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Software\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.navigate().to("https://naukri.com");
driver.manage().window().maximize();

Actions act=new Actions(driver);
act.sendKeys(Keys.PAGE_DOWN);
act.sendKeys(Keys.PAGE_DOWN);
act.build().perform();

act.contextClick(driver.findElement(By.xpath("html/body/div[5]/div/div[1]/div[2]/div[1]/div[1]/table/tbody/tr[14]/td/a/img")));
act.build().perform();
act.sendKeys(Keys.ARROW_DOWN);
act.sendKeys(Keys.ARROW_DOWN);
act.sendKeys(Keys.ENTER);
act.build().perform();

Set<String> windows=driver.getWindowHandles();
Object[] allwindows=windows.toArray();

String window1 = allwindows[0].toString();
String window2 = allwindows[1].toString();
String window3 = allwindows[2].toString();
String window4 = allwindows[3].toString();
String window5 = allwindows[4].toString();

driver.switchTo().window(window1);
driver.findElement(By.className("mainSec")).click();
for (int i = 1; i <+100; i++) 
{
act.sendKeys(Keys.PAGE_UP);
act.build().perform();
}
System.out.println(driver.getCurrentUrl());

driver.findElement(By.xpath("html/body/div[4]/div[1]/div/ul/li[3]/a")).click();


}
}

