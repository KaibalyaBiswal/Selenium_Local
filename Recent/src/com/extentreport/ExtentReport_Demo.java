package com.extentreport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport_Demo 
{

	@Test
	public void test_report() throws Throwable
	{
		
		System.out.println("Creating script for extent report");
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/reportLog3.html");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		ExtentTest logger = extent.createTest("testing_demo_report");
		
		logger.log(Status.PASS, "Demo Pass");
		logger.log(Status.FAIL, "Demo Fail");
	
	
//Attach screenshot to the report
	//1st method
		//logger.addScreenCaptureFromPath("C:\\Users\\kaiba\\OneDrive\\Desktop\\Annotation 2020-04-24 211826.png");
		
	//2nd method
		logger.fail("screenShotAttached", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\kaiba\\OneDrive\\Desktop\\Annotation 2020-04-24 211826.png").build());
		extent.flush();//this is mandatory other wise it will create the report in the given location
	}
			
}
