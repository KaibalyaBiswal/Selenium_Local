package com.automating;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

public class Draganddrop {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
WebElement source=driver.findElement(By.id("draggable"));
WebElement target=driver.findElement(By.id("draggable"));
Actions actions=new Actions(driver);
actions.dragAndDrop(source, target);
actions.build().perform();

	}
}
