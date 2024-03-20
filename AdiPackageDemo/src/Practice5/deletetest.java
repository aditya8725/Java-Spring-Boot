package Practice5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class deletetest 
{
	public static void main(String[] args) 
	{
		Connection con;
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			
			con.setAutoCommit(false);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the empno which your want to delete...");
			int empno = sc.nextInt();
			
			
			PreparedStatement pst = con.prepareStatement("delete from emp_tbl where empno=?");
			pst.setInt(1, empno);
			
			int rows = pst.executeUpdate();
			
			System.out.println("Are u sure u want to delete");
			Scanner sc1 = new Scanner(System.in);
			String reply = sc1.nextLine();
			
			if(reply.equalsIgnoreCase("Yes"))
			{
				con.commit();
				System.out.println("Successfully deleted..");
			}
			else
			{
				con.rollback();
				System.out.println("Operation Discarded");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
