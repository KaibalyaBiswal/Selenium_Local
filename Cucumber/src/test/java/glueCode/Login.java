package glueCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login 
{

	public static WebDriver driver;
	
	
	@Given("Navigate to login page")
	public void navigate_to_login_page() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
	}

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() 
	{
		driver.findElement(By.id("login_field")).sendKeys("kaibalya.kb@gmail.com");
		driver.findElement(By.id("password")).sendKeys("*******");
		
	}

	@And("click on login button")
	public void click_on_login_button() 
	{
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		
	}

	@Then("It should show the home page")
	public void it_should_show_the_home_page() 
	{
		String currentURL = "https://github.com/";
		Assert.assertEquals("https://github.com/", currentURL);
	}
	
	@And("It should logout the application")
	public void logout() 
	{
		driver.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/summary")).click();
		driver.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/details-menu/form/button")).click();
	}
	
	@And("It should quit the browser")
	public void quit() 
	{
		driver.quit();
		
	}
}
