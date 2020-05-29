package m18012018;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkCText {

	public static void main(String[] args) 
	{
WebDriver driver=new FirefoxDriver();
driver.navigate().to("http://google.com");
driver.findElement(By.linkText("Gmail")).click();		
	}

}
