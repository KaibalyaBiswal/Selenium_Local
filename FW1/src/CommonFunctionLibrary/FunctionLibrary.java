package CommonFunctionLibrary;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import Utilities.PropertyFileUtil;

public class FunctionLibrary 						//this is the 3rd class connected with the 2nd class PropertyFileUtil 
{													//here we are creating the common functions(actions perform)

	
	//For start Browser
	
public static WebDriver startBrowser(WebDriver driver) throws Throwable, Throwable
	{
	
if (PropertyFileUtil.getValueForKey("Browser").equalsIgnoreCase("Firefox")) 
{
driver=new FirefoxDriver();	
}		
else
	if (PropertyFileUtil.getValueForKey("Browser").equalsIgnoreCase("chrome")) 
	{
		System.setProperty("webdriver.chrome.driver", "CommonJarFiles/chromedriver.exe");
	driver=new ChromeDriver();
	}
		
	else
		if (PropertyFileUtil.getValueForKey("Browser").equalsIgnoreCase("IE")) 
		{
			System.setProperty("webdriver.ie.driver","CommonJarFiles/IEDriverServer.exe");
		driver=new InternetExplorerDriver();

		}

return driver;
	}
	
	//Open Application

	public static void openApplication(WebDriver driver) throws Throwable, Throwable
	{
	driver.manage().window().maximize();
	driver.get(PropertyFileUtil.getValueForKey("URL"));
	}
	
	//Close Application
	
public static void closeApplication(WebDriver driver)
{
driver.close();

}

	//Click Action

public static void clickAction(WebDriver driver,String locatorType,String locatorValue)
{
	if (locatorType.equalsIgnoreCase("id")) 
	{
	driver.findElement(By.id(locatorValue)).click();	
	}
	else
		if (locatorType.equalsIgnoreCase("name")) 
		{
		driver.findElement(By.name(locatorValue)).click();	
		}
		else
			if (locatorType.equalsIgnoreCase("xpath")) 
			{
			driver.findElement(By.xpath(locatorValue)).click();	
			}

}

	//Type Action

public static void typeAction(WebDriver driver, String locatorType,String locatorValue,String data)
{
	
if (locatorType.equalsIgnoreCase("id")) 
{
	driver.findElement(By.id(locatorValue)).clear();
	driver.findElement(By.id(locatorValue)).sendKeys(data);
}	
else
	if (locatorType.equalsIgnoreCase("name")) 
	{
	driver.findElement(By.name(locatorValue)).clear();
	driver.findElement(By.name(locatorValue)).sendKeys(data);
	}
	else
		if (locatorType.equalsIgnoreCase("xpath")) 
		{
		driver.findElement(By.xpath(locatorValue)).clear();
		driver.findElement(By.xpath(locatorValue)).sendKeys(data);
		}
}

	//Wait For Element

public static void waitForElement(WebDriver driver,String locatorType,String locatorValue,String waitTime)

{
WebDriverWait wait=new WebDriverWait(driver,Integer.parseInt(waitTime) );

if (locatorType.equalsIgnoreCase("id")) 
{
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorValue)));
}
else
	if (locatorType.equalsIgnoreCase("name")) 
	{
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorValue)));	
	}

	else
		if (locatorType.equalsIgnoreCase("xpath")) 
		{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorValue)));
		}
}

	//Capture Data

public static void captureData(WebDriver driver, String locatorType, String locatorValue) throws Throwable
{
	String data = "";
	
	if(locatorType.equalsIgnoreCase("id"))
	{
		data = driver.findElement(By.id(locatorValue)).getAttribute("value");
	}
	else
		if(locatorType.equalsIgnoreCase("xpath"))
		{
			data = driver.findElement(By.xpath(locatorValue)).getAttribute("value");
		}
	
	FileWriter fr = new FileWriter("./CapturedData/Data.txt");
	
	BufferedWriter br = new BufferedWriter(fr);
	
	br.write(data);
	
	br.flush();
	
	br.close();		
}

	//Table Validation

public static void tableValidation(WebDriver driver, String colNum) throws Throwable
{
	FileReader fr = new FileReader("./CapturedData/Data.txt");
	
	BufferedReader br = new BufferedReader(fr);
	
	String exp_data = br.readLine();
	
	// String to int
	int colNum1 = Integer.parseInt(colNum);
	
	
	if(driver.findElement(By.xpath(PropertyFileUtil.getValueForKey("Search.box"))).isDisplayed())
	{
		driver.findElement(By.xpath(PropertyFileUtil.getValueForKey("Search.box"))).clear();
	
		driver.findElement(By.xpath(PropertyFileUtil.getValueForKey("Search.box"))).sendKeys(exp_data);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(PropertyFileUtil.getValueForKey("Search.btn"))).click();
		
		Thread.sleep(2000);
	}
	else
	{
		driver.findElement(By.xpath(PropertyFileUtil.getValueForKey("Search.panel"))).click();
		
		driver.findElement(By.xpath(PropertyFileUtil.getValueForKey("Search.box"))).clear();
		
		driver.findElement(By.xpath(PropertyFileUtil.getValueForKey("Search.box"))).sendKeys(exp_data);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(PropertyFileUtil.getValueForKey("Search.btn"))).click();
		
		Thread.sleep(2000);
	}
	
	
	WebElement webtable = driver.findElement(By.xpath(PropertyFileUtil.getValueForKey("Webtable.path")));
	
	List<WebElement> rows = webtable.findElements(By.tagName("tr"));
	
	for(int i=1;i<=rows.size();i++)
	{
		String act_data = driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/form/div/div//table[@class='table ewTable']/tbody/tr["+i+"]/td["+colNum1+"]/div/span/span")).getText();
	
		Assert.assertEquals(act_data, exp_data);
		
		break;
	}
}

	//Move Over Element

public static void moveOverElement(WebDriver driver, String locatorType,String locatorValue)
{
	Actions act=new Actions(driver);
	
	if(locatorType.equalsIgnoreCase("id"))
	{
		
		act.moveToElement(driver.findElement(By.id(locatorValue))).build().perform();
		
	}
	else
		if(locatorType.equalsIgnoreCase("xpath"))
		{
			
			act.moveToElement(driver.findElement(By.xpath(locatorValue))).build().perform();
			
		
		}
}

public static void tableValidations(WebDriver driver, String colNum,String exp_data) throws Throwable
{
	
	// String to int
	int colNum1 = Integer.parseInt(colNum);
	
	
	if(driver.findElement(By.xpath(PropertyFileUtil.getValueForKey("Search.box"))).isDisplayed())
	{
		driver.findElement(By.xpath(PropertyFileUtil.getValueForKey("Search.box"))).clear();
	
		driver.findElement(By.xpath(PropertyFileUtil.getValueForKey("Search.box"))).sendKeys(exp_data);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(PropertyFileUtil.getValueForKey("Search.btn"))).click();
		
		Thread.sleep(2000);
	}
	else
	{
		driver.findElement(By.xpath(PropertyFileUtil.getValueForKey("Search.panel"))).click();
		
		driver.findElement(By.xpath(PropertyFileUtil.getValueForKey("Search.box"))).clear();
		
		driver.findElement(By.xpath(PropertyFileUtil.getValueForKey("Search.box"))).sendKeys(exp_data);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(PropertyFileUtil.getValueForKey("Search.btn"))).click();
		
		Thread.sleep(2000);
	}
	
	
	WebElement webtable = driver.findElement(By.xpath(PropertyFileUtil.getValueForKey("Webtable.path")));
	
	List<WebElement> rows = webtable.findElements(By.tagName("tr"));
	
	for(int i=1;i<=rows.size();i++)
	{
		String act_data = driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/form/div/div//table[@class='table ewTable']/tbody/tr["+i+"]/td["+colNum1+"]/div/span/span")).getText();
	
		Assert.assertEquals(act_data, exp_data);
		
		break;
	}
}

	//Title Validation

public static void titleValidation(WebDriver driver,String exp_title)
{
	
String act_title = driver.getTitle();

	Assert.assertEquals(act_title, exp_title);
	
}

	//Generate Date

public static String generateDate()
{
	
	Date date= new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("YYYY_MMM_DD_SS");
	return	sdf.format(date);

}

	//Condition Validation

public static void conditionValidation(WebDriver driver, String locatorType, String locatorValue) throws Throwable
{
	
	String act_text = "";
	
	String duplicateData = "";
	
	if(locatorType.equalsIgnoreCase("id"))
	{
		act_text = driver.findElement(By.id(locatorValue)).getText();
	}
	else
		if(locatorType.equalsIgnoreCase("name"))
		{
			act_text = driver.findElement(By.name(locatorValue)).getText();
		}
		else
			if(locatorType.equalsIgnoreCase("xpath"))
			{
				act_text = driver.findElement(By.xpath(locatorValue)).getText();
			}
	
	if(act_text.contains("Duplicate primary key"))
	{
		int min=0, max=9999999;
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(PropertyFileUtil.getValueForKey("Second_OK"))).click();
	
		int randomNum = min + (int)(Math.random() * max);			
		
		duplicateData = String.valueOf(randomNum);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(PropertyFileUtil.getValueForKey("UOM_Id"))).clear();
		
					
		driver.findElement(By.xpath(PropertyFileUtil.getValueForKey("UOM_Id"))).sendKeys(duplicateData);

}
}

	//DropDown

public static void dropDown(WebDriver driver, String locatorType, String locatorValue, String data)
{
	if(locatorType.equalsIgnoreCase("id"))
	{
		new Select(driver.findElement(By.id(locatorValue))).selectByVisibleText(data);
	}
	else
		if(locatorType.equalsIgnoreCase("name"))
		{
			new Select(driver.findElement(By.name(locatorValue))).selectByVisibleText(data);
		}
		else
			if(locatorType.equalsIgnoreCase("xpath"))
			{
				new Select(driver.findElement(By.xpath(locatorValue))).selectByVisibleText(data);
			}
}

	//DropDown Action

public static void dropDownAction(WebDriver driver, String locatorType, String locatorValue, String data) throws Exception
{
	Actions action = new Actions(driver);
	
	if(locatorType.equalsIgnoreCase("id"))
	{
		WebElement element = driver.findElement(By.id(locatorValue));
		
		action.moveToElement(element).perform();
		
		Thread.sleep(2000);
		
		action.click().sendKeys(data).sendKeys(Keys.ENTER).build().perform();
	}
	else
		if(locatorType.equalsIgnoreCase("xpath"))
		{
			WebElement element = driver.findElement(By.xpath(locatorValue));
			
			action.moveToElement(element).perform();
			
			Thread.sleep(2000);
			
			action.click().sendKeys(data).sendKeys(Keys.ENTER).build().perform();
		}
		else
			if(locatorType.equalsIgnoreCase("name"))
			{
				WebElement element = driver.findElement(By.name(locatorValue));
				
				action.moveToElement(element).perform();
				
				Thread.sleep(2000);
				
				action.click().sendKeys(data).sendKeys(Keys.ENTER).build().perform();
			}
}

	//Date Picker

public static void datePicker(WebDriver driver, String locatorValue, String date)
{
	
	((JavascriptExecutor)driver).executeScript("document.getElementById('"+locatorValue+"').value='"+date+"'");

}

}


