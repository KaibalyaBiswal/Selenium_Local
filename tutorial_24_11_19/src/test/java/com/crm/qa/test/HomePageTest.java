package com.crm.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utils.TestUtil;

public class HomePageTest extends TestBase
{
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	TestUtil testUtil;
	public HomePageTest()
	{
		
		super();
	}
	
	
	//test cases should be separated/independent
	//before each test case browser should lunch and login
	//@test Execute test case
	//after each test case close browser
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		
		homePage=new HomePage();
		testUtil=new TestUtil();
		contactsPage=new ContactsPage();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void verifyHomePageTitle()
	{
		
		String title=homePage.validateHomePageTitle();
		Assert.assertEquals(title, "Cogmento CRM","Page title is not matched");			//The third string is written for only in case of failed case
		
	}
	/*
	 * @Test(priority = 2) public void contactLink() { testUtil.switchToFrame();
	 * contactsPage=homePage.clickContactLink(); }
	 * 
	 * @Test(priority = 3) public void verifyUsername() { testUtil.switchToFrame();
	 * Assert.assertTrue(homePage.verifyUsername());
	 * 
	 * }
	 */
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	
	
}
