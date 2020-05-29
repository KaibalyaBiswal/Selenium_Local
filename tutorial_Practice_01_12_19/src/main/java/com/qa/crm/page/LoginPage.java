package com.qa.crm.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.base.TestBase;

public class LoginPage extends TestBase
{
	
	@FindBy(name="email")
	WebElement username;

	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//div[text()='Login']")
	WebElement loginbtn;

	@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
	WebElement forgotpwdlink;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement signuplink;

/* ----------------------------------------------------------------*/
	
	public LoginPage()
	{	
		PageFactory.initElements(driver, this);
		
	}

/* ----------------------------------------------------------------*/
	
	public String validateUrl()
	{	
		
		return driver.getCurrentUrl();
	}
	
	public String validateTitle()
	{
		
		return driver.getTitle();
	}
	
	public HomePage logintoApp(String uid,String pwd)
	{
		
		username.sendKeys(uid);
		password.sendKeys(pwd);
		loginbtn.click();
		
		return new HomePage();
	}
	

}
