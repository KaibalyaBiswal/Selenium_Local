package com.automatingKM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextclick {

	public static void main(String[] args) 
	{
WebDriver driver=new FirefoxDriver();
driver.navigate().to("http://google.com");

Actions act = new Actions(driver);
act.contextClick(driver.findElement(By.linkText("Gmail")));
act.build().perform();
act.sendKeys(Keys.ARROW_DOWN);
act.sendKeys(Keys.ARROW_DOWN);
act.sendKeys(Keys.ARROW_DOWN);
act.sendKeys(Keys.ARROW_DOWN);
act.sendKeys(Keys.ARROW_DOWN);
act.sendKeys(Keys.ARROW_DOWN);
act.sendKeys(Keys.ARROW_DOWN);

act.sendKeys(Keys.ENTER);
act.build().perform();
		
	}

}
