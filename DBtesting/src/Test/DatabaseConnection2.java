package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class DatabaseConnection2 
{
public static void main(String[] args) throws Throwable 
{
Class.forName("com.mysql.jdbc.Driver");			//package.Class
System.out.println("Driver Loaded");

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trial","root","Kaibalya*3");
System.out.println("Database COnnection Established");

Statement stmt = con.createStatement();
System.out.println("Statement Created");

ResultSet res = stmt.executeQuery("select * from facebook");
System.out.println("Query Executed");



//Java Connection Established

//while(res.next())
//{
//System.out.println(res.getString(1));
//System.out.println(res.getString(2));
//
//}


//Selenium Connection Established

while(res.next())
{
WebDriver driver=new FirefoxDriver();
driver.get("http://facebook.com");
driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(res.getString("userid"));
driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(res.getString("password"));
driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
Sleeper.sleepTightInSeconds(3);
driver.close();


}
}
}
