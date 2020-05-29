package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_text 
{
public static void main(String[] args) 
{

	WebDriver driver=new FirefoxDriver();
	driver.get("http://projects.qedgetech.com/xpath/");
	
	//driver.findElement(By.xpath("//button[text()='         Click Here     ']")).click();				//-> method 1
	
	//driver.findElement(By.xpath("//button[normalize-space(text()) ='Click Here']")).click();			//-> method 2	it is better as it target to specific node																				//-> for handelling white spaces in xpath in text locator method
	
	//driver.findElement(By.xpath("//button[normalize-space(.) ='Click Here']")).click();				//-> method 3
	
	//driver.findElement(By.xpath("//button[normalize-space() ='Click Here']")).click();				//-> method 4
	
//=> by giving normalize-space() xpath method which produce a new string from its argument in which the white space are cut and 
	//every whitespace within the string is replaced by a single space character.
	//although xpath is not a string handling mechanism
	
	
	
	//Sleeper.sleepTightInSeconds(2);
	//driver.findElement(By.xpath("//button[text()='Close']")).click();
}
}
