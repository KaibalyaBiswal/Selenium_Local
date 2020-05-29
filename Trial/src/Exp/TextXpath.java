package Exp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextXpath 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kaiii\\Downloads\\Compressed\\geckodriver-v0.19.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://orangehrm.qedgetech.com");
	//driver.findElement(By.xpath("//*[text()='Username']")).sendKeys("Admin");
	
}
}
