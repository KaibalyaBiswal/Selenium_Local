package WindowsApplications;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class Notepad 
{
	public static WindowsDriver driver=null;
	
	@Test
	public void Desktop_Notepad()
	{
		DesiredCapabilities cap = new DesiredCapabilities();
	//capabilities for application (name,value)
		cap.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
	//capabilities for platform (name,value)
		cap.setCapability("platform", "Windows");
	//capabilities for device(name, value)
		cap.setCapability("deviceName", "WindowsPC");
	
		try {
			driver=new WindowsDriver(new URL("http://127.0.0.1:4723/"), cap );
		} catch (MalformedURLException e) 
		{
			e.printStackTrace();
		}
	//Notepad functions automation
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByName("Help").click();
		driver.findElementByName("About Notepad").click();
		driver.findElementByName("OK").click();
		driver.findElementByName("Text Editor").sendKeys("this is written by WinAppDriver");
		driver.findElementByName("Text Editor").clear();
		driver.findElementByName("Close").click();
			
	}
	
	
	
}
