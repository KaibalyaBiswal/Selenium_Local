package Questions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;

public class WindowsHandle 
{
public static void main(String[] args) 
{
WebDriver driver=new FirefoxDriver();
driver.get("http://google.com");
driver.manage().window().maximize();
	
	Actions act=new Actions(driver);
	act.contextClick(driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")));
	act.build().perform();
	act.sendKeys(Keys.ARROW_DOWN);
	act.sendKeys(Keys.ARROW_DOWN);
	act.sendKeys(Keys.ENTER);
	act.build().perform();
	
	Set<String> allwindows = driver.getWindowHandles();
	
				Object[] windows = allwindows.toArray();
				
				String window1 = windows[0].toString();
				String window2 = windows[1].toString();
				
				
		driver.switchTo().window(window1);
		driver.findElement(By.id("gb_70")).click();
	
	
	
}
}
