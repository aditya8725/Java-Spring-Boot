package company.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import company.dept.Department;

public class updateTest {

	public static void main(String[] args) 
	{
		
		Connection con;
		Department d;
		try {
			d = new Department();
			//setting Driver Manager
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver Manager Ready......");
			
			//setting connection
			con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connection Ready......");
			
//			//For which department u want to update
//			System.out.println("Enter the DeptNo which u want to update: ");
//			Scanner sc = new Scanner(System.in);
//			int deptNo = sc.nextInt();
//			
//			System.out.println("Enter the updated DeptName: ");
//			Scanner sc1 = new Scanner(System.in);
//			String deptName = sc1.nextLine();
//			
//			System.out.println("Enter the updated DeptLoc: ");
//			Scanner sc2 = new Scanner(System.in);
//			String deptLoc = sc2.nextLine();
			
			d.setDeptNumber(101);
			d.setDeptName("CHEM");
			d.setDeptLocation("NEWZLAND");
			
			PreparedStatement pst = con.prepareStatement("UPDATE DEPT_MASTER SET DEPTNAME=?,DEPTLOC=? WHERE DEPTID=?");
			pst.setInt(3, d.getDeptNumber());
			pst.setString(1, d.getDeptName());
			pst.setString(2, d.getDeptLocation());
			
			int rows = pst.executeUpdate();
			System.out.println("Row UPDATED Successfully......"+rows);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
