import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JpaTesting 
{
	EntityManager manager;
	public JpaTesting() 
	{
		System.out.println("Constructor....");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyJpa");
		manager = factory.createEntityManager();
		
		System.out.println("Manager created");
		
	}

	@Test
	public void createDepartTest()
	{
		EntityTransaction trans = manager.getTransaction();
		trans.begin();
		Department d = new Department();
		d.setDeptNumber(128990);
		d.setDepartLoc("PUNE");
		d.setDepartName("CSE");
		
		manager.persist(d);
		trans.commit();

	}
	
	@Test
	public void UpdateDepartment()
	{
		EntityTransaction trans = manager.getTransaction();
		trans.begin();
		Department d = manager.find(Department.class,123);
		Assertions.assertTrue(d!=null);
		d.setDepartLoc("PUNE");
		d.setDepartName("CSE");
		
		manager.merge(d);
		trans.commit();
		
		
	}
	
	@Test
	public void DeleteDepartment()
	{
		EntityTransaction trans = manager.getTransaction();
		trans.begin();
		Department d = manager.find(Department.class, 12345);
		Assertions.assertTrue(d!=null);

		manager.remove(d);
		trans.commit();
	}
	
	@Test
	public void selectTest()
	{

		Department d = manager.find(Department.class, 12345);
		Assertions.assertTrue(d!=null);

		System.out.println();
	}
	
	@Test
	public void testcase5()
	{
		System.out.println("Test5");
	}
	
}
