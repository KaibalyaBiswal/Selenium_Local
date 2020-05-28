package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JavaIntegration {

	public static void main(String[] args) throws Throwable 
	{

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "Kaibalya*3");
		System.out.println("Database Connection Established");
		
		
		Statement st = con.createStatement();
		System.out.println("Statement Created");
		
		
		ResultSet res = st.executeQuery("Select * from details");
		System.out.println("Query Executed");
		
		
		while (res.next()) 
		{
		System.out.println(res.getString("userid"));
		System.out.println(res.getString("password"));
		
		}
		
		
		
		
		
	}

}
