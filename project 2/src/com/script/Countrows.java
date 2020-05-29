package com.script;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Countrows {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();

		driver.get("http://money.rediff.com/tools/forex");

		WebElement table=driver.findElement(By.className("dataTable"));
List<WebElement> rows=table.findElements(By.tagName("tr"));
System.out.println(rows.size()-1);

	}
}
