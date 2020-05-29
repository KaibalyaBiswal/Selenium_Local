package Exp;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenShot 
{
	public static void main(String[] args) throws Throwable 
	{
	System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Software\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("kaibalya.kb@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("KSKKA***7");


WebDriverWait wait = new WebDriverWait(driver, 10);		
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("u_0_2")));
		
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.id("u_0_2")).click();
		
		
File sc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	

	//to copy the screen shot to your required location
FileUtils.copyFile(sc, new File("E:/kai.jpg"));
System.out.println("screenshot captured");


	}

}
