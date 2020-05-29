package com.automatingKeyboardmouse;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsHandles2 
{
public static void main(String[] args) 
{

	WebDriver driver=new FirefoxDriver();
	driver.get("http://google.com");
	driver.manage().window().maximize();

	Actions act=new Actions(driver);
	act.contextClick(driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")));
	act.sendKeys(Keys.ARROW_DOWN);
	act.sendKeys(Keys.ARROW_DOWN);
	act.sendKeys(Keys.ENTER);
	act.build().perform();
	
	
	Set<String> allwindows = driver.getWindowHandles();
	Object[] windows = allwindows.toArray();
	String window1 = windows[0].toString();
	String window2 = windows[1].toString();
	
driver.switchTo().window(window1);
driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[2]")).click();
driver.switchTo().window(window2);
//driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();

WebDriverWait wdw = new WebDriverWait(driver, 10);
			wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/nav/div/a[2]")));

			driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();


	
	
	
	
	
	
	
	
	
	
}
	
	
}
