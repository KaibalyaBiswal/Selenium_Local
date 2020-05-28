package com.programme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_Window_Handle_again {
	@Test
	public static void Window_Handle() throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		//String parent_window = driver.getWindowHandle();
		// System.out.println(driver.getCurrentUrl());

		driver.findElement(By.xpath("//button[contains(text(),'Open Multiple Windows')]")).click();

		//Set<String> windows=driver.getWindowHandles();
				
		for (String windows : driver.getWindowHandles()) {
			driver.switchTo().window(windows);
			driver.manage().window().maximize();
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
			
			
			//WebElement openhomepage = driver.findElement(By.xpath("//button[contains(text(),'Open Home Page')]"));
			
			/*
			 * if (url!=null) { Thread.sleep(3000); driver.switchTo().window(windows);
			 * driver.manage().window().maximize();
			 * System.out.println(driver.getCurrentUrl()); //driver.findElement(By.xpath(
			 * "/html/body/div/div/div[3]/section/div[1]/div/div/a")).click(); //
			 * System.out.println(driver.getCurrentUrl());
			 * 
			 * }
			 */
		
			}
		

		// driver.switchTo().window(parent_window);
		// System.out.println(driver.getCurrentUrl());

	}

}
