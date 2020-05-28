package com.programme;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Demo 
{
	public static void main(String[] args) 
	{
		
//How to Handle untrusted SSL certificates using selenium webdriver?
		
	FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(false);
		
		
	WebDriver driver=new FirefoxDriver((Capabilities) profile);
	driver.get("http://google.com");
		driver.manage().window().maximize();
	}
}
