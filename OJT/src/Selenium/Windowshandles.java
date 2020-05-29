package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Windowshandles 
{
public static void main(String[] args) throws Throwable 
{

	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://naukri.com");
	driver.manage().window().maximize();
	Actions act=new Actions(driver);
	act.contextClick(driver.findElement(By.xpath("html/body/div[2]/div/div[1]/ul[2]/li[1]/a")));
//	act.build().perform();
	act.sendKeys(Keys.ARROW_DOWN);
	act.sendKeys(Keys.ARROW_DOWN);
	Sleeper.sleepTightInSeconds(3);
	act.sendKeys(Keys.ENTER);
	act.build().perform();



//		Sleeper.sleepTightInSeconds(5);
//act.contextClick(driver.findElement(By.xpath("html/body/header/div[1]/div/div[1]/div[2]/a")));
//	act.sendKeys(Keys.ARROW_DOWN);		
//	act.sendKeys(Keys.ARROW_DOWN);						//not worked
//	Sleeper.sleepTightInSeconds(3);
//	act.sendKeys(Keys.ENTER);
//	act.build().perform();
	
}
}
