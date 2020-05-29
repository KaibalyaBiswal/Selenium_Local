package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase
{

	@FindBy(xpath="//span[contains(text(),'Contacts']")
	WebElement contactslLink;
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement DealsLink;
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement taskLink;
	
	@FindBy(xpath="//span[contains(text(),'Companies')]")
	WebElement companiesLink;
	
	@FindBy(xpath="//span[contains(text(),'Kaibalya Biswal')]")
	WebElement username;
	
//Create constructor of the page to initialize page object
	public HomePage()
	{
		PageFactory.initElements(driver, this);
		
	}
		
	public String validateHomePageTitle()
	{		
		return driver.getTitle();
	}
	
	public ContactsPage clickContactLink()
	{
		contactslLink.click();
		
		return new ContactsPage();
	}
	
	public DealsPage clickDealsPage()
	{
		
		DealsLink.click();
		return new DealsPage();
	}
	
	public TaskPage clickTasksPage()
	{
		
		taskLink.click();
		return new TaskPage();
	}
	
	public CompaniesPage clickCompaniesPage()
	{
		
		companiesLink.click();
		return new CompaniesPage();
	}
	
	public boolean verifyUsername()
	{
		return username.isDisplayed();
		
	}
	
}
