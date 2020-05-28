package com.programme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_Window_Handle {
	@Test
	public static void Window_Handle() throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		//String parent_window = driver.getWindowHandle();
		// System.out.println(driver.getCurrentUrl());

		driver.findElement(By.xpath("//button[contains(text(),'Open Multiple Windows')]")).click();

		for (String windows : driver.getWindowHandles()) {
			//driver.switchTo().window(windows);
			//driver.manage().window().maximize();
			//System.out.println(driver.getCurrentUrl());
			//WebElement openhomepage = driver.findElement(By.xpath("//button[contains(text(),'Open Home Page']"));

			  if (driver.findElement(By.xpath("//button[contains(text(),'Open Home Page')]")).isDisplayed())
			  {
			  
			//  driver.close();
				 System.out.println("main window active");
				 driver.switchTo().window(windows);
				 driver.manage().window().maximize();
				 System.out.println(driver.getCurrentUrl());
				 
				/*
				 * System.out.println("entering second window area");
				 * driver.switchTo().window(windows); driver.manage().window().maximize();
				 * System.out.println(driver.getCurrentUrl());
				 * driver.findElement(By.xpath("//a[contains(text(),'Go to Home Page')]")).click
				 * (); System.out.println(driver.getCurrentUrl()); //driver.close();
				 */
			  } if (driver.findElement(By.xpath("//button[contains(text(),'Open Home Page')]")).isDisplayed()) 
			  {
				  driver.switchTo().window(windows);
					driver.manage().window().maximize();
					System.out.println(driver.getCurrentUrl());
					driver.findElement(By.xpath("//button[contains(text(),'Go to Home Page')]")).click();
					System.out.println(driver.getCurrentUrl());
			}
			  else 
			  { 
				  
				  System.out.println("success"); 
			}
			 
			
		}
		

		// driver.switchTo().window(parent_window);
		// System.out.println(driver.getCurrentUrl());

	}

}
