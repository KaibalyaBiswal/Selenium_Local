package com.programme;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AssertEquals {
	@Test
	public void test1() {
		String exptitle, acttitle;
		exptitle = "Gmail";
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.findElement(By.linkText("Gmail")).click();
		acttitle = driver.getTitle();
		assertEquals(exptitle, acttitle);

	}
}