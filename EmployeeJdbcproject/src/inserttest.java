
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class inserttest 
{
	public static void main(String[] args) 
	{
		Connection con;
		
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver manager ready...");
			
			con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connection ready...");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the empno: ");
			int empno = sc.nextInt();
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter the empno: ");
			String empname = sc1.nextLine();
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter the sal: ");
			int empsal = sc2.nextInt();
			
			
			PreparedStatement pst = con.prepareStatement("insert into emp_tbl values(?,?,?)");
			pst.setInt(1, empno);
			pst.setString(2, empname);
			pst.setInt(3, empsal);
			
			int rows = pst.executeUpdate();
			System.out.println("Successfully inserted....");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
