package com.primusbank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{

//This class will store all the locators of login page
	
	WebDriver driver;
	
	By username=By.id("txtuId");
	By password=By.xpath("//*[@id=\"txtPword\"]");
	By login=By.name("login");

	
	public LoginPage(WebDriver driver)
	{	
	

		this.driver=driver;
		
	}
	
//	public void enterUsername()                //Before parameterize  ---> static
	public void enterUsername(String uid)      //After parameterize
	{
		
		driver.findElement(username).sendKeys(uid);
		
	}
	//public void enterPassword()              //Before parameterize  ---> static
	public void enterPassword(String pwd)      //After parameterize
	{
		
		driver.findElement(password).sendKeys(pwd);
		
	}
	
	public void clickLogin()
	{
		
		driver.findElement(login).click();
		
	}
	
	
}



