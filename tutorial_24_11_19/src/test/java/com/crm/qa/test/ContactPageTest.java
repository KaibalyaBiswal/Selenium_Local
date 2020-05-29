package com.crm.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utils.TestUtil;

public class ContactPageTest extends TestBase
{

	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	TestUtil testUtil;
	
	String sheetName="contacts";
	
	
	public ContactPageTest()
	{
		
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		
		homePage=new HomePage();
		testUtil=new TestUtil();
		contactsPage=new ContactsPage();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactsPage=homePage.clickContactLink();
	}

	///here may be we have to switch to the frame we are not getting the element
	
	
	@Test(priority = 1)
	public void verifyContactPageLabel()
	{
		Assert.assertTrue(contactsPage.verifyContactsLable(),"contact label is not found");
				
	}
	
	@Test(priority = 2)
	public void selectContactBox()
	{
		
		contactsPage.selectContactByName("kaibalya 123456789 Biswal");
		contactsPage.selectContactByName("chiru 12345 m");
	
	}
	
	/*
	 * @Test(priority = 2) public void selectContactBox() {
	 * 
	 * contactsPage.selectContactByName(); }
	 */
	
	@DataProvider
	public Object[][] getCRMTestData() throws Throwable
	{
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;

	}

	@Test(priority = 3,dataProvider = "getCRMTestData")
	public void validateNewContact(String firstName,String lastName,String company)	
	{
		contactsPage.clickNewButton();
		//contactsPage.createNewContact("kaibalya", "biswal", "google");
		contactsPage.createNewContact(firstName,lastName,company);
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	
}


