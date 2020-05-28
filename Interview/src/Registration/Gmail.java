package Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Gmail 
{
public static void main(String[] args) 
{
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://gmail.com");
driver.findElement(By.xpath(".//*[@id='ow211']/content/span")).click();
Sleeper.sleepTightInSeconds(5);
driver.findElement(By.xpath(".//*[@id='initialView']/div[2]/div[3]/div/div/content[1]/div[2]/div")).click();
Sleeper.sleepTightInSeconds(5);
driver.findElement(By.id("FirstName")).sendKeys("kaibalya");
driver.findElement(By.id("LastName")).sendKeys("Biswal");
driver.findElement(By.id("GmailAddress")).sendKeys("kaibalya.kai333@gmail.com");
driver.findElement(By.id("Passwd")).sendKeys("Kaibalya*3");
driver.findElement(By.id("PasswdAgain")).sendKeys("Kaibalya*3");
driver.findElement(By.xpath("//*[normalize-space(.)='Month']")).click();
Sleeper.sleepTightInSeconds(5);

Actions act=new Actions(driver);
act.sendKeys(Keys.ARROW_DOWN);
act.sendKeys(Keys.ENTER);
act.build().perform();

driver.findElement(By.id("BirthDay")).sendKeys("10");
driver.findElement(By.id("BirthYear")).sendKeys("1990");
driver.findElement(By.xpath("//*[normalize-space(.)='I am...']")).click();

act.sendKeys(Keys.ARROW_UP);
act.sendKeys(Keys.ENTER);
act.build().perform();

driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("7008470453");
driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("kaibalya.kb@gmail.com");

driver.findElement(By.id(":i")).click();
act.sendKeys(Keys.ARROW_DOWN);
act.sendKeys(Keys.ARROW_DOWN);
act.sendKeys(Keys.ENTER);
act.build().perform();
Sleeper.sleepTightInSeconds(3);

act.doubleClick(driver.findElement(By.xpath("//*[@name='submitbutton']")));
act.build().perform();
Sleeper.sleepTightInSeconds(3);
act.sendKeys(Keys.PAGE_DOWN);
act.sendKeys(Keys.PAGE_DOWN);
act.sendKeys(Keys.PAGE_DOWN);
act.build().perform();

Sleeper.sleepTightInSeconds(3);
driver.findElement(By.id("iagreebutton")).click();


}
}
