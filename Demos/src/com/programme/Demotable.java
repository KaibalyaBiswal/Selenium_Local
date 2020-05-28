package com.programme;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demotable {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com");
	
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
	Actions act = new Actions(driver);	
	act.moveToElement(driver.findElement(By.id("menu_admin_viewAdminModule")));
	act.build().perform();

	act.moveToElement(driver.findElement(By.linkText("User Management")));
	act.build().perform();
	driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
	WebElement table = driver.findElement(By.id("resultTable"));
	List<WebElement> rows = table.findElements(By.tagName("tr"));
	System.out.println(rows.size());
	String cols = rows.get(1).getText();
	System.out.println(cols);
	
	
		//not executed
	}

}
