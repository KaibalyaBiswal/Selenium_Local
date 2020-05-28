package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection 
{
	
public static void main(String[] args) throws Exception
{
	Class.forName("com.mysql.jdbc.Driver");			////package.Class
	System.out.println("Driver Loaded");
	
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kaibalya","root","Kaibalya*3");
System.out.println("Database Connection Establish");

Statement stmnt = conn.createStatement();
System.out.println("Statement Created");

ResultSet res = stmnt.executeQuery("select * from biswal");
System.out.println("Query executed");

/*
 * Interacting With Java
 
while (res.next()) 
{
System.out.println(res.getString("name"));
System.out.println(res.getString("mob"));
System.out.println(res.getString("adress"));

}
}
 																	*/
	
//Interacting With Selenium
/*
 	
while (res.next()) 
{
WebDriver driver=new FirefoxDriver();
driver.get("http://facebook.com");
driver.findElement(By.xpath("USERNAME")).sendKeys(res.getString("uname"));
driver.findElement(By.xpath("PASSWORD")).sendKeys(res.getString("pwd"));
driver.findElement(By.xpath("BUTTON")).click();
driver.close();

}
 													*/


}
}
