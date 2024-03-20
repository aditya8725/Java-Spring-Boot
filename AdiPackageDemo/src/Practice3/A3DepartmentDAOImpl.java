package Practice3;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class A3DepartmentDAOImpl implements A2DepartmentDAO
{
	
	Connection con;

	public A3DepartmentDAOImpl() {
		super();
		System.out.println("Department consturctor");
		
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Hsql Registered...");
			
			con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connected..");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void creatDepartment(A1Department deptobj) 
	{
		try {
			PreparedStatement pst = con.prepareStatement("insert into Temp values (?,?,?)");
			pst.setInt(1, deptobj.getDeptid());
			pst.setString(2, deptobj.getDeptname());
			pst.setString(3, deptobj.getDeptloc());
			
			int rows = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateDepartment(A1Department deptobj) 
	{
		try {
			PreparedStatement pst = con.prepareStatement("update Temp set Deptloc =?,Deptname=? where Deptid=?");

			pst.setString(1, deptobj.getDeptloc());
			pst.setString(2, deptobj.getDeptname());
			pst.setInt(3, deptobj.getDeptid());
			
			int rows = pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

	@Override
	public void DeleteDepartment(int deptid) 
	{
		
		try {
			PreparedStatement pst = con.prepareStatement("delete form Temp where deptid=?");
			pst.setInt(1, deptid);
			
			int rows = pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public A1Department readDepartments(int deptid) 
	{
		A1Department deptobj=null;
		
		
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from Temp where deptid="+deptid);
			
			while(rs.next())
			{
				deptobj = new A1Department();
				deptobj.setDeptid(rs.getInt(1));
				deptobj.setDeptname(rs.getString(2));
				deptobj.setDeptloc(rs.getString(3));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return deptobj;
	}

	@Override
	public List<A1Department> readA1Departments() 
	{
		List<A1Department> deptList = new ArrayList<A1Department>();
		
		A1Department deptobj=null;
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from Temp");
			
			while(rs.next())
			{
				
				deptobj = new A1Department();
				deptobj.setDeptid(rs.getInt(1));
				deptobj.setDeptname(rs.getString(2));
				deptobj.setDeptloc(rs.getString(3));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return deptList;
	}

}
