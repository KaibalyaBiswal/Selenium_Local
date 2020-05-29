package com.automatingKM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangehrmCalender 
{
public static void main(String[] args) 
{
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("http://orangehrm.qedgetech.com");
driver.findElement(By.id("txtUsername")).sendKeys("ADMIN");
driver.findElement(By.id("txtPassword")).sendKeys("admin");
driver.findElement(By.id("btnLogin")).click();

driver.findElement(By.linkText("Recruitment")).click();
driver.findElement(By.linkText("Candidates")).click();
driver.findElement(By.id("candidateSearch_fromDate")).click();

Select mlist=new Select(driver.findElement(By.className("ui-datepicker-month")));	
	mlist.selectByVisibleText("Mar");

Select ylist=new Select(driver.findElement(By.className("ui-datepicker-year")));
	ylist.selectByValue("2030");
			
driver.findElement(By.xpath("html/body/div[4]/table/tbody/tr[5]/td[5]/a")).click();


							//I have to check this programme again
}
}
