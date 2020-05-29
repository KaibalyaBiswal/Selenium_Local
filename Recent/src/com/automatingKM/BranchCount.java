package com.automatingKM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BranchCount {

	public static void main(String[] args) 
	{
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.navigate().to("http://primusbank.qedgetech.com");
Select	blist=new Select(driver.findElement(By.id("drlist")));
List<WebElement> options = blist.getOptions();

for (int i = 1; i < options.size(); i++) 
{
System.out.println(options.get(i).getText());	
}
		
	}
}

