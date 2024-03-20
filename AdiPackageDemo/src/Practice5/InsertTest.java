package Practice5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertTest {

	public static void main(String[] args) 
	{
		Connection con;
		
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver Manager Registered Successfully...");
			con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connection Successfull...");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the empno: ");
			int empno = sc.nextInt();
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter the empname: ");
			String empname = sc1.nextLine();
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter the empsal: ");
			int empsal = sc2.nextInt();
			PreparedStatement pst = con.prepareStatement("insert into emp_tbl values(?,?,?)");
			
			pst.setInt(1, empno);
			pst.setString(2, empname);
			pst.setInt(3, empsal);
			
			int rows = pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
