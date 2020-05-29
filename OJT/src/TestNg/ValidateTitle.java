package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ValidateTitle 
{

	@Test
	public void validate()
	{
	
	ExtentReports	report=new ExtentReports("E:/kaibalya.html");
	ExtentTest test = report.startTest("Validate Application");
	
	WebDriver driver=new FirefoxDriver();
	test.log(LogStatus.INFO, "Browser Started");

driver.get("http://facebook.com");
test.log(LogStatus.INFO, "Application is Running");

String acttitle = driver.getTitle();
if (acttitle.equalsIgnoreCase("facebook")) 
{
	test.log(LogStatus.PASS, "Title Matched");
} else 
{
test.log(LogStatus.FAIL, "Title Mismatched");
}
report.endTest(test);
report.flush();



	}
	}
