import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class A1SelectTest {
	public static void main(String[] args) {

		//1. load the driver (ctrl+shift+M)
		
		try
		{
			//FOR MYSQL
//			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//			System.out.println("Drivare is registerd...");

			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("HSQL Drivare is registerd...");
			
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root123");
//			System.out.println("Connected to the db");
			
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connected to the db");
			
			
			Statement st = conn.createStatement();
			ResultSet rt =st.executeQuery("select * from mydept");
			
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

