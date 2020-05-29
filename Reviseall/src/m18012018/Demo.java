package m18012018;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) 
	{
WebDriver driver=new FirefoxDriver();
driver.get("http://google.com");

driver.findElement(By.id("lst-ib")).sendKeys("hindisongs");
driver.findElement(By.name("btnK")).click();


		
		
		
	}

}
