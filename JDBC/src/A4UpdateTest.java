import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class A4UpdateTest {
	public static void main(String[] args) {

	
		try
		{

			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("HSQL Drivare is registerd...");
			
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connected to the db");
			
			//Statement st = conn.createStatement();
			
			System.out.println("Enter new department N0 ?" );
			Scanner sc1 = new Scanner(System.in);
			int deptno = sc1.nextInt();
			
			System.out.println("Enter new department Name ?" );
			Scanner sc2 = new Scanner(System.in);
			String deptname = sc2.nextLine();
			
			System.out.println("Enter new  department Loc ?" );
			Scanner sc3 = new Scanner(System.in);
			String loc = sc3.nextLine();

			PreparedStatement pst = conn.prepareStatement("UPDATE MYDEPT SET LOC=?, DEPTNAME=? WHERE DEPTNO=?");
			System.out.println("Prepared The statement");
			pst.setString(1, loc); //fill up the second ?
			pst.setString(2, deptname); //fill up the third ?
			pst.setInt(3, deptno); //fillup the first ? placeholder

			int rows = pst.executeUpdate();
			System.out.println("Query executed...");
			System.out.println("Rows UPDATED : "+rows);

			
			pst.close();
			conn.close();
			sc1.close();
			sc2.close();
			sc3.close();

			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}
}

