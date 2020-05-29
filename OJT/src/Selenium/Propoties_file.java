package Selenium;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Propoties_file 
{

	public static void main(String[] args) throws Throwable 
	{
		
		//We need to create an object of FileInputStream class with the path to properties file (FileInputStream()=Read data)
	FileInputStream	fis=new FileInputStream("E:\\c\\workspaceeclipse\\OJT\\kaibalya.properties");
		
		//load the properties file or Reading data from properties file we create an object
	Properties p = new Properties();
		
	//Reading data from properties file can be done using load method offered by Properties class in java
	p.load(fis);
	
	WebDriver driver=new FirefoxDriver();
	driver.get(p.getProperty("url"));
	driver.findElement(By.xpath(p.getProperty("username.path"))).sendKeys(p.getProperty("username"));
	driver.findElement(By.xpath(p.getProperty("password.path"))).sendKeys("password");
	driver.findElement(By.xpath(p.getProperty("login.path"))).click();
	
	
	
	
	
		
		
		
	}

}
