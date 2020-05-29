package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic_xpath_ends_with 
{
public static void main(String[] args) 
{

	WebDriver driver=new FirefoxDriver();
	driver.get("http://in.yahoo.com");
	driver.findElement(By.xpath(".//*[@id='uh-search-box']")).sendKeys("selenium");
	
	//ends-with() = where starting data is dynamic & ending data is static
}
}
