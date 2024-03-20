package Practice6jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class selectalltest 
{
	public static void main(String[] args) 
	{
Connection con;
		
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver manager ready...");
			
			con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connection ready...");
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from emp_tbl");
			
			while(rs.next())
			{
				System.out.println("Empno: "+rs.getInt(1));
				System.out.println("Empno: "+rs.getString(2));
				System.out.println("Empno: "+rs.getInt(3));
				System.out.println("----------------");
			}

				System.out.println("----------------");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
