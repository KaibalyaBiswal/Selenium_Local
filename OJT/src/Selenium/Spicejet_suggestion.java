package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Spicejet_suggestion {

	public static void main(String[] args) 
	{

		WebDriver driver=new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
//->	driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[2]/li[6]/a")).click();						// method 1
		
//->	Actions act = new Actions(driver);	
//		act.click(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")));			// method 2
//		act.sendKeys(Keys.ARROW_DOWN);
//		act.sendKeys(Keys.ARROW_DOWN);
//		act.sendKeys(Keys.ENTER);
//		act.build().perform();
		
//	driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).sendKeys("hyderabad");	// method3
		
		
		
		
//		Sleeper.sleepTightInSeconds(3);
//	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("h");
//	Sleeper.sleepTightInSeconds(3);			
//driver.findElement(By.partialLinkText("Hyderabad")).click();															//its selecting hyderabad but not clicking
		
		
//		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).sendKeys("h");
//		Sleeper.sleepTightInSeconds(3);																					//not working	
//		driver.findElement(By.xpath("//*[normalize-space()=' Hyderabad (HYD)']")).click();

		
		
		//		Sleeper.sleepTightInSeconds(3);	
//	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("h");
//	Sleeper.sleepTightInSeconds(5);
//	List<WebElement> cities = driver.findElements(By.xpath(".//*[@id='dropdownGroup1']/div/ul[2]/li[1]/a/li"));	
//	for (WebElement element : cities) 
//	{																													//not working
//	if (element.getText().equalsIgnoreCase(" Hyderabad (HYD)")) 
//	{
//	element.click();
//	}	
//	}
	
//		WebElement cities = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
//		List<WebElement> allnames = cities.findElements(By.tagName("li"));
//		for (WebElement city : allnames) 
//		{
//			List<WebElement> pcity = city.findElements(By.tagName("a"));
//			for (WebElement particualarcity : pcity) 																	//not working
//			{
//			if (particualarcity.getText().equalsIgnoreCase(" Hyderabad (HYD)")) 
//			{
//				particualarcity.click();
//			}	
//			}
//		}

			
		
		
	
			}
}
