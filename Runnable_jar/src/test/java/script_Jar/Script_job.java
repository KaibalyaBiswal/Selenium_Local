package script_Jar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_job 
{

	@Test
	public void invokeBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.co.in");
		driver.findElement(By.name("q")).sendKeys("kaibalya Biswal");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		driver.quit();
		
	}
}
