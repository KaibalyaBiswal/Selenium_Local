package Questions;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) 
	{

		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();

//convert web driver object to TakeScreenshot 
		TakesScreenshot scrshot = ((TakesScreenshot)driver);

//Call getScreenshotAs method to create image file		
		File srcfile = scrshot.getScreenshotAs(OutputType.FILE);
		
//		destfile=new File(File)
		
		
		
						//not executed
		
	}

}
