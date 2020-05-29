/**
 * 
 */
package com.primusbank.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.primusbank.pages.WithPF_Login;
import com.utility.BrowsersUtility;

/**
 * @author Kaibalya
 *
 */
public class WithPF_Varify 
{
	WebDriver driver;
	
	@Test
	public void validate()
	{
		
		driver=BrowsersUtility.browsers("chrome", "http://primusbank.qedgetech.com/");
		
		
		WithPF_Login login_page = PageFactory.initElements(driver, WithPF_Login.class);
		
		login_page.login_to("Admin", "Admin");
		
		
	}
	
	
}
