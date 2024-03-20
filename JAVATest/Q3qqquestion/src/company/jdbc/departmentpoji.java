package company.jdbc;

import java.util.List;
import company.dept.Department;

interface departmentpoji 
{
	public void createDepartment(Department deptObj);
	public Department readDepartment(int deptNumber);
	public List<Department> readDepartments();
	public void updateDepartment(Department deptObj);
	public void deleteDepartment(int deptNumber);

}
