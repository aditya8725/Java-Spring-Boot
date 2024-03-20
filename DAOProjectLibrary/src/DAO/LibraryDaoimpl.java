package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import Entity.Library;

public class LibraryDaoimpl implements LibraryDao
{
	Connection con;
	public LibraryDaoimpl() {
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("HSQL Driver is registerd...");
			con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void createLibrary(Library libobj) 
	{
		try {
			PreparedStatement pst = con.prepareStatement("Insert into Library VALUES (?,?,?)");
			pst.setInt(1, libobj.getBookno());
			pst.setString(2, libobj.getBookname());
			pst.setInt(3, libobj.getBookprice());
			
			int rows = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void updateLibrary(Library libobj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLibrary(int bookno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Library readLibrary(int bookno) {
		Statement st;
		Library libobj;
		try {
			st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from Library where bookno="+bookno);
			
			if(rs.next())
			{
				libobj = new Library();
				libobj.setBookno(rs.getInt(1));
				libobj.setBookname(rs.getString(2));
				libobj.setBookprice(rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Library> readLibrarys() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
