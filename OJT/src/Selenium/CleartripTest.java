package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CleartripTest 
{
public static void main(String[] args) 
{

WebDriver driver=new FirefoxDriver();
driver.get("https://www.cleartrip.com/");
driver.findElement(By.id("RoundTrip")).click();
if (driver.findElement(By.xpath(".//*[@id='ReturnDate']")).isDisplayed()) {
	System.out.println("pass");
} else {
System.out.println("fail");
}

driver.findElement(By.xpath(".//*[@id='MultiCity']")).click();
if (driver.findElement(By.xpath(".//*[@id='ReturnDate']")).isDisplayed()) {
	System.out.println("pass");
} else {
System.out.println("fail");
}

if (driver.findElement(By.xpath(".//*[@id='DepartDate2']")).isDisplayed()) {
	System.out.println("pass");
} else {
System.out.println("fail");

}
}
}
