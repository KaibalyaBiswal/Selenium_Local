package m18012018;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop 
{
public static void main(String[] args) 
{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://jqueryui.com/");
	driver.manage().window().maximize();
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='sidebar']/aside[1]/ul/li[2]/a"))).click();
	//driver.findElement(By.xpath(".//*[@id='sidebar']/aside[1]/ul/li[2]/a")).click();

	driver.switchTo().frame(driver.findElement(By.xpath(".//*[@id='content']/iframe")));
	WebElement sourceE;WebElement targetE;

sourceE=driver.findElement(By.xpath(".//*[@id='draggable']"));
targetE=driver.findElement(By.xpath(".//*[@id='droppable']"));

Actions act=new Actions(driver);
act.dragAndDrop(sourceE, targetE);
act.build().perform();
System.out.println(driver.getCurrentUrl());


}
}
