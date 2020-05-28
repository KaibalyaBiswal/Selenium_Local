package com.kai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Gmailaction {
public static void main(String[] args) 
{
WebDriver driver=new FirefoxDriver();
driver.get("http://google.com");
driver.findElement(By.linkText("Gmail")).click();
driver.findElement(By.id("identifierId")).sendKeys("kaibalya.kb@gmail.com");
driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
Sleeper.sleepTightInSeconds(5);
driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("**********");
driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();


}

}
