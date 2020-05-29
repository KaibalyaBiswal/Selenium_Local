package m18012018;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Browsernavigate {
public static void main(String[] args) {
WebDriver driver=new FirefoxDriver();
driver.get("http://google.com");

driver.findElement(By.className("gsfi")).sendKeys("facebook");
driver.findElement(By.name("btnK")).click();
driver.navigate().back();

driver.navigate().forward();

Actions act=new Actions(driver);
act.moveToElement(driver.findElement(By.xpath("//div/div[2]/div[2]/div/div/div/div[2]/div/div/div/h3/a"))).contextClick();
act.sendKeys(Keys.ARROW_DOWN);
act.sendKeys(Keys.ARROW_DOWN);
act.sendKeys(Keys.ENTER);
act.build().perform();

driver.close();
driver.quit();
}
}
