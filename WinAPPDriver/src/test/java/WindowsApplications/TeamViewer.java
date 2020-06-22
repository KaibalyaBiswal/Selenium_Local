package WindowsApplications;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class TeamViewer 
{

	public static WindowsDriver driver=null;
	@Test
	public void testFuction() throws Throwable
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("app", "C:\\Program Files (x86)\\TeamViewer\\TeamViewer.exe");
		cap.setCapability("platform", "Windows");
		cap.setCapability("deviceName", "WindowsPC");
				
		try {
			driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"),cap);
			
		} catch (MalformedURLException e) 
		{
			e.printStackTrace();
			System.out.println(e);
			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByName("Help").click();
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
	}
		//error
}
