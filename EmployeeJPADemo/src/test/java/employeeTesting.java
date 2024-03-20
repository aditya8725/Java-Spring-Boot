import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entity.Employeepojo;

public class employeeTesting 
{
	EntityManager manager;
	
	employeeTesting()
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyJPA");
		manager = factory.createEntityManager();
		System.out.println("Manager Created....");
	}
	
	@Test
	public void createEmployeeTest()
	{
		System.out.println("Trying to insert an employeee....");
		EntityTransaction trans = manager.getTransaction();
		trans.begin();
		
		Employeepojo emp = new Employeepojo();
		
		emp.setEmployeename("Shivam");
		emp.setEmployeesalary(7589);
		emp.setEmployeenumber(5661);
		manager.persist(emp);
		
		trans.commit();
		System.out.println("Object Persisted");
	}
	
	@Test
	public void selectEmployeeTest()
	{
		System.out.println("Trying to select an employeee....");
		
		Employeepojo emp = manager.find(Employeepojo.class, 5678);
		Assertions.assertTrue(emp!=null);
		System.out.println("Empno.: "+emp.getEmployeenumber());
		System.out.println("EmpName: "+emp.getEmployeename());
		System.out.println("EmpSal: "+emp.getEmployeesalary());
	
		System.out.println("Object Persisted");
	}
	

	@Test
	public void selectallEmployeeTest()
	{
		System.out.println("Trying to select all employeee....");
		
		Query q = manager.createQuery("from Employeepojo");
		List<Employeepojo> staff = q.getResultList();
		for(Employeepojo emp : staff)
		{
		System.out.println("Empno.: "+emp.getEmployeenumber());
		System.out.println("EmpName: "+emp.getEmployeename());
		System.out.println("EmpSal: "+emp.getEmployeesalary());
		}
		System.out.println("Object Persisted");
	}
	
	
	@Test
	public void updateEmployeeTest()
	{
		System.out.println("Trying to insert an employeee....");
		EntityTransaction trans = manager.getTransaction();
		trans.begin();
		
		Employeepojo emp = manager.find(Employeepojo.class, 5661);
		
		emp.setEmployeename("K Jwalitha");
		emp.setEmployeesalary(25000);
		manager.merge(emp);
		
		trans.commit();
		System.out.println("Object Persisted");
	}
	
	
	@Test
	public void deleteEmployeeTest()
	{
		System.out.println("Trying to insert an employeee....");
		EntityTransaction trans = manager.getTransaction();
		trans.begin();
		
		Employeepojo emp = manager.find(Employeepojo.class, 5661);
		
		Assertions.assertTrue(emp!=null);
		manager.remove(emp);
		
		trans.commit();
		System.out.println("Object Persisted");
	}
}



