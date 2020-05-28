package com.programme;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Capturetitle {

	public static void main(String[] args) { // static=modifier,void=return
												// type,public=access specifier

		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		String title = driver.getTitle();
		System.out.println(title);

	}

}
