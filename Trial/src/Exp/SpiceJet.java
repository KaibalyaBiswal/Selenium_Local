package Exp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class SpiceJet 
{
public static void main(String[] args) 
{
WebDriver driver=new FirefoxDriver();
driver.get("http://spicejet.com");
Sleeper.sleepTightInSeconds(3);
List<WebElement> radio = driver.findElements(By.xpath(".//*[@id='ctl00_mainContent_rbtnl_Trip']/tbody/tr/td/label"));
System.out.println(radio.size());
for (int i = 0; i < radio.size(); i++) 
{
System.out.println(radio.get(i).getText());
}

//For finding Check box as well as those names
List<WebElement> check = driver.findElements(By.xpath("//*[starts-with(@for,'ctl00_mainContent_chk')]"));
System.out.println(check.size());

for (int i = 0; i < check.size(); i++) 
{
System.out.println(check.get(i).getText());
		
}


WebElement value = driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']"));

System.out.println(value.getText()
		);

}
}
