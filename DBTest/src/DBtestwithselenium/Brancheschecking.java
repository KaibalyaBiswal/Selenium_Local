package DBtestwithselenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Brancheschecking {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

//Class.forName("packageName.Driverclass").newInstance();
	
//step1-connecting to database
		
		String url,uid,pwd;
	url="jdbc:sqlserver.//primusbank.qedgetech.com:1433;database=bankdb";
	uid="qedge";
	pwd="qedge";
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
	Connection dbcon;
	dbcon=DriverManager.getConnection(url, uid, pwd);

//step2-send SQL queries to database
	
	java.sql.Statement	 stmt=dbcon.createStatement();
    ResultSet rs=stmt.executeQuery("select count(*) from bankbranches");

    //step3- process results 
    
    rs.next();
    int brcount=rs.getInt(1);
    System.out.println(brcount);
    }
    }