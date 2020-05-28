package Maven_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web_testing 
{
	@Test
	public void browser()
	{

	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.get("http://google.com");
	String url=driver.getCurrentUrl();
	System.out.println(url);
	}
}
