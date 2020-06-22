package com.automating;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Keyboardmouse {
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
driver.get("http://google.com");

Actions actions=new Actions(driver);
actions.contextClick(driver.findElement(By.linkText("Gmail")));
actions.build().perform();

actions.sendKeys(Keys.ARROW_DOWN);
actions.sendKeys(Keys.ARROW_DOWN);
actions.sendKeys(Keys.ENTER);
actions.build().perform();

	}

}
