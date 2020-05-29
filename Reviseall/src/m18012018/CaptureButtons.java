package m18012018;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureButtons {

	public static void main(String[] args) 
	{
WebDriver driver=new FirefoxDriver();
driver.get("http://calc.qedgetech.com/");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().window().maximize();
List<WebElement> btn = driver.findElements(By.xpath("//*[@type='button']"));
		System.out.println(btn.size());
		
		
//add numbers in calculator application
		driver.findElement(By.xpath("//*[@value='1']")).click();
	  	driver.findElement(By.xpath("//*[@value='+']")).click();
		driver.findElement(By.xpath("//*[@value='2']")).click();
		driver.findElement(By.xpath("//*[@value='=']")).click();
System.out.println(driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[1]/input")).getAttribute("value"));
		
	}

}
