package m18012018;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotDemo 
{
public static void main(String[] args) throws Throwable 
{
WebDriver driver=new FirefoxDriver();
driver.get("http://google.com");

File sc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(sc, new File("E:\\google.jpg"));
}
}
