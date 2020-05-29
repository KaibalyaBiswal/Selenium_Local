package Aaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrimusbankHomepage 
{

public static	WebDriver driver;
public static String url="http://primusbank.qedgetech.com";
public  String adminuid,adminpwd;

public static void lunchApp(String url)
{
driver=new FirefoxDriver();
driver.get(url);
}
public static boolean adminLogin(String adminuid,String adminpwd)
{
	String expurl,acturl;
	expurl="adminflow.aspx";
	driver.findElement(By.id("txtuId")).sendKeys("uid");
	driver.findElement(By.id("txtPword")).sendKeys("pwd");
	driver.findElement(By.id("login")).click();
	acturl=driver.getCurrentUrl();
	
if (acturl.toLowerCase().contains(expurl)) 
{
return true;
} 
else 
{
return false;
}
}
	
public static void closeApp()
{
	driver.close();	
}
}