import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class A2SelectWhereTest {
	public static void main(String[] args) {

	
		try
		{

			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("HSQL Drivare is registerd...");
			
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connected to the db");
			
			Statement st = conn.createStatement();
			
			System.out.println("For which department Name ?" );
			Scanner sc = new Scanner(System.in);
			String deptname = sc.nextLine();

//			ResultSet rt =st.executeQuery("select * from mydept where deptname='Test'");
			ResultSet rt =st.executeQuery("select * from mydept where deptname="+"'"+deptname+"'");
			
			while(rt.next())
			{
				System.out.println("DeptNo: "+rt.getInt(1));
				System.out.println("DName: "+rt.getString(2));
				System.out.println("Loc: "+rt.getString(3));
				System.out.println("--------------");
				
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}
}

