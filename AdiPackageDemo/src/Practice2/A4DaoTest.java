package Practice2;

import java.util.*;

public class A4DaoTest 
{
	public static void main(String[] args) 
	{
		
		a2DepartmentDao deptDAO = new A3DepartmentDaoImpl();
//		
//		A1department deptObj=new A1department();
//		deptObj.setDeptno(102);
//		deptObj.setDeptName("Marketing Sales");
//		deptObj.setLoc("PTQ");	
//		deptDAO.createDepartment(deptObj);		

		A1department deptObj=deptDAO.readDepartment(102);
		
		System.out.println("DEPT No "+deptObj.getDeptno());
		System.out.println("DEPT Name "+deptObj.getDeptName());
		System.out.println("DEPT Loc "+deptObj.getLoc());
		
		
	}

}
