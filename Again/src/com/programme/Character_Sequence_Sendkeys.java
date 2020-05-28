package com.programme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Character_Sequence_Sendkeys 
{

	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://google.com");
	WebElement search = driver.findElement(By.name("q"));

//  inside sendKeys method we can send character of sequence as multiple string 
// 	string builder class allows us to append multiple string
	
		
		  StringBuilder sb = new StringBuilder();
		  sb.append("Kaibalya");
		  sb.append(" ");
		  sb.append("Biswal");
		 
	
	
	StringBuffer sb1 = new StringBuffer();
	sb1.append("qa");
	sb1.append(" ");
	sb1.append("tester");
	
	
	String accept = "@best";
	
	search.sendKeys(sb,sb1,accept);
	
	
	
	
	}
	
	
	
}






