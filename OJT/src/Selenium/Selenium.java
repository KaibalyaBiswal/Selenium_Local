package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Selenium 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Software\\geckodriver-v0.19.0-win64\\geckodriver.exe");
	//System.setProperty("webdriver.ie.driver", "E:\\Selenium\\Software\\IEDriverServer_x64_3.5.1\\IEDriverServer.exe");
	WebDriver driver=new FirefoxDriver();
driver.get("https://in.yahoo.com/");
driver.findElement(By.id("uh-search-box")).sendKeys("Selenium");
Sleeper.sleepTightInSeconds(3);

//1-> driver.findElement(By.xpath("//*[normalize-space()='selenium ide']")).click();
	
//2-> WebDriverWait wait = new WebDriverWait(driver, 10);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[normalize-space()='selenium ide']")));
//   driver.findElement(By.xpath("//*[normalize-space()='selenium ide']")).click();

	
}
}
