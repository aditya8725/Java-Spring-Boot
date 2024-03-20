package company.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import company.dept.Department;

public class deleteTest 
{
	public static void main(String[] args) 
	{
		Connection con;
		Department d;
		try {
			d = new Department();
			//setting Driver Manager
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver Manager Ready......");
			
			////setting connection
			con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connection Ready......");
			
			//Taking input for which we want to delete
//			System.out.println("Enter the DeptNo which u want to delete: ");
//			Scanner sc = new Scanner(System.in);
//			int deptNo = sc.nextInt();
			
			d.setDeptNumber(101);
			
			PreparedStatement pst = con.prepareStatement("DELETE FROM DEPT_MASTER WHERE DEPTID=?");
			pst.setInt(1, d.getDeptNumber());
			
			int rows = pst.executeUpdate();
			System.out.println("Row DELETED Successfully......"+rows);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
