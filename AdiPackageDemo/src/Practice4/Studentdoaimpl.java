package Practice4;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Studentdoaimpl implements studentdaopoji
{
	Connection conn;

	public Studentdoaimpl() 
	{
		super();
		System.out.println("Studentdoaimpl constructor....");
		
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	

	@Override
	public void creatStudent(Student studobj) 
	{
		try {
			PreparedStatement pst = conn.prepareStatement("Insert into Student values(?,?,?)");
			pst.setInt(1, studobj.getStudentrollno());
			pst.setString(2, studobj.getStudentname());
			pst.setString(3,studobj.getStudentclass());
			
			int rows = pst.executeUpdate();
			System.out.println("Query Executed.....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateStudent(Student studobj) 
	{
		try {
			PreparedStatement pst = conn.prepareStatement("update Student set studentname=?,Studentclass=? where Studentrollno=?");
			pst.setInt(1, studobj.getStudentrollno());
			pst.setString(2, studobj.getStudentname());
			pst.setString(3,studobj.getStudentclass());
			
			int rows = pst.executeUpdate();
			System.out.println("Query Executed.....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteStudent(int studentrollno) 
	{
		try {
			PreparedStatement pst = conn.prepareStatement("delete from Student where Studentrollno=?");
			pst.setInt(1, studentrollno);
			
			int rows = pst.executeUpdate();
			System.out.println("Query Executed.....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public Student readStudent(int studentrolno) 
	{
		Student studobj = null;
		
		
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from Student where studentrolno= "+studentrolno);

			if(rs.next())
			{
				studobj = new Student();
				
				studobj.setStudentrollno(rs.getInt(1));
				studobj.setStudentname(rs.getString(2));
				studobj.setStudentclass(rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		return studobj;
	}

	@Override
	public List<Student> readStudents() 
	{
		List<Student> stdlist = new ArrayList<Student>();
		Student studobj = null;
		
		Statement st;
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery("Select *SS from student");

			if(rs.next())
			{
				studobj = new Student();
				
				studobj.setStudentrollno(rs.getInt(1));
				studobj.setStudentname(rs.getString(2));
				studobj.setStudentclass(rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return stdlist;
	}
	

}
