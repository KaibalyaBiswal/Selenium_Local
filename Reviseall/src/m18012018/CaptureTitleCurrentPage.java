package m18012018;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureTitleCurrentPage 
{
public static void main(String[] args) 
{

	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("http://facebook.com");
String title = driver.getTitle();
	System.out.println(title);
}
	
}
