package DBtestwithselenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Maxempid {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 
	{

		Class.forName("com.mysql.jdbc.Driver").newInstance();
		String dburl,uid,pwd;
		dburl="jdbc:mysql://qedgetech.com:3306/qedge_ohrm1";
		uid="qedgehrm";
		pwd="12345";
		Connection dbcon;
		dbcon=DriverManager.getConnection(dburl, uid, pwd);
		java.sql.Statement stmt=dbcon.createStatement();
		ResultSet rs=stmt.executeQuery("select max(emp_number)from hs_hr_employee");
		rs.next();
		int expempid=rs.getInt(1);
		System.out.println(expempid);
		rs.close();
		dbcon.close();
	    }

		}
