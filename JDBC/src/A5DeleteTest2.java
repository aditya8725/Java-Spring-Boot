import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class A5DeleteTest2 {
	public static void main(String[] args) {

	
		try
		{

			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("HSQL Drivare is registerd...");
			
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connected to the db");
			
			//Statement st = conn.createStatement();
			
			conn.setAutoCommit(false);
			System.out.println("Now Transactios are not auto commited..");
			System.out.println("We have to control the transactions...");
			System.out.println("Either via commit or rollback...");
			
			//ur table is mydept
			
			
			System.out.println("Which department number to delete ? ");
			Scanner scanner1 = new Scanner(System.in);
			int deptno=scanner1.nextInt(); //80

			PreparedStatement pst = conn.prepareStatement("DELETE FROM MYDEPT WHERE DEPTNO=?");
			System.out.println("Prepared The statement");
			pst.setInt(1, deptno); //fillup the first ? placeholder

			int rows = pst.executeUpdate();
			
			System.out.println("Are you sure to delete ? ");
			Scanner scanner2 = new Scanner(System.in);
			String reply=scanner2.nextLine(); //Y Yes Yeap
			
			if(reply.equalsIgnoreCase("Yes")) {
				conn.commit();
				System.out.println("Query executed...");
				System.out.println("Rows DELETED : "+rows);
				
			}
			else {
				conn.rollback();
				System.out.println("Query discarded...");
				System.out.println("Rows Not Deleted : ");
				
			}

			
			pst.close();
			conn.close();

			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}
}

