package com.programme;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Allinone {

	public static void main(String[] args) {

		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Admin");
		driver.findElement(By.name("Submit")).click();
		
////ADMIN		
		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(By.linkText("Admin")));
//		act.build().perform();
//		Sleeper.sleepTightInSeconds(3);
//		act.moveToElement(driver.findElement(By.id("menu_admin_UserManagement")));
//		act.build().perform();
//		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
//		
////		//Sleeper.sleepTightInSeconds(3);
//////		driver.navigate().back();
//////		Sleeper.sleepTightInSeconds(3);
//////		driver.navigate().forward();
////		Sleeper.sleepTightInSeconds(3);
//		
//		driver.findElement(By.xpath("//div[2]/form/fieldset/ol/li[1]/input")).sendKeys("Kaibalya");
//		Select role = new Select(driver.findElement(By.id("searchSystemUser_userType")));
//			role.selectByVisibleText("Admin");
//			Sleeper.sleepTightInSeconds(3);
//			
//		driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Kaibalya Biswal");
//		Select Status = new Select(driver.findElement(By.name("searchSystemUser[status]")));
//			Status.selectByVisibleText("Enabled");
//			
//		driver.findElement(By.id("searchBtn")).click();	
//		Sleeper.sleepTightInSeconds(3);
//		driver.findElement(By.xpath("//div[2]/form/fieldset/p/input[2]")).click();	
//		Sleeper.sleepTightInSeconds(3);
//		
//driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/a")).click();
//
//Sleeper.sleepTightInSeconds(3);
//	driver.findElement(By.id("btnAdd")).click();
//			
//		Select UR = new Select(driver.findElement(By.id("systemUser_userType")));
//		UR.selectByValue("2");
//		
//		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("d");
//		Sleeper.sleepTightInSeconds(3);
//
//		act.sendKeys(Keys.ARROW_DOWN).build().perform();
//		Sleeper.sleepTightInSeconds(3);
//
//		act.sendKeys(Keys.ENTER).build().perform();
//		
//		
//		driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[3]/input")).sendKeys("Kaibalya");
//
//		Select Status1 = new Select(driver.findElement(By.id("systemUser_status")));
//		Status1.selectByValue("0");
//		driver.findElement(By.id("systemUser_password")).sendKeys("Kaibalya");
//		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Kaibalya");
//		driver.findElement(By.id("btnSave")).click();
//		Sleeper.sleepTightInSeconds(3);
//////PIM
//		//optional field
//		driver.findElement(By.linkText("PIM")).click();
//		Sleeper.sleepTightInSeconds(3);
//		act.moveToElement(driver.findElement(By.linkText("Configuration")));
//		act.build().perform();
//		driver.findElement(By.id("menu_pim_configurePim")).click();
//		driver.findElement(By.id("configPim_chkShowSSN")).click();
//		Sleeper.sleepTightInSeconds(3);
//		
		//Custom Fields
		act.moveToElement(driver.findElement(By.id("menu_pim_viewPimModule")));
		act.build().perform();
		act.moveToElement(driver.findElement(By.id("menu_pim_Configuration")));
		act.build().perform();
		driver.findElement(By.id("menu_pim_listCustomFields")).click();
		driver.findElement(By.id("customField_name")).sendKeys("Kaibalya Biswal");
		
	Select screen = new Select(driver.findElement(By.id("customField_screen")));
		screen.selectByVisibleText("Personal Details");
	Select type = new Select(driver.findElement(By.id("customField_type")));
		type.selectByValue("0");
		driver.findElement(By.id("btnSave")).click();
WebElement table = driver.findElement(By.id("customFieldList"));
List<WebElement> rows = table.findElements(By.tagName("tr"));
System.out.println(rows.size()-1);
		
		
		
		
		
	}

}
