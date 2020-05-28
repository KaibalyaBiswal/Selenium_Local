package com.programme;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestNgTest {

	@Test(priority = 0)
	public void sendMail() {
		System.out.println("Send Mail Test");
	}

	@Test(priority = 1)
	public static void receiveMail() {
		System.out.println("Receive Mail Test");
	}

	@BeforeMethod
	public void login() {
		System.out.println("GMail Login");
	}

	@AfterMethod
	public void logout() {
		System.out.println("GMail Logout");
	}

	@BeforeClass
	public void launchApp() {
		System.out.println("Launch GMail App");
	}

	@AfterClass
	public void closeApp() {
		System.out.println("Close GMail App");
	}

	@BeforeTest
	public void deleteCoockies() {
		System.out.println("Deleting Coockies");
	}

	@AfterTest
	public void closeallBrowsers() {
		System.out.println("Close All Browsers");
	}

	@BeforeSuite
	public void initWebdriver() {
		System.out.println("Initialize WebDriver");
	}

	@AfterSuite
	public void killWebdriver() {
		System.out.println("Killing Webdriver Object");
	}

}
