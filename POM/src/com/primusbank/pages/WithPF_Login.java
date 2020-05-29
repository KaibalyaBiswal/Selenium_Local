/**
 * 
 */
package com.primusbank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Kaibalya
 *
 */
public class WithPF_Login 
{

	WebDriver driver;

public WithPF_Login(WebDriver driver1) //the driver come from factory will initialize in local driver
{
	this.driver=driver1; //local driver
		
}
	
		
	@FindBy(id="txtuId")
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.ID,using="txtPword")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"login\"]")
	@CacheLookup
	WebElement lonin_button;
	
		
	public void login_to(String uid,String pwd)
	{
		
		username.sendKeys(uid);
		password.sendKeys(pwd);
		lonin_button.click();
	
		driver.quit();
	}
	
	
	
}
