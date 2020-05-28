package Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class GmailCheck 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
driver.get("http://gmail.com");
driver.findElement(By.xpath("//*[@id='ow212']/content/span")).click();
driver.findElement(By.xpath("//*[@id='initialView']/div[2]/div[3]/div/div/content[1]/div[2]/div")).click();



//		In Gmail element get changing when we are running in selenium






}
}
