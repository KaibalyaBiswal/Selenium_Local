package m18012018;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Primusbank {
public static void main(String[] args) 
{

	WebDriver driver=new FirefoxDriver();
	driver.get("http://primusbank.qedgetech.com");

//select class
Select brlist=new Select(driver.findElement(By.id("drlist")));
	brlist.selectByVisibleText("ameerpet");
	
	driver.findElement(By.name("txtuId")).sendKeys("Admin");
	driver.findElement(By.id("txtPword")).sendKeys("Admin");
	driver.findElement(By.xpath("//table[2]/tbody/tr[2]/td/table/tbody/tr[5]/td/div/input")).click();

//finds links
	
	driver.findElement(By.linkText("Site Map")).click();
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	
//print the links name
	for (int i = 0; i < links.size(); i++) 
	{
System.out.println(links.get(i).getText());
		
	}
}
}
