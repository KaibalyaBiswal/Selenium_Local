package m18012018;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CatureURL 
{
public static void main(String[] args) 
{
WebDriver driver=new FirefoxDriver();
driver.navigate().to("http://facebook.com");
String url = driver.getCurrentUrl();
	System.out.println(url);
	
	
}
	
}
