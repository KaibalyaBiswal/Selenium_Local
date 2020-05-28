package com.programme;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autoit1 {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://my.naukri.com/Profile/view?id=");
		driver.manage().window().maximize();
		driver.findElement(By.id("emailTxt")).sendKeys("kaibalya.kb@gmail.com");
		driver.findElement(By.id("pwd1")).sendKeys("9777262828");
		driver.findElement(By.xpath("//div[2]/div[2]/form/div[7]/input")).click();
		
		driver.findElement(By.xpath("html/body/div[3]/div[2]/div/h2[8]/a")).click();
		
		
		//we can upload a desktop file by using the path of the file(By using sendKeys()) without using AutoIT
		
		driver.findElement(By.xpath(".//*[@id='attachCV']")).sendKeys("C:\\Users\\Kaiii\\Desktop\\Kaibalya_Biswal_QA_Testing.doc");
		driver.findElement(By.xpath(".//*[@id='editForm']/div[7]/button")).click();
		
		
		//driver.findElement(By.xpath("html/body/div[4]/div[3]/div/form/div[1]/p/input[1]")).click();
//		
//		
//		//here we write AutoIt script
//		
//		Runtime.getRuntime().exec("E:\\Eclipse project\\Autoit\\Programme1.exe");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("html/body/div[4]/div[3]/div/form/div[7]/button")).click();
	}

}