package com.fun;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Kai2 {
	
public static void main(String[] args){ 
WebDriver driver=new FirefoxDriver();
driver.get("http://calc.qedgetech.com");
List<WebElement>buttons=driver.findElements(By.xpath("//*[@type='button']"));
System.out.println(buttons.size());

}
   }
