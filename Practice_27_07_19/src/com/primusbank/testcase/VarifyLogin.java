/**
 * 
 */
package com.primusbank.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.primusbank.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Kaibalya
 *
 */
public class VarifyLogin 
{

	@Test
	public void validate()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		
		
		LoginPage login = new LoginPage(driver);
		
		//login.enterUsername(); 			Before parameterize  ---> static
		login.enterUsername("admin");
		
		//login.enterPassword(); 			Before parameterize  ---> static
		login.enterPassword("admin");
		login.clickLogin();
		driver.quit();
	}
	
	
}
