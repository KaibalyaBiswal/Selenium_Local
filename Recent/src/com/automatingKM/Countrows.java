package com.automatingKM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Countrows {

	public static void main(String[] args) 
	{
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.navigate().to("http://money.rediff.com/tools/forex");
WebElement table = driver.findElement(By.className("dataTable"));
List<WebElement> rows = table.findElements(By.tagName("tr"));
System.out.println(rows.size());

		

		
		
	}

}
