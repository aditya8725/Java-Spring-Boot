package Practice2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class A3DepartmentDaoImpl implements a2DepartmentDao 
{
	Connection con;

	public A3DepartmentDaoImpl() {
		super();
		System.out.println("Dept connection..");
		
		try
		{
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("HSQL registered");
			
			con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connected to the HSQL : "+con);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void createDepartment(A1department deptobj) 
	{
		try {
			PreparedStatement pst = con.prepareStatement("Insert into Aditest values(?,?,?)");
			pst.setInt(1, deptobj.getDeptno());
			pst.setString(2, deptobj.getDeptName());
			pst.setString(3, deptobj.getLoc());
			
			int rows = pst.executeUpdate();
			System.out.println("Query Executed....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public A1department readDepartment(int deptno) 
	{
		A1department deptobj = null;
		
		try
		{
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from Aditest where Deptno = "+deptno);
			
			if(rs.next())
			{
				deptobj = new A1department();
				deptobj.setDeptno(rs.getInt(1));
				deptobj.setDeptName(rs.getString(2));
				deptobj.setLoc(rs.getString(3));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

		return deptobj;
	}

	@Override
	public void updateDepartment(A1department deptobj) 
	{
		try {
			PreparedStatement pst = con.prepareStatement("update Aditest set loc=?,deptname=? where deptno=?");

			pst.setString(1, deptobj.getLoc());
			pst.setString(2, deptobj.getDeptName());
			pst.setInt(3, deptobj.getDeptno());
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteDepartment(int deptno) {
			try {
			PreparedStatement pst = con.prepareStatement("Delete AdiTest where deptno=?");
			pst.setInt(1, deptno);
			int rows = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<A1department> readDepartments() 
	{
		List<A1department> deptList = new ArrayList<A1department>();
		A1department deptobj = null;
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from AdiTest");
			
			while(rs.next())
			{
				deptobj = new A1department();
				deptobj.setDeptno(rs.getInt(1));
				deptobj.setDeptName(rs.getString(2));
				deptobj.setLoc(rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return deptList;
	}
	

}
