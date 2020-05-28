package DBtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JavaConnection 
{
public static void main(String[] args) throws Throwable 
{

	Class.forName("com.mysql.jdbc.driver");
	System.out.println("Driver Loaded");
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kaibalya", "root", "Kaibalya*3");
	System.out.println("Database connection estlablished");
	
	Statement stmnt = con.createStatement();
	System.out.println("Statement Created");
	
	ResultSet res = stmnt.executeQuery("select * from again");
	System.out.println("Query Executed");
	
	
	
	
	
	
}
}
