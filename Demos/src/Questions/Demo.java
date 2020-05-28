package Questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		
//Syntax- http://username:password@url
		
		driver.get("http://username:password@url");
		
		
	}

}

//How to login into any site if its showing any authetication popup for user name and pass ?