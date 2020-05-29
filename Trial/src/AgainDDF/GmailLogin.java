package AgainDDF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GmailLogin 
{
@Test(dataProvider="datas")
public void login(String username,String password)
{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys(username);
driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
Sleeper.sleepTightInSeconds(5);
driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(password);
driver.findElement(By.xpath(".//*[@id='passwordNext']/content")).click();

driver.close();
}

@DataProvider(name="datas")
public Object[][] data()
{
Object[][] obj=new Object[3][2];

obj[0][0]="**********";
obj[0][1]="*******";

obj[1][0]="nlacalcalkcm";
obj[1][1]="sgsggsgs";

obj[2][0]="vscscsacs";
obj[2][1]="acacacac";

return obj;
}
}
