package m18012018;

import org.openqa.selenium.opera.OperaDriver;

public class LunchOpera 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.opera.driver","E:\\Selenium\\Software\\operadriver_win64\\operadriver_win64\\operadriver.exe");
OperaDriver driver = new OperaDriver();
driver.navigate().to("http://google.com");
	
	
}
}
