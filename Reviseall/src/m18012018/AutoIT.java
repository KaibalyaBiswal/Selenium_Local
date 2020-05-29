package m18012018;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoIT 
{
public static void main(String[] args) throws Throwable 
{
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("https://naukri.com");
driver.manage().window().maximize();
driver.findElement(By.xpath(".//*[@id='login_Layer']")).click();
Thread.sleep(2000);
driver.findElement(By.id("eLogin")).sendKeys("kaibalya.kb@gmail.com");
Thread.sleep(2000);
driver.findElement(By.id("pLogin")).sendKeys("9777262828");
Thread.sleep(2000);
driver.findElement(By.xpath(".//*[@id='lgnFrm']/div[8]/button")).click();		
Thread.sleep(2000);

Actions act=new Actions(driver);
act.moveToElement(driver.findElement(By.xpath("html/body/div[1]/div/div/ul[2]/li[2]/a")));
act.build().perform();
Thread.sleep(5000);
driver.findElement(By.xpath("html/body/div[1]/div/div/ul[2]/li[2]/div/ul[1]/li[1]/a")).click();
for (int i = 0; i <= 3; i++) 
{
act.sendKeys(Keys.PAGE_DOWN);
act.build().perform();
}
driver.findElement(By.xpath("//div/div/div/div[2]/div[1]/div/div/ul/li[11]/a")).click();
driver.findElement(By.xpath(".//*[@id='attachCV']")).click();

//AutoIT Execution
Runtime.getRuntime().exec("C:\\Users\\Babuni\\Desktop\\AutoITDemo.exe");


//2nd method to upload a file
//driver.findElement(By.xpath(".//*[@id='attachCV']")).sendKeys("D:\\KAIBALYA BISWAL\\Resumes\\Kaibalya_Biswal_QA_Testing.docx");

}
}