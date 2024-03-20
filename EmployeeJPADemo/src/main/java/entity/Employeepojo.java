package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp_tbl")
public class Employeepojo 
{
	@Id
	@Column(name="Empno")
	private int employeenumber;
	
	@Column(name="Empname")
	private String employeename;
	
	@Column(name="Empsal")
	private int employeesalary;

	public Employeepojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmployeenumber() {
		return employeenumber;
	}

	public void setEmployeenumber(int employeenumber) {
		this.employeenumber = employeenumber;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public int getEmployeesalary() {
		return employeesalary;
	}

	public void setEmployeesalary(int employeesalary) {
		this.employeesalary = employeesalary;
	}

	
	
	
}
