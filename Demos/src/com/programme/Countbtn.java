package com.programme;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countbtn {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Software\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("http://calc.qedgetech.com");
	
List<WebElement> btn=driver.findElements(By.xpath("//*[@type='button']"));
		
		System.out.println(btn.size());
		
		System.out.println(btn.get(2).getAttribute("value"));
	    System.out.println(btn.get(3).getAttribute("value"));
	
	}

}
