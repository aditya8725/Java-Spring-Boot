package company.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import company.dept.Department;

public class Inserttest implements departmentpoji
{
	Connection conn2 ;

	public Inserttest() {
		System.out.println("DepartmentDAOImpl() ctor....");
		try {
			
			//for hsqldb
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("HSQL Driver is registerd...");
			
			
			//for myhsqldb
			conn2 = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connected to the HSQL : "+conn2);
			
			
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	
	@Override
	public void createDepartment(Department deptObj) {

		try {
			PreparedStatement pst = conn2.prepareStatement("INSERT INTO mydept VALUES (?,?,?)");
			System.out.println("Prepared The statement");
			pst.setInt(1, deptObj.getDepartmentNumber()); //fillup the first ? placeholder
			pst.setString(2, deptObj.getDepartmentLocation()); //fill up the second ?
			pst.setString(3, deptObj.getDepartmentName()); //fill up the third ?

			int rows = pst.executeUpdate();
			System.out.println("Query executed...");
			System.out.println("Rows inserted : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}