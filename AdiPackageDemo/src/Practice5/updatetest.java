package Practice5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class updatetest {

	public static void main(String[] args) 
	{
		Connection c;
		try{
			
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver Registerd.....");
			
			c = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connection successfull....");
			
			System.out.println("Which for which Roll no. you want to update ?");
			Scanner sc = new Scanner(System.in);
			int studentrolno = sc.nextInt();
			
			System.out.println("Enter a new name: ");
			Scanner sc1 = new Scanner(System.in);
			String studentname = sc1.nextLine(); 
			
			System.out.println("Enter new class: ");
			Scanner sc2 = new Scanner(System.in);
			String Studentclass = sc2.nextLine();
			
			PreparedStatement pst = c.prepareStatement("update student set studentname=?,Studentclass=? where studentrolno=?");
			pst.setString(1, studentname);
			pst.setString(2, Studentclass);
			pst.setInt(3, studentrolno);
			System.out.println("--------------------");
			
			int rows = pst.executeUpdate();

		}catch(SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
