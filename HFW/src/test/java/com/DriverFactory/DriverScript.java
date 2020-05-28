package com.DriverFactory;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.CommonFunctionLibrary.FunctionLibrary;
import com.Utilities.ExcelFileUtil;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DriverScript 
{
	ExtentReports report;
	WebDriver driver;
	ExtentTest logger;
	
public void statrTest() throws Throwable
{
	ExcelFileUtil excel=new ExcelFileUtil();

for (int i = 1; i < excel.rowCount("MasterTestCases"); i++) 
{

	String ModuleStatus="";
	
if (excel.getData("MasterTestCases", i, 2).equalsIgnoreCase("Y")) 
{
	//Define Module Name
String TCModule=excel.getData("MasterTestCases", i, 1);	
report = new ExtentReports(".\\Reports"+TCModule+".html"+"_"+FunctionLibrary.generateDate());	
logger = report.startTest(TCModule);	

int rowcount=excel.rowCount(TCModule);

	//Corresponding Sheet

for (int j = 1; j < rowcount; j++) 
{
String Description=excel.getData(TCModule, j, 0);	
String Object_Type=excel.getData(TCModule, j, 1);
String Locator_Type=excel.getData(TCModule, j, 2);
String Locator_Value=excel.getData(TCModule, j, 3);
String Test_Data=excel.getData(TCModule, j, 4);

try 
{
	if (Object_Type.equalsIgnoreCase("startBrowser")) 
	{
	driver=FunctionLibrary.startBrowser(driver);
	}
	if (Object_Type.equalsIgnoreCase("openApplication")) 
	{
	FunctionLibrary.openApplication(driver);	
	}
	if (Object_Type.equalsIgnoreCase("typeAction")) 
	{
	FunctionLibrary.typeAction(driver, Locator_Type, Locator_Value, Test_Data);	
	}
	if (Object_Type.equalsIgnoreCase("clickActon")) 
	{
	FunctionLibrary.clickActon(driver, Locator_Type, Locator_Value);
	}
	if (Object_Type.equalsIgnoreCase("closeApplication")) 
	{
	FunctionLibrary.closeApplication(driver);	
	}
	if (Object_Type.equalsIgnoreCase("waitForElement")) 
	{
	FunctionLibrary.waitForElement(driver, Locator_Type, Locator_Value, Test_Data);
	}
	if (Object_Type.equalsIgnoreCase("captureData")) 
	{
	FunctionLibrary.captureData(driver, Locator_Type, Locator_Value);	
	}
	if (Object_Type.equalsIgnoreCase("moveOverElement")) 
	{
	FunctionLibrary.captureData(driver, Locator_Type, Locator_Value);	
	}
	if (Object_Type.equalsIgnoreCase("titleValidation")) 
	{
	FunctionLibrary.titleValidation(driver, Test_Data);	
	}
	if (Object_Type.equalsIgnoreCase("dropDown")) 
	{
	FunctionLibrary.dropDown(driver, Locator_Type, Locator_Value, Test_Data);	
	}
	if (Object_Type.equals("datePicker")) 
	{
	FunctionLibrary.datePicker(driver, Locator_Value, Test_Data);	
	logger.log(LogStatus.INFO, Description);
	}
	
excel.setData(TCModule, j, 5, "pass");	
ModuleStatus="true";
logger.log(LogStatus.PASS, Description+"pass");	

}


catch (Exception e) 
{
excel.setData(TCModule, j, 5, "fail");
ModuleStatus="false";
logger.log(LogStatus.FAIL, Description+"fail");	
File sc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(sc, new File(".\\ScreenShot"+Description+"_"+FunctionLibrary.generateDate()+".jpg"));
String image = logger.addScreenCapture(".\\ScreenShot"+Description+"_"+FunctionLibrary.generateDate()+".jpg");

logger.log(LogStatus.FAIL, image);

break;
}
}

if (ModuleStatus.equalsIgnoreCase("true")) 
{
excel.setData("MasterTestCases", i, 3, "pass");
}else
	if (ModuleStatus.equalsIgnoreCase("fail")) 
	{
	excel.setData("MasterTestCases", i, 3, "fail");	
	}
}	

else
{
	excel.setData("MasterTestCases", i, 3, "notExecuted");
}

report.endTest(logger);
report.flush();

}
}
}
