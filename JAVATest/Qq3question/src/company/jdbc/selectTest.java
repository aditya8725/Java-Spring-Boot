package company.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class selectTest {

	public static void main(String[] args) 
	{
		Connection con;
		
		try {
			//setting Driver Manager
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver Manager Ready......");
			
			//setting connection
			con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connection Ready......");
			
			//statement created
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM DEPT_MASTER");
			
			//printing
			while(rs.next())
			{
				System.out.println("DeptId: "+rs.getInt(1));
				System.out.println("DeptName: "+rs.getString(2));
				System.out.println("DeptLoc: "+rs.getString(3));
				System.out.println("----------------------------------");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
