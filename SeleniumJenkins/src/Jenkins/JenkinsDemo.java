package Jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinsDemo 
{

	@Test
	public void testJenkins()
	{
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com/");
System.out.println(driver.getTitle());		
	driver.close();
	
	}
	
}