package com.automatingKM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendar3 {

	String date = "20/oct/2020";
	String[] temp= date.split("/");
	static String dt;
	String month;
	String year;{
	dt=temp[0];
	month=temp[1];
	year=temp[2];}
	
	public static void main(String[] args) 
	{

		WebDriver driver=new FirefoxDriver();
		
driver.get("http://orangehrm.qedgetech.com");
driver.findElement(By.id("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin");
driver.findElement(By.id("btnLogin")).click();

driver.findElement(By.linkText("Recruitment")).click();
driver.findElement(By.linkText("Candidates")).click();
driver.findElement(By.id("candidateSearch_fromDate")).click();

Select mlist= new Select(driver.findElement(By.className("ui-datepicker-month")));
mlist.selectByVisibleText("month");

Select ylist=new Select(driver.findElement(By.className("ui-datepicker-year")));
ylist.selectByVisibleText("year");

WebElement table;
table=driver.findElement(By.className("ui-datepicker-calender"));

List<WebElement> rows,cols;
rows=table.findElements(By.tagName("tr"));

boolean flag=false;
for(int i=1;i<rows.size();i++)
{
cols=rows.get(i).findElements(By.tagName("td"));
for(int j=0;j<cols.size();j++)
{
	String caldate=cols.get(j).getText();
	if(caldate.equals(dt))
	{
		cols.get(j).click();
		flag=true;
		break;
		
	}
}


}

	}
	
}

