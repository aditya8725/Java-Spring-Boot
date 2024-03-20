package Practice2;

import java.util.*;


public interface a2DepartmentDao 
{
	void createDepartment(A1department deptobj);
	A1department readDepartment(int deptno);
	void updateDepartment(A1department deptobj);
	void deleteDepartment(int deptno);
	List<A1department> readDepartments();
	
}
