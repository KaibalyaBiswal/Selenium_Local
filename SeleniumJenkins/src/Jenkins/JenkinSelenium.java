package Jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinSelenium 
{
	@Test
public void Jenkins()
{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://primusbank.qedgetech.com");
	System.out.println(driver.getCurrentUrl());
	driver.close();
	
}	
}
