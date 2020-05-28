package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntegration 
{
	public static void main(String[] args) throws Throwable 
	{

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "Kaibalya*3");
		System.out.println("Connection Established");
		
		Statement st = con.createStatement();
		System.out.println("Statement Created");
		
		
		ResultSet res = st.executeQuery("select * from details");
		System.out.println("Query Executed");
		
		
		while (res.next()) 
		{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com");
		driver.findElement(By.xpath(".//*[@id='txtuId']")).sendKeys(res.getString("userid"));
		driver.findElement(By.xpath(".//*[@id='txtPword']")).sendKeys(res.getString("password"));
		driver.findElement(By.xpath(".//*[@id='login']")).click();
		System.out.println("Aplication Logged in");
		driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		System.out.println("Application Logged out");
		driver.close();
		}
		
	}
}
