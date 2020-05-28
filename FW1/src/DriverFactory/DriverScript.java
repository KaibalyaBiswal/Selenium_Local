package DriverFactory;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import CommonFunctionLibrary.FunctionLibrary;
import Utilities.ExcelFileUtil;

public class DriverScript 
{

	WebDriver driver;
	ExtentReports report;
	ExtentTest logger;
	
	public void startTest() throws Throwable
	{
		
		ExcelFileUtil excel=new ExcelFileUtil();
		
		//module sheet
		
		for (int i = 1; i <=excel.rowCount("MasterTestCases"); i++) 
		{
			
		
	String ModuleStatus="";
	
		if (excel.getData("MasterTestCases", i, 2).equalsIgnoreCase("Y"))
		{
		
			//Define Module name
			String	TCModule=excel.getData("MasterTestCases", i, 1);
			report=new ExtentReports("./Reports/"+TCModule+".html"+"-"+FunctionLibrary.generateDate());
			
			logger=report.startTest(TCModule);
			
			int rowCount=excel.rowCount(TCModule);
			
			//corresponding sheet
			
			for (int j = 1; j <=rowCount; j++) 
			{
			String Description = excel.getData(TCModule, j, 0);
			String Object_Type = excel.getData(TCModule, j, 1);
			String Locator_Type = excel.getData(TCModule, j, 2);
			String Locator_Value = excel.getData(TCModule, j, 3);
			String Test_Data = excel.getData(TCModule, j, 4);
			
try{
			if (Object_Type.equalsIgnoreCase("startBrowser")) 
			{
   driver = FunctionLibrary.startBrowser(driver);
			}
			if (Object_Type.equalsIgnoreCase("openApplication")) 
			{
				FunctionLibrary.openApplication(driver);
			
			}
            if (Object_Type.equalsIgnoreCase("typeAction")) 
            {
            	FunctionLibrary.typeAction(driver, Locator_Type, Locator_Value, Test_Data);
            }	
				
            if (Object_Type.equalsIgnoreCase("clickAction")) 
            {
            	FunctionLibrary.clickAction(driver, Locator_Type, Locator_Value);	
			}
            
            if (Object_Type.equalsIgnoreCase("waitForElement")) 
            {
            	FunctionLibrary.waitForElement(driver, Locator_Type, Locator_Value, Test_Data);
			}
            
            if (Object_Type.equalsIgnoreCase("CloseApplication")) 
            {
            	FunctionLibrary.closeApplication(driver);	
            	logger.log(LogStatus.INFO,Description);
            }
            if (Object_Type.equalsIgnoreCase("captureData")) 
            {
            	
			FunctionLibrary.captureData(driver, Locator_Type, Locator_Value);
			logger.log(LogStatus.INFO, Description);
			
			}
            if (Object_Type.equalsIgnoreCase("tableValidation")) 
            {
            	FunctionLibrary.tableValidation(driver, Test_Data);
            	logger.log(LogStatus.INFO, Description);
            }
            if (Object_Type.equalsIgnoreCase("moveOverElement")) 
            {
            	FunctionLibrary.moveOverElement(driver, Locator_Type, Locator_Value);
            	logger.log(LogStatus.INFO,Description);
			}
            if (Object_Type.equalsIgnoreCase("tableValidations"))
            {
			FunctionLibrary.tableValidations(driver, Locator_Value, Test_Data);	
			logger.log(LogStatus.INFO,Description);
            }
           if (Object_Type.equalsIgnoreCase("titleValidation")) 
           {
			
        	   FunctionLibrary.titleValidation(driver, Test_Data);
        	   logger.log(LogStatus.INFO,Description);
           } 
           
           
           if (Object_Type.equalsIgnoreCase("conditionValidation")) 
           {
			FunctionLibrary.conditionValidation(driver,Locator_Type, Locator_Value);
			logger.log(LogStatus.INFO, Description);
		}
           
           if (Object_Type.equalsIgnoreCase("dropDown")) 
           {
			FunctionLibrary.dropDown(driver, Locator_Type, Locator_Value, Test_Data);
		   logger.log(LogStatus.INFO, Description);
		}
           
          if (Object_Type.equalsIgnoreCase("dropDownAction")) 
          {
			FunctionLibrary.dropDownAction(driver, Locator_Type, Locator_Value, Test_Data);
			logger.log(LogStatus.INFO, Description);
        	  
		} 
           
        if (Object_Type.equalsIgnoreCase("datePicker")) 
        {
		
        	FunctionLibrary.datePicker(driver, Locator_Value, Test_Data);
        	logger.log(LogStatus.INFO, Description);
        	
		}
    
        excel.setData(TCModule, j, 5, "pass");
            ModuleStatus="true";    
            logger.log(LogStatus.PASS,Description + " PASS");
		
			}

catch(Exception e)
		{
		excel.setData(TCModule, j, 5, "Fail");
		
		ModuleStatus="false";
		
		logger.log(LogStatus.FAIL,Description + " FAIL");	
		
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scrFile, new File("./Screenshots/"+Description+"_"+FunctionLibrary.generateDate()+".jpg"));
		
		String image =logger.addScreenCapture("./Screenshots/"+Description+"_"+FunctionLibrary.generateDate()+".jpg");
		
		logger.log(LogStatus.FAIL, image);
		
		break;
		}
		catch (AssertionError e) 
		{
		excel.setData(TCModule, j, 5, "Fail");
		
		ModuleStatus = "false";

		logger.log(LogStatus.FAIL, Description + " Fail");
		
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scrFile, new File("./Screenshots/"+Description+"_"+FunctionLibrary.generateDate()+".jpg"));
		
		String image =logger.addScreenCapture("./Screenshots/"+Description+"_"+FunctionLibrary.generateDate()+".jpg");

		logger.log(LogStatus.FAIL, image);

		break;
		}

		}

		if (ModuleStatus.equalsIgnoreCase("true")) 
		{
	
		excel.setData("MasterTestCases", i, 3, "pass");
	
		}
		else
		{
		excel.setData("MasterTestCases", i, 3, "fail");	
		}
		}
		
		else
		{
		excel.setData("MasterTestCases", i, 3, "not executed");	
			
		}
		report.endTest(logger);
		report.flush();
		
		}	
			}
		
			  }
			    
	

