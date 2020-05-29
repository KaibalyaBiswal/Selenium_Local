package AgainDDF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class DataProvider 
{
@Test(dataProvider="inputdata")
public void ohrm(String uid,String pwd)
{
System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://orangehrm.qedgetech.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("txtUsername")).clear();
	driver.findElement(By.id("txtUsername")).sendKeys(uid);
	driver.findElement(By.id("txtPassword")).clear();
	driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	driver.findElement(By.id("btnLogin")).click();
		driver.close();
}


@org.testng.annotations.DataProvider(name="inputdata")
public Object[][] datas()
{
Object[][] data = new Object[3][2];	
data[0][0]="Admin";
data[0][1]="Admin";

data[1][0]="Admin";
data[1][1]="admin";

data[2][0]="admin";
data[2][1]="admin";
return data;
}

}
