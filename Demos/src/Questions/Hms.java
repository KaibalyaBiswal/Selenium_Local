package Questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hms 
{

	public static void main(String[] args) 
	{

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumbymahesh.com/HMS/admission_list.php");
		driver.findElement(By.xpath("html/body/div[2]/div/form/input[1]")).sendKeys("user1");
		driver.findElement(By.xpath("html/body/div[2]/div/form/input[2]")).sendKeys("user1");
		driver.findElement(By.xpath("html/body/div[2]/div/form/input[3]")).click();
		driver.findElement(By.xpath(".//*[@id='navigation']/li[2]/a")).click();
		driver.findElement(By.xpath(".//*[@id='navigation']/li[2]/ul/li[2]/ul/li[2]/a")).click();
		List<WebElement> details = driver.findElements(By.xpath("html/body/div[2]/div/div[2]/table"));
		
		String expid = "102";
System.out.println(details.size());		
		//driver.findElement(By.xpath("html/body/div[2]/div/div[2]/table[2]/tbody/tr/td[10]/a[1]")).click();

	for (int i = 0; i < details.size(); i++) 
	{
	System.out.println(details.get(i).getText());
	
	if (expid.equalsIgnoreCase("102"))  
	{
	driver.findElement(By.xpath("html/body/div[2]/div/div[2]/table[2]/tbody/tr/td[10]/a[1]")).click();
	}
	else
	{
		System.out.println("failed");
	}
	}
	}
	}


