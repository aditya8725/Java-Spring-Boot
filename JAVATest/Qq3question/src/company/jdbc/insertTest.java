package company.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import company.dept.Department;

public class insertTest {

	public static void main(String[] args) 
	{
		Connection con;
			Department d;
		try {
			d = new Department();
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver Manager Ready......");
			
			con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connection Ready......");
//			
//			System.out.println("Enter the DeptNo: ");
//			Scanner sc = new Scanner(System.in);
//			int deptNo = sc.nextInt();
//			
//			System.out.println("Enter the DeptName: ");
//			Scanner sc1 = new Scanner(System.in);
//			String deptName = sc1.nextLine();
//			
//			System.out.println("Enter the DeptLoc: ");
//			Scanner sc2 = new Scanner(System.in);
//			String deptLoc = sc2.nextLine();
			
			d.setDeptNumber(101);
			d.setDeptName("ETC");
			d.setDeptLocation("Africa");
			
			PreparedStatement pst = con.prepareStatement("INSERT INTO DEPT_MASTER VALUES(?,?,?)");
			pst.setInt(1, d.getDeptNumber());
			pst.setString(2,d.getDeptName());
			pst.setString(3, d.getDeptLocation());
			
			int rows = pst.executeUpdate();
			System.out.println("Row Inserted Successfully......"+rows);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
