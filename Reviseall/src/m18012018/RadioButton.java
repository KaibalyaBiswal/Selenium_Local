package m18012018;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton 
{
public static void main(String[] args) 
{
WebDriver driver=new FirefoxDriver();
driver.get("https://cleartrip.com");
driver.manage().window().maximize();
List<WebElement> radios=driver.findElements(By.xpath(" .//*[@id='SearchForm']/nav/ul/li/label/strong"));
System.out.println(radios.size());

String expradio = "Round trip";

for (int i = 0; i <radios.size(); i++) 
{
String actradio = radios.get(i).getText();
if (expradio.equalsIgnoreCase(actradio)) 
{
System.out.println("Radio Button Matched");
} else {
System.out.println("Radio Button Don't Matched");
}
}


}
}
