package m18012018;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LunchIE {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "E:\\Selenium\\Software\\IEDriverServer_x64_3.5.1\\IEDriverServer.exe");
WebDriver	driver=new InternetExplorerDriver();
	driver.get("http://gogle.com");	
		
	}

}
