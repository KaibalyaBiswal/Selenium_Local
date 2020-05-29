package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic_xpath_start_with 
{
public static void main(String[] args) 
{

	WebDriver driver=new FirefoxDriver();
	driver.get("http://in.yahoo.com");
	driver.findElement(By.id("uh-search-box")).sendKeys("selenium");
	List<WebElement> list = driver.findElements(By.xpath("//*[starts-with(@id,'yui_3_18_0_3_15186')]/li"));
	
	for (WebElement element : list) 
	{
	if (element.getText().equalsIgnoreCase("selenium ide")) 
	{
	element.click();	
	}	
	}
}
}
