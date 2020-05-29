package Exp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutor 
{
public static void main(String[] args) 
{
WebDriver driver=new FirefoxDriver();

driver.get("http://primusbank.qedgetech.com/");

((JavascriptExecutor)driver).executeScript("document.getElementById('txtuId').value='Admin'");
((JavascriptExecutor)driver).executeScript("document.getElementById('txtPword').value='Admin'");
((JavascriptExecutor)driver).executeScript("document.getElementById('login').click()");

	
}
}
