package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase
{

	@FindBy(xpath="//div[contains(text(),'Contacts')]")
	WebElement contactsLabel;

	@FindBy(xpath="//*[text(),'New']")
	WebElement newButton;

	@FindBy(name="first_name")
	WebElement firstName;

	@FindBy(name="last_name")
	WebElement lastName;

	@FindBy(className="search")
	WebElement company;

	@FindBy(xpath="//*[text(),'Save']")
	WebElement saveButton;

	
	//for initialization page object constructor in page class 									// super class constructor in test class
	public ContactsPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean verifyContactsLable()
	{
		
		return contactsLabel.isDisplayed();
	}
	
	
//this is the proper way of writing dynamically	
	
	  public void selectContactByName(String name) {
	  
	  driver.findElement(By.xpath("//td[contains(text(),'"+name+"')]")).click(); }
	 
	
	/*
	 * public void selectContactByName() {
	 * 
	 * driver.findElement(By.xpath(
	 * "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[2]")).
	 * click();
	 * 
	 * }
	 */
	
	  public void clickNewButton()
	  {
		  newButton.click();
		  
	  }
	  
	public void createNewContact(String fstName,String lstName,String companyName)
	{
		firstName.sendKeys(fstName);
		lastName.sendKeys(lstName);
		company.sendKeys(companyName);
		saveButton.click();
		
	}
	  
	  
	
}


