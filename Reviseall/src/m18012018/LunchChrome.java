package m18012018;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LunchChrome 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Software\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new FirefoxDriver();
driver.navigate().to("http://google.com");
	
	
}
		
}
