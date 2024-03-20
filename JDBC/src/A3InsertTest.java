import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class A3InsertTest {
	public static void main(String[] args) {

	
		try
		{

			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("HSQL Drivare is registerd...");
			
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connected to the db");
			
			//Statement st = conn.createStatement();
			
			System.out.println("For which department N0 ?" );
			Scanner sc1 = new Scanner(System.in);
			int deptno = sc1.nextInt();
			
			System.out.println("For which department Name ?" );
			Scanner sc2 = new Scanner(System.in);
			String deptname = sc2.nextLine();
			
			System.out.println("For which department Loc ?" );
			Scanner sc3 = new Scanner(System.in);
			String loc = sc3.nextLine();

//			PreparedStatement pst = conn.prepareStatement("INSERT INTO MYDEPT VALUES(?,?,?);
			PreparedStatement pst = conn.prepareStatement("INSERT INTO MYDEPT VALUES (?,?,?)");
			System.out.println("Prepared The statement");
			pst.setInt(1, deptno); //fillup the first ? placeholder
			pst.setString(2, deptname); //fill up the second ?
			pst.setString(3, loc); //fill up the third ?
			
			
			int rows = pst.executeUpdate();
			System.out.println("Query executed...");
			System.out.println("Rows inserted : "+rows);
			
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

