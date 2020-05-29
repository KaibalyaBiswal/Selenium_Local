package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Programme2 {

	public static void main(String[] args) {
		
WebDriver driver=new FirefoxDriver();
   driver.get("http://calc.qedgetech.com");
   java.util.List<WebElement>buttons=driver.findElements(By.xpath("//*[@type='button']"));
   System.out.println(buttons.size());
	}

}
