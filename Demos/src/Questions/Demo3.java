package Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {

	public static void main(String[] args) 
	{

	WebDriver driver=new FirefoxDriver();
	driver.get("https://gethermit.com/books/564881/chapters/1");
	
	driver.manage().window().maximize();
	
	//driver.findElement(By.linkText("Continue with Facebook")).click();
	driver.findElement(By.linkText("Continue with Google")).click();
	
	
	driver.findElement(By.id("identifierId")).sendKeys("kaibalya.kb@gmail.com");	
	driver.findElement(By.className("CwaK9")).click();
	
	
	driver.findElement(By.name("password")).sendKeys("**********");
	driver.findElement(By.className("CwaK9")).click();
	
//to write new line inside a text area
	driver.findElement(By.className("chapter__container")).sendKeys("kaibalya\n biswal");
	
	

	
	
	}

}
