package com.automatingKM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender 
{
public static void main(String[] args) 
{
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("http://redbus.in");
driver.manage().window().maximize();
driver.findElement(By.id("src")).sendKeys("bhu");

List<WebElement> cities = driver.findElements(By.xpath("//section/div/div[1]/div/ul/li"));
cities.get(0).click();

driver.findElement(By.id("dest")).sendKeys("hyd");

List<WebElement> dcities = driver.findElements(By.xpath("//section/div/div[2]/div/ul/li"));
dcities.get(0).click();


driver.findElement(By.xpath("//section/div/div[3]/div/input")).click();
driver.switchTo().frame(driver.findElement(By.xpath("html/body/div[7]")));
 
driver.findElement(By.className("monthTitle")).click();

driver.findElement(By.xpath("html/body/div[7]/table/tbody/tr[7]/td[1]")).click();
//List<WebElement> cal = driver.findElements(By.id("html/body/div[7]"));
//driver.findElement(By.xpath("html/body/div[7]/table/tbody/tr[1]/td[2]")).click();
//driver.findElement(By.xpath("html/body/div[7]/table/tbody/tr[7]/td[1]")).click();

//System.out.println(cities.size());	

    //	for (int i = 0; i < cities.size(); i++) 
	{
	
	//String	cityname=cities.get(i).getText();
	//System.out.println(cityname);
    //cities.get(3).click();//
	}
	
}
}
