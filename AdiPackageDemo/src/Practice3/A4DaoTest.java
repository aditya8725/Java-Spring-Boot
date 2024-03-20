package Practice3;

import Practice2.A1department;

public class A4DaoTest 
{
	public static void main(String[] args) 
	{
		A2DepartmentDAO deptDoa = new A3DepartmentDAOImpl();
		
//		A1Department deptobj = new A1Department();
//		deptobj.setDeptid(101);
//		deptobj.setDeptname("CSE");
//		deptobj.setDeptloc("VTZ");
		
//		deptDoa.creatDepartment(deptobj);
		
		A1Department deptObj=deptDoa.readDepartments(101);
		
		System.out.println("DEPT No "+deptObj.getDeptid());
		System.out.println("DEPT Name "+deptObj.getDeptname());
		System.out.println("DEPT Loc "+deptObj.getDeptloc());
		
		
	}

}
