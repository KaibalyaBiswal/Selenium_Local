package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase 
{

//Page factory OR object repository
	@FindBy(name="email") 	
	WebElement username;										//no need to write: driver.findElement(By) = @FindBy() is same
	
	@FindBy(name="password")	
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")	
	WebElement loginbtn;
	
	@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
	WebElement forgot_password;

	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement SignUpbtn;

	@FindBy(xpath="//a[contains(text(),'Classic CRM')]")
	WebElement Classic_CRM;
	
//To initialize page factory object/object repository we will create the constructor
	
	public LoginPage()
	{
		//initialize page factory or page object // "this" keyword pointing to the current class object
		
		PageFactory.initElements(driver, this);
		
	}
	
//create different actions present in login page
	
	public String validateLoginPage()
	{
		
		return driver.getTitle();
	}
	
	
	public String validateUrl()
	{
		return driver.getCurrentUrl();
	
	}

//Home page is landing page of login page,it will return home page object
	
	public HomePage login(String uname,String pwd)
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginbtn.click();
	
		return new HomePage();
		
	}

}




