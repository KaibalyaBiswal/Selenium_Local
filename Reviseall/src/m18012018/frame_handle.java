package m18012018;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame_handle {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
//		WebDriverWait wait = new WebDriverWait(driver,30);

		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("jetblue@grr.la");
		driver.findElement(By.id("passwd")).sendKeys("jetblue");
		driver.findElement(By.id("SubmitLogin")).click();

		// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//a[@title='T-shirts']")));

//click on tshirt link		
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();

//click on the image		
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img")).click();

		// driver.switchTo().frame("fancybox-frame1574439093293");

		int frame_count = driver.findElements(By.tagName("iframe")).size();
		System.out.println(frame_count);

		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/iframe")));

		// WebElement frame =
		// driver.findElement(By.xpath("//iframe[@id='fancybox-frame1574439093293']"));

		// driver.switchTo().frame(frame);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@type='submit' or @name='Submit' or @class='exclusive added']")).click();

		int frame_count1 = driver.findElements(By.tagName("iframe")).size();
		System.out.println(frame_count1);

		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a")).click();
		
		
		String text="Product successfully added to your shopping cart";
		
		String path = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[1]/h2/text()")).getText();
		
		Assert.assertEquals(text, path);
		

        //js.executeScript("window.scrollBy(0,1000)");
		
	
	//	driver.findElement(By.xpath("//*[@class='btn btn-default button button-medium' and @title='Proceed to checkout' or @rel='nofollow']")).click();

	}
}
