package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class A4PracticeArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "Aditya"));
		emp.add(new Employee(1,"Jwalitha"));
		emp.add(new Employee(3, "Shivani"));
		emp.add(new Employee(4, "Rabi"));
		
//		Iterator<Employee> empitr = emp.iterator();
//		while(empitr.hasNext())
//		{
//			Employee e = empitr.next();
//			System.out.println("Employee: "+e);
//		}
		
		
		Iterator<Employee> empitr = emp.iterator();
		while(empitr.hasNext())
		{
			Employee e = empitr.next();
			System.out.println("Employee :"+e);
		}
		
 	}
}


class Employee
{
	int empid;
	String ename;
	public Employee(int empid, String ename) {
		super();
		this.empid = empid;
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "[empid=" + empid + ", ename=" + ename + "]";
	}
	
}

