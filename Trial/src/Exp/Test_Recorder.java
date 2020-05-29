package Exp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;

public class Test_Recorder 
{
	WebDriver driver;
	 ATUTestRecorder recorder;

	 @Test
	 public void setup() throws Exception {
	  DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
	  Date date = new Date();
	  //Created object of ATUTestRecorder
	  //Provide path to store videos and file name format.
	  recorder = new ATUTestRecorder("D:\\Movies\\","TestVideo-"+dateFormat.format(date),false);
	  //To start video recording.
	  recorder.start();
	  System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Software\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://google.com/");
	 

	  driver.manage().window().setSize(new Dimension(400,768));
	  Thread.sleep(2000);  
	  
	  driver.manage().window().setSize(new Dimension(400,400));
	  Thread.sleep(2000);
	  
	  driver.manage().window().setSize(new Dimension(1024,400));      
	  
	 
	  driver.quit();
	  //To stop video recording.
	  recorder.stop();;
	 
	}

}
