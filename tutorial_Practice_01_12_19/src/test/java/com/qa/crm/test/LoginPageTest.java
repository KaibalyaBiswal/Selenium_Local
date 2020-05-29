package com.qa.crm.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.base.TestBase;
import com.qa.crm.page.HomePage;
import com.qa.crm.page.LoginPage;

public class LoginPageTest extends TestBase
{
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest()
	{
		
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		
		initialization();
		
		loginpage=new LoginPage();
	}
	
	@Test(priority = 1)
	public void validateUrl()
	{
		String url = loginpage.validateUrl();
		Assert.assertEquals(url,"https://ui.freecrm.com/");
		System.out.println("the page url is "+ url);
		
	}
	
	@Test(priority = 2)
	public void validateTitle()
	{
		String title=loginpage.validateTitle();
		Assert.assertEquals(title, "Cogmento CRM");
		System.out.println("the page title is "+ title);
		
	}
	
	@Test(priority = 3)
	public void login()
	{
		
		homepage=loginpage.logintoApp(prop.getProperty("username"), prop.getProperty("password"));
	
	}

	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
		
	}
	
	
}



