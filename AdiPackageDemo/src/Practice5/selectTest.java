package Practice5;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class selectTest 
{
	public static void main(String[] args) 
	{
		Connection con;
		
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver Manager Created...");
			
			con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connection successfull....");
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from emp_tbl");
			
			while(rs.next())
			{
				System.out.println("Empno: "+rs.getInt(1));
				System.out.println("Empname: "+rs.getString(2));
				System.out.println("Empsal: "+rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
