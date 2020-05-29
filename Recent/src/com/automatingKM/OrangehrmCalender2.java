package com.automatingKM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class OrangehrmCalender2 {

	public static void main(String[] args) 
	{

		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://orangehrm.qedgetech.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("Recruitment")).click();
		driver.findElement(By.partialLinkText("Candidates")).click();

		driver.findElement(By.xpath("//div[2]/form/fieldset/ol/li[7]/input")).click();

Select year = new Select(driver.findElement(By.className("ui-datepicker-month")));
year.selectByVisibleText("Mar");

Select month = new Select(driver.findElement(By.className("ui-datepicker-year")));
month.selectByValue("1994");		

List<WebElement> table = driver.findElements(By.className("ui-datepicker-calendar"));
WebElement rows = driver.findElement(By.tagName("tr"));
rows.findElement(By.xpath("html/body/div[4]/table/tbody/tr[5]/td[4]/a")).click();		
	
	//not executed



	}

}
