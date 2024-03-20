package company.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class selectWhere {

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

			//Taking input from user
			System.out.println("Enter the DeptNo which u want to display.... ");
			Scanner sc = new Scanner(System.in);
			int deptId = sc.nextInt();
			
			//Executing the query
			ResultSet rs = st.executeQuery("SELECT * FROM DEPT_MASTER WHERE DEPTID="+deptId);
			
			//Printing the value
			if(rs.next())
			{
				System.out.println("DeptName: "+rs.getString(2));
				System.out.println("DeptLoc: "+rs.getString(3));
				System.out.println("----------------------------------");
			}
			
		} catch (SQLException e) {
			System.out.println("ERROR !!!"+e.getMessage());
			e.printStackTrace();
		}
	}

}
