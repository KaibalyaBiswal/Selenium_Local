package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JavaSeleniumConnection {

	public static void main(String[] args) throws Throwable 
	{
Class.forName("com.mysql.jdbc.Driver");
System.out.println("Driver Loaded");


Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kaibalya", "root", "Kaibalya*3");
System.out.println("Database Connection Established");

Statement st = con.createStatement();
System.out.println("Statement Created");

ResultSet rs = st.executeQuery("select * from details");
	System.out.println("Query Executed");

//interacting with Java
	
	//while (rs.next()) 
	//{
	//System.out.println(rs.getString("id"));
	//System.out.println(rs.getString("name"));
	//System.out.println(rs.getString("mob"));
	
	//}	
	
	
//interacting with Selenium
	
//	while (rs.next()) 
//	{
//	WebDriver driver=new FirefoxDriver();
//	driver.get("http://facebook.com");
//	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(rs.getString("name"));
//	driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(rs.getString("mob"));
//	Sleeper.sleepTightInSeconds(3);
//	driver.findElement(By.xpath(".//*[@id='u_0_a']")).click();
//	
//	System.out.println("Login button clicked");
//	
//	driver.close();
//	
//	}
	
	}

}
