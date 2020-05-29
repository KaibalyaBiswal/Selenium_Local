package com.crm.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase
{
	
	LoginPage loginPage;
	HomePage homePage;

//	this constructor will load the properties from the base class defined as as super keyword so it will not give null point exception
//	because we need the properties also to perform action before initialization() method
	
	public LoginPageTest()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();

//create object of login page class
		
		loginPage = new LoginPage();	
	}
	
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String title = loginPage.validateLoginPage();
		Assert.assertEquals(title, "Cogmento CRM");
		System.out.println("the page title is : "+ title);
	}
	
	@Test(priority=2)
	public void urlTest()
	{
		
		String url = loginPage.validateUrl();
		Assert.assertEquals(url, "https://ui.cogmento.com/");
		System.out.println("the page url is : "+ url);
	}
	
	@Test(priority=3)
	public void loginTest() 
	{
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}	
}
