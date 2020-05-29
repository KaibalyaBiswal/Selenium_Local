package Exp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Software\\geckodriver-v0.19.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://google.com");
	
	
}
}
