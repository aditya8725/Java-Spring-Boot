package company.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.sun.tools.classfile.Opcode.Set;

import company.dept.Department;

public class insertTest2 {

	public static void main(String[] args) 
	{
		Department d;
		Connection con;
		
		try {
			d = new Department();
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver Manager Ready......");
			
			con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connection Ready......");
			
			
//			int deptNumber = d.setDeptNumber();
//			String deptName = d.getDeptName();
//			String deptLoc = d.getDeptLocation();
			
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


