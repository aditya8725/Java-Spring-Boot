package Practice3;

import java.util.List;

public interface A2DepartmentDAO 
{
	//CRUD
	void creatDepartment(A1Department deptobj);
	void updateDepartment(A1Department deptobj);
	void DeleteDepartment(int deptno);
	A1Department readDepartments(int deptno);
	List<A1Department> readA1Departments();
	}
