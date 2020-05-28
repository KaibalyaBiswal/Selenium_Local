package com.programme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Captureurl 
{

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://irctc.co.in");
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

}
